package nick.com.beadhouse.model;

/**
 * Created by nick on 2017/2/21.
 */

public class TestJsonModel {

    private String success;

    private ResultModel result;

    public void setSuccess(String success){
        this.success = success;
    }
    public String getSuccess(){
        return this.success;
    }
    public void setResult(ResultModel result){
        this.result = result;
    }
    public ResultModel getResult(){
        return this.result;
    }
}
