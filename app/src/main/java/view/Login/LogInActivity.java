package view.Login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import a8a.wwl.com.a8a_android.R;
import backend.BackendManager;
import backend.listener.APIResultCallback;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import view.ConfirmReceive.ConfirmActivity;
import view.Home.HomeActivity;

/**
 * Created by itman on 4/22/17.
 */

public class LogInActivity extends AppCompatActivity {
    @BindView(R.id.editPhontNumber)
    EditText editPhoneNumber;

    @OnClick(R.id.btnGetConfirmation)
    public void onBtnGetConfirmation(){
        // navigateToConfirmPage(); //Test code
        BackendManager backendManager = BackendManager.getSharedInstance();
        progressDialog.show();
        backendManager.getConfirmatioinCode(editPhoneNumber.getText().toString(), new APIResultCallback.LogInResultCallback() {
            @Override
            public void onLoginSuccess(boolean isSuccess) {
                progressDialog.dismiss();
                if (isSuccess){
                    navigateToConfirmPage();
                }
            }
        });
    }

    private void navigateToConfirmPage(){
        Intent intent = new Intent(LogInActivity.this, ConfirmActivity.class);
        startActivity(intent);
    }

    ProgressDialog progressDialog;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        init();
    }

    protected void init(){
        progressDialog = new ProgressDialog(this);

    }
}
