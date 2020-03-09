
package supermercadosantafe;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Santiago Velasquez, Mario Dorado y Jeimmy Naranjo
 */
public class Principal {

   static List<Empleado> empleados = new LinkedList<>();
   static Scanner teclado = new Scanner(System.in);
    /**
     * Organizar la informacion de los empleados
  
     */
    public static void main(String[] args) {
       
        int opciones;
        
        do {
            System.out.println("0. Salir ");
            System.out.println("1. Agregar empleado ");
            System.out.println("2. Imprimir todos losempleados ");
            System.out.println("3. Empleados por departamento ");
            System.out.println("4. Aumentar salario (10%) ");
            System.out.println("5. Total nomina ");
            opciones = teclado.nextInt();
            switch (opciones){
                case 1:
                    CrearEmpleado();
                    break;
                case 2:
                    MostrarEmpleados();
                    break;
                case 3:
                    EmpleadosDepartamento();
                    break;
                case 4:
                    AumentarSalario();
                            
                    break;
                case 5:
                    TotalNomina();
                    break;
                
            }
        } while (opciones != 0);
    }

    private static void CrearEmpleado() {
        teclado.nextLine();
        System.out.print("Nombre del empleado: ");
        String name = teclado.nextLine();
        System.out.print("Departamento o area: ");
        String area = teclado.nextLine();
        System.out.print("Cargo en el supermercado: ");
        String position = teclado.nextLine();
        System.out.print("Salario del empleado: ");
        int salary = teclado.nextInt();
        teclado.nextLine();
        
        Empleado empleado = new Empleado(name, area, position, salary);
        
        empleados.add(empleado); 
        System.out.println("Empleado creado!");
       
               
               
    }

    public static void MostrarEmpleados() {
        for(Empleado elemento: empleados){
            System.out.println(elemento);
        }
        
    }
   

    public static void EmpleadosDepartamento() {
        teclado.nextLine();
        System.out.println("Departamento o area: ");
        String area = teclado.nextLine();
        //teclado.nextLine();
        int cont = 0;
                
         for (Empleado elemt : empleados){
            
            if(elemt.getDepartamento().equalsIgnoreCase(area)){
                cont++;
               
            }
         }
         if (cont == 0){
         
                System.out.println("NO hay empleados en " + area);
         }    
         else {
             System.out.println("En el Departamento " + area + " hay " + cont + " empleados. " );                 
         }
         
            
        }

     public static void AumentarSalario() {
        //static Integer s = 0.10; 
        for (Empleado elm : empleados){
        empleados.get(3).getSalario();
        int isalario = empleados.get(3).getSalario();
        isalario = (isalario * 10)/100;
        isalario = isalario + empleados.get(3).getSalario();
        empleados.set(empleados.get(3).getSalario(), isalario);
        }
        
       
       
        
                
         }
       /**  double salario = 0.10;

         for (Empleado i : empleados.) {
             double isalario = (double) i.getSalario();
             isalario = salario * i.getSalario();
             isalario = isalario + i.getSalario();
             int iisalario = (int) isalario;
             //empleados.set(3, iisalario);
             return iisalario;
         }
         empleados.set(3, iisalario);
         System.out.println(empleados); */    
     }

    public static void TotalNomina() {
       // int total = 0;
        //for (Empleado j: empleados){
          //  total = total + empleados.get(j.getSalario());
            
        }
        
       
    }
    

  
            
     
    

