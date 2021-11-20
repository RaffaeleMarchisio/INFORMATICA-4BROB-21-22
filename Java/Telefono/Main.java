public class Main {
    public static void main(String[] args) {
        telefono t1=new telefono(100,true,100,50);
        telefono t2=new telefono(100,false,40,25);

        if (t1.equals(t2))
            System.out.println("uguali");
        else System.out.println("diversi");
    }
}
