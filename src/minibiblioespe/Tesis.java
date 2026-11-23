package minibiblioespe;

public class Tesis extends MaterialBiblioteca{
    //Atributos
    private String tema, departamento;
    
    
    //Constructores
    public Tesis() {
    }

    public Tesis(String tema, String departamento, String codigo, String titulo, String autor, int anioPublicacion, boolean disponible) {
        super(codigo, titulo, autor, anioPublicacion, disponible);
        this.tema = tema;
        this.departamento = departamento;
    }
   
    //Setters y Getters

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
    //metodos
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); 
        System.out.println("Tema: "+tema);
        System.out.println("Departamento: "+departamento);
        System.out.println("Observacion: Solo lectura en sala");
    }    
    //public double calcularMultas(int diasRetraso){ return 0;} NO se implementa, las tesis no se prestan
}