package builder.arma;

import model.arma.Espada;
import model.interfaces.Arma;

public class EspadaBuilder implements ArmaBuilder{
    private Double adicionalRapido = 2.3;
    private Double adicionalForca = 1.7;
    private Double adicionalEspecial = 2.5;
    private Boolean habilitada = true;

    @Override
    public ArmaBuilder AdicionalForca(Double AdicionalForca) {
        this.adicionalForca = AdicionalForca;
        return this;
    }

    @Override
    public ArmaBuilder AdicionalEspecial(Double AdicionalEspecial) {
        this.adicionalEspecial = AdicionalEspecial;
        return this;
    }

    @Override
    public ArmaBuilder AdicionalRapido(Double AdicionalRapido) {
        this.adicionalRapido = AdicionalRapido;
        return this;
    }

    @Override
    public ArmaBuilder Habilitada(Boolean habilitada) {
        this.habilitada = habilitada;
        return this;
    }
    
    @Override
    public Arma build() {
        return new Espada(adicionalRapido, adicionalForca, adicionalEspecial, habilitada);
    }

}
