package Model;

public class Cerdo extends Animal {
    private double peso;
    private String id;

    public Cerdo(String nombre, byte edad, double peso, String id){
        super(nombre, edad);
        this.peso = peso;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: OINK,OINK");
    }

    @Override
    public String toString() {
        return super.toString() + "Cerdo{" +
                "peso=" + peso +
                ", id='" + id + '\'' +
                '}';
    }
}
