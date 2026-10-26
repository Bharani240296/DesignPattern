package factoryPattern;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Vehicle v=VehicleFactory.driveVehicle("bike");
        v.drive();

        int s=-1;
        convertToBase7(s);
    }

    public static String convertToBase7(int num) {
        List<Integer> list=new ArrayList();
        int li=0;
        if(num>0){
            while(num>0){
                li=li*10+(num%7);
                num=num/7;
            } }
        else{
            while(num<0){
                li=li*10+(num%7);
                num=num/7;
            }
            if (num==0){
                li=li*10+num;
            }
        }
        System.out.println(li);
        return String.valueOf(li);
    }
}
