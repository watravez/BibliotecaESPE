package minibiblioespe;

import java.time.LocalDate;

public class Prestamo {
    //Atributos
    private Usuario usuario;
    private MaterialBiblioteca material;
    //private String fechaPrestamo, fechaDevolucion;
    private LocalDate fechaPrestamo, fechaDevolucion, fechaLimite; //implementacion fecha automatica
    private double multa;
    private boolean devuelto; 

    //Constructores ------------------------------------
    public Prestamo() {
    }

    public Prestamo(Usuario usuario, MaterialBiblioteca material) {
        this.usuario = usuario;
        this.material = material;
        this.fechaPrestamo = LocalDate.now(); //implementacion fecha automatica
        this.fechaDevolucion = null; //implementacion fecha automatica
        this.fechaLimite = this.fechaPrestamo.plusDays(3); //implementacion fecha automatica
        //this.fechaPrestamo = fechaPrestamo;
        //this.fechaDevolucion = fechaDevolucion;
        this.multa = 0.0;
        this.devuelto = false;
    }

    //Getters y Setters --------------------------------------
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public MaterialBiblioteca getMaterial() {
        return material;
    }

    public void setMaterial(MaterialBiblioteca material) {
        this.material = material;
    }


    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }
    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
    
    /*public String getFechaPrestamo() {
    return fechaPrestamo;
    }
    public void setFechaPrestamo(String fechaPrestamo) {
    this.fechaPrestamo = fechaPrestamo;
    }
    public String getFechaDevolucion() {
    return fechaDevolucion;
    }
    public void setFechaDevolucion(String fechaDevolucion) {
    this.fechaDevolucion = fechaDevolucion;
    }*/
    
    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }
    
    //Metodos -------------------------------------
    public void mostrarInfo(){
        System.out.println("Usuario: " + usuario.getNombres());
        System.out.println("CI: " + usuario.getCedula());
        System.out.println("Material Prestado: ");
        material.mostrarInformacion();
        System.out.println("Fecha de Prestamo: " + fechaPrestamo);
        System.out.println("Fecha de Limite de Entrega: " + fechaLimite);
        
        if(devuelto){
            System.out.println("Estado: Devuelto");
            System.out.println("Fecha de Devolucion: " + fechaDevolucion);
            System.out.println("Multa: $" + multa);
        } else {
            System.out.println("Estado: En Prestamo. Pendiente Devolucion.");
        }

    }
}
