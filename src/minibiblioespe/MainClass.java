package minibiblioespe;
import java.time.LocalDate;

import java.util.Scanner;

public class MainClass {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();
        
        System.out.println("---------------- | BiblioGest | ----------------");
        System.out.println(" ");
        
        int op1=9; //Opcion 1 del menu PRINCIPAL
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
            System.out.println("0. Salir");
            
            System.out.print("Digite la opcion: ");
            try{
                op1 = sc.nextInt();
                sc.nextLine();
            }catch (Exception e) {
                System.out.println("ERROR. Digito no valido.");
                sc.nextLine();
                continue;
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
                            continue;
                        }
                        
                        
                        switch (op2) { //MENU 2 -------------------
                            case 1:
                                try{
                                    System.out.println("----> Datos del Estudiante");
                                    System.out.print("id: ");
                                    String id = sc.nextLine();
                                    System.out.print("Cedula: ");
                                    String cedula = sc.nextLine();
                                    System.out.print("Nombres: ");
                                    String nombres = sc.nextLine();
                                    System.out.print("Edad: ");
                                    int edad = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Direccion de Domicilio: ");
                                    String direccionDomicilio = sc.nextLine();
                                    System.out.print("Carrera: ");
                                    String carrera = sc.nextLine();
                                    System.out.print("Semestre: ");
                                    int semestre = sc.nextInt();
                                    sc.nextLine();

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
                                    System.out.print("id: ");
                                    String id = sc.nextLine();
                                    System.out.print("Cedula: ");
                                    String cedula = sc.nextLine();
                                    System.out.print("Nombres: ");
                                    String nombres = sc.nextLine();
                                    System.out.print("Edad: ");
                                    int edad = sc.nextInt();
                                    sc.nextLine();
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
                    int op3;
                    do{
                        System.out.println("========== Registro de Materiales ==========");
                        System.out.println("1. Registrar Libro");
                        System.out.println("2. Registrar Revista");
                        System.out.println("3. Registrar Tesis");
                        System.out.println("0. Regresar");
                        
                        System.out.print("Digite el Tipo de Material: ");
                        op3=sc.nextInt();
                        sc.nextLine();
                        
                        switch (op3) { //MENU 3 -------------------
                            case 1:
                                System.out.println("----> Datos del Libro");
                                System.out.print("Titulo: ");
                                String titulo = sc.nextLine();
                                System.out.print("Autor: ");
                                String autor = sc.nextLine();
                                System.out.print("Codigo: ");
                                String codigo = sc.nextLine();
                                System.out.print("Anio Publicacion: ");
                                int anioPublicacion = sc.nextInt();
                                sc.nextLine();  
                                System.out.print("Genero: ");
                                String genero = sc.nextLine();                           
                                System.out.print("Numero de Paginas: ");
                                int numPaginas = sc.nextInt();
                                sc.nextLine();
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
                                System.out.print("Codigo: ");
                                codigo = sc.nextLine();
                                System.out.print("Anio Publicacion: ");
                                anioPublicacion = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Categoria: ");
                                String categoria = sc.nextLine();
                                System.out.print("Numero de Edicion: ");
                                int numEdicion = sc.nextInt();
                                sc.nextLine();
                                System.out.println("Estado: Registrado como DISPONIBLE ");
                                disponible=true;
                                
                                Revista re=new Revista ( numEdicion, categoria, codigo, titulo, autor, anioPublicacion, disponible);
                                b.agregarMaterial(re);

                                break;
                            case 3: 
                                System.out.println("----> Datos de la Tesis");
                                System.out.print("Titulo: ");
                                titulo = sc.nextLine();
                                System.out.print("Autor: ");
                                autor = sc.nextLine();
                                System.out.print("Codigo: ");
                                codigo = sc.nextLine();
                                System.out.print("Anio Publicacion: ");
                                anioPublicacion = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Tema: ");
                                String tema = sc.nextLine();
                                System.out.print("Departamento: ");
                                String departamento = sc.nextLine();
                                System.out.println("Estado: Registrado como DISPONIBLE");
                                disponible=true;

                                Tesis te=new Tesis (tema, departamento, codigo, titulo, autor, anioPublicacion, disponible);
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
                    System.out.println("========== Registro de Devolucion ==========");
                    System.out.print("Codigo: ");
                    String codigoDev = sc.nextLine();
                    System.out.print("Fecha Devolucion: ");
                    
                    LocalDate fechaDevolucion;
                    fechaDevolucion = LocalDate.now();
                    
                    /*System.out.print("Ingrese fecha de devolucion (yyyy/MM/dd): ");
                    String fechaTexto = sc.nextLine();
                    fechaDevolucion = LocalDate.parse(fechaTexto);*/ //AGREGAR FECHA MANUALMENTE
   
                    b.devolverMaterial(codigoDev, fechaDevolucion);
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
                    
                    break;
                    
                case 0:
                    System.out.println("     | Cerrando el Sistema... |     ");
                    break;    
                    
                default:
                    System.out.println("ERROR. Opcion Invalida.");
            }
        
        }while(op1 != 0);
                    
    }
    
}
