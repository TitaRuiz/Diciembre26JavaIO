package com.corenetworks.presentacion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ProbarFileReader {

    public static void main(String[] args) {
        //Definir variables
        char[] buffer = new char[128];
        int caracterLeido;
        try {
            FileReader fEntrada = new FileReader("salida.txt");
            caracterLeido = fEntrada.read(buffer);
            System.out.println("Caracteres leidos ->"+ caracterLeido);
            System.out.println(Arrays.toString(buffer));
            while(caracterLeido!=-1){
                System.out.println("Entra al bucle");
                caracterLeido = fEntrada.read(buffer);
                System.out.println(Arrays.toString(buffer));

            }
            fEntrada.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
