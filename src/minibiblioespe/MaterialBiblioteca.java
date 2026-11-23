package minibiblioespe;

public abstract class MaterialBiblioteca {
    //Atributos
    protected String codigo, titulo, autor;
    protected int anioPublicacion;
    protected boolean disponible;
    
    //Constructores
    public MaterialBiblioteca() {
    }

    public MaterialBiblioteca(String codigo, String titulo, String autor, int anioPublicacion, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }

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

    //Metodos NOTA solo pongo los metodos protegitos para no ponerlos como abstractos y no generar un metodo poco eficiente
    protected void mostrarInformacion (){
        System.out.println("========== Material Biblioteca ==========");
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("codigo: "+codigo);
        System.out.println("Anio Publicacion: "+anioPublicacion);
        if (disponible == true) {
            System.out.println("Estado: DISPONIBLE");
        } else {
            System.out.println("Estado: PRESTADO");
        }
    }
    
    
    protected  double calcularMultas(int diasRetraso){
        return 0;
    }
    
}