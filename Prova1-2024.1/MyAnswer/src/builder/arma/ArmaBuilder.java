package builder.arma;

import model.interfaces.Arma;

public interface ArmaBuilder {
    public ArmaBuilder AdicionalForca(Double AdicionalForca);
    public ArmaBuilder AdicionalEspecial(Double AdicionalEspecial);
    public ArmaBuilder AdicionalRapido(Double AdicionalRapido);
    public ArmaBuilder Habilitada(Boolean habilitada);
    public Arma build();
}
