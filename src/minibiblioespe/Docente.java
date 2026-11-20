package minibiblioespe;

public class Docente extends Usuario{
    //Atriutos
    private String departamento, especialidad;
    
    //Constructores    
    public Docente() {
    }    
        
    public Docente(String departamento, String especialidad, String id, 
            String cedula, String nommbres, String direccionDomicilio, int edad) {
        super(id, cedula, nommbres, direccionDomicilio, edad);
        this.departamento = departamento;
        this.especialidad = especialidad;
    }
    
    //Metodos heredados de USUARIO
    

}
