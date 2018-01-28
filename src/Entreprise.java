public class Entreprise {
    private String nom = "";

    Adresse ad = new Adresse();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (!nom.equals("")) this.nom = nom;
    }
}
