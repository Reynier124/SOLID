package SingleResposibility;

public class Libro_true {
    private String titulo;
    private String autor;

    public Libro_true() {
    }

    public Libro_true(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
