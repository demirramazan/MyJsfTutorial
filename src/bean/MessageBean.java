package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by ramazan.demir on 6.2.2017.
 */
@ManagedBean(name = "message")
@RequestScoped
public class MessageBean {
    private String sayWelcome = "Welcome to my page, ";

    public String getSayWelcome() {
        return sayWelcome;
    }

    public void setSayWelcome(String sayWelcome) {
        this.sayWelcome = sayWelcome;
    }
}
