package minibiblioespe;

public class Revista extends MaterialBiblioteca implements IPrestamo{
     //Atributos 
    private int numEdicion;
    private String categoria;
    
    
    //Constructores
    public Revista() {
    }

    public Revista(int numEdicion, String Categoria, String codigo, String titulo, String autor, int anioPublicacion, boolean disponible) {
        super(codigo, titulo, autor, anioPublicacion, disponible);
        this.numEdicion = numEdicion;
        this.categoria = Categoria;
    }

    //Get y Set
    public int getNumEdicion() {
        return numEdicion;
    }

    public void setNumEdicion(int numEdicion) {
        this.numEdicion = numEdicion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String Categoria) {
        this.categoria = Categoria;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de Edicion: "+numEdicion);
        System.out.println("Categoria: "+categoria);  
    }


    @Override
    public double calcularMultas(int diasRetraso) {
        if (diasRetraso > 0) {
            return diasRetraso * 1.00;
        } else {
            return 0.0; // Si entregó a tiempo, no paga multa
        }      
    }
    
    @Override
    public void prestar() {
        if (isDisponible() == true) {
            setDisponible(false); // Se marca como prestado (ocupado)
            System.out.println("La revista " + getTitulo()+ " ha sido prestada.");
        } else {
            System.out.println("Error: La revista "+ getTitulo()+ " ya está prestada.");
        }
        
    }

    @Override
    public void devolver() {
        setDisponible(true); // Vuelve a estar libre
        System.out.println("La revista " +getTitulo()+ " fue devuelta y está disponible.");
    }
}
