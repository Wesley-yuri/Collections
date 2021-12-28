package dio.digitalinnovation;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));

        System.out.println("---\t Crie um conjunto e adicione as notas\t----");
        System.out.println(notas);

        System.out.println(notas.contains(5d));
        System.out.println(Collections.max(notas));

        // Precisa implementar um iterator para fazer a soma dos elementos
        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }

        System.out.println("Exibe os valores da soma: \t" + soma);
        System.out.println("Exibe os valores da soma: \t" + soma / notas.size());

        notas.remove(0d); //remove o elemento 0.0
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");

        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }


        System.out.println(notas);
        System.out.println("===================");


        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);

        System.out.println(notas3);
        notas2.clear(); // excluir todos os elementos da lista


        System.out.println(notas2.isEmpty());  // verificar se as lista esta vazia
        System.out.println(notas2);
    }
}
