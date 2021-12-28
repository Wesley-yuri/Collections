package dio.digitalinnovation;


import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {


        System.out.println("\t ordem de Aleatoria \t");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
            put("Duhigg, Charles", new Livro("O poder do hábito", 408));
            put("Harari,Yuval Noah", new Livro("21 Lição para o século 21", 432));
        }};


        for (Map.Entry<String, Livro> Livro : meusLivros.entrySet()) {
            System.out.println(Livro.getKey() + " - " + Livro.getValue().getNome());

        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");


        Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
            put("Harari,Yuval Noah", new Livro("21 Lição Para o Século 21", 432));
        }};

        System.out.println("\t Ordem de Inserção \t");

        for (Map.Entry<String, Livro> Livro : meusLivros1.entrySet()) {

            System.out.println(Livro.getKey() + " - " + Livro.getValue().getNome());
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("\t Ordem alfabética autores \t");

        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> Livro : meusLivros2.entrySet()) {

            System.out.println(Livro.getKey() + " - " + Livro.getValue().getNome());
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("\t Ordem alfabética Livros \t");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> Livro : meusLivros3)
            System.out.println(Livro.getKey() + " - " + Livro.getValue().getNome());
    }
}


class Livro{

    private  String nome;
    private  Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}