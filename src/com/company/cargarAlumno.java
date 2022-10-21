package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class cargarAlumno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String destino = sc.nextLine();
        ArrayList<String> lineas = new ArrayList<>();
        File fichero = new File(destino);

        FileReader fr = null;
        try {
            fr = new FileReader(fichero);
            BufferedReader bf = new BufferedReader(fr);

            String linea = null;
            while ((linea=bf.readLine())!= null){
                lineas.add(linea);
            }
            if(lineas.size()>0) {
                for (int i = 0; i < lineas.size(); i++) {
                    String l = lineas.get(i);
                    String[] datos =l.split(";");
                    String nombre = datos[0];
                    String apellido = datos[1];
                    String dni = datos[2];
                    System.out.println(nombre);
                    System.out.println(apellido);
                    System.out.println(dni);
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*SOLUCION DE EDU
        * if(fichero.exist())
        * BufferedReader br = new BufferedReader(new FileReader(fichero));
        * String linea;
        * while((linea = br.readLine())!= null){
        * System.out.println(linea)
        * }
        *
        *
        * }else{
        *   throw new FileNotFoundException;
        * }
        * */

    }
}