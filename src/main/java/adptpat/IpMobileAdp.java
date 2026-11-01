package adptpat;

public class IpMobileAdp implements MobileCharger{
    Ipone6 ip6=new Ipone6();
    @Override
    public void plugIn(String s) {
        ip6.charge(s);
    }
}
