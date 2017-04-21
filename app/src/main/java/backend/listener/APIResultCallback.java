package backend.listener;

/**
 * Created by itman on 4/22/17.
 */

public interface APIResultCallback {
    interface LogInResultCallback{
        void onLoginSuccess(boolean isSuccess);
    }
}
