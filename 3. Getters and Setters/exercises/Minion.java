package exercises;

public class Minion {

    private String name;
    private int eyes;
    private String color;
    private String master;

    Minion(String getName, int getEyes, String getColor, String getMaster) {
        this.name = getName;
        this.eyes = getEyes;
        this.color = getColor;
        this.master = getMaster;
    }
    String getName(){
        return this.name;
    }

    int getEyes(){
        return this.eyes;
    }

    String getColor(){
        return this.color;
    }
    String getMaster(){
        return this.master;
    }

    void setMaster(String master) {
        this.master = master;
    }
}
