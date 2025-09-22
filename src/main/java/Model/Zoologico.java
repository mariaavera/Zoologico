package Model;
import java.util.ArrayList;

public class Zoologico {
    private String nombre;
    private ArrayList<Animal>animales;

    public Zoologico(String nombre){
        this.nombre = nombre;
        this.animales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAnimales(ArrayList<Animal> animales) {
        this.animales = animales;
    }

    public Animal buscarAnimal(String nombre){

        Animal resultado = null;
        for(int i=0; i < animales.size(); i++){

            Animal animalAux = animales.get(i);
            if(animalAux.getNombre().equals(nombre)){
                resultado = animalAux;
                break;
            }
        }
        return resultado;
    }
// Crear
    public String registrarAnimal(Animal nuevoAnimal){
        String resultado = "";
        Animal animalEncontrado = null;
        animalEncontrado = buscarAnimal(nuevoAnimal.getNombre());
        if(animalEncontrado == null){
            animales.add(nuevoAnimal);
            resultado = "El animal fue registrado en el zoologico ";
        }else{
            resultado = "El animal ya existe en el zoologico ";
        }
        return resultado;
    }
//Leer
    public void listarAnimales(){
        if(animales.isEmpty()) {
            System.out.println("No hay animales registrados");
        }else{
            for (Animal animalAux : animales){
                System.out.println(animalAux.toString());
            }
        }
    }
//Actualizar
    public String actualizarAnimal(String nombreActual, String nuevoNombre, byte nuevaEdad){
        String resultado = "";
        Animal AnimalEncontrado = null;

        AnimalEncontrado = buscarAnimal(nombreActual);
        if(AnimalEncontrado != null){
            AnimalEncontrado.setNombre(nuevoNombre);
            AnimalEncontrado.setEdad(nuevaEdad);

            resultado = "La información del animal fue actualizada correctamente";
        }else{
            resultado = "El no existe";
        }
        return resultado;
    }
//Eliminar
    public String eliminarAnimal(String nombre){
        Animal animalEncontrado = null;

        animalEncontrado = buscarAnimal(nombre);

        if(animalEncontrado != null){
            animales.remove(animalEncontrado);
            System.out.println("Animal eliminado exitosamente");
            return "Animal eliminado exitosamente";
        }else{
            return "Animal no existe";
        }

    }

    public void hacerSonidos(){
        for(Animal animalAux : animales){
            animalAux.hacerSonido();
        }
    }

}
