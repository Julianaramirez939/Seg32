package Ejercicio2;
import java.util.Scanner;
public class Main{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Cuentas cuentas = new Cuentas();

    int opcion;

    do {
        System.out.println("Menú: ");
        System.out.println("1. Visualizar saldo Cuenta Corriente");
        System.out.println("2. Visualizar saldo Cuenta de Ahorros");
        System.out.println("3. Visualizar saldo CDT");
        System.out.println("4. Visualizar saldo total");
        System.out.println("5. Invertir en CDT");
        System.out.println("6. Cerrar inversión en CDT");
        System.out.println("7. Consignar en Cuenta Corriente");
        System.out.println("8. Retirar de Cuenta Corriente");
        System.out.println("9. Consignar en Cuenta de Ahorros");
        System.out.println("10. Retirar de Cuenta de Ahorros");
        System.out.println("0. Salir");

        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Saldo Cuenta Corriente: $" + cuentas.getSaldoCuentaCorriente());
                break;
            case 2:
                System.out.println("Saldo Cuenta de Ahorros: $" + cuentas.getSaldoCuentaAhorros());
                break;
            case 3:
                System.out.println("Saldo CDT: $" + cuentas.getSaldoCDT());
                break;
            case 4:
                System.out.println("Saldo Total: $" + cuentas.getSaldoTotal());
                break;
            case 5:
                System.out.print("Monto de inversión en CDT: $");
                double montoInversionCDT = scanner.nextDouble();
                cuentas.invertirEnCDT(montoInversionCDT);
                break;
            case 6:
                cuentas.cerrarInversionCDT();
                break;
            case 7:
                System.out.print("Monto a consignar en Cuenta Corriente: $");
                double montoConsignacionCC = scanner.nextDouble();
                cuentas.consignarEnCuentaCorriente(montoConsignacionCC);
                break;
            case 8:
                System.out.print("Monto a retirar de Cuenta Corriente: $");
                double montoRetiroCC = scanner.nextDouble();
                cuentas.retirarDeCuentaCorriente(montoRetiroCC);
                break;
            case 9:
                System.out.print("Monto a consignar en Cuenta de Ahorros: $");
                double montoConsignacionCA = scanner.nextDouble();
                cuentas.consignarEnCuentaAhorros(montoConsignacionCA);
                break;
            case 10:
                System.out.print("Monto a retirar de Cuenta de Ahorros: $");
                double montoRetiroCA = scanner.nextDouble();
                cuentas.retirarDeCuentaAhorros(montoRetiroCA);
                break;
        }
    } while (opcion != 0);

    System.out.println("...............");
}
}