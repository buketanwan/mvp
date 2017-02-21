package nick.com.beadhouse.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import nick.com.beadhouse.R;
import nick.com.beadhouse.presenter.MainPresenter;
import nick.com.beadhouse.view.project.MainActivityView;

public class MainActivity extends AppCompatActivity implements MainActivityView, View.OnClickListener {
    private RelativeLayout mActivityMain;
    private EditText mTvUserName;
    private EditText mTvUserPassword;
    private Button mBtLogin;
    private MainPresenter mMainPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        assignViews();
        initListener();
    }

    private void assignViews() {
        mActivityMain = (RelativeLayout) findViewById(R.id.activity_main);
        mTvUserName = (EditText) findViewById(R.id.tv_user_name);
        mTvUserPassword = (EditText) findViewById(R.id.tv_user_password);
        mBtLogin = (Button) findViewById(R.id.bt_login);
        mMainPresenter = new MainPresenter(this);
    }

    private void initListener() {
        mBtLogin.setOnClickListener(this);
    }

    @Override
    public String getUserName() {
        return "b59bc3ef6191eb9f747dd4e83c99f2a4";
    }

    @Override
    public String getPassword() {
        return "json";
    }

    @Override
    public void setPassword(String password) {
        mTvUserPassword.setText(password);
    }

    @Override
    public void setUserName(String userName) {
        mTvUserName.setText(userName);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_login:
                mMainPresenter.login();
                break;
        }
    }
}
