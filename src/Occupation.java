public class Occupation {
    String poste = "";

    Entreprise ent = new Entreprise();

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        if (!poste.equals("")) this.poste = poste;
    }
}
