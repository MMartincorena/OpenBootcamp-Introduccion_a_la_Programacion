/*
Crea una clase Persona con las siguientes variables:
- La edad
- El nombre
- El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, 
esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades 
la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, 
y con una variable salario que solo tenga la clase Trabajador.
*/

package Herencia_Polimorfismo_Interfaces;

public class App_Ej6 {

  public static void main(String[] args) throws Exception {

    Cliente cliente = new Cliente();

    Trabajador trabajador = new Trabajador();

    cliente.nombre = "Martin";
    cliente.edad = 30;
    cliente.telefono = 123456789;
    cliente.credito = 15000;
    System.out.println("Nombre: " + cliente.nombre + ", Edad: " + cliente.edad + " años, Telefono: " + cliente.telefono + " Credito: " + cliente.credito );

    trabajador.nombre = "Marcelo"; 
    trabajador.edad = 32;
    trabajador.telefono = 12457845;
    trabajador.salario = 18000;
    System.out.println("Nombre: " + trabajador.nombre + ", Edad: " + trabajador.edad + " años, Telefono: " + trabajador.telefono + " Credito: " + trabajador.salario);
  }
}
  class Persona {

    int edad;
    String nombre;
    int telefono;
  }

  class Cliente extends Persona {

    int credito;
    
  }

  class Trabajador extends Persona {

    int salario;
  }

