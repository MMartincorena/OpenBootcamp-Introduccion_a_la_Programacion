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
    Cliente cliente1 = new Cliente(credito, edad, nombre, telefono);
    cliente1.setCredito(15000);
    


  }

  class Persona {

    private int edad;
    private String nombre;
    private int telefono;
  }

  class Cliente extends Persona {

    private int credito;

    public Cliente(int credito, int edad, String nombre, int telefono) {
        this.credito = credito;
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    
  }

  class Trabajador extends Persona {

    private int salario;
  }
}
