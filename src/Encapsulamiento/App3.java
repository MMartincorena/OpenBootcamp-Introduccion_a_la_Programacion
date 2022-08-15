package Encapsulamiento;
/*Para practicar la encapsulación:
Crear clase Persona.
Crear variables las privadas edad, nombre y telefono de la clase Persona.
Crear gets y sets de cada propiedad.
Crear un objeto persona en el main.
Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola
*/

public class App3 {

  public static void main(String[] args) throws Exception {
    Persona persona1 = new Persona();
    persona1.setEdad(12);
    persona1.setNombre("Martin");
    persona1.setTelefono(123456);

    System.out.println(
      "Nombre: " +
      persona1.getNombre() +
      ", " +
      "Edad: " +
      persona1.getEdad() +
      ", " +
      "Telefono: " +
      persona1.getTelefono()
    );
  }
}

class Persona {

  private int edad;
  private String nombre;
  private int telefono;

  // public Persona(int edad, String nombre, int telefono) {
  //   this.edad = edad;
  //   this.nombre = nombre;
  //   this.telefono = telefono;
  // }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad ) {
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }
}
