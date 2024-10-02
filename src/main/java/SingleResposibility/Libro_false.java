package SingleResposibility;

public class Libro_false {
    private String titulo;
    private String autor;
    private boolean estaPrestado;

    public Libro_false() {
    }

    public Libro_false(String titulo, String autor, boolean estaPrestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.estaPrestado = estaPrestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isEstaPrestado() {
        return estaPrestado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }

    public void verificarPrestamo() {
        if (!estaPrestado) {
            System.out.println("No tomaste prestado el libro");
        } else {
            System.out.println("Tomaste prestado el libro");
        }
    }

    public void devolverLibro() {
        if (estaPrestado) {
            estaPrestado = false;
            System.out.println("Libro devuelto");
        } else {
            System.out.println("No hay prestamo en este libro");
        }
    }
}
