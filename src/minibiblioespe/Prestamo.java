package minibiblioespe;

public class Prestamo {
    //Atributos
    private Usuario usuario;
    private MaterialBiblioteca material;
    private String fechaPrestamo, fechaDevolucion;
    private double multa;
    
    //Metodos
    public void mostrarInfo(){
        System.out.println("Usuario: " + usuario);
        System.out.println("Material: " + material);
        System.out.println("Fecha de Prestamo: " + fechaPrestamo);
        System.out.println("Fecha de Devolucion: " + fechaDevolucion);
        System.out.println("Multa: " + multa); // OJO REVISAR LUEGO PQ LA MULTA 
        //SOLO DEBE APARECER CUANDO DeVUelVA
    }
}
