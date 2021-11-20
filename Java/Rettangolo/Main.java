public class Main {
    public static void main(String[] args) {
        Rettangolo r1=new Rettangolo(5,6);
        Rettangolo r2=new Rettangolo(5,7);

        r1.toString();
        r2.toString();

        if (r1.equals(r2)){
            System.out.println("uguali");
        }
        else
            System.out.println("diversi");
    }
}
