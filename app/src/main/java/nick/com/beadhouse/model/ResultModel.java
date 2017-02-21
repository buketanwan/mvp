package nick.com.beadhouse.model;

/**
 * Created by nick on 2017/2/21.
 */

public class ResultModel {
    private String status;

    private String phone;

    private String area;

    private String postno;

    private String att;

    private String ctype;

    private String par;

    private String prefix;

    private String operators;

    private String style_simcall;

    private String style_citynm;

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }

    public void setPostno(String postno) {
        this.postno = postno;
    }

    public String getPostno() {
        return this.postno;
    }

    public void setAtt(String att) {
        this.att = att;
    }

    public String getAtt() {
        return this.att;
    }

    public void setCtype(String ctype) {
        this.ctype = ctype;
    }

    public String getCtype() {
        return this.ctype;
    }

    public void setPar(String par) {
        this.par = par;
    }

    public String getPar() {
        return this.par;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setOperators(String operators) {
        this.operators = operators;
    }

    public String getOperators() {
        return this.operators;
    }

    public void setStyle_simcall(String style_simcall) {
        this.style_simcall = style_simcall;
    }

    public String getStyle_simcall() {
        return this.style_simcall;
    }

    public void setStyle_citynm(String style_citynm) {
        this.style_citynm = style_citynm;
    }

    public String getStyle_citynm() {
        return this.style_citynm;
    }
}
