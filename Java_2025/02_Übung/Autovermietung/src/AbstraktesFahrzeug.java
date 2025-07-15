public abstract class AbstraktesFahrzeug implements  Fahrzeug{
    private String marke;
    private String modell;
    private double tagespreis;

    public  AbstraktesFahrzeug(String marke, String modell, double tagespreis){
        this.marke = marke;
        this.modell = modell;
        this.tagespreis = tagespreis;
    }
    // implement the Methods of the Fahrzeug Interface
    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    public double getTagespreis() {
        return tagespreis;
    }

}
