public class Aereo {
    private boolean Carbu;
    private int Posti;
    private boolean Motorstate;
    private int Vel;

    public Aereo(int posti) {
        Posti = posti;
    }

    public boolean getCarbu() {
        return Carbu;
    }

    public void setCarbu(boolean carbu) {
        Carbu = carbu;
    }

    public int getPosti() {
        return Posti;
    }

    public void setPosti(int posti) {
        Posti = posti;
    }

    public boolean getMotorstate() {
        return Motorstate;
    }

    public void setMotorstate(boolean motorstate) {
        Motorstate = motorstate;
    }

    public int getVel() {
        return Vel;
    }

    public void setVel(int vel) {
        Vel = vel;
    }
    @Override
    public String toString(){
        if (getCarbu()){
            System.out.println("Carburante pieno");
        }
        else {
            System.out.println("Carburante vuoto");
        }
        if (getMotorstate()){
            System.out.println("Motore Acceso");
        }
        else {
            System.out.println("Motore Spento");
        }
        return "posti:"+getPosti()+" velocità:"+getVel();
    }
}
