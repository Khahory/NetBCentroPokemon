package paquete1;

import java.util.ArrayList;
import java.util.Scanner;

public class Enfermo implements Registro {

    //variables
    private String buscarTipoPoke;

    //ARREGLOS
    public static ArrayList<Pokemon> enfermos = new ArrayList<Pokemon>();
    public ArrayList<String> enfermosTipos = new ArrayList<>();

    //objetos
    TextoBeta txt = new TextoBeta();
    Scanner in = new Scanner(System.in);
    Pokemon poke = new Pokemon();

    public void buscarPokeEspecifico() {
        txt.mostrarPokeQueBuscas();
        buscarTipoPoke = in.nextLine();
        int buscarNum = enfermosTipos.indexOf(buscarTipoPoke);
        

        for (int x = 0; x < 1; x++) {
            Pokemon buscarPoke = enfermos.get(buscarNum);
            System.out.println("\nNombre del pokemon: " + buscarPoke.getNombre());
            System.out.println("Tipo del pokemon: " + buscarPoke.getTipo());
            System.out.println("Color del pokemon: " + buscarPoke.getColor());
        }
    }
    
    @Override
    public void registrar() {
        Pokemon pokereg = new Pokemon();
        txt.nomPokemon();
        pokereg.setNombre(in.nextLine());

        txt.tipoPokemon();
        pokereg.setTipo(in.nextLine());

        txt.colorPokemon();
        pokereg.setColor(in.nextLine());
        enfermos.add(pokereg);
        enfermosTipos.add(pokereg.getTipo());
    }

    @Override
    public void ver() {
        if (enfermos.isEmpty()) {
            System.out.println("Aun no se han inscripto los pokemones");
        } else {
            Pokemon pokever;
            txt.mostrarListaPokemon();
            for (int x = 0; x < enfermos.size(); x++) {
                pokever = enfermos.get(x);
                System.out.println("Nombre del pokemon: " + pokever.getNombre());
                System.out.println("Tipo del pokemon: " + pokever.getTipo());
                System.out.println("Color del pokemon: " + pokever.getColor());
            }
        }
    }

}
