public class Treno {
    private float carburante;
    private int posti;
    private boolean Motorstate;
    private int Vel;

    public Treno(float carburante, int posti, boolean motorstate, int vel) {
        this.carburante = carburante;
        this.posti = posti;
        Motorstate = motorstate;
        Vel = vel;
    }

    public void setCarburante(float carburante) {
        this.carburante = carburante;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    public void setMotorstate(boolean motorstate) {
        Motorstate = motorstate;
    }

    public void setVel(int vel) {
        Vel = vel;
    }

    public float getCarburante() {
        return carburante;
    }

    public int getPosti() {
        return posti;
    }

    public boolean getMotorstate() {
        return Motorstate;
    }

    public int getVel() {
        return Vel;
    }

    @Override
    public String toString() {
        return "Treno:" + "carburante=" + carburante + ", posti=" + posti + ", Motorstate=" + Motorstate + ", Vel=" + Vel;
    }
    @Override
    public boolean equals(Object obj){
        return ((Treno)obj).getVel()==this.getVel() && ((Treno)obj).getCarburante() ==this.getCarburante()
                && ((Treno)obj).getMotorstate() == this.getMotorstate() && ((Treno)obj).getPosti()==this.getPosti();
    }
}
