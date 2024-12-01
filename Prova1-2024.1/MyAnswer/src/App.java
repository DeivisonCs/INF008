import java.util.ArrayList;
import java.util.Arrays;

import builder.arma.ArmaBuilder;
import builder.arma.BacamarteBuilder;
import builder.arma.EspadaBuilder;
import builder.arma.MetralhadoraBuilder;
import builder.personagem.CruzadoBuilder;
import builder.personagem.PersonagemBuilder;
import builder.personagem.SoldadoGuerraGolfoBuilder;
import builder.personagem.SoldadoGuerraSecessaoBuilder;
import director.PersonagemDirector;
import model.interfaces.Arma;
import model.interfaces.Personagem;

public class App {

    private void run1(){
        PersonagemBuilder builderCruzado = new CruzadoBuilder();
        PersonagemBuilder builderGolfoSoldier = new SoldadoGuerraGolfoBuilder();
        PersonagemBuilder builderSecessaoSoldier = new SoldadoGuerraSecessaoBuilder();

        Personagem cruzado = builderCruzado
            .ataqueRapido(3.1)
            .ataqueForca(3.5)
            .ataqueEspecial(3.9)
            .defesa(2.2)
            .build();

        Personagem golfoSoldier = builderGolfoSoldier
            .ataqueRapido(2.5)
            .ataqueForca(2.7)
            .ataqueEspecial(3.0)
            .defesa(3.4)
            .build();

        Personagem secessaoSoldier = builderSecessaoSoldier
            .ataqueRapido(1.5)
            .ataqueForca(1.7)
            .ataqueEspecial(2.0)
            .defesa(1.9)
            .build();

        System.out.println(cruzado);
        System.out.println("\n");
        System.out.println(golfoSoldier);
        System.out.println("\n");
        System.out.println(secessaoSoldier);
        System.out.println("\n");
    }

    private void run2(){
        ArmaBuilder espadaBuilder = new EspadaBuilder();
        ArmaBuilder bacamarteBuilder = new BacamarteBuilder();
        ArmaBuilder metralhadoraBuilder = new MetralhadoraBuilder();

        Arma espada = espadaBuilder
            .build();

        Arma bacamarte = bacamarteBuilder
            .AdicionalEspecial(4.0)
            .build();

        Arma metralhadora = metralhadoraBuilder
            .AdicionalRapido(5.0)
            .build();

        System.out.println(espada);
        System.out.println("\n");
        System.out.println(bacamarte);
        System.out.println("\n");
        System.out.println(metralhadora);
        System.out.println("\n");
    }

    private void run3(){
        PersonagemBuilder cruzadoBuilder = new CruzadoBuilder();
        PersonagemDirector director = new PersonagemDirector(cruzadoBuilder);

        PersonagemBuilder golfoBuilder = new SoldadoGuerraGolfoBuilder();

        ArmaBuilder espadaBuilder = new EspadaBuilder();
        ArmaBuilder metralhadoraBuilder = new MetralhadoraBuilder();

        Arma espada = espadaBuilder
            .build();
            
        Arma metralhadora = metralhadoraBuilder
            .AdicionalRapido(4.2)
            .build();

        director.getCruzado();
        Personagem cruzado = cruzadoBuilder.build();
        // Personagem cruzado = cruzadoBuilder
        //     .build();

        director.changeBuilder(golfoBuilder);
        director.getGolfoSoldier();
        golfoBuilder.armas(new ArrayList<>(Arrays.asList(metralhadora, espada)));
        Personagem golfoSoldier = golfoBuilder.build();
        // Personagem golfoSoldier = golfoBuilder
        //     .armas(new ArrayList<>(Arrays.asList(metralhadora, espada)))
        //     .build();

        System.out.println(cruzado);
        System.out.println("\n");
        System.out.println(golfoSoldier);
        System.out.println("\n");

    }

    public static void main(String[] args) throws Exception {
        // (new App()).run1();
        // (new App()).run2();
        (new App()).run3();
    }
}
