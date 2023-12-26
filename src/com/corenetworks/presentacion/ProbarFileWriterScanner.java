package com.corenetworks.presentacion;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProbarFileWriterScanner {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        String linea = null;
        System.out.println("Escriba la línea ->");
        linea = s1.nextLine();
        try {
            FileWriter salida = new FileWriter("prueba1.txt");
            salida.write(linea);
            salida.flush();
            salida.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
