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
        BufferedReader entrada;
	ArrayList<String> diccionario;
        diccionario = new ArrayList<String>();
		
        entrada = new BufferedReader(new FileReader(""));
		Scanner scaner = new Scanner(System.in);
		 try{
                while(entrada.ready()){
                   
                    String strLine;
                     while ((strLine = entrada.readLine()) != null) {
                    diccionario.add(strLine); //agregar cada linea al diccionario
                }

                /* Separar cadenas y hacer asociacion */
                for (int i = 0; i < diccionario.size(); i++) {
                    String temp = diccionario.get(i).substring(1, diccionario.get(i).length() - 1);
                    String[] partes = temp.split(", ");
                    //dic.insert(partes[0],partes[1]);
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
    

    

