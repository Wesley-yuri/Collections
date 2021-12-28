package dio.digitalinnovation;

import java.util.*;

public class ExemploOrdenadoSet {
    public static void main(String[] args){
        System.out.println("--\t Ordem aleatória \t--");
        Set<Serie> minhasSeries = new HashSet<>(){{
           add(new Serie("got","fantasia",60));
           add(new Serie("dark","drama",60));
           add(new Serie("that '70s show","Comédia",25));
        }};

        for (Serie serie: minhasSeries) System.out.println(serie.getNome()+ "-" + serie.getGereno()+ "-" + serie.getTempoEpisodio());
        System.out.println("\n --");
        System.out.println("\n-- \t Ordem de inserção \t ---");
        Set<Serie> minhasSerie1 = new LinkedHashSet<>(){{
            add(new Serie("Got","Fantasia",60));
            add(new Serie("Dark","Drama",60));
            add(new Serie("That '70s show","Comédia",25));
        }};

        for (Serie serie:minhasSerie1) System.out.println(serie.getNome()+ "-"+ serie.getGereno() + "-"+ serie.getTempoEpisodio());


        System.out.println("--\t Ordem natural (TempoEpisodio) \t-- \n\n");

        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSerie1);

        for (Serie serie:minhasSeries2) System.out.println(serie.getNome()+ "-"+ serie.getGereno()+ "-" + serie.getTempoEpisodio());


        System.out.println("ordem Nome/Genero/TempoEpisodio");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeries);
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome()+ "-"+ serie.getGereno()+ "-" + serie.getTempoEpisodio());


    }
    }



class Serie implements Comparable<Serie>{

    private String nome;
    private String gereno;
    private Integer tempoEpisodio;


    public Serie(String nome, String gereno, Integer tempoEpisodio) {
        this.nome = nome;
        this.gereno = gereno;
        this.tempoEpisodio = tempoEpisodio;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGereno() {
        return gereno;
    }

    public void setGereno(String gereno) {
        this.gereno = gereno;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", gereno='" + gereno + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public int compareTo(Serie serie) {
       int tempoEpisodio = Integer.compare(this.getTempoEpisodio(),serie.getTempoEpisodio());
       if(tempoEpisodio != 0) return tempoEpisodio;

       return this.getGereno().compareTo(serie.getGereno());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && gereno.equals(serie.gereno) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, gereno, tempoEpisodio);
    }
}

class ComparatorNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {

        int nome = s1.getNome().compareTo(s2.getNome());
        if(nome != 0) return nome;

        int genero = s1.getGereno().compareTo(s2.getGereno());
        if(genero != 0) return genero;

        return Integer.compare(s1.getTempoEpisodio(),s2.getTempoEpisodio());

    }
}