package Model;

public class Perro extends Animal {
    private String raza;
    private String color;
    private String id;

    public Perro(String nombre, byte edad, String raza, String color, String id) {
        super(nombre, edad);
        this.raza = raza;
        this.color = color;
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: WOOF,WOOF");
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" +
                "raza='" + raza + '\'' +
                ", color='" + color + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

