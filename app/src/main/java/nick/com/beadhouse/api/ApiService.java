package nick.com.beadhouse.api;

import io.reactivex.Observable;
import nick.com.beadhouse.model.IpModel;
import nick.com.beadhouse.model.TestJsonModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by nick on 2017/2/16.
 */

public interface ApiService {

    //http://api.k780.com:88/?app=phone.get&phone=13888888888&appkey=10003&sign=b59bc3ef6191eb9f747dd4e83c99f2a4&format=json
    @GET("/")
    Observable<TestJsonModel> login(@Query("app") String app, @Query("phone") String phone, @Query("sign") String userName, @Query("format") String password);

    @GET("/service/getIpInfo.php")
    Observable<IpModel> getIp(@Query("ip") String ip);

    @GET("/service/getIpInfo.php")
    Call<IpModel> getIp2(@Query("ip") String ip);
}
