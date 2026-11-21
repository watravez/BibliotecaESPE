package minibiblioespe;

public class Libro extends MaterialBiblioteca implements IPrestamo{
    //Atributos
    private String genero;
    private int numPaginas;

    public Libro() {
    }

    public Libro(String genero, int numPaginas, String codigo, String titulo, String autor, int anioPublicacion, boolean disponible) {
        super(codigo, titulo, autor, anioPublicacion, disponible);
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    //Get y Set
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    //Metodos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Genero: "+genero);
        System.out.println("Numero de Paginas: "+numPaginas);
        
    }

    @Override
    public double calcularMultas(int diasRetraso) {
        if (diasRetraso > 0) {
            return diasRetraso * 0.50;
        } else {
            return 0.0; // Si entregó a tiempo, no paga multa
        } 
    }

    @Override
    public void prestar() {
        if (isDisponible() == true) {
            setDisponible(false); // Se marca como prestado (ocupado)
            System.out.println("El libro " + getTitulo() + " ha sido prestado.");
        } else {
            System.out.println("Error: El libro " + getTitulo() + " ya está prestado.");
        }
        
    }

    @Override
    public void devolver() {
        setDisponible(true); // Vuelve a estar libre
        System.out.println("El libro " + getTitulo() + " fue devuelto y esta disponible.");
    }
}