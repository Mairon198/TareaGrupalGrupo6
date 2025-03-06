package persona;


class Doctor extends Persona {
    private String especialidad;
    private String graduado;
    
    public Doctor(String nombre, int edad, double dni, String especialidad, String graduado) {
        super(nombre, edad, dni);
        this.especialidad = especialidad;
        this.graduado = graduado;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public String getGraduado() {
        return graduado;
    }
    
    public void setGraduado(String graduado) {
        this.graduado = graduado;
    }
    
    public void mostrarInformacion() {
        System.out.println("Doctor: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Graduado en: " + graduado);
        
    }
}