public class Main {
    public static void main(String[] args) {
        Treno t1=new Treno(150,200,true,250);
        Treno t2=new Treno(150,150,false,300);
        t1.toString();
        if (t1.equals(t2)){
            System.out.println("i due oggetti sono uguali");
        }
        else
            System.out.println("diversi");
    }
}
