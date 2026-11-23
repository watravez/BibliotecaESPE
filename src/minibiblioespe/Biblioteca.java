package minibiblioespe;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Biblioteca {
    //Atributos
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    private ArrayList<MaterialBiblioteca> listaMateriales = new ArrayList<>();
    private ArrayList<Prestamo> listaPrestamos = new ArrayList <> ();
    
    //Constructores

    public Biblioteca() {
    }
    
    //Getters y Setters 

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
                System.out.print("[ " + (i+1) + " ] ");
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
    
    public Usuario buscarUsuario(String cedula){
        for (int i = 0; i < listaUsuarios.size(); i++) {
            if(listaUsuarios.get(i).getCedula().equalsIgnoreCase(cedula)){
                return listaUsuarios.get(i);
            }            
        }
        return null;
    }
    
    public MaterialBiblioteca buscarMaterial(String codigo){
        for (int i = 0; i < listaMateriales.size(); i++) {
            if (listaMateriales.get(i).getCodigo().equalsIgnoreCase(codigo)){
                return listaMateriales.get(i);            
            }
        }
        return null;
    }
    
    public int contarPrestamosAct(Usuario us){
        int aux = 0;
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo p = listaPrestamos.get(i);
            if(p.getUsuario().getCedula().equalsIgnoreCase(us.getCedula()) && !p.isDevuelto()){
                aux ++;
            }
        }
        return aux;
    }
    
    public void registrarPrestamo(String cedulaUs, String codigoMt){
        Usuario us = buscarUsuario(cedulaUs);
        if(us == null){
            System.out.println("ERROR. No Hay Usuarios con la Cedula Ingresada: [ " + cedulaUs + " ]" );
            return;
        }
        
        if(contarPrestamosAct(us) >= 3){
            System.out.println("ERROR. El usuario [ " + us.getNombres() + " ] tiene activos el Maximo de 3 Prestamos.");
            return;
        }
        
        MaterialBiblioteca mt = buscarMaterial(codigoMt);
        if (mt == null) {
            System.out.println("ERROR. El Material de Codigo [ " + codigoMt + " ] NO EXISTE.");
            return;
        }
        
        if (!(mt instanceof IPrestamo)) {
            System.out.println("ERROR. [ " + mt.getTitulo() + " ] Es una Tesis, No se Presta. Solo Revision en Sala");
            return;
        }
        
        if (!mt.isDisponible()) {
            System.out.println("ERROR. [ " + mt.getTitulo() + " ] No esta Disponible - | Prestado | - ");
            return;
        }
        
        us.solicitarPrestamo();
        IPrestamo materialPrestable = (IPrestamo)  mt;
        materialPrestable.prestar();
        
        Prestamo p = new Prestamo(us, mt);
        listaPrestamos.add(p);
        
        System.out.println("----> Prestamo a [ " + us.getNombres() + " ] [ " + us.getCedula() + " ] -- | REGISTRADO | --");
        System.out.println("----> Fecha de Prestamo: [ " + p.getFechaPrestamo() + " ] Fecha Limite de Entrega: [ " + p.getFechaLimite() + " ]");        
    }   
    
    public void devolverMaterial(String codigoMt, LocalDate fechaDevolucion){
        Prestamo pActivo = null;
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo p = listaPrestamos.get(i);
            if (p.getMaterial().getCodigo().equalsIgnoreCase(codigoMt) && !p.isDevuelto()) {
                pActivo = p;
                break;
            }
        }
        
        if (pActivo == null) {
            System.out.println("ERROR. No Existen Prestamos Activos para el material [ " + codigoMt + " ]");
            return;            
        }
        
        if(fechaDevolucion.isBefore(pActivo.getFechaPrestamo())){
            System.out.println("ERROR. La Fecha de Devolucion Registrada es Anterior al Prestamo");
            return;
        }
        
        MaterialBiblioteca mt = pActivo.getMaterial();
        IPrestamo materialPrestable = (IPrestamo) mt;
        materialPrestable.devolver();
        
        long diferencia = ChronoUnit.DAYS.between(pActivo.getFechaLimite(), fechaDevolucion);
        int diasRetraso = (int) diferencia;
        if(diasRetraso < 0){
            diasRetraso = 0;
        }
                
        double multaCalculada = mt.calcularMultas(diasRetraso);
        
        pActivo.setFechaDevolucion(fechaDevolucion);
        pActivo.setMulta(multaCalculada);
        pActivo.setDevuelto(true);
        
        System.out.println("----> - | Devolucion REGISTRADA | -");
        if (multaCalculada > 0) {
            System.out.println("--- !!!El usuario [ " + pActivo.getUsuario().getNombres() + " ] Genero una multa de: | $" + multaCalculada + " | por | " + diasRetraso + " | dias de retraso.");
        } else{
            System.out.println("--- Entrega en el plazo establecido. Multa: NO Aplica.");
        }
        
    }

}
