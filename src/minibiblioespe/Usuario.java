package minibiblioespe;

public class Usuario {
    //Atriutos
    private String id, cedula, nombres, direccionDomicilio;
    private int edad ;
    
    //Constructores
    public Usuario() {
    }

    public Usuario(String id, String cedula, String nombres, String direccionDomicilio, int edad) {
        this.id = id;
        this.cedula = cedula;
        this.nombres = nombres;
        this.direccionDomicilio = direccionDomicilio;
        this.edad = edad;
    }
    
    //Getters y Setters NOTA: LOS PUSE POR SI LOS OCUPAMOS

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(String direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
        
    //Metodos    
    public void consultarMateriales(){
        System.out.println("Usuario esta consultando materiales");
    }
    
    public void solicitarPrestamo(){
        System.out.println("Usuario esta solicitando prestamo");
    }
    
    public void mostrarDatos(){
        System.out.println("id: " + id);
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombres: " + nombres);
        System.out.println("Edad: " + edad);
        System.out.println("Direccion de Domicilio: " + direccionDomicilio);
    }
}
