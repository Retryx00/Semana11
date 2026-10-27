import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("============ SET ============");
        // Conjunto (set)
        Set<String> techComponents = new HashSet<>();


        // Agregamos elementos
        techComponents.add("Keyboard");
        techComponents.add("Hard disk");
        techComponents.add("Graphic card");
        techComponents.add("Memory card");
        techComponents.add("Mouse");
        techComponents.add("Case");


        System.out.println(techComponents);


        if (techComponents.contains("Hard disk")) {
            System.out.println("Hard disk is already in the set.");
        }
        techComponents.remove("Keyboard");
        System.out.println(techComponents);

        // Imprimimos la cantaidad de elementos en el set
        System.out.println(techComponents.size());


        // Devuelve True si la lista esta vacia
        System.out.println(techComponents.isEmpty());


        System.out.println("============ LIST ============");
        // Lista
        List<String> countryList = new ArrayList<>();

        countryList.add("Peru");
        countryList.add("Argentina");
        countryList.add("Peru");
        countryList.add("Chile");
        countryList.add("Bolivia");
        countryList.add("Ecuador");


        System.out.println(countryList);

        // Esta variable almacena el primer elemento de la lista
        String firstElement = countryList.get(0);
        System.out.println("First element: " + firstElement);

        // Insertamos un elemento en una posicion espeficifica
        countryList.set(1, "Colombia");
        System.out.println(countryList);

        // removemos un elemento especificando el nombre del elemento
        countryList.remove("Peru");

        // Reemplazamos el 4 elemento de la lista
        countryList.set(3,"Argentina");
        System.out.println(countryList);



        // Imprimimos el tamano de la lista
        System.out.println(countryList);
        System.out.println("Size of the list: " +
                countryList.size());



        System.out.println("============ MAP ============");
        // Map
        Map<String, Double> stocksMap = new HashMap<>();
        stocksMap.put("AAPL", 135.0);
        stocksMap.put("MSFT", 418.16);
        stocksMap.put("GOOG", 165.05);
        stocksMap.put("AAPL", 235.0);
        stocksMap.put("AAAA", 111.0);
        stocksMap.put("BBBB", 222.0);
        stocksMap.put("CCCC", 333.0);
        stocksMap.put("DDDD", 444.0);
        System.out.println(stocksMap);

        // Agregara un nuevo valor a DDD
        stocksMap.put("DDDD", 555.0);
        System.out.println(stocksMap);



        Double stockPrice = stocksMap.get("MSFT");
        System.out.println("Price of MSFT: " + stockPrice);

        if (stocksMap.containsKey("MSFT")) {
            System.out.println("MSFT is already in the map.");
        }


        stocksMap.remove("MSFT");
        System.out.println(stocksMap);
        System.out.println("Map size: " + stocksMap.size());

        // Devuelve toda las key del MAP
        System.out.println(stocksMap.keySet());

        // Devuelve todo los valores de las Keys del map
        System.out.println(stocksMap.values());
    }
}