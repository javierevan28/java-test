import java.util.Scanner;
public class SayHello {
    public static void main(String args[]) {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        nombre = sc.nextLine();
        System.out.println("Hola "+nombre);
    }
}
