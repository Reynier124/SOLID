package SingleResposibility;

public class PrestarLibro {
    private Libro_true libro;
    private boolean estaPrestado;

    public PrestarLibro() {
    }

    public PrestarLibro(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }

    public Libro_true getLibro() {
        return libro;
    }

    public void setLibro(Libro_true libro) {
        this.libro = libro;
    }

    public boolean isEstaPrestado() {
        return estaPrestado;
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
