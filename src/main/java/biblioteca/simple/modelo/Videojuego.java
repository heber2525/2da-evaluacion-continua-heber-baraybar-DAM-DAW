package biblioteca.simple.modelo;

import biblioteca.simple.contratos.Prestable;
import biblioteca.simple.modelo.usuario;

public  class Videojuego extends Producto implements Prestable{

    private String consola;
    private String genero;
    private boolean prestado;
    private Usuario prestadoA;

    public Videojuego(int id, String titulo, String anho, String genero, Strign consola, String prestado, Usuario prestadoA){
        super(id, titulo, anho );
        this.genero = genero;
        this.consola = consola;
        this.prestado = false;
        this.prestadoA = prestadoA;
    }

    public Videojuego(String titulo, String anho, String consola, String genero) {
        super(titulo, anho);
        this.consola = consola;
        this.genero = genero;
    }
}

