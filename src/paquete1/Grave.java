
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;


public class Grave implements Registro{
    //arraylist
       public static ArrayList<Pokemon> graves = new ArrayList<Pokemon>();
       
        //objetos
           TextoBeta txt = new TextoBeta();
           Scanner in = new Scanner(System.in);
           Pokemon poke = new Pokemon();
       
    @Override
    public void registrar() {
        Pokemon pokereg = new Pokemon();
        txt.nomPokemon();
        pokereg.setNombre(in.nextLine());

        txt.tipoPokemon();
        pokereg.setTipo(in.nextLine());

        txt.colorPokemon();
        pokereg.setColor(in.nextLine());
        graves.add(pokereg);
    }

    @Override
    public void ver() {
         if(graves.isEmpty()){
            System.out.println("Aun no se han inscripto los pokemones");
        } else{
        Pokemon pokever;
        txt.mostrarListaPokemon();
        for (int x = 0; x < graves.size(); x++) {
            pokever = graves.get(x);
            System.out.println("Nombre del pokemon: " + pokever.getNombre());
            System.out.println("Tipo del pokemon: " + pokever.getTipo());
            System.out.println("Color del pokemon: " + pokever.getColor());
        }
        }
    }
}
