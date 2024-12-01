package builder.personagem;

import java.util.List;

import model.interfaces.Arma;
import model.interfaces.Personagem;

public interface PersonagemBuilder {

    public PersonagemBuilder ataqueRapido(Double ataqueRapido);

    public PersonagemBuilder ataqueForca(Double ataqueForca);
    
    public PersonagemBuilder ataqueEspecial(Double ataqueEspecial);
    
    public PersonagemBuilder defesa(Double defesa);

    public PersonagemBuilder armas(List<Arma> armas);

    public Personagem build();
}
