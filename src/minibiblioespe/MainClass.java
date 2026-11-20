package minibiblioespe;

import java.util.Scanner;

public class MainClass {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
            
            switch (op1) {
                case 1:
                    
                    break;
                    
                case 2:
                    
                    break;
                
                case 3:
                    
                    break;
                    
                case 4:
                    
                    break;
                    
                case 5:
                    
                    break;
                    
                case 6:
                    
                    break;
                    
                case 7:
                    
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
