package view.profile;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import a8a.wwl.com.a8a_android.R;
import butterknife.ButterKnife;
import butterknife.OnClick;
import view.Home.HomeActivity;

/**
 * Created by itman on 4/22/17.
 */

public class ProfileActivity extends AppCompatActivity {
    @OnClick(R.id.btnLogOut)
    void onLogOut(){
        Intent intent = new Intent(this, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profile);
        ButterKnife.bind(this);


    }
}
