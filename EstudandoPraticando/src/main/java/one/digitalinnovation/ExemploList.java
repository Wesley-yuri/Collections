package one.digitalinnovation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>();

        notas.add(3d);

        notas.add(2.d);
        notas.add(1.3);
        notas.add(2.94);
        notas.add(7.2);

        System.out.println("confere se a nota esta na lista \t" + notas.contains(24.94));

        System.out.println(notas);

        Iterator<Double> Iterator = notas.iterator();
        Double soma = 0d;

        while(Iterator.hasNext()){
            Double next = Iterator.next();
            soma += next;
            if(soma > 6) System.out.println("verdadeiro \t" + soma);
            else System.out.println("falso \t" + soma);
        }
        System.out.println("Exibe o valor da soma:" + soma);

        System.out.println(notas.isEmpty());

        System.out.println("remove as notas menores que 7 e exibe a lista");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double  next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        // remove todos elementos da list
        notas.clear();
        // verifica se a list esta vazia
        System.out.println(notas.isEmpty());

        System.out.println(notas);
    }
}
