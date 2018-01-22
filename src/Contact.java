/**
 * Created by DufVi1731300 on 2018-01-22.
 */
public class Contact {
    static int nbContacts = 0;
    private String prenom = "", nom = "", poste = "";

    Occupation occ = new Occupation();
    Adresse ad = new Adresse();
    Telephone[] tel = new Telephone[10];

    public Contact() {
        nbContacts++;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}
