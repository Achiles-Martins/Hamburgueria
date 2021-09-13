public class Combo {

    private String sanduiche;
    private String batata;
    private String salada;
    private String refrigerante;

    public Combo() {
        this.setSanduiche("");
        this.setBatata("");
        this.setSalada("");
        this.setRefrigerante("");
    }

    public Combo(String sanduiche, String batata, String salada, String refrigerante) {
        this.setSanduiche(sanduiche);
        this.setBatata(batata);
        this.setSalada(salada);
        this.setRefrigerante(refrigerante);
    }

    public String getSanduiche() {
        return sanduiche;
    }

    public void setSanduiche(String sanduiche) {
        this.sanduiche = sanduiche;
    }

    public String getBatata() {
        return batata;
    }

    public void setBatata(String batata) {
        this.batata = batata;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String getRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(String refrigerante) {
        this.refrigerante = refrigerante;
    }
}
