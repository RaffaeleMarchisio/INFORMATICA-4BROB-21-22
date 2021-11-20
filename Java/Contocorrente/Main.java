public class Main {

    public static void main(String[]args){
        Contocorrente c=new Contocorrente("IT90888888888888888","Raffaele","Marchisio");
        System.out.println(c.toString());
        c.deposito(5000);
        System.out.println(c.toString());
        c.prelievo(2500);
        System.out.println(c.toString());
        System.out.println(c.toString());
    }

}
