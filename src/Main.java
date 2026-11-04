import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        {

            int edad;
            System.out.println("Bienvenido a Cines ABC");
            System.out.print("Introduzca su edad: ");
            Scanner scanner = new Scanner(System.in);
            edad = scanner.nextInt();

            if (edad < 13) {
                System.out.println("Se le aplicará la tarifa para niños.");
            }

            else {
                System.out.println("Se le aplicará la tarifa de adulto.");
            }
        }

    }
}