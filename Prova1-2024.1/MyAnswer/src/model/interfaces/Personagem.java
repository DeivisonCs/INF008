package model.interfaces;

import java.util.List;

public interface Personagem {

    public Double getAtaqueRapido();

    public Double getAtaqueForca();

    public Double getAtaqueEspecial();

    public Double getDefesa();

    public List<Arma> getArmas();
    
}
