package builderPattern;

public class Main {
    public static void main(String[] args) {
        Computer comp=new Computer.ComputerBuilder("2GB","Intel").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
        System.out.println(comp.getCPU()+" ---> "+comp.getHdd());
    }
}
