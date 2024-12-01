package director;

import builder.personagem.PersonagemBuilder;

public class PersonagemDirector {

    private PersonagemBuilder builder;

    public PersonagemDirector(PersonagemBuilder builder) {
		this.builder = builder;
	}

    public void changeBuilder(PersonagemBuilder builder){
        this.builder = builder;
    }

    public void getCruzado(){
        builder
            .ataqueRapido(3.1)
            .ataqueForca(3.5)
            .ataqueEspecial(3.9)
            .defesa(2.2)
            .build();
    }
  
    public void getGolfoSoldier(){
        builder
            .ataqueRapido(2.5)
            .ataqueForca(2.7)
            .ataqueEspecial(3.0)
            .defesa(3.4)
            .build();
    }

    public void getSecessaoSoldier(){
        builder
            .ataqueRapido(1.5)
            .ataqueForca(1.7)
            .ataqueEspecial(2.0)
            .defesa(1.9)
            .build();
    }
}
