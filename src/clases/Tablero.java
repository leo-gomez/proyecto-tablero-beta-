package clases;

public class Tablero {
    private int segundos =0;
    private int minutos =0;
    private int periodo;
    private boolean alarma = false;
    private boolean tiempo = false;
    private int cuartos ;
    
    public Tablero (int segundos,int minutos,int periodo,boolean alarma,boolean timepo,int cuartos){
       
       this.minutos=minutos;
       this.periodo=periodo;
       this.segundos=segundos;
       this.alarma=alarma;
       this.tiempo = tiempo;
       this.cuartos = cuartos;
               
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public boolean isAlarma() {
        return alarma;
    }

    public void setAlarma(boolean alarma) {
        this.alarma = alarma;
    }

    public boolean isTiempo() {
        return tiempo;
    }

    public void setTiempo(boolean tiempo) {
        this.tiempo = tiempo;
    }
    
        public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

   
    public boolean sonarAlarma (){
        return this.alarma = true ;
    }
    
    public boolean detenerTiempo(){
        return this.tiempo = true;              
    }
    
    public void sumarpuntos(int tirar){
        
    }
    
    public int relog(){
        do{
            this.segundos=this.segundos+1;
            if(this.segundos == 60)
                this.segundos=0;
                this.minutos=this.minutos+1;
            }while(this.minutos<5);
       return this.minutos+this.minutos ;
   }
    
    public void marcador(){
        
    }

}
