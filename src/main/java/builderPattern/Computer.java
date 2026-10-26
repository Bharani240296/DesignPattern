package builderPattern;

public class Computer {
    private String Hdd;
    private String CPU;

    public String getCPU() {
        return CPU;
    }

    public String getHdd() {
        return Hdd;
    }

    private boolean isGraphicCardEnabled;
    private boolean isBluetoothEnable;

    public boolean isGraphicCardEnabled() {
        return isGraphicCardEnabled;
    }

    public boolean isBluetoothEnable() {
        return isBluetoothEnable;
    }
    private Computer(ComputerBuilder builder) {
        this.Hdd=builder.HDD;
        this.CPU= builder.Cpu;
        this.isBluetoothEnable= builder.isBluetoothEnabled;
        this.isGraphicCardEnabled= builder.isGraphicsCardEnabled;
    }

    public static class ComputerBuilder{

        private String HDD;
        private String Cpu;

        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd, String Cpu){
            this.HDD=hdd;
            this.Cpu=Cpu;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
