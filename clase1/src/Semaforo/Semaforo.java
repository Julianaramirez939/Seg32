package Semaforo;

public class Semaforo {
    public String color;
    public String mostrarMensaje() {
        if (this.color.equals("Red")){
            return "Stop";
        } else if (this.color.equals("Green")){
            return "Go";
        } else{
            return "ReadyGo";
        }
    }
}
