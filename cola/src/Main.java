//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

 Queue<String>cola = new LinkedList<>();

        System.out.println("Está vacía? " + cola.isEmpty());
        cola.add("Hola");
        cola.add("Chau");
        System.out.println("Está vacía? " + cola.isEmpty());

        System.out.println("Primero: " + cola.peek());
    }
}
