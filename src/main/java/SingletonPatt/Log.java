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
        System.out.println(log==log2);
    }
}

