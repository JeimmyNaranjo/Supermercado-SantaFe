
package supermercadosantafe;

import java.text.DecimalFormat;

/**
 *
 * @author Santiago Velasquez, Mario Dorado y Jeimmy Naranjo
 */
public class Empleado {

    //Atributos
    private String nombre;
    private String departamento;
    private String cargo;
    private int salario;
    
    //Constructor
    public Empleado(String nombre, String departamento, String cargo, int salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
    }
  //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override  // Para imprimir los datos del empleado
    public String toString() {
        DecimalFormat format = new DecimalFormat("$###,###");
       String salarioStr = format.format(salario);
        return "Empleado {" + "nombre= " + nombre + ", departamento= " + departamento + ", cargo= " + cargo + ", salario= " + salarioStr + '}';
    }
    
    

   
    
    
    
    
    
    
    
    
    
}
