//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        HashMap<String,Persona> mapaPersonas = new HashMap <String,Persona>();

        Persona p1 = new Persona("Juan", "Soriano", "11223344");
        Persona p2 =new Persona("Sol", "Montevideo", "00998877");

        mapaPersonas.put("00998877", p2);

        Persona personaDelMapa = mapaPersonas.get("00998877");

        System.out.println("Nombre: " + personaDelMapa.getNombre());
        System.out.println("Departamento: " + personaDelMapa.getDepartamento());
        System.out.println("Cedula: " + personaDelMapa.getCedula());
    }
}