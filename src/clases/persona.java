package clases;

public abstract class persona {
    private String nombre ;
    private int edad;
    private float altura;
    
        public persona(String nombre,int edad, float altura){
            this.altura=altura;
            this.edad=edad;
            this.nombre=nombre;
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public String toString (){
        return "Nombre :"+this.nombre+"\n"+"edad :"+this.edad+"\n"+"altura :"+this.altura+" m";
    }
    
}
