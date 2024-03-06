package Ejercicio5;
import java.util.ArrayList;

public class TurnoDAO {
    private ArrayList<Turno> turnos;


    public TurnoDAO() {
        this.turnos = new ArrayList<>();
    }


    public void agregarTurno(Turno turno) {
        turnos.add(turno);
    }


    public void mostrarTurnos() {
        System.out.println("Lista de los Turnos ");
        for (Turno turno : turnos) {
            System.out.println(turno);
        }
        System.out.println("-------------------------------");
    }
}