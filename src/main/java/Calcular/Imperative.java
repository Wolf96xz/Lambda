package Calcular;

import Interrface.IListElements;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Imperative {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(18,6,4,15,55,78,12,9,8);
        int numerosM10 = 0;

        for (int i:
             numbers) {
            if (i > 10){
                numerosM10++;
            }

        }

        System.out.println("Cantidad de numeros mayores de 10: " +numerosM10);

/*
        IListElements vs = list -> {
            numbers.forEach(n -> System.out.println("Numeros lista: " +n) );
        };
*/
   //   vs.showList(numbers);

        IListElements count = lista -> numbers.stream().filter(n -> n > 10).count();

        count.showList(numbers);

        count.showList(numbers);

        System.out.println(numbers.stream().filter(n -> n > 10).count());

        List<String> jugadores = List.of("azul", "verde", "rojo", "amarillo", "rosa");


        jugadores.stream().filter(s -> !s.equals("rojo")).map(color -> color.toUpperCase()).forEach(System.out::println);


        List<Producto> shoppingCart = List.of(new Producto("Clothes", new BigDecimal("15.90"), Impuesto.NORMAL),
                new Producto("Bread", new BigDecimal("1.5"), Impuesto.SUPERREDUCED),
                new Producto("Meat", new BigDecimal("13.99"), Impuesto.REDUCED),
                new Producto("Cheese", new BigDecimal("3.59"), Impuesto.SUPERREDUCED),
                new Producto("Coke", new BigDecimal("1.89"), Impuesto.REDUCED),
                new Producto("Whiskey", new BigDecimal("19.90"), Impuesto.NORMAL));


        Object s = shoppingCart.stream().filter(p -> p.name.charAt(0) == 'C').map(n -> n.name).collect(Collectors.toSet());

        Object price = shoppingCart.stream().mapToDouble(p -> p.price.multiply((BigDecimal.valueOf(p.impuesto.getPercent())).divide(new BigDecimal(100))).add(p.price).doubleValue()).sum();

        System.out.println("Precio total: " + price);
        System.out.println("Productos por c: " +s);

      // shoppingCart.stream().map(imp -> imp.price.multiply((BigDecimal) imp.impuesto / 100))









    }
}
