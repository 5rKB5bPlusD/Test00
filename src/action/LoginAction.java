package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by BlackZXK on 2/24/2017.
 */
public class LoginAction extends ActionSupport{
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        if("admin".equals(this.getUsername())){
            return SUCCESS;
        }else{
            return ERROR;
        }
    }
}
