package minibiblioespe;

import java.util.ArrayList;

public class Biblioteca {
    //Atributos
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private ArrayList<MaterialBiblioteca> listaMateriales = new ArrayList<>();
    private ArrayList<Prestamo> listaPrestamos = new ArrayList <> ();
    
    //Constructores

    public Biblioteca() {
    }
    
    //Getters y Setters REVISAR SI SON NECESARIOS OJOOOOOOO

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public ArrayList<MaterialBiblioteca> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(ArrayList<MaterialBiblioteca> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public void setListaPrestamos(ArrayList<Prestamo> listaPrestamos) {
        this.listaPrestamos = listaPrestamos;
    }
    
    
    //Metodos
    public void agregarUsuarios(Usuario us){
        listaUsuarios.add(us);
    }
    
    public void agregarMaterial(MaterialBiblioteca mt){
        listaMateriales.add(mt);
    }
    
    public void devolverMaterial(String codigo){
        
    }
    
    public void mostrarUsuarios(){
        if(listaUsuarios.isEmpty()){
            System.out.println("No hay Usuarios Registrados...");
        } else{
            for (int i = 0; i < listaUsuarios.size(); i++) {
                System.out.println("Registro de Usuario [ " + (i+1) + " ]");
                listaUsuarios.get(i).mostrarDatos();    
            }                              
        }
        
    }
    
    public void mostrarMateriales(){
        if (listaMateriales.isEmpty()){
            System.out.println("No hay Materiales Registrados...");
        } else {
            for (int i = 0; i < listaMateriales.size(); i++) {
                System.out.print("[ " + (i+1) + " ]");
                listaMateriales.get(i).mostrarInformacion();    
            }                    
        }
        
    }
    
    public void mostrarPrestamos(){
        if(listaPrestamos.isEmpty()){
            System.out.println("No se han realizado Prestamos...");
        } else {
            for (int i = 0; i < listaPrestamos.size(); i++) {
                System.out.println("Registro de Prestamo [ " + (i+1) + " ]");
                listaPrestamos.get(i).mostrarInfo(); //OJO
            }                               
        }
        
    }
    
    public void persistenciaInfo () {
    
    }
}
