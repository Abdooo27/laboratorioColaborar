import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        {

            int edad1;
            System.out.println("Bienvenido a Cines ABC-Mateo y Abdo");
            System.out.print("Introduzca su edad: ");
            Scanner scanner = new Scanner(System.in);
            edad1 = scanner.nextInt();

            if (edad1 < 13) {
                System.out.println("Se le aplicará la tarifa para niños.");
                System.out.print(" 6.99€");
            }

            else {
                System.out.println("Se le aplicará la tarifa de adulto.");
                System.out.print(" 9.99€");
            }
        }

    }
}