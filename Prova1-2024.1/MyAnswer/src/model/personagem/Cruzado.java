package model.personagem;

import java.util.List;

import model.interfaces.Arma;
import model.interfaces.Personagem;

public class Cruzado implements Personagem{
    private Double ataqueRapido;
    private Double ataqueForca;
    private Double ataqueEspecial; 
    private Double defesa;
    private List<Arma> armas;

    public Cruzado(Double ataqueRapido, Double ataqueForca, Double ataqueEspecial, Double defesa, List<Arma> armas) {
        this.ataqueRapido = ataqueRapido;
        this.ataqueForca = ataqueForca;
        this.ataqueEspecial = ataqueEspecial;
        this.defesa = defesa;
        this.armas = armas;
    }

    @Override
    public Double getAtaqueRapido() {
        return ataqueRapido;
    }

    @Override
    public Double getAtaqueForca() {
        return ataqueForca;
    }

    @Override
    public Double getAtaqueEspecial() {
        return ataqueEspecial;
    }

    @Override
    public Double getDefesa() {
        return defesa;
    }

    @Override
    public List<Arma> getArmas() {
        return armas;
    }

    @Override
    public String toString() {
        return "Cruzado [\n" + 
            "\tAtaqueRapido: " + ataqueRapido + 
            "\t\nAtaqueForca: " + ataqueForca + 
            "\t\nAtaqueEspecial: "+ ataqueEspecial + 
            "\t\nDefesa: " + defesa + 
            "\t\nArmas: [\n" +
            "\n" + armas.toString() +   
        "\n]";
    }

}
