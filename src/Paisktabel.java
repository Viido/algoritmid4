import java.util.ArrayList;

public class Paisktabel {
    private ArrayList<Isik> isikud;
    private int pikkus;

    public Paisktabel(int pikkus){
        this.isikud = new ArrayList<>(pikkus);
        this.pikkus = pikkus;
    }

    public void lisa(Isik isik){
        int hash = paiskfunktsioon(isik.getID());
        isikud.add(hash,isik);
    }

    public Isik võta(int id){
        int hash = paiskfunktsioon(id);

        return isikud.get(hash);
    }

    public int paiskfunktsioon(int id){
        double T = (Math.sqrt(5)-1)/2;
        int hash = (int)Math.floor(pikkus*(id*T-Math.floor(id*T)));

        return hash;
    }
}
