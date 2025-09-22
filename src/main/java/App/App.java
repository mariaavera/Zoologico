package App;
import Model.Zoologico;
import Model.Perro;
import Model.Gato;
import Model.Pollo;
import Model.Leon;
import Model.Cerdo;
import Model.Animal;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico("ZooIng");

        Animal perro = new Perro("Tobby", (byte)10, "Poodle", "Blanco", "1234");
        Animal gato = new Gato("Pluto",(byte)2,"Criollo", "verde", "109491" );
        Animal pollo = new Pollo("Pollito",(byte)4,"Amarillo","8756");
        Animal leon = new Leon("Leonidas",(byte)5, 114.5,"Sabana","23435");
        Animal cerdo = new Cerdo("Puerqui",(byte)1, 12,"2354");

        zoologico.registrarAnimal(perro);
        zoologico.registrarAnimal(gato);
        zoologico.registrarAnimal(pollo);
        zoologico.registrarAnimal(leon);
        zoologico.registrarAnimal(cerdo);

        zoologico.listarAnimales();

        zoologico.hacerSonidos();


    }
}
