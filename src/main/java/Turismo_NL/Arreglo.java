package Turismo_NL;

import Turismo_NL.Lugar;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Arreglo {
	Scanner entrada = new Scanner (System.in);
	
	private Object arreglo[], n, aux;
        private int i = 0;
        Object vector[] = new Object[3];


	public Arreglo() {
		
	}
	/*
	public void LlenarArreglo() {
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la longuitud del Arreglo unidimencional"));
		arreglo = new int[n];

		for (int a = 0; a < n; a++) {
			arreglo[a]=Integer.parseInt(JOptionPane.showInputDialog("Ingresar valores"));
		}			
	}
        */
        public boolean setIngreso() {
        
        Lugar l = new Lugar();
        
        
        if ( i < vector.length) {
            
            System.out.println("primer intento");
            l.setNombre(new Scanner(System.in).nextLine());
            l.setDireccion(new Scanner(System.in).nextLine());
            l.setDescripcion(new Scanner(System.in).nextLine());
            vector[i] = l;
            i++;
        }
      
            return false;
    }
	public boolean existe( ){
		n = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la referencia que deseas buscar"));
	    int a = 0;
	    boolean encontrado= false;
	    while (a < arreglo.length && !encontrado)
	       { if (arreglo[a] == n){
	                  encontrado = true;
	                  JOptionPane.showMessageDialog(null, "Elemento Encontrado \n" + "[ " +arreglo[a]+" ]");
	                  return encontrado;
	                  }
	        else {  

	        	a = a+1;
		}
	       }
		return encontrado;       
	}

	public void OrdenBurbuja() {
	for (int i=0; i<n-1; i++) {
		for (int j = 0; j < n-1;j++) {
			if (arreglo[j+1]< arreglo[j]) {
				aux = arreglo[j+1];
				arreglo[j+1] = arreglo[j];
				arreglo[j] = aux;
				
			}
		}
	}
	for(int i1 =0; i1<n;i1++) {
		System.out.print(i1 + ".[ " + arreglo[i1] + " ]> ");
	}
	}
	public void Insertion_sort()
	{   int i, j;
	    int actual;
	    for (i = 1; i < arreglo.length; i++) {
	        actual = arreglo[i];
	        for (j = i; j > 0 && arreglo[j - 1] > actual; j--) {
	        	arreglo [j] = arreglo [j - 1];
	        }
	        arreglo[j] = actual;
	    }
	    for(int i1 =0; i1<n;i1++) {
			System.out.print(i1 + ".[ " + arreglo[i1] + " ]> ");
		}
	}
}
