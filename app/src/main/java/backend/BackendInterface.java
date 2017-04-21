package backend;

import backend.ResultModel.GetConfirmationResult;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by itman on 4/22/17.
 */

public interface BackendInterface {
    @FormUrlEncoded
    @POST("login/request-code")
    Call<GetConfirmationResult> getConfirmation(
            @Field("phoneNumber") String phoneNumber
    );

    @FormUrlEncoded
    @POST("logout")
    Call<GetConfirmationResult> revokeToken(
            @Field("phoneNumber") String phoneNumber,
            @Field("confirmationCode") String confirmationCode,

            @Field("email") String email,
            @Field("password") String password
    );

}
