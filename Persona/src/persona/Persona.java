package persona;

import java.util.Scanner;

class Persona {
    protected String nombre;
    protected int edad;
    protected double dni;
    
    public Persona(String nombre, int edad, double dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public double getDni() {
        return dni;
    }
    
    public void setDni(double dni) {
        this.dni = dni;
    }
    
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: "+ edad);
        System.out.println("DNI: " + dni);
    }
    
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido al menu");
        System.out.println("Ingrese el nombre del doctor: ");
        String nombreDoctor = scanner.nextLine();
        System.out.println("Ingrese edad del doctor: ");
        int edadDoctor = scanner.nextInt();
        System.out.println("Ingrese el DNI del doctor: ");
        double dniDoctor = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("Ingrese especialidad del doctor: ");
        String especialidadDoctor = scanner.nextLine();
        System.out.println("Ingrese universidad donde se graduó el doctor: ");
        String graduadoDoctor = scanner.nextLine();
        
        Doctor doctor = new Doctor(nombreDoctor, edadDoctor, dniDoctor, especialidadDoctor, graduadoDoctor);
        
        System.out.println("Bienvenido al menu");
        System.out.println("Ingrese el nombre del deportista: ");
        String nombreDeportista = scanner.nextLine();
        System.out.println("Ingrese la edad del deportista: ");
        int edadDeportista = scanner.nextInt();
        System.out.println("Ingrese el DNI del deportista: ");
        double dniDeportista = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.println("Ingrese el deporte que practica: ");
        String deporteDeportista = scanner.nextLine();
        
        Deportista deportista = new Deportista(nombreDeportista, edadDeportista, dniDeportista, deporteDeportista);
        
        System.out.println("\nInformación ingresada:");
        doctor.mostrarInformacion();
        deportista.mostrarInformacion();
        
        scanner.close();
    }
}