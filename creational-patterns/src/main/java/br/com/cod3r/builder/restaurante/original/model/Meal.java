package br.com.cod3r.builder.restaurante.original.model;

public class Meal {

    private String suco;
    private String pratoPrincipal;
    private String acompanhamento;
    private String sobremesa;


    public Meal() {
    }

    public String getSuco() {
        return suco;
    }

    public void setSuco(String suco) {
        this.suco = suco;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public String getAcompanhamento() {
        return acompanhamento;
    }

    public void setAcompanhamento(String acompanhamento) {
        this.acompanhamento = acompanhamento;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    @Override
    public String toString() {
        return "Refeição{" +
                "suco='" + suco + '\'' +
                ", pratoPrincipal='" + pratoPrincipal + '\'' +
                ", acompanhamento='" + acompanhamento + '\'' +
                ", sobremesa='" + sobremesa + '\'' +
                '}';
    }
}
