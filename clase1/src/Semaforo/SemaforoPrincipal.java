package Semaforo;

public class SemaforoPrincipal {
    public static void main(String[] args) {
        Semaforo semaforo = new Semaforo();
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese");
        semaforo.color = lector.nextString();
        semaforo.color = "Green";
        System.out.println(semaforo.mostrarMensaje());
    }
}
