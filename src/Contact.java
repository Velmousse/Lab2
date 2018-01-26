public class Contact {
    static int nbContacts = 0;
    private int nbTelephones = 0;
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
        if (!prenom.equals("")) this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (!nom.equals("")) this.nom = nom;
    }

    public int getNbTelephones() {
        return nbTelephones;
    }

    public void addNbTelephones() {
        tel[this.nbTelephones] = new Telephone();
        this.nbTelephones++;
    }
}
