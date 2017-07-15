package cn.bdqn.action;


import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by dll on 2017/7/15.
 */
public class UserAction extends ActionSupport {
    /**
     * 登录的方法
     * 解耦的两种方法
     *     001.使用AcionContext!
     *     struts2 在底层把我们的request,session,application用Map集合保存起来了！
     */
    private String name;
    private String password;

    public String login(){
        Map<String,Object> request= (Map<String,Object>)ActionContext.getContext().get("request");
        //让success.jsp获取数据
        request.put("name","name");//等同于setAttribute("name",name);
        request.put("password",password);
        return SUCCESS;
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
