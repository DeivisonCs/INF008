package model.arma;

import model.interfaces.Arma;

public class Bacamarte implements Arma{
    private Double adicionalRapido;
    private Double adicionalForca;
    private Double adicionalEspecial;
    private Boolean habilitada;

    public Bacamarte(Double adicionalRapido, Double adicionalForca, Double adicionalEspecial, Boolean habilitada) {
        this.adicionalRapido = adicionalRapido;
        this.adicionalForca = adicionalForca;
        this.adicionalEspecial = adicionalEspecial;
        this.habilitada = habilitada;
    }

    @Override
    public Double getAdicionalRapido() {
        return this.adicionalRapido;
    }

    @Override
    public Double getAdicionalForca() {
        return this.adicionalForca;
    }

    @Override
    public Double getAdicionalEspecial() {
        return this.adicionalEspecial;
    }

    @Override
    public Boolean habilitada() {
        return this.habilitada;
    }

    @Override
    public String toString() {
        return "Bacamarte [adicionalRapido=" + adicionalRapido + ", adicionalForca=" + adicionalForca
                + ", adicionalEspecial=" + adicionalEspecial + ", habilitada=" + habilitada + "]";
    }
}
