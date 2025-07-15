public class Auto extends  AbstraktesFahrzeug{
    private  int anzSitze;

    public Auto(String marke, String modell, double tagespreis, int anzSitze) {
        super(marke, modell, tagespreis);
        this.anzSitze = anzSitze;
    }

    public int getSitze() {
        return anzSitze;
    }
}
