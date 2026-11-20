package minibiblioespe;

public class Usuario {
    //Atriutos
    private String id, cedula, nommbres, direccionDomicilio;
    private int edad;
    
    //Constructores
    public Usuario() {
    }

    public Usuario(String id, String cedula, String nommbres, String direccionDomicilio, int edad) {
        this.id = id;
        this.cedula = cedula;
        this.nommbres = nommbres;
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

    public String getNommbres() {
        return nommbres;
    }

    public void setNommbres(String nommbres) {
        this.nommbres = nommbres;
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
    
    }
    
    public void solicitarPrestamo(){
    
    }
}
