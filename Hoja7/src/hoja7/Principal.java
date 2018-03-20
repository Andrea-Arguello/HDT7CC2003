/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoja7;

import java.util.Scanner;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author cooli
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        BufferedReader entrada = new BufferedReader(new FileReader("diccionario.txt"));
        BinarySearchTree bst = new BinarySearchTree();
	BufferedReader txt = new BufferedReader(new FileReader("texto.txt"));
		 try{
                while(entrada.ready()){
                    String parts[] = entrada.readLine().split(",");
                    String key = parts[0].substring(1,parts[0].length());
                    String value = parts[1].substring(0,parts[1].length()-1);
                    Association word = new Association(key,value); 
                    bst.insert(word);
                }
                
                while(txt.ready()){
                    System.out.println("Oracion a traducir:");
                    String texto =txt.readLine();
                    System.out.println(texto);
                    String[] oracion = texto.split("\\s+");
                    String traducida = "";
                    for(int i=0; i<oracion.length; i++){
                        Node busqueda = bst.buscar(oracion[i].toLowerCase());
                        if(busqueda==null){
                            traducida+=(" *" + oracion[i] + "* ");
                        }
                        else{
                            traducida+=(busqueda.key.getValue() + " ");
                        }
                    }
                    System.out.println("Oracion traducida:");
                    System.out.println(traducida);
                }
                
            }catch (IOException e) {
                System.out.println("No se halla el archivo.");

            }finally{
                try{
                    entrada.close();
                    txt.close();
                }
                catch(IOException e){
                }
	}	
   
    }
}
