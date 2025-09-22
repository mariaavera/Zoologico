package Model;

public class Pollo extends Animal {
    private String color;
    private String id;

    public Pollo(String nombre, byte edad, String color, String id){
        super(nombre, edad);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: PIO,PIO");
    }

    @Override
    public String toString() {
        return super.toString() + "Pollo{" +
                "color='" + color + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}

