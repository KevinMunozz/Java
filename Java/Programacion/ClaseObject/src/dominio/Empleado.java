
package dominio;

import java.util.Objects;


public class Empleado {
   protected String nombre;
   protected double sueldo;
   
   public Empleado(String nombre, double sueldo){
       this.nombre = nombre;
       this.sueldo= sueldo;
   }
   public String obtenerDetalle(){
      return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        hash = 47 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }
   
}
