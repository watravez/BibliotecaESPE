package minibiblioespe;

public class Estudiante extends Usuario{
    //Atriutos
    private String carrera;
    private int semestre;
    
    //Constructores
    public Estudiante() {
    }
             
    public Estudiante(String carrera, int semestre, String id, String cedula, 
            String nommbres, String direccionDomicilio, int edad) {
        super(id, cedula, nommbres, direccionDomicilio, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }
    
    //Metodos heredados de USUARIO

}
