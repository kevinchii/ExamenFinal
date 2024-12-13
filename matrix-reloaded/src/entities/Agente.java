package entities;


//Se añade un atributo nivel a la clase Agent.
public class Agente extends Entidad {
    private String habilidadEspecial;
    private String misionAsignada;
    private int nivel;

    public Agente(int id, String nombre, String habilidadEspecial) {
        super(id, nombre);
        this.habilidadEspecial = habilidadEspecial;
        this.nivel = 1;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }

    public String getMisionAsignada() {
        return misionAsignada;
    }

    public void asignarMision(String mision) {
        this.misionAsignada = mision;
    }

    public int getNivel() {
        return nivel;
    }

    //Se crea un método incrementarNivel() que aumente el nivel en 1 y se muestra el nivel actual del agente.

    public void incrementarNivel() {
        this.nivel++;
        System.out.println("El nivel del agente ha sido incrementado\n Nivel actual:"+this.nivel);
    }

    @Override
    public String toString() {
        return super.toString() + "Nivel:"+ nivel+", Habilidad Especial: " + habilidadEspecial +
                (misionAsignada != null ? ", Misión: " + misionAsignada : "");
    }
}
