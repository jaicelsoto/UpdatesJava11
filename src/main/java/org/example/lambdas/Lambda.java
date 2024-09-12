package org.example.lambdas;

import java.util.stream.IntStream;

public class Lambda {

    public void probar(String seleccion) {
        switch (seleccion) {
            case "PAR":
                IntStream.of(2, 4, 6, 8, 10, 12).filter((var i) -> i % 2 == 0).forEach(System.out::println);
                break;
            case "IMPAR":
                IntStream.of(1, 3, 5, 7, 9, 11, 12).filter((var i) -> i % 2 != 0).forEach(System.out::println);
                break;
        }

    }

    public void sumar() {
        IOperacion operacion = (var x, var y) -> (x + y);
        double resultado = operacion.calcular(2, 2.0);
        System.out.println(resultado);
    }
}
