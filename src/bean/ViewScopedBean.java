package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * Created by ramazan.demir on 14.2.2017.
 */
@ManagedBean
@ViewScoped
public class ViewScopedBean implements Serializable{
    private static final long serialVersionUID = 1L;


    private String name;
    private String surname;
    private String pass;
    private int counter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getCounter() {
        return ++counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getGreating(){
        if (name!=null &&name.length()>0){
            return "welcome ..." + name+" "+surname;
        }else{
            return "";
        }
    }
    public int getHashCode(){
        return super.hashCode();
    }

}
