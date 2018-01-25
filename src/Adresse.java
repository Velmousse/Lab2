/**
 * Created by DufVi1731300 on 2018-01-22.
 */
public class Adresse {
    private int numeroCivique = 0;
    private String rue = "", appartement = "", ville = "", province = "", pays = "";

    public int getNumeroCivique() {
        return numeroCivique;
    }

    public void setNumeroCivique(int numeroCivique) {
        this.numeroCivique = numeroCivique;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getAppartement() {
        return appartement;
    }

    public void setAppartement(String appartement) { if (appartement != "*") this.appartement = appartement; }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
