package adptpat;

public class Iphone7 {
    private MobileCharger mobileCharger;

    public MobileCharger getMobileCharger() {
        return mobileCharger;
    }

    public void setMobileCharger(MobileCharger mobileCharger) {
        this.mobileCharger = mobileCharger;
    }
    public void charge(String s){
        mobileCharger.plugIn(s);
    }
}
