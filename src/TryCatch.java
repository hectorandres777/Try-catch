import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args) {

        System.out.println("*** MENÚ INTERACTIVO ***");

        Scanner consola = new Scanner(System.in);
        var dato = true;

        while (dato) {
            System.out.println(" ")
            System.out.println("1. con manejo de Errores");
            System.out.println("2. sin manejo de errores");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            String opcion = consola.nextLine();

            switch (opcion) {
                case "1":
                    try {
                        System.out.println("ingrese un numero entero: ");
                           int datoDado = Integer.parseInt(consola.nextLine());
                           int operacion = 100 / datoDado;
                        System.out.println("Resultado de 100 / " + datoDado + " = " + operacion);
                    } catch (NumberFormatException e) {
                        System.out.println("\nError, ingresa un valor que sea un entero.");
                    } catch (ArithmeticException e) {
                        System.out.println("\nError, ingresa un valor que no sea cero.");
                    }

                    break;
                case "2":
                    System.out.print("Ingrese un número entero: ");
                       int datoDado2 = Integer.parseInt(consola.nextLine());
                       int operacion = 100 / datoDado2;
                    System.out.println("Resultado de 100 / " + datoDado2 + " = " + operacion);
                    System.out.println("Este mensaje no se mostrará si ocurre una excepción.");
                    break;
                case "3":
                    dato = false;
                    System.out.println("lindo dia :)");
                    break;
                default:
                    System.out.println("Intente de nuevo, opcion invalida");
            }
        }

    }

}



