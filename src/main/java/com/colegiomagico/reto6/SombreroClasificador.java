package com.colegiomagico.reto6;

/**
 * Usa Switch. Gryffindor -> Valentia, Ravenclaw -> Inteligencia, otro -> Desconocido.
 */
public class SombreroClasificador {

    public static String clasificar(String casa) {
        if (casa == null) {
            return "Desconocido";
        }

        return switch (casa) {
            case "Gryffindor" -> "Valentia";
            case "Ravenclaw" -> "Inteligencia";
            default -> "Desconocido"; // TODO: Cambia esto
        };
    }

    public static void main(String[] args) {
        System.out.println("Gryffindor: " + clasificar("Gryffindor"));
        System.out.println("Ravenclaw: " + clasificar("Ravenclaw"));
        System.out.println("Slytherin: " + clasificar("Slytherin"));
    }
}