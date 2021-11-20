

public class telefono {
    private int Luminos;
    private boolean schermo;
    private int vol;
    private int grandezza;

    public telefono(int luminos, boolean schermo, int vol, int grandezza) {
        Luminos = luminos;
        this.schermo = schermo;
        this.vol = vol;
        this.grandezza = grandezza;
    }

    public int getLuminos() {
        return Luminos;
    }

    public void setLuminos(int luminos) {
        Luminos = luminos;
    }

    public boolean getSchermo() {
        return schermo;
    }

    public void setSchermo(boolean schermo) {
        this.schermo = schermo;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public int getGrandezza() {
        return grandezza;
    }

    public void setGrandezza(int grandezza) {
        this.grandezza = grandezza;
    }
    @Override
    public boolean equals(Object o){
        return ((telefono)o).getSchermo()==this.schermo&&((telefono)o).getVol()==this.vol&&((telefono)o).getGrandezza()==this.grandezza&&((telefono)o).getLuminos()==this.Luminos;
    }
}
