package nick.com.beadhouse.activity;


import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    private long mTime = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        beforeSetContentView();
        setContentView(getViewId());
        initView();
        initData();
        initListener();
    }

    protected void beforeSetContentView() {

    }

    protected abstract int getViewId();

    protected abstract void initView();

    protected abstract void initData();

    protected void initListener() {

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View v) {
        if (System.currentTimeMillis() - mTime > 200) {
            _onClick(v);
            mTime = System.currentTimeMillis();
        }
    }

    //防止多次点击
    private void _onClick(View v) {

    }
}
