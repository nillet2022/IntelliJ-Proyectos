public class Perro {
    private String nombre;
    private int edad;
    private String raza;
    private int numeroPatas;
    private double tamaño;

    public Perro() {
    }

    public Perro(String nombre, int edad, String raza, int numeroPatas, double tamaño) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.numeroPatas = numeroPatas;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                ", numeroPatas=" + numeroPatas +
                ", tamaño=" + tamaño +
                '}';
    }
    public void correr(){
        System.out.println("Este perro esta corriendo");
    }
}
