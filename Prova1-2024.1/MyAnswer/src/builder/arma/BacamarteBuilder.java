package builder.arma;

import model.arma.Bacamarte;
import model.interfaces.Arma;

public class BacamarteBuilder implements ArmaBuilder {
    private Double adicionalRapido = 1.2;
    private Double adicionalForca = 3.2;
    private Double adicionalEspecial = 3.5;
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
        return new Bacamarte(adicionalRapido, adicionalForca, adicionalEspecial, habilitada);
    }
}
