package paquete1;

import java.util.Scanner;

public class Menu {

    //objetos
    Scanner in = new Scanner(System.in);
    TextoBeta txt = new TextoBeta();
    Registro regD = new Dolor();
    Registro regE = new Enfermo();
    Registro regG = new Grave();

    //variables
    boolean correr = true;
    private String accionEnfermera;
    private String saludPokemon;
    private String accionBuscar;
    private String accionBuscarPorSalud;
    private String accionBuscarPorTipo;
   

    //metodo
    public void ejecutarMenu() {
        while (correr) {
            txt.ejecutarMenu();
            accionEnfermera = in.nextLine();
            switch (accionEnfermera) {
                case "1":
                    txt.ejecutarSalud();
                    saludPokemon = in.nextLine();
                    switch (saludPokemon) {
                        case "1":
                            regE.registrar();
                            txt.mostrarSe_a_Inscrito();
                            in.nextLine();
                            break;

                        case "2":
                            regG.registrar();
                            txt.mostrarSe_a_Inscrito();
                            in.nextLine();
                            break;

                        case "3":
                            regD.registrar();
                            txt.mostrarSe_a_Inscrito();
                            in.nextLine();
                            break;
                        default:
                            txt.mostrarOperacionNoValida();
                            in.nextLine();
                            break;
                    }
                    break;

                case "x":
                    correr = false;
                    break;
                    
                case "2":
                    txt.mostrarComoBucarPokemon();
                    accionBuscar = in.nextLine();
                    switch (accionBuscar) {
                        case "1":
                            switch (accionBuscarPorTipo) {
                                case "1":
                                    
                                    
                                    
                                    
                                    
                                    
                                    break;
                                default:
                                    txt.mostrarOperacionNoValida();
                                    in.nextLine();
                                    break;
                            }
                            break;
                            
                        case "2":
                            txt.mostrarBucarPorSalud();
                            accionBuscarPorSalud = in.nextLine();
                            switch (accionBuscarPorSalud) {
                                case "1":
                                    regE.ver();
                                    txt.mostrarPulsaTecla();
                                    in.nextLine();
                                    break;
                                    
                                case "2":
                                    regG.ver();
                                    txt.mostrarPulsaTecla();
                                    in.nextLine();
                                    break;
                                    
                                case "3":
                                    regD.ver();
                                    txt.mostrarPulsaTecla();
                                    in.nextLine();
                                    break;

                                default:
                                    txt.mostrarOperacionNoValida();
                                    in.nextLine();
                                    break;
                            }
                            break;
                        default:
                            txt.mostrarOperacionNoValida();
                            in.nextLine();
                            break;    
                    }
                    break;
                default:
                    txt.mostrarOperacionNoValida();
                    in.nextLine();
                    break;
            }
        }
    }
}
