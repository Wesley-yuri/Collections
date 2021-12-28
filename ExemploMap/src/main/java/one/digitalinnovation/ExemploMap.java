package one.digitalinnovation;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args){

        Map<String,Double> carrosPopulares = new HashMap<>(){{

            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);

        }};
            System.out.println(carrosPopulares);

        System.out.println("substitua o comsumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol",16.1);
        System.out.println(carrosPopulares);

        System.out.println("====================================");


        System.out.println("confira se o modelo gol esta no dicionario: \t" + carrosPopulares.containsKey("gol"));

        System.out.println("======================================");

        System.out.println("exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("======================================");

        System.out.println("exiba o modelos:");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("=====================================");


        System.out.println("exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("=====================================");


        Double ConsumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();

        String ModeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry: entries ) {
            if (entry.getValue().equals(ConsumoMaisEficiente)) {
                ModeloMaisEficiente = entry.getKey();
                System.out.println("modelos mais eficiente: " + ModeloMaisEficiente + " - " + ConsumoMaisEficiente);
            }
        }

        System.out.println("=====================================");

        System.out.println("Exiba o modelo menos economico e seu consumo");
            Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
            String modeloMenosEficiente = "";
            for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
                if (entry.getValue().equals(consumoMenosEficiente)){
                    modeloMenosEficiente = entry.getKey();
                    System.out.println("modelo menos eficiente: "  + modeloMenosEficiente + " - "+ consumoMenosEficiente);
                }
            }

            Iterator<Double> iterator = carrosPopulares.values().iterator();
            Double soma = 0d;
            while (iterator.hasNext()){
                soma += iterator.next();
            }
        System.out.println("Exiba a soma dos consumos: " + soma);
        System.out.println("--------------------------------------");
        System.out.println("Exiba a média dos consumos deste dicionário de carros: "+ (soma/carrosPopulares.size()));

        System.out.println("--------------------------------------");
        System.out.println("Remova os modelos com consumo igual a 15,6 km/l: ");
        System.out.println(carrosPopulares);
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("=================================");

        System.out.println("exiba todos os carros na ordem em que foram informados: ");

        Map<String,Double> carrosPopulares1 = new LinkedHashMap<>(){{

            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);

        }};
        System.out.println(carrosPopulares1);

        System.out.println("=================================");


        Map<String,Double> carrosPopulares2 = new TreeMap<>(){{

            put("gol",14.4);
            put("uno",15.6);
            put("mobi",16.1);
            put("hb20",14.5);
            put("kwid",15.6);

        }};
        System.out.println(carrosPopulares2);
        System.out.println("======================================");
        System.out.println("Apaga o dicionario de Carros");
        carrosPopulares.clear();
        System.out.println(carrosPopulares);

        System.out.println("Confira se a lista está vazia: " + carrosPopulares1.isEmpty());
        System.out.println("\t\t===== FIM ====");

    }
}
