package adapterPattern;

public class MainAdp {
    public static void main(String[] args) {
        PenAdapter p=new PenAdapter();
        Assignment as=new Assignment();
        as.setPen(p);
        as.writeAssignment("I complete my assignemet part");

    }
}
