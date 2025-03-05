package Helpers;

import Logica_Negocio.Persona;
import java.util.ArrayList;

/**
 *
 * @author Marcela Rivera
 */
public class HelperImpresion {

    public static void ImprimirInfo(ArrayList<Persona> listapersonas) {

        for (int i = 0; i < listapersonas.size(); i++) {
            System.out.println("Persona" + (i + 1) + "\n");
            System.out.println("El id de la persona es :" + "\t" + listapersonas.get(i).getId());
            System.out.println("El Nombre de la persona es :" + "\t" + listapersonas.get(i).getNombre());
            System.out.println("El apellido de la persona es:" + "\t" + listapersonas.get(i).getApellido());
            System.out.println("\n");

            for (int j = 0; j < listapersonas.get(i).getListaproductos().size(); j++) {
                System.out.println("Productos" + (j + 1));
                System.out.println("el id del producto es:" + "\t" + listapersonas.get(i).getListaproductos().get(j).getId());
                System.out.println("El Nombre el producto es:" + "\t" + listapersonas.get(i).getListaproductos().get(j).getNombre());
                System.out.println("la descripcion de producto es :" + "\t" + listapersonas.get(i).getListaproductos().get(j).getDescripcion());
                System.out.println("\n");
            }
        }

    }

    public static void BuscarPersona(String id, ArrayList<Persona> lista) {
        int band = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (id.equals(lista.get(i).getId())) {
                band = 1;
                System.out.println("El id de la persona es:" + "\t" + lista.get(i).getId());
                System.out.println("El Nombrede la persona es:" + "\t" + lista.get(i).getNombre());
                System.out.println("El apellido de la persona es:" + "\t" + lista.get(i).getApellido());
                for (int j = 0; j < lista.get(i).getListaproductos().size(); j++) {
                    System.out.println("el Id del producto es es:" + "\t" + lista.get(i).getListaproductos().get(j).getId());
                    System.out.println("El nombre del producto es:" + "\t" + lista.get(i).getListaproductos().get(j).getNombre());
                    System.out.println("La descripcion de el producto es :" + "\t" + lista.get(i).getListaproductos().get(j).getDescripcion());

                }
            }
        }
            if(band == 0){
                System.out.println("id no encontrado");
            }
        }
    }

