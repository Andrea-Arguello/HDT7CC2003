import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class Principal{
	 public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
           
            Scanner scaner = new Scanner(System.in);
            FactoryHash factory = new FactoryHash();
            Usuario usuario = new Usuario();
            BuscadorCarta buscar= new BuscadorCarta();

             System.out.println("Que tipo de mapa desea utilizar?");
             System.out.println("***1. LinkedHashMap\n***2. HashMap\n***3. TreeMap");
            
            String op = scaner.next();
            
            while(op.equals("1") == false && op.equals("2") == false && op.equals("3") == false){
                System.out.println("Esta no es una opcion valida. Ingrese una opcion valida.");
                op=scaner.next();
            }
            
            Map cards = factory.getMap(Integer.parseInt(op));
            
            BufferedReader entrada;
           // File archivo = new File("cards.txt");
            entrada = new BufferedReader(new FileReader("cards_desc.txt"));


            try{
                String linea;
                while((linea=entrada.readLine())!=null){
                    String parts[] = linea.split("\\|");
                    cards.put(parts[0].toUpperCase(), new Carta(parts[0].toUpperCase(),parts[1].toUpperCase()));
                }
                int contador=0;
                while(contador==0){
                System.out.println("Que desea hacer?");
                System.out.println("***1. Agregar carta\n***2. Buscar una carta y mostrar su tipo\n***3. Mostrar mis cartas\n***4. Mostrar mis cartas ordenadas por tipo\n***5. Mostrar todas las cartas\n***6. Mostrar todas las cartas por tipo\n***7. Salir");
                String option=scaner.next();
             switch(option){
                 case "1":
                     System.out.println("Que carta desea agregar?");
                     String key1=scaner.nextLine().toUpperCase();
                     key1=scaner.nextLine().toUpperCase();
                     if(buscar.keyExiste(key1,cards)==false){
                         System.out.println("Esta carta no existe");
                     }
                     else{
                         usuario.addCarta(buscar.getCartaKey(key1,cards));
                         System.out.println("Carta agregada");
                     }
                     break;
                 case "2":
                     System.out.println("Que carta desea buscar?");
                     String key2=scaner.nextLine().toUpperCase();
                     key2=scaner.nextLine().toUpperCase();
                     if (buscar.keyExiste(key2,cards) == false)
                     {
                         System.out.println("Esta carta no existe");
                     }
                     else{
                         System.out.println("Carta: "+key2);
                         System.out.println("Tipo: "+buscar.buscarTipodeCarta(key2, cards));
                     }
                     contador=0;
                     break;
                 case "3":
                     if(usuario.getCartas().equals("")){
                         System.out.println("Usted no tiene cartas");
                     }
                     else{
                     System.out.println(usuario.getCartas());
                     }
                     contador=0;
                     break;
                 case "4":
                     if(usuario.getCartas().equals("")){
                         System.out.println("Usted no tiene cartas");
                     }
                     else{
                        System.out.println(usuario.ordenar());
                     }
                     break;
                 case "5":
                     buscar.todasMisCartas(cards);
                     break;
                 case "6": 
                     buscar.todasMisCartas(buscar.ordenarporTipo(cards));
                     break;
                 case "7":
                     System.out.println("Adios");
                     contador=1;
                     break;
                     
                     
                        } 
                 
                }

            }catch (IOException e) {
                System.out.println("No se halla el archivo.");

            }finally{
                try{
                    entrada.close();
                }
                catch(IOException e){
                }
            }    
         }
}
