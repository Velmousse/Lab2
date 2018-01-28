public class Telephone {
    private String numero = "", infos = "";

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
       if (!numero.equals("")) this.numero = numero;
    }

    public String getInfos() {
        return infos;
    }

    public void setInfos(String infos) {
        if (!infos.equals("")) this.infos = infos;
    }
}
