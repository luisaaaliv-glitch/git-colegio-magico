package com.colegiomagico.reto8;

/**
 * Filtra la lista de ingredientes devolviendo solo aquellos que empiezan con 'A'.
 */
public class InventarioPociones {

    public static java.util.List<String> filtrar(java.util.List<String> ingredientes) {
        java.util.List<String> resultado = new java.util.ArrayList<>();
        if (ingredientes == null) {
            return resultado;
        }

        for (String ingrediente : ingredientes) {
            if (ingrediente != null && ingrediente.startsWith("A")) {
                resultado.add(ingrediente);
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        java.util.List<String> lista = java.util.Arrays.asList("Ajenjo", "Miel");
        System.out.println("Filtrados: " + filtrar(lista));
    }
}