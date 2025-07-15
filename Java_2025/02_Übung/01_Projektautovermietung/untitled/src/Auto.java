public class Auto extends AbstraktesFahrzeug {
    private int anzSitze;

    public Auto(String marke, String modell, double tagespreis, int anzSitze) {
        super(marke, modell, tagespreis);
        this.anzSitze = anzSitze;
    }

    public int getSitze() {
        return anzSitze;
    }

    @Override
    public String toString() {
        return "Auto: " + marke + " " + modell + ", Sitze: " + anzSitze + ", Preis pro Tag: " + tagespreis + "€";
    }
}
