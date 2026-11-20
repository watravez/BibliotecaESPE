package minibiblioespe;

public class MaterialBiblioteca {
    //Atributos
    protected String codigo, titulo, autor;
    protected int anioPublicacion;
    protected boolean disponible;

    //Get y Set
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    //Metodos 
    public void mostrarInformacion (){
         
        
    }
    
    
    public void calcularMultas(){
        
    }
}
