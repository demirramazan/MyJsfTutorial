package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by ramazan.demir on 9.2.2017.
 */
@ManagedBean
@RequestScoped
public class RequestScopedBean {

    private String name;
    private String pass;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    public int getHashCode(){
        return super.hashCode();
    }
}
