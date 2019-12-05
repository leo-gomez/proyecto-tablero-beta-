package clases;

public class Jugador extends persona {
    
    private boolean jugando;
    private int faltas;
    private int puntos;
    
    public Jugador(String nombre, int edad, float altura,boolean jugando, int faltas,int puntos) {
        super(nombre, edad, altura);
        this.faltas=faltas;
        this.jugando=jugando;
        this.puntos=puntos;
    }

    
    public boolean isJugando() {
        return jugando;
    }

    public void setJugando(boolean jugando) {
        this.jugando = jugando;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
    public int tirar(){
        int canasta = 0;
        int anotacion = (int)(Math.random()*10+1);
            if (anotacion >=4){               
                 if(anotacion>=8){
                     canasta = 2;
                     System.out.println("doble");
                this.setPuntos(this.getPuntos() + 3);               
                 }else       
                System.out.println("triple");
                this.setPuntos(this.getPuntos() + 2);
                canasta = 3;
                }            
                else{
               System.out.println("se fallo es tiro");
                }  
            return canasta;
    }
    
    @Override
    public String toString(){
        return super.toString();
    }

}
