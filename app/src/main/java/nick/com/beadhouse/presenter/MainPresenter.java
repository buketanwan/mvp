package nick.com.beadhouse.presenter;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import nick.com.beadhouse.api.ApiService;
import nick.com.beadhouse.model.IpModel;
import nick.com.beadhouse.view.project.MainActivityView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by nick on 2017/2/16.
 */

public class MainPresenter {
    private MainActivityView mMainView;
    private ApiService apiService;


    public MainPresenter(MainActivityView mMainView) {
        this.mMainView = mMainView;
    }

    public void login() {

        Retrofit retrofit2 = new Retrofit.Builder()
                .baseUrl("http://ip.taobao.com")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        apiService = retrofit2.create(ApiService.class);
        apiService.getIp2("63.223.108.42").enqueue(new Callback<IpModel>() {
            @Override
            public void onResponse(Call<IpModel> call, Response<IpModel> response) {

            }

            @Override
            public void onFailure(Call<IpModel> call, Throwable t) {

            }
        });

        apiService.getIp("63.223.108.42")
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .map(new Function<IpModel, String>() {
                    @Override
                    public String apply(IpModel ipModel) throws Exception {
                        return null;
                    }
                })
                .subscribe(new Observer<String>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(String value) {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });

    }

}
