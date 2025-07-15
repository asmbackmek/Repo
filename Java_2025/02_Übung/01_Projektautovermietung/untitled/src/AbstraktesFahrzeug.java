public abstract class AbstraktesFahrzeug implements Fahrzeug {
    protected String marke;
    protected String modell;
    protected double tagespreis;

    public AbstraktesFahrzeug(String marke, String modell, double tagespreis) {
        this.marke = marke;
        this.modell = modell;
        this.tagespreis = tagespreis;
    }

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
