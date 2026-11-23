package minibiblioespe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class MainClass {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();
        
        System.out.println("---------------- | BiblioGest | ----------------");
        System.out.println(" ");
        
        int op1=-1; //Opcion 1 del menu PRINCIPAL
        do{
            System.out.println("========== Menu de Opciones =========="); //MENU PRINCIPAL
            System.out.println("1. Registrar Usuarios"); // OJO Aqui iria el menu 2
            System.out.println("2. Registrar Material"); // OJO aqui va otro menu 3
            System.out.println("3. Registrar Prestamos");
            System.out.println("4. Registrar Devolucion de Prestamos");
            System.out.println("5. Ver Usuarios");
            System.out.println("6. Ver Material");
            System.out.println("7. Ver Prestamos");
            System.out.println("8. Guardar Datos");
            System.out.println("9. Leer Datos");
            System.out.println("0. Salir");
            
            System.out.print("Digite la opcion: ");
            try{
                op1 = sc.nextInt();
                sc.nextLine();
            }catch (Exception e) {
                System.out.println("ERROR. Digito no valido.");
                sc.nextLine();
            }
                        
            switch (op1) { //MENU PRINCIPAL ---------------------------
                case 1:
                    int op2 = 3;
                    do{
                        System.out.println("========== Registro de Usuario ==========");
                        System.out.println("1. Registrar Estudiante");
                        System.out.println("2. Registrar Docente");
                        System.out.println("0. Regresar");
                        
                        System.out.print("Digite el Tipo de Usuario: ");
                        try{
                            op2=sc.nextInt();
                            sc.nextLine();
                        } catch (Exception e){
                            System.out.println("ERROR. Digito no valido.");
                            sc.nextLine(); 
                        }
   
                        switch (op2) { //MENU 2 -------------------
                            case 1:
                                try{
                                    System.out.println("----> Datos del Estudiante");
                                    String id = "";
                                    boolean aid = false;
                                    while (!aid) {
                                        System.out.print("id: ");
                                        id = sc.nextLine();     
                                        if (id.trim().isEmpty()) {
                                            System.out.println("ERROR. No debe dejar el campo vacio.");                                            
                                        } else {
                                            aid = true;
                                        }
                                    }
                                    
                                    String cedula = "";
                                    boolean aCed = false;
                                    while (!aCed) {
                                        System.out.print("Cedula: ");
                                        cedula = sc.nextLine();
                                        if (!cedula.matches("[0-9]{10}")) {
                                            System.out.println("ERROR. La cedula solo debe contener 10 numeros positivos.");
                                        } else {
                                            aCed = true;
                                        }
                                    }
                                    System.out.print("Nombres: ");
                                    String nombres = sc.nextLine();
                                    int edad = 0;
                                    boolean ed = false;
                                    while (!ed) {
                                        System.out.print("Edad: ");
                                        try {
                                            edad = sc.nextInt();
                                            sc.nextLine();
                                            if (edad <= 0 || edad > 100) {
                                                System.out.println("No ingrese numeros negativos");
                                            } else {
                                                ed = true;
                                            }
                                        } catch (Exception e) {
                                            System.out.println("Solo ingrese numeros");
                                            sc.nextLine();
                                        }
                                    }                       
                                    System.out.print("Direccion de Domicilio: ");
                                    String direccionDomicilio = sc.nextLine();
                                    System.out.print("Carrera: ");
                                    String carrera = sc.nextLine();
                                    
                                    int semestre = 0;
                                    boolean Sem = false;
                                    while (!Sem) {
                                        System.out.print("Semestre: ");
                                        try {
                                            semestre = sc.nextInt();
                                            sc.nextLine();
                                            if (semestre <= 0 || semestre >=11) {
                                                System.out.println("Error. Semestre no valido.");
                                            } else {
                                                Sem = true;
                                            }
                                        } catch (Exception e) {
                                            System.out.println("Solo ingrese numeros");
                                            sc.nextLine();
                                        }
                                    }       
                                    Estudiante est = new Estudiante( carrera,  semestre,  id,  cedula,  nombres,  direccionDomicilio, edad);

                                    b.agregarUsuarios(est);
                                } catch (Exception e){
                                    if(e.getMessage()==null){
                                        System.out.println("ERROR. No se Admite Letras en edad y semestre");
                                        sc.nextLine();
                                    } else {
                                        System.out.println("ERROR. " + e.getMessage());
                                    }
                                }
                                
                            break;
                                
                            case 2:
                                try{
                                    System.out.println("----> Datos del Docente");
                                    String id = "";
                                    boolean aid = false;
                                    while (!aid) {
                                        System.out.print("id: ");
                                        id = sc.nextLine();     
                                        if (id.trim().isEmpty()) {
                                            System.out.println("ERROR. No debe dejar el campo vacio.");                                            
                                        } else {
                                            aid = true;
                                        }
                                    }
                                    String cedula = "";
                                    boolean aCed = false;
                                    while (!aCed) {
                                        System.out.print("Cedula: ");
                                        cedula = sc.nextLine();
                                        if (!cedula.matches("[0-9]{10}")) {
                                            System.out.println("ERROR. La cedula solo debe contener 10 numeros positivos.");
                                        } else {
                                            aCed = true;
                                        }
                                    }
                                    System.out.print("Nombres: ");
                                    String nombres = sc.nextLine();
                                    int edad = 0;
                                    boolean a = false;
                                    while (!a) {
                                        System.out.print("Edad: ");
                                        try {
                                            edad = sc.nextInt();
                                            sc.nextLine();
                                            if (edad <= 0 || edad > 100) {
                                                System.out.println("No ingrese numeros negativos");
                                            } else {
                                                a = true;
                                            }
                                        } catch (Exception e) {
                                            System.out.println("Solo ingrese numeros");
                                            sc.nextLine();
                                        }
                                    } 
                                    System.out.print("Direccion de Domicilio: ");
                                    String direccionDomicilio = sc.nextLine();
                                    System.out.print("Departamento: ");
                                    String departamento = sc.nextLine();
                                    System.out.print("Especialidad: ");
                                    String especialidad = sc.nextLine();

                                    Docente dc = new Docente( departamento, especialidad,  id,  cedula,  nombres,  direccionDomicilio, edad);

                                    b.agregarUsuarios(dc);
                                }catch(Exception e){
                                    if(e.getMessage() == null){
                                        System.out.println("ERROR. Ingrese Numeros en Edad.");
                                        sc.nextLine();
                                    } else{
                                        System.out.println("ERROR. " + e.getMessage());
                                    }
                                }
                                
                                break;
                                
                            case 0:                                
                                break;    
                                
                            default:
                                System.out.println("ERROR. Opcion Invalida.");
                        }
                        
                    }while(op2 != 0);
                    break;
                    
                case 2:
                    int op3 = 0;
                    do{
                        System.out.println("========== Registro de Materiales ==========");
                        System.out.println("1. Registrar Libro");
                        System.out.println("2. Registrar Revista");
                        System.out.println("3. Registrar Tesis");
                        System.out.println("0. Regresar");
                            
                        System.out.print("Digite el Tipo de Material: ");
                        try{
                            op3=sc.nextInt();
                            sc.nextLine();
                        } catch (Exception e){
                            System.out.println("ERROR. Digito no valido.");
                            sc.nextLine(); 
                        }

                        switch (op3) { //MENU 3 -------------------
                            case 1:
                                System.out.println("----> Datos del Libro");
                                System.out.print("Titulo: ");
                                String titulo = sc.nextLine();
                                System.out.print("Autor: ");
                                String autor = sc.nextLine();
                                
                                String codigo = "";
                                boolean codValido = false;
                                while (!codValido) {
                                    System.out.print("Codigo: ");
                                    codigo = sc.nextLine();
                                    if (b.buscarMaterial(codigo) != null) {
                                        System.out.println("ERROR. El codigo [ " + codigo + " ] ya existe. Ingrese otro.");
                                    } else {
                                        codValido = true;
                                    }
                                }
                                
                                int anioPublicacion = 0;
                                boolean aAnio1 = false;
                                while (!aAnio1) {
                                    System.out.print("Anio Publicacion: ");
                                    try {
                                        anioPublicacion = sc.nextInt();
                                        sc.nextLine();
                                        int anioActual = LocalDate.now().getYear();
                                        if (anioPublicacion <= 0 || anioPublicacion > anioActual) {
                                            System.out.println("Ingrese un anio valido. Mayor a cero y que no supere la actualidad.");
                                        } else {
                                            aAnio1 = true;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Solo ingrese numeros");
                                        sc.nextLine();
                                    }
                                }
                                System.out.print("Genero: ");
                                String genero = sc.nextLine();    
                                int numPaginas = 0;
                                boolean aPag = false;
                                while (!aPag) {
                                    System.out.print("Numero de Paginas: ");
                                    try {
                                        numPaginas = sc.nextInt();
                                        sc.nextLine();
                                        if (numPaginas <= 0) {
                                            System.out.println("Numero de paginas No Valido.");
                                        } else {
                                            aPag = true;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Solo ingrese numeros");
                                        sc.nextLine();
                                    }
                                }                                            
                                                            
                                System.out.println("Estado: Registrado como DISPONIBLE");
                                boolean disponible=true;
                                Libro li=new Libro (genero, numPaginas, codigo, titulo, autor, anioPublicacion,disponible);
                                b.agregarMaterial(li);                    
                        break;
                    
                            case 2:
                                System.out.println("----> Datos de la Revista");
                                System.out.print("Titulo: ");
                                titulo = sc.nextLine();
                                System.out.print("Autor: ");
                                autor = sc.nextLine();
                                
                                String codigo1 = "";
                                boolean cod1Valido = false;
                                while (!cod1Valido) {
                                    System.out.print("Codigo: ");
                                    codigo1 = sc.nextLine();
                                    if (b.buscarMaterial(codigo1) != null) {
                                        System.out.println("ERROR. El codigo [ " + codigo1 + " ] ya existe. Ingrese otro.");
                                    } else {
                                        cod1Valido = true;
                                    }
                                }                                
                                
                                anioPublicacion = 0;
                                boolean aAnio2 = false;
                                while (!aAnio2) {
                                    System.out.print("Anio Publicacion: ");
                                    try {
                                        anioPublicacion = sc.nextInt();
                                        sc.nextLine();
                                        int anioActual = LocalDate.now().getYear();
                                        
                                        if (anioPublicacion <= 0 || anioPublicacion > anioActual) {
                                            System.out.println("Ingrese un anio valido. Mayor a cero y que no supere la actualidad.");
                                        } else {
                                            aAnio2 = true;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Solo ingrese numeros");
                                        sc.nextLine();
                                    }
                                }
                                System.out.print("Categoria: ");
                                String categoria = sc.nextLine();
                                
                                int numEdicion = 0;
                                boolean aEd = false;
                                while (!aEd) {
                                    System.out.print("Numero de Edicion: ");
                                    try {
                                        numEdicion = sc.nextInt();
                                        sc.nextLine();
                                        if (numEdicion <= 0) {
                                            System.out.println("No ingrese numeros negativos");
                                        } else {
                                            aEd = true;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Solo ingrese numeros");
                                        sc.nextLine();
                                    }
                                }
                                System.out.println("Estado: Registrado como DISPONIBLE ");
                                disponible=true;
                                
                                Revista re=new Revista ( numEdicion, categoria, codigo1, titulo, autor, anioPublicacion, disponible);
                                b.agregarMaterial(re);

                                break;
                            case 3: 
                                System.out.println("----> Datos de la Tesis");
                                System.out.print("Titulo: ");
                                titulo = sc.nextLine();
                                System.out.print("Autor: ");
                                autor = sc.nextLine();
                                
                                String codigo2 = "";
                                boolean cod2Valido = false;
                                while (!cod2Valido) {
                                    System.out.print("Codigo: ");
                                    codigo2 = sc.nextLine();
                                    if (b.buscarMaterial(codigo2) != null) {
                                        System.out.println("ERROR. El codigo [ " + codigo2 + " ] ya existe. Ingrese otro.");
                                    } else {
                                        cod2Valido = true;
                                    }
                                }                                
                                
                                anioPublicacion = 0;
                                boolean aAnio3 = false;
                                while (!aAnio3) {
                                    System.out.print("Anio Publicacion: ");
                                    try {
                                        anioPublicacion = sc.nextInt();
                                        sc.nextLine();
                                        int anioActual = LocalDate.now().getYear();
                                        if (anioPublicacion <= 0 || anioPublicacion > anioActual) {
                                            System.out.println("Ingrese un anio valido. Mayor a cero y que no supere la actualidad.");
                                        } else {
                                            aAnio3 = true;
                                        }
                                    } catch (Exception e) {
                                        System.out.println("Solo ingrese numeros");
                                        sc.nextLine();
                                    }
                                }
                                System.out.print("Tema: ");
                                String tema = sc.nextLine();
                                System.out.print("Departamento: ");
                                String departamento = sc.nextLine();
                                System.out.println("Estado: Registrado como DISPONIBLE");
                                disponible=true;

                                Tesis te=new Tesis (tema, departamento, codigo2, titulo, autor, anioPublicacion, disponible);
                                b.agregarMaterial(te);
                                break;
                                
                            case 0:                                
                                break;      
                            default:
                                System.out.println("ERROR. Opcion Invalida.");
                        }
                    }while(op3 != 0);
                    break;                    
                
                case 3:
                    System.out.println("========== Registro de Prestamo ==========");
                    System.out.print("Cedula: ");
                    String cedula = sc.nextLine();
                    System.out.print("Codigo del Material: ");
                    String codigo = sc.nextLine();
                                        
                    b.registrarPrestamo(cedula, codigo);
                    break;
                    
                case 4:
                    int op4 = -1;
                    do {
                        System.out.println("\n========== Registro de Devolucion ==========");
                        System.out.println("1. Usar Fecha Automatica)");
                        System.out.println("2. Usar Fecha Manual");
                        System.out.println("0. Regresar");

                        System.out.print("Digite una opcion: ");
                        try {
                            op4 = sc.nextInt();
                            sc.nextLine(); 
                        } catch (Exception e) {
                            System.out.println("ERROR. Digito no valido.");
                            sc.nextLine(); 
                            op4 = -1;      
                            continue;
                        }

                        switch (op4) {
                            case 1:
                                System.out.println("----> Devolucion con Fecha Actual");
                                System.out.print("Codigo del Material: ");
                                String codigoDev1 = sc.nextLine();

                                LocalDate fechaHoy = LocalDate.now(); 
                                System.out.println("Fecha de Devolucion asignada: " + fechaHoy);

                                b.devolverMaterial(codigoDev1, fechaHoy);
                                break;

                            case 2:
                                System.out.println("----> Devolucion con Fecha Manual");
                                System.out.print("Codigo del Material: ");
                                String codigoDev2 = sc.nextLine();

                                LocalDate fechaManual = null; 
                                boolean fechaValida = false;
                                while (!fechaValida) {
                                    System.out.print("Ingrese fecha de devolucion (AAAA-MM-DD): ");
                                    String fechaTexto = sc.nextLine().trim();
                                    try {
                                        fechaManual = LocalDate.parse(fechaTexto); 
                                        fechaValida = true;
                                    } catch (Exception e) {
                                        System.out.println("ERROR. Formato invalido.");                                   
                                    }
                                }

                                b.devolverMaterial(codigoDev2, fechaManual);
                                break;

                            case 0:
                                break;

                            default:
                                System.out.println("ERROR. Opcion Invalida.");
                                break;
                        }

                    } while (op4 != 0);
                    break;
                    
                case 5:
                    b.mostrarUsuarios();
                    break;
                    
                case 6:
                    b.mostrarMateriales();
                    break;
                    
                case 7:
                    b.mostrarPrestamos();
                    break;
                    
                    
                    
                case 8:
                    // Escritura de Datos en un archivo de texto
                    try {
                        BufferedWriter bw = new BufferedWriter(
                                new FileWriter("biblioteca.txt")
                        );
                        
                        bw.write("========== USUARIOS ==========");
                        bw.newLine();
                        for (Usuario u : b.getListaUsuarios()) {
                            if (u instanceof Estudiante) {
                                Estudiante est = (Estudiante) u;
                                bw.write("Estudiante - ID: " + est.getId() + ", Cedula: " + est.getCedula() 
                                        + ", Nombres: " + est.getNombres() + ", Edad: " + est.getEdad() 
                                        + ", Carrera: " + est.getCarrera() + ", Semestre: " + est.getSemestre());
                            } else if (u instanceof Docente) {
                                Docente doc = (Docente) u;
                                bw.write("Docente - ID: " + doc.getId() + ", Cedula: " + doc.getCedula() 
                                        + ", Nombres: " + doc.getNombres() + ", Edad: " + doc.getEdad() 
                                        + ", Departamento: " + doc.getDepartamento() + ", Especialidad: " + doc.getEspecialidad());
                            }
                            bw.newLine();
                        }

                        bw.write("========== MATERIALES ==========");
                        bw.newLine();
                        for (MaterialBiblioteca m : b.getListaMateriales()) {
                            if (m instanceof Libro) {
                                Libro li = (Libro) m;
                                bw.write("Libro - Codigo: " + li.getCodigo() + ", Titulo: " + li.getTitulo() 
                                        + ", Autor: " + li.getAutor() + ", Anio: " + li.getAnioPublicacion() 
                                        + ", Genero: " + li.getGenero() + ", Paginas: " + li.getNumPaginas() 
                                        + ", Disponible: " + li.isDisponible());
                            } else if (m instanceof Revista) {
                                Revista re = (Revista) m;
                                bw.write("Revista - Codigo: " + re.getCodigo() + ", Titulo: " + re.getTitulo() 
                                        + ", Autor: " + re.getAutor() + ", Anio: " + re.getAnioPublicacion() 
                                        + ", Categoria: " + re.getCategoria() + ", Edicion: " + re.getNumEdicion() 
                                        + ", Disponible: " + re.isDisponible());
                            } else if (m instanceof Tesis) {
                                Tesis te = (Tesis) m;
                                bw.write("Tesis - Codigo: " + te.getCodigo() + ", Titulo: " + te.getTitulo() 
                                        + ", Autor: " + te.getAutor() + ", Anio: " + te.getAnioPublicacion() 
                                        + ", Tema: " + te.getTema() + ", Departamento: " + te.getDepartamento());
                            }
                            bw.newLine();
                        }

                        bw.write("========== PRESTAMOS ==========");
                        bw.newLine();
                        for (Prestamo p : b.getListaPrestamos()) {
                            bw.write("Usuario: " + p.getUsuario().getNombres() 
                                    + " (" + p.getUsuario().getCedula() + ")"
                                    + ", Material: " + p.getMaterial().getTitulo() 
                                    + ", Fecha Prestamo: " + p.getFechaPrestamo() 
                                    + ", Fecha Limite: " + p.getFechaLimite() 
                                    + ", Devuelto: " + p.isDevuelto() 
                                    + ", Multa: $" + p.getMulta());
                            bw.newLine();
                        }

                        bw.close();
                        System.out.println("Datos Almacenados correctamente");
                    } catch (IOException e) {
                        System.out.println("Error al escribir en el archivo!!!!!!!!!");
                    }
                    break;

                case 9:
                    // Lectura de Datos desde un archivo de texto
                    try {
                        BufferedReader br = new BufferedReader(
                                new FileReader("biblioteca.txt")
                        );
                        String linea;
                        System.out.println("Datos Leidos desde el Archivo: ");
                        while ((linea = br.readLine()) != null) {
                            System.out.println(linea);
                        }
                        br.close();
                    } catch (IOException e) {
                        System.out.println("Error al LEER el archivo!!!!!!");
                    }
                    break;    

                case 0:
                    System.out.println("     | Cerrando el Sistema... |     ");
                    break;    
                    
                default:
                    System.out.println("ERROR. Opcion Invalida.");
            }
        
        }while(op1 != 0);
    sc.close();               
    } 
}
