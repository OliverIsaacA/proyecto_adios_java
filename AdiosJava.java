import java.util.Scanner;
public class AdiosJava {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Inicio de la operación suma==========");
        System.out.println("Escribe el numero 1: ");
        numero1 = scanner.nextInt();
        System.out.println("Escribe el numero 2: ");
        numero2 = scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("La suma es: " + resultado);
        resta(args);
    }
    public static void resta(String[] args) {
        int num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========Inicio de la operación resta==========");
        System.out.println("Escribe el numero 1: ");
        num1 = scanner.nextInt();
        System.out.println("Escibre el numero 2: ");
        num2 = scanner.nextInt();
        int resta = num1 - num2;
        System.out.println("El resultado de la resta es: " + resta);
    }
}
//Agregar un método que reste dos números
//Agregar una clase persona con setters y getters en otro archivo

//git add -A
//git commit -m "NOMBRE DE COMMIT"
//git push origin main