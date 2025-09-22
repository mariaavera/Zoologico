package Model;

public class Leon extends Animal {
    private double velocidadMaxima;
    private String habitat;
    private String id;

    public Leon(String nombre, byte edad, double velocidadMaxima, String habitat, String id) {
        super(nombre, edad);
        this.velocidadMaxima = velocidadMaxima;
        this.habitat = habitat;
        this.id = id;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: ROAAAAARRR");
    }

    @Override
    public String toString() {
        return super.toString() + "Leon{" +
                "velocidadMaxima=" + velocidadMaxima +
                ", habitat='" + habitat + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}







