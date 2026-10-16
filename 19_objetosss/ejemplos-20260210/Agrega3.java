import java.util.ArrayList;
import java.util.List;

// Clase Pokémon (parte)
class Pokemon {
    private String nombre;

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Entrenador (todo)
class Entrenador {
    private String nombre;
    private List<Pokemon> pokemons;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemons = new ArrayList<>();
    }

    public void capturarPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void mostrarPokemons() {
        System.out.println("Pokémon de " + nombre + ":");
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon.getNombre());
        }
    }
}

// Clase principal
public class Agrega3 {
    public static void main(String[] args) {
        // Crear pokémons
        Pokemon pikachu = new Pokemon("Pikachu");
        Pokemon bulbasaur = new Pokemon("Bulbasaur");

        // Crear entrenador
        Entrenador ash = new Entrenador("Ash");

        // Capturar pokémons
        ash.capturarPokemon(pikachu);
        ash.capturarPokemon(bulbasaur);

        // Mostrar los pokémons del entrenador
        ash.mostrarPokemons();
    }
}

