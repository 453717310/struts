package cn.bdqn.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.RequestAware;

import java.util.Map;


/**
 * Created by dll on 2017/7/15.
 */
public class UserAction2 extends ActionSupport implements RequestAware{
    private  String name;
    private  String password;
    private Map<String,Object> request;

    //登录的方法
    public  String  login() {
        request.put("name", name);
        request.put("password", password);
        return SUCCESS;
    }
    //重写方法   给请求request赋值
    @Override
    public void setRequest(Map<String, Object> request) {
        this.request=request;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
