public class Contocorrente {
    private int Denaro;
    private String IBAN;
    private String Nome;
    private String Cognome;

    public Contocorrente(String IBAN, String nome, String cognome) {
        Denaro=0;
        this.IBAN = IBAN;
        setCognome(cognome);
        setNome(nome);
    }
    public void prelievo(int d){
        Denaro-=d;
    }

    public void deposito(int d){
        Denaro+=d;
    }

    private void setDenaro(int denaro) {
        Denaro = denaro;
    }

    private void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    private void setNome(String nome) {
        Nome = nome;
    }

    private void setCognome(String cognome) {
        Cognome = cognome;
    }

    public int getDenaro() {
        return Denaro;
    }

    public String getIBAN() {
        return IBAN;
    }

    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }
    @Override
    public String toString(){
        return "IBAN:"+this.IBAN+" Nome:"+this.Nome+" Cognome:"+this.Cognome+" denaro:"+this.Denaro;
    }
}
