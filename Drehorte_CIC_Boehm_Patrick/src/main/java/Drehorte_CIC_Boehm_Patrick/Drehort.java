package Drehorte_CIC_Boehm_Patrick;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Drehort {
    private String ort;
    private String name;
    
    public String getOrt() {
        return this.ort;
    }
    public void setOrt(String ort) {
        this.ort = ort;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


}