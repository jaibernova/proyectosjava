package model;


import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;

public class Ejercicios {
    Scanner fecha = new Scanner(System.in);
    private int suma=0;


    public Ejercicios() throws ParseException{
        System.out.println("escriba la fecha");
        String ingreso=fecha.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(ingreso); 
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int añoDeLaSuerte = localDate.getYear()+localDate.getMonthValue()+localDate.getDayOfMonth();
        System.out.println(añoDeLaSuerte);
        String añoNumero = Integer.toString(añoDeLaSuerte);
        //char[] digits1= añoNumero.toCharArray();
        //System.out.println(digits1);
        int[] num = new int[añoNumero.length()];
        //Arrays.setAll(num, i -> (int) digits1[i]);
        System.out.println(añoNumero.length());
        //for (int c : num){
        //    suma += c;
        //}

        for (int i = 0; i < añoNumero.length(); i++) {
            int c = añoNumero.charAt(i) -'0';
            
            suma += c;
            System.out.println(c);
        }
    }
    public int getSuma(){
        return suma;
    }
}

class Metodo{

    public static void main4(String[] args) throws ParseException {
        Ejercicios ejercicio1 = new Ejercicios();
        System.out.println(ejercicio1.getSuma());
        
    }
}
