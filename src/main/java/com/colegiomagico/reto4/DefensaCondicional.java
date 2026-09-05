package com.colegiomagico.reto4;

/**
 * Si el hechizo es 'Imperius' o 'Crucio', retorna 'Maldicion'. De lo contrario, 'Permitido'.
 */
public class DefensaCondicional {

    public static String evaluar(String hechizo) {
        String a="";
        if (hechizo=="Imperius"|| hechizo=="Crucio"){
            a= a+"Maldicion";
        }else {
            a= a+"Permitido";
        };
        return a; // TODO: Cambia esto
    };

    public static void main(String[] args) {
        System.out.println("Lumos: " + evaluar("Lumos"));
        System.out.println("Crucio: " + evaluar("Crucio"));
    }
}
