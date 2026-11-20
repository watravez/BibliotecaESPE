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
    
    }
    
    public void agregarMaterial(MaterialBiblioteca mt){
    
    }
    
    public void devolverMaterial(String codigo){
    
    }
    
    public void mostrarUsuarios(){
    
    }
    
    public void mostrarMateriales(){
    
    }
    public void mostrarPrestamos(){
    
    }
    
    public void persistencia () {
    
    }
}
