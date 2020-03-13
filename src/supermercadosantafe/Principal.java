
package supermercadosantafe;

import java.text.DecimalFormat;
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

    private static void AumentarSalario() {
        for (int i =0; i < empleados.size();i++){ 
            int salario = empleados.get(i).getSalario();
            salario = (salario*10) /100;
            salario = salario + empleados.get(i).getSalario();  
           empleados.get(i).setSalario(salario); // Guardar el nuevo salario en la lista
        }
        for(Empleado elemento: empleados){
            System.out.println(elemento); //Imprimir los datos del empleado con salario nuevo
        }
     
    }

    private static void TotalNomina() {
        int salario = 0;
        for (int i =0; i < empleados.size();i++){ 
            salario = salario + empleados.get(i).getSalario(); 
        }
        DecimalFormat format = new DecimalFormat("$###,###");
        String salarioStr = format.format(salario);
        System.out.println("La nomina total del Supermercado Santafe  es: " + salarioStr);
    }
}

