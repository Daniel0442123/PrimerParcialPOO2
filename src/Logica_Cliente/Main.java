/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelperValidacion;
import Logica_Negocio.Persona;
import Logica_Negocio.Producto;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author yani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String id, nombreProducto, descripcion;
        String idPersona, nombre, apellido;
        Persona objPersona;
        Producto objProducto;
       
        //conteo valida el numero de caracteres ingresados por el usuario 
        int rta, conteo, cantidad,opcion=0;
        ArrayList<Producto> listaproductosglobal = null;
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        
        do {
            System.out.println("B I E N V E N I D O   A L   M E N U ....");
            System.out.println("1. Regitrar Personas");
            System.out.println("2. Mostrar Personas");
            System.out.println("3. Buscar personas");
            System.out.println("4. Salir");

            System.out.println("Digite una opcion valida");
            opcion = teclado.nextInt();
            
            System.out.println("---------------------------------");
            System.out.println("---------------------------------");

            switch (opcion) {
                case 1 -> {
                    ArrayList<Producto> listaproductolocal = new ArrayList<>();
                    System.out.println("Digite el Numero de productos");
                    cantidad = teclado.nextInt();

                    for (int i = 0; i < cantidad; i++) {
                        teclado.nextLine();

                        System.out.println("Digite el id del producto");
                        id = teclado.nextLine();
                        rta = HelperValidacion.ValidarTodoSerial(id);
                        while (rta > 0) {
                            System.out.println("Digite el id del producto ");
                            id = teclado.nextLine();
                            rta = HelperValidacion.ValidarTodoSerial(id);
                        }
                        conteo = HelperValidacion.ValidarTodoSerial(id);
                        while (conteo != 0) {
                            System.out.println("Digite el id del producto");
                            id = teclado.nextLine();
                            conteo = HelperValidacion.ValidarTodoSerial(id);
                        }
                        
                        
                        
                        System.out.println("Digite el nombre del producto ");
                        nombreProducto = teclado.nextLine();
                        rta = HelperValidacion.ValidarTodo(nombreProducto);
                        while (rta > 0) {
                            System.out.println("Digite el nombre del producto ");
                            nombreProducto = teclado.nextLine();
                            rta = HelperValidacion.ValidarTodo(nombreProducto);
                        }
                        conteo = HelperValidacion.ValidarTodo(nombreProducto);
                        while (conteo != 0) {
                            System.out.println("Digite el nombre del producto");
                            nombreProducto = teclado.nextLine();
                            conteo = HelperValidacion.ValidarTodo(nombreProducto);

                        }
                        
                        
                        
                        System.out.println("Digite la Descripcion del producto ");
                        descripcion = teclado.nextLine();
                        rta = HelperValidacion.ValidarTodo(descripcion);
                        while (rta > 0) {
                            System.out.println("Digite la Descripcion del producto ");
                            descripcion = teclado.nextLine();
                            rta = HelperValidacion.ValidarTodo(descripcion);
                        }
                        conteo = HelperValidacion.ValidarTodo(descripcion);
                        while (conteo != 0) {
                            System.out.println("Digite la Descripcion del producto ");
                            descripcion = teclado.nextLine();
                            conteo = HelperValidacion.ValidarTodo(descripcion);
                        }
                        
                        objProducto= new Producto(id, nombreProducto, descripcion);
                        listaproductolocal.add(objProducto);
                    }
                    //proceso para no duplicar datos 
                    listaproductosglobal = listaproductolocal;
                    listaproductolocal = null;
                    
                    

                    
                    System.out.println("Digite el id de la persona");
                    idPersona = teclado.nextLine();
                    rta = HelperValidacion.ValidarTodoSerial(idPersona);
                    while (rta > 0) {
                        System.out.println("Digite el id de la persona");
                        idPersona= teclado.nextLine();
                        rta = HelperValidacion.ValidarTodoSerial(idPersona);
                    }
                    conteo = HelperValidacion.ValidarTodoSerial(idPersona);
                    while (conteo != 0) {
                        System.out.println("Digite el id de la persona");
                        idPersona= teclado.nextLine();
                        conteo = HelperValidacion.ValidarTodoSerial(idPersona);
                    }
                    
                    
                    
                    
                    System.out.println("Digite el nombre de la persona ");
                    nombre = teclado.nextLine();
                    rta = HelperValidacion.ValidarTodo(nombre);
                    while (rta > 0) {
                        System.out.println("Digite el nombre de la persona ");
                        nombre = teclado.nextLine();
                        rta = HelperValidacion.ValidarTodo(nombre);
                    }
                    conteo = HelperValidacion.ValidarTodo(nombre);
                    while (conteo != 0) {
                        System.out.println("Digite el nombre de la persona ");
                        nombre = teclado.nextLine();
                        conteo = HelperValidacion.ValidarTodo(nombre);
                    }
                    
                    
                    
                    
                    System.out.println("Digite el apellido de la persona ");
                    apellido = teclado.nextLine();
                    rta = HelperValidacion.ValidarTodo(apellido);
                    while (rta > 0) {
                        System.out.println("Digite el apellido de la persona");
                        apellido= teclado.nextLine();
                        rta = HelperValidacion.ValidarTodo(apellido);
                    }
                    conteo = HelperValidacion.ValidarTodo(apellido);
                    while (conteo != 0) {
                        System.out.println("Digite el apellido de la persona");
                        apellido = teclado.nextLine();
                        conteo = HelperValidacion.ValidarTodoLetra(apellido);
                    }
                    
                    // Aqui se realiza la asociacion
                    objPersona= new Persona(idPersona,nombre, apellido, listaproductosglobal);
                    listaPersonas.add(objPersona);

                }
                case 2 -> {
                    Helpers.HelperImpresion.ImprimirInfo(listaPersonas);
                }
                case 3 -> {
                    teclado.nextLine();
                    System.out.println("Digite el id a Buscar");
                    id  = teclado.nextLine();
                    
                    Helpers.HelperImpresion.BuscarPersona(id, listaPersonas);
                    
                }
                case 4 -> {
                    
                    System.out.println("Saliendo...........");
                }
              
                /*default -> {
                    System.out.println("Opción no válida.");
                }*/
            }
            
            

        } while (opcion != 4);

    }
}

      
    

