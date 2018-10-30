public class Isik {
    private int ID;
    private String nimi;
    private int palk;
    private int vanus;

    public Isik(int ID, String nimi, int palk, int vanus) {
        this.ID = ID;
        this.nimi = nimi;
        this.palk = palk;
        this.vanus = vanus;
    }

    public int getID() {
        return ID;
    }

    public String getNimi() {
        return nimi;
    }

    public double getPalk() {
        return palk;
    }

    public double getVanus() {
        return vanus;
    }

    public String toString() {
        return "Isik nr." + ID + " " + nimi;
    }
}
