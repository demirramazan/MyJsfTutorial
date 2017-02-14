package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.sql.Blob;
import java.util.List;

/**
 * Created by ramazan.demir on 6.2.2017.
 */
@ManagedBean(name = "person")
@SessionScoped

public class PersonBean {
    private String isimSoyisim;
    private List<String> cinsiyet;
    private boolean ehliyetVarMi;
    private  String adres;
    private String il;
    private Blob jpegResim;


    public String getIsimSoyisim() {
        return isimSoyisim;
    }

    public void setIsimSoyisim(String isimSoyisim) {
        this.isimSoyisim = isimSoyisim;
    }

    public List<String> getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(List<String> cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public boolean isEhliyetVarMi() {
        return ehliyetVarMi;
    }

    public void setEhliyetVarMi(boolean ehliyetVarMi) {
        this.ehliyetVarMi = ehliyetVarMi;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public Blob getJpegResim() {
        return jpegResim;
    }

    public void setJpegResim(Blob jpegResim) {
        this.jpegResim = jpegResim;
    }


}
