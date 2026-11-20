package minibiblioespe;

import java.util.Scanner;

public class MainClass {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();
        
        System.out.println("---------------- | BiblioGest | ----------------");
        System.out.println(" ");
        
        int op1; //Opcion 1 del menu PRINCIPAL
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
            op1 = sc.nextInt();
            sc.nextLine();
            
            switch (op1) { //MENU PRINCIPAL ---------------------------
                case 1:
                    int op2;
                    do{
                        System.out.println("========== Registro de Usuario ==========");
                        System.out.println("1. Registrar Estudiante");
                        System.out.println("2. Registrar Docente");
                        System.out.println("0. Regresar");
                        
                        System.out.print("Digite el Tipo de Usuario: ");
                        op2=sc.nextInt();
                        sc.nextLine();
                        
                        switch (op2) { //MENU 2 -------------------
                            case 1:
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
                                break;
                                
                            case 2:
                                System.out.println("----> Datos del Docente");
                                System.out.print("id: ");
                                id = sc.nextLine();
                                System.out.print("Cedula: ");
                                cedula = sc.nextLine();
                                System.out.print("Nombres: ");
                                nombres = sc.nextLine();
                                System.out.print("Edad: ");
                                edad = sc.nextInt();
                                sc.nextLine();
                                System.out.print("Direccion de Domicilio: ");
                                direccionDomicilio = sc.nextLine();
                                System.out.print("Departamento: ");
                                String departamento = sc.nextLine();
                                System.out.print("Especialidad: ");
                                String especialidad = sc.nextLine();
                                
                                Docente dc = new Docente( departamento, especialidad,  id,  cedula,  nombres,  direccionDomicilio, edad);
                                
                                b.agregarUsuarios(dc);
                                break;
                                
                            case 0:                                
                                break;    
                                
                            default:
                                System.out.println("ERROR. Opcion Invalida.");
                        }
                        
                    }while(op2 != 0);
                    break;
                    
                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
                    
                case 4:
                    
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
