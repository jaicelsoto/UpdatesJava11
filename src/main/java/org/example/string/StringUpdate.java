package org.example.string;

import java.util.stream.Collectors;

public class StringUpdate {
    public void estaVacio(String texto){
        System.out.println(texto.isBlank());
    }
    public void repetir(String texto, int cantidad){
        var repetido = texto.repeat(cantidad);
        System.out.println(repetido);
    }

    public void convertitLista(String texto){
        System.out.println(texto.lines().collect(Collectors.toList()));
    }

    public void removerEspacios(String texto){
        System.out.println(texto.strip());
        System.out.println(texto.stripLeading());
        System.out.println(texto.stripTrailing());
        System.out.println(texto.stripIndent());
        System.out.println(texto.trim());
    }

    public static void main(String[] args) {
        StringUpdate stringUpdate = new StringUpdate();
        /*
        stringUpdate.repetir("test", 3);
        stringUpdate.convertitLista("1,2,3,da,12313,333");
        */
        stringUpdate.removerEspacios(" Hola Code ");
    }
}
