import java.util.*;

public class Test {
    public static void main(String args[]) {
        //Lista que contienes las canciones
        List<String> lista = new ArrayList();
        List<String> listaCompleta = new ArrayList();
        List<String> listaCanciones = new ArrayList();

        String item1 = "Grupo1,Disco1,Cancion1";
        String item2 = "Grupo2,Disco2,Cancion2";
        String item3 = "Grupo3,Disco3,Cancion1";
        String item4 = "Grupo4,Disco4,Cancion4";
        String item5 = "Grupo5,Disco5,Cancion1";

        //Cargo la lista repitiendo 3
        lista.add(item1);
        lista.add(item2);
        lista.add(item3);  //REPETIDA 2ª VEZ
        lista.add(item4);
        lista.add(item5);  //REPETIDA 3ª VEZ

        //Lista para las canciones
        for (String s : lista) {
            String[] partes = s.split(",");
            String grupo = partes[0];
            String disco = partes[1];
            String cancion = partes[2];
            System.out.println(cancion);
            listaCanciones.add(cancion);
        }

        Collections.sort(listaCanciones);

        //Set para las repetidas
        List<String> cancionesRepetidas = new ArrayList();
        ;

        for (String s : lista) {
            System.out.println("elemento lista: " + s);
            String[] partes = s.split(",");
            String grupo = partes[0];
            String disco = partes[1];
            String cancion = partes[2];
            System.out.println(cancion);
            listaCompleta.add(cancion);

            //Si no coincide el primer y último index => están repetidas

            if (listaCanciones.indexOf(cancion) != listaCanciones.lastIndexOf(cancion)) {
                cancionesRepetidas.add(grupo + "," + disco + "," + cancion);
            }
        }
        System.out.println("Canciones repetidas: " + cancionesRepetidas);
    }
}
