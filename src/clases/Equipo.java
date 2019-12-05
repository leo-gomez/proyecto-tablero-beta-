package clases;

import java.util.ArrayList;

public class Equipo {
    private String nombre ;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;
    private int puntos;
    
    public Equipo (String nombre, Entrenador entrenador,ArrayList<Jugador>jugadores,int puntos){
        this.entrenador=entrenador;
        this.jugadores=jugadores;
        this.nombre=nombre;
        this.puntos=puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
     public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
        
    public void Mostrarjugadores(){
        for (Jugador jugador : jugadores){
            System.out.println(jugador.toString());
        }
            
    }
    @Override
    public String toString(){
        return "Nombre del equipo = " +this.nombre+ "\n"+
               "Entrenador = " + this.entrenador.toString();
                
    }    
}
