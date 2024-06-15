import java.util.HashMap;

public class ConHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> personas = new HashMap<>();
        personas.put("Juan", 30);
        personas.put("María", 25);
        personas.put("Pedro", 35);

        System.out.println("Personas y sus edades:");
        for (String nombre : personas.keySet()) {
            System.out.println(nombre + ": " + personas.get(nombre));
        }


	}

}
