package minibiblioespe;

public class Docente extends Usuario{
    //Atriutos
    private String departamento, especialidad;
    
    //Constructores    
    public Docente() {
    }    
        
    public Docente(String departamento, String especialidad, String id, 
            String cedula, String nombres, String direccionDomicilio, int edad) throws Exception {
        super(id, cedula, nombres, direccionDomicilio, edad);
        this.departamento = departamento;
        this.especialidad = especialidad;
    }
    //Getters y Stters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    //Metodos heredados de USUARIO
    @Override
    public void consultarMateriales(){
        System.out.println("Profesor esta consultando materiales");
    }
    
    @Override
    public void solicitarPrestamo(){
        System.out.println("Profesor esta solicitando un prestamo");
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Departamento: " + departamento);
        System.out.println("Especialidad: " + especialidad);
    }

}
