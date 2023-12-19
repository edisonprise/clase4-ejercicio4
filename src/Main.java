import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        String frase = scanner.nextLine();

        //Contar la cantidad de caracteres
        int cantidadCaracteres = frase.length();
        System.out.println("Cantidad de caracteres: " + cantidadCaracteres);

        // Verificar si contiene una palabra especifica (ejemplo: "hola")
        String palabraBuscada = "hola";
        boolean contienePalabra = frase.toLowerCase().contains(palabraBuscada);
        System.out.println("La frase contiene la palabra 'hola' ?" + contienePalabra);

        // Convertir la frase a minusculas y mayusculas
        String enMinusculas = frase.toLowerCase();
        String enMayusculas = frase.toUpperCase();
        System.out.println("Frase en minusculas: " + enMinusculas);
        System.out.println("Frase en mayusculas: " + enMayusculas);

        // Imprimir solo la primera palabra
        int indiceEspacio = frase.indexOf(" ");
        String primeraPalabra = frase.substring(0, indiceEspacio);
        System.out.println("Primera palabra: " + primeraPalabra);

        //Agregar dos o mas palabras en cualquier punto de la frase
        String fraseModificada = frase + " adicionando mas palabras.";
        System.out.println("Frase modificada: "  + fraseModificada);

        scanner.close();
    }
}