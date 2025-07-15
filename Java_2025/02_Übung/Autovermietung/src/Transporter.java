public class Transporter extends  AbstraktesFahrzeug{
    private  int ladeVolumen;

    public Transporter(String marke, String modell, double tagespreis, int ladeVolumen) {
        super(marke, modell, tagespreis);
        this.ladeVolumen = ladeVolumen;
    }

    public int getLadeVolumen() {
        return ladeVolumen;
    }
}
