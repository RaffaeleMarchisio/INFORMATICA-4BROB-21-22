public class Rettangolo {
    private int a;
    private int b;
    private int Area;
    private int Perim;

    public Rettangolo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int calcolaArea(){
        return a*b;
    }
    public int calcolaPerimetro(){
        return a*2+b*2;
    }
    @Override
    public String toString(){
        return "lato1:"+this.a+" lato2";
    }
    @Override
    public boolean equals(Object obj){
        return ((Rettangolo)obj).getA()==this.a&&((Rettangolo)obj).getB()==this.b;
    }
}
