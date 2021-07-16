package model;

import java.util.Scanner;

public class Ejercicios2 {
    int[] miLista = new int[] {1,2,3,4,5,6,7,8,9,10};

    public Ejercicios2(int numero2) {
        for (int i : miLista) {
            System.out.println(i*numero2);            
        }

    }

    public String Imprimir(){
        return "se convirtio la tabla";

    }




    
}

class Main{

    public static void main(String[] args) {
    Scanner tabla = new Scanner(System.in);
    System.out.println("inserte numero");
    String numero = tabla.nextLine();
    int numero2 = Integer.parseInt(numero);
    Ejercicios2 ejercicio = new Ejercicios2(numero2);
    ejercicio.Imprimir();
            
    }


}
