package Ordenacao;

import java.util.Objects;

public class Serie {
    private String nome;
    private String genero;
    private String tempoEpisodio;

    Serie(String nome, String genero, String tempoEpisodio)
    {
        this.genero = genero;
        this.nome = nome;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public String getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='"+nome+'\''+
                ", genero='" + genero +'\''+
                ", genero='" + tempoEpisodio +'\''+
                '}';
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null ||getClass() != obj.getClass()) return false;
        Serie serie = (Serie) obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }
}
