package view.Home;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import a8a.wwl.com.a8a_android.R;
import butterknife.ButterKnife;
import butterknife.OnClick;
import view.Login.LogInActivity;

/**
 * Created by itman on 4/22/17.
 */

public class HomeActivity extends AppCompatActivity {
    @OnClick(R.id.btnWatchNews)
    public void onBtnWatchNews(){

    }

    @OnClick(R.id.btnReportNews)
    public void onBtnReportNews(){
        Intent intent = new Intent(this, LogInActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

    }
}
