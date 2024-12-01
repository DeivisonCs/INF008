package builder.personagem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import builder.arma.BacamarteBuilder;
import model.interfaces.Arma;
import model.interfaces.Personagem;
import model.personagem.SoldadoGuerraSecessao;

public class SoldadoGuerraSecessaoBuilder implements PersonagemBuilder{
    private Double ataqueRapido; 
    private Double ataqueForca;
    private Double ataqueEspecial; 
    private Double defesa;
    private List<Arma> armas = new ArrayList<>(Arrays.asList(new BacamarteBuilder().build()));

    @Override
    public PersonagemBuilder ataqueRapido(Double ataqueRapido) {
        this.ataqueRapido = ataqueRapido;
        return this;
    }

    @Override
    public PersonagemBuilder ataqueForca(Double ataqueForca) {
        this.ataqueForca = ataqueForca;
        return this;
    }

    @Override
    public PersonagemBuilder ataqueEspecial(Double ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
        return this;
    }

    @Override
    public PersonagemBuilder defesa(Double defesa) {
        this.defesa = defesa;
        return this;
    }

    @Override
    public PersonagemBuilder armas(List<Arma> armas) {
        this.armas = armas;
        return this;
    }

    @Override
    public Personagem build() {
        return new SoldadoGuerraSecessao(ataqueRapido, ataqueForca, ataqueEspecial, defesa, armas);
    }

}
