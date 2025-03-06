package persona;

class Deportista extends Persona {
    private String deporte;
    
    public Deportista(String nombre, int edad, String dni, String deporte) {
        super(nombre, edad, dni);
        this.deporte = deporte;
    }
    
    public String getDeporte() {
        return deporte;
    }
    
    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
    
    public void mostrarInformacion() {
        System.out.println("Deportista: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Deporte: " + deporte);
    
    }
}