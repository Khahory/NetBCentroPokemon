/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Lugue
 */
public class TextoBeta {
    public void nomPokemon() {
        System.out.println("\nDigite el nombre del pokemon");
    }

    public void tipoPokemon() {
        System.out.println("Digite el tipo del pokemon");
    }

    public void colorPokemon() {
        System.out.println("Digite el color del pokemon");
    }
    
    public void ejecutarMenu(){
        System.out.println("\n\nBienvenido al registro de pokeones del centro pokemon");
        System.out.println("1 --> Registrar pokemon          2 --> Buscar pokemon           x --> Para salir ");
    }

    public void ejecutarSalud() {
        System.out.println("Digite el numero adecuado dependiendo de la salud del pokemon");
        System.out.println("1 --> Enfermo                  2 --> Grave                 3 --> Dolor muscular");
    }

    public void mostrarOperacionNoValida() {
        System.out.println("Opcion no valida");
        System.out.println("\n    ----Pulsa la tecla Enter----");
    }

    public void mostrarSe_a_Inscrito() {
        System.out.println("\n----Se ha inscrito exitosamente----");
        System.out.println("\n  ----Pulsa la tecla Enter----");
    }
    
    public void mostrarComoBucarPokemon(){
        System.out.println("Digite el numero adecuado dependiendo de la busqueda que deseas realizar");
        System.out.println("1 --> Buscar por tipo                  2 --> Buscar por salud");
    }
    
    public void mostrarBucarPorSalud(){
        System.out.println("1 --> Enfermo                  2 --> Grave                 3 --> Dolor muscular");
    }
    
    public void mostrarListaPokemon(){
        System.out.println("Estos son los pokemones que estan registrados: ");
    }
    
    public void mostrarPulsaTecla(){
        System.out.println("\n  ----Pulsa la tecla Enter----");
    }
    
    public void mostrarPokeQueBuscas(){
         System.out.println("Digite el tipo de pokemon que desea buscar");
    }
}
