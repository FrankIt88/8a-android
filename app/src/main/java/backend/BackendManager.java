package backend;

import backend.ResultModel.GetConfirmationResult;
import backend.listener.APIResultCallback;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by itman on 4/22/17.
 */

public class BackendManager {
    private static BackendManager _sharedInstance = null;

    public static BackendManager getSharedInstance() {
        if (_sharedInstance == null){
            _sharedInstance = new BackendManager();
        }

        return _sharedInstance;
    }

    public void getConfirmatioinCode(String phoneNumber, final APIResultCallback.LogInResultCallback argCallback){
        BackendInterface backendInterface = BackendServiceGenerator.createService(BackendInterface.class);

        Call<GetConfirmationResult> call = backendInterface.getConfirmation(phoneNumber);
        call.enqueue(new Callback<GetConfirmationResult>() {
            @Override
            public void onResponse(Call<GetConfirmationResult> call, Response<GetConfirmationResult> response) {
                if (argCallback != null) {
                    if (response != null && response.body() != null) {
                        GetConfirmationResult result = response.body();
                        argCallback.onLoginSuccess(result.getSuccess().equalsIgnoreCase("Ok"));
                    } else {
                        argCallback.onLoginSuccess(false);
                    }
                }
            }

            @Override
            public void onFailure(Call<GetConfirmationResult> call, Throwable t) {
                if (argCallback != null){
                    argCallback.onLoginSuccess(false);
                }
            }
        });
    }

}
