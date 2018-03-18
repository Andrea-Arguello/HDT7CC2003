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
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scaner = new Scanner(System.in);
          Scanner ingreso = new Scanner(System.in);
        String source = "";
        ArrayList<String> diccionario;
        diccionario = new ArrayList<String>();

        String textoTraducido = "";

        System.out.println("Bienvenido!\nSeleccione el archivo .TXT que contiene el Diccionario\n(presiona ENTER para continuar)");
        ingreso.nextLine();
        /*
         ejemplo de codigo tomado de:
         http://stackoverflow.com/questions/7494478/jfilechooser-from-a-command-line-program-and-popping-up-underneath-all-windows
         */
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("./src"));
        chooser.setDialogTitle("Seleccione su archivo");
        chooser.setFileFilter(new FileNameExtensionFilter("Text files (.txt)", "txt"));
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {

            try {
						/*Lee el archivo y obtiene la cadena*/
                FileInputStream fstream = new FileInputStream(chooser.getSelectedFile().getAbsolutePath());
                BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                String strLine;
                while ((strLine = br.readLine()) != null) {
                    diccionario.add(strLine); //agregar cada linea al diccionario
                }

                /* Separar cadenas y hacer asociacion */
                for (int i = 0; i < diccionario.size(); i++) {
                    String temp = diccionario.get(i).substring(1, diccionario.get(i).length() - 1);
                    String[] partes = temp.split(", ");
                    dic.insert(partes[0],partes[1]);
                }
            } catch (Exception e) {
                System.out.println("Archivo no valido");
            }
        }

        /*abrir el texto*/
        System.out.println("Seleccione el archivo txt\n(presiona ENTER para continuar)");
        ingreso.nextLine();
        JFileChooser chooser2 = new JFileChooser(System.getProperty("java.class.path"));
        chooser2.setDialogTitle("Seleccione su archivo");
        chooser2.setFileFilter(new FileNameExtensionFilter("Text files (.txt)", "txt"));
        int returnVal2 = chooser2.showOpenDialog(null);
        if(returnVal2 == JFileChooser.APPROVE_OPTION) {
            try {
                Scanner inputFile2 = new Scanner(new File(chooser2.getSelectedFile().getAbsolutePath()));
                source = chooser2.getSelectedFile().getAbsolutePath();
            }
            catch (FileNotFoundException e) {
                System.out.println("No se sseleciono ningun archivo");

            }
        }

    }
    }
    

