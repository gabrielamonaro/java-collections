package Ordenacao;

import java.util.Objects;

public class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    Serie(String nome, String genero, int tempoEpisodio)
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

    public int getTempoEpisodio() {
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
        if(obj == null || getClass() != obj.getClass()) return false;
        Serie serie = (Serie) obj;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio); 
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        
            int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
            int genero = this.getGenero().compareToIgnoreCase(serie.getGenero());
            if (tempoEpisodio != 0 ) return tempoEpisodio;
            return genero;

    }
}
