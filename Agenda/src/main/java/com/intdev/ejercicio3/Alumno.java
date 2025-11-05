package intdev.ejercicio3;
public Class Alumno{
    private String nombre;
    private int edad;
    private String curso;
    private float notaMedia;

    public Alumno(String nombre, int edad, String curso, float notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getCurso() {
        return curso;
    }
    public float getNotaMedia() {
        return notaMedia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void setNotaMedia(float notaMedia) {
        this.notaMedia = notaMedia;
    }

    public void mostrarInfo () {
        System.out.println("Alumno{" +
                "nombre:  '" + nombre + '\'' +
                ", edad: " + edad +
                ", curso: '" + curso + '\'' +
                ", notaMedia: " + notaMedia +
                '}');
    }
}