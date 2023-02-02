package Ordenacao;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));
        }};

        System.out.println("--- Ordem aleatória: ---");
        for(Serie serie: minhasSeries)
        {
            System.out.println(serie.getNome() +
             " - " + serie.getGenero() + 
             "-" + serie.getTempoEpisodio());
        }


    System.out.println("--- Ordem de inserção: ---");
    
    Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
        add(new Serie("got", "fantasia", 60));
        add(new Serie("dark", "drama", 60));
        add(new Serie("that '70s show", "comédia", 25));
    }};
    for(Serie serie: minhasSeries1)
    {
        System.out.println(serie.getNome() +
         " - " + serie.getGenero() + 
         "-" + serie.getTempoEpisodio());
    }
    



    System.out.println("--- Ordem natural: (TempoEpisodio) ---");
    Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
    System.out.println(minhasSeries2);
 


    System.out.println("--- Ordem (Nome/Genero/TempoEpisodio) ---");
    Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
    minhasSeries3.addAll(minhasSeries);
    System.out.println(minhasSeries3);

    





    }
}
