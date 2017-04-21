package view.ConfirmReceive;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import a8a.wwl.com.a8a_android.R;
import butterknife.ButterKnife;
import butterknife.OnClick;
import view.profile.ProfileActivity;

/**
 * Created by itman on 4/22/17.
 */

public class ConfirmActivity extends AppCompatActivity {

    @OnClick(R.id.btnConfirmNext)
    void onBtnNext(){
        navigateToProfilePage();
    }

    @OnClick(R.id.btnConfirmNotReceived)
    void onBtnNotReceived(){
        finish();
    }

    private void navigateToProfilePage(){
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        ButterKnife.bind(this);
    }
}
