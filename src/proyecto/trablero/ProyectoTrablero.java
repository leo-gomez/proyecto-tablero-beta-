package proyecto.trablero;

import clases.Entrenador;
import clases.Equipo;
import clases.Jugador;
import clases.Tablero;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import Thread.thread;


public class ProyectoTrablero {    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Thread hilo = new thread("proceso");
        
        boolean salir=false;
        boolean partido=false;
        
        Entrenador entrenador1 = new Entrenador("Martin ",45, (float) 1.70);
        Entrenador entrenador2 = new Entrenador("esteban", 37, (float) 1.76);
        
        Jugador jugador1 = new Jugador("Adrian", 27, (float) 1.90, true, 0, 0);
        Jugador jugador2 = new Jugador("Cristian",20 , (float)1.88, true, 0, 0);
        Jugador jugador3 = new Jugador("Martin",30 , (float)2.10, true, 0, 0);
        Jugador jugador4 = new Jugador("Nicolas",25 , (float)2.08, true, 0, 0);
        Jugador jugador5 = new Jugador("Leonel",22 , (float)1.70, true, 0, 0);
        Jugador jugador6 = new Jugador("lebrone",32 , (float)2.15, true, 0, 0);
        Jugador jugador7 = new Jugador("Pablo",24 , (float)1.95, true, 0, 0);
        Jugador jugador8 = new Jugador("Ricardo",34 , (float)2.20, true, 0, 0);
        
        Tablero tablero = new Tablero(0, 0, 0, false ,false , 0); 
        
        ArrayList<Jugador> equipo1 = new ArrayList<>();
        equipo1.add(jugador1);
        equipo1.add(jugador2);
        equipo1.add(jugador3);
        equipo1.add(jugador4);
        
        ArrayList<Jugador> equipo2 = new ArrayList<>();
        equipo2.add(jugador5);
        equipo2.add(jugador6);
        equipo2.add(jugador7);
        equipo2.add(jugador8);
        
        Equipo Equipo1 = new Equipo("Los genericos", entrenador1, equipo1,0);
        Equipo Equipo2 = new Equipo("nombre a eleccion", entrenador2, equipo2,0);
               
        do {
            
            System.out.println("  Menu del tablero");
        System.out.println("╔============================╗");
        System.out.println("║1)mostrar equipo 1          ║");
        System.out.println("║2)Mostrar equipo 2          ║");
        System.out.println("║3)Empezar partido           ║");
        System.out.println("║4) salir                    ║");
        System.out.println("╚============================╝");
        
        
        
            int menu = sc.nextInt();
        switch(menu){
            case 1 :
                System.out.println(Equipo1.getNombre());
                System.out.println("Entrenador ");
                System.out.println(entrenador1.toString());
                System.out.println("============================");
                System.out.println("Jugadores");
                Equipo1.Mostrarjugadores();
                break;
            case 2 :
                System.out.println(Equipo2.getNombre());
                System.out.println("Entrenador ");
                System.out.println(entrenador2.toString());
                System.out.println("============================");
                System.out.println("Jugadores");
                Equipo2.Mostrarjugadores();
                break;
            case 3 :
                System.out.println("Que comience el partido");
                do{                    
                    System.out.println("╔====================================╗");
                    System.out.println("║ "+Equipo1.getNombre()+"    "+Equipo2.getNombre()+" ║");
                    System.out.println("║      "+Equipo1.getPuntos()+"                  "+Equipo2.getPuntos()+"          ║");
                    System.out.println("║                 "+"Tiempo"+"             ║");
                    System.out.println("║                 "+tablero.relog()+"                 ║");
                    System.out.println("║               Cuartos              ║");
                    System.out.println("║                  "+tablero.getCuartos()+"                 ║");
                    System.out.println("╚====================================╝");
                    
                    System.out.println("Acciones del partido");
                    System.out.println("1)Tirar ");
                    System.out.println("2)pedir tiempo");
                    System.out.println("3)terminar partido (por aburrimiento)");
                    
                    int accion=sc.nextInt();
                    
                    switch(accion){
                        case 1 : 
                            System.out.println("que equipo tiro?");
                            System.out.println("1)"+Equipo1.getNombre());
                            System.out.println("2)"+Equipo2.getNombre());
                            int eleccion=sc.nextInt();
                                if(eleccion < 2){
                                    jugador1.tirar();                                 
                                }else{
                                    jugador4.tirar();
                                }
                                    
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            System.out.println("fIN DEL JUEGO");
                            partido= true;
                            break;
                        default : 
                            System.out.println("la opcion ingresada no exite");
                            break;
                    }                                       
                }while(partido !=true);
                
                    //muestro el resultadodel patido
                    System.out.println("Resultado final");
                    System.out.println(Equipo1.getNombre()+" :"+Equipo1.getPuntos());
                    System.out.println(Equipo2.getNombre()+" :");
                    //seteo los puntos a 0 para qe no vuelvan a aparecer si se 
                    //empiesa denuevo el partido
                    Equipo1.setPuntos(0);
                    Equipo2.setPuntos(0);
                break;
            case 4 :
                System.out.println("fin del programa");
                salir=true;
            default :
                System.out.println("El numero ingresado no pertenece a las opciones");
                break;
        }
            
    }while(salir != true);    
    }
}
