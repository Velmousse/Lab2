public class Adresse {
    private String rue = "", appartement = "", ville = "", province = "", pays = "", numeroCivique = "";

    public String getNumeroCivique() {
        return numeroCivique;
    }

    public void setNumeroCivique(String numeroCivique) {
        if (!numeroCivique.equals("")) this.numeroCivique = numeroCivique;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        if (!rue.equals("")) this.rue = rue;
    }

    public String getAppartement() {
        return appartement;
    }

    public void setAppartement(String appartement) { if (!appartement.equals("")) this.appartement = appartement; }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        if (!ville.equals("")) this.ville = ville;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        if (!province.equals("")) this.province = province;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        if (!pays.equals("")) this.pays = pays;
    }
}
