package Turismo_NL;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

public class Archivo {
    // TODO Auto-generated method stub

    public void ingreso() throws IOException {
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        String dato;
        FileInputStream entrada;
        ObjectInputStream salida;
        FileReader leer = null;
        archivo = new File("almacen.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                //Scanner dato = new Scanner("ingresa algo chucha");
                dato = JOptionPane.showInputDialog("ahora!!");
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println(dato);
                linea.close();
                escribir.close();

                //entrada = new FileInputStream(archivo);
                //	salida = new ObjectInputStream(entrada);
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {

                //Scanner dato = new Scanner("ingresa algo chucha");
                dato = JOptionPane.showInputDialog("hola");
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                //leer = new FileReader("almacen.txt");
                //entrada = new FileInputStream(archivo);
                //salida = new ObjectInputStream(entrada);
                //leer = (FileReader) salida.readObject();
                //JOptionPane.showMessageDialog(null, linea);
                linea.print(dato);
                linea.close();
                escribir.close();
            } catch (IOException ex) {
                Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void mostrar() throws IOException {
        FileWriter escribir;
        PrintWriter linea;
        String dato;
        FileInputStream entrada = new FileInputStream("almacentxt");
        ObjectInputStream salida = new ObjectInputStream(entrada);
        FileReader leer = new FileReader("almacen.txt");
        dato = (String) salida.readLine();

        System.out.println(leer.read());
    }

    public void readFromFile() throws IOException {
        InputStreamReader fr = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("almacen.txt"));
            System.out.println(bufferedReader.read());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            fr.close();
        }
    }
}
