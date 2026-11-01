package adptpat;

public class MainClass {
    public static void main(String[] args) {
        IpMobileAdp ipm = new IpMobileAdp();
        Iphone7 iphone7=new Iphone7();
        iphone7.setMobileCharger(ipm);
        iphone7.charge("Mobile charger successfully connected");

    }
}
