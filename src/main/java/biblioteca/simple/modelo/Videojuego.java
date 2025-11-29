package biblioteca.simple.modelo;

import biblioteca.simple.contratos.Prestable;
import biblioteca.simple.modelo.Usuario;

public  class Videojuego extends Producto implements Prestable{

    private String consola;
    private String genero;
    private boolean prestado;
    private Usuario prestadoA;

    public Videojuego(int id, String titulo, String anho,  String consola, String genero){
        super(id, titulo, anho );
        this.genero = genero;
        this.consola = consola;
    }

    public Videojuego(String titulo, String anho, String consola, String genero) {
        super(titulo, anho);
        this.consola = consola;
        this.genero = genero;
    }

    public String getConsola() {
        return consola;
    }

    public String getGenero() {
        return genero;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    @Override
    public void  prestar(Usuario u){
        if (prestado) throw new IllegalStateException("Ya prestado");
        this.prestado = true;
        this.prestadoA = u;
    }
    @Override
    public void devolver() {
        this.prestado = false;
        this.prestadoA = null;
    }

    @Override
    public boolean estaPrestado(){return this.prestado;}

    @Override
    public String toString() {
        return "Videojuego{" +
                "consola='" + consola + '\'' +
                ", genero='" + genero + '\'' +
                ", id=" + id +
                ", titulo='" + titulo + '\'' +
                ", anho='" + anho + '\'' +
                '}';
    }

}


