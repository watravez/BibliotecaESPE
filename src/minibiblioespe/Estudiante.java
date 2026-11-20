package minibiblioespe;

public class Estudiante extends Usuario{
    //Atriutos
    private String carrera;
    private int semestre;
    
    //Constructores
    public Estudiante() {
    }
             
    public Estudiante(String carrera, int semestre, String id, String cedula, 
            String nombres, String direccionDomicilio, int edad) {
        super(id, cedula, nombres, direccionDomicilio, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    //Setters y Getters -----------------------------------
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    //Metodos ---------------------------------------------
    @Override
    public void consultarMateriales(){
        System.out.println("Estudiante esta consultando materiales");
    }
    
    @Override
    public void solicitarPrestamo(){
        System.out.println("Estudiante esta consultando materiales");
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
    }

}
