package Model;

public class Gato extends Animal {
    private String raza;
    private String colorOjos;
    private String id;

    public Gato(String nombre, byte edad,String raza, String colorOjos, String id) {
        super(nombre, edad);

        this.raza = raza;
        this.colorOjos = colorOjos;
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace: MIAUU,MIAUU");
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" +
                "raza='" + raza + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
