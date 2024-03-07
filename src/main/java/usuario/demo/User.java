package usuario.demo;

public class User {
    String nombre;
    int puntuacion;

    public User() {
    }

    public User(String n, int p) {
        this.nombre = n;
        this.puntuacion = p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String registro() {
        return this.nombre + "/" + this.puntuacion;
    }
}
