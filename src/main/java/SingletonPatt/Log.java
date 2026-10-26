package SingletonPatt;

 class Loggger {
    private static  Loggger log = null;
    private Loggger(){}
    public static Loggger getInstance(){
        if (log==null){
            log= new Loggger();
        }
        return log;
    }
}
class Log{
    public static void main(String[] args) {
        Loggger log=Loggger.getInstance();
        Loggger  log2=Loggger.getInstance();
        System.out.println(log+"  " +log.hashCode()+ "  "+Integer.toHexString(log.hashCode())+ "  "+log2.hashCode());

        long s=0x333333333l;
        int b=Long.bitCount((long) s);
        System.out.println(b);
        int a=90;
        String s9= String.valueOf(a);

    }
}

