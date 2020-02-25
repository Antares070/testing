import java.util.*;

public class Test2 {
    public static void main(String args[]) {
        //Lista que contienes las canciones
        List<String> lista = new ArrayList();

        String obj1 = "Cancion1";
        String obj2 = "Cancion2";
        String obj3 = "Cancion3";

        //Cargo la lista repitiendo 2
        lista.add(obj1);
        lista.add(obj2);
        lista.add(obj1);  //REPETIDA 2ª VEZ
        lista.add(obj3);
        lista.add(obj1);  //REPETIDA 3ª VEZ

        //Set para las repetidas - EMPIEZA EL BLOQUE QUE NECESITAS
        Set<String> cancionesRepetidas = new HashSet<String>();
        for(String s : lista){
            System.out.println("elemento lista: " + s);
            //Si no coincide el primer y último index => están repetidas
            if(lista.indexOf(s) != lista.lastIndexOf(s))
                cancionesRepetidas.add(s);
        }

        System.out.println(cancionesRepetidas);
    }
    }

