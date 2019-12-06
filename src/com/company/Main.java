package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; // Pour Exercice #5
        String[] mostCoffeeDrank = {"0","01/01/0000","0"}; // Pour Exercice #2
        int neeEnMai = 0;
        String[][] tableau = {
                {"16/11/1992", "02/05/1990", "23/05/1996", "19/02/1985", "30/05/1991"},
                {"2", "1", "5", "0", "2"},
        };
        String tableauHeader = "Indice | Tableau pers\n---------------------------------------------";

        // Exercice #1
        System.out.println(tableauHeader);
        for(int i = 0; i<tableau[0].length;i++){

            if(Integer.parseInt(mostCoffeeDrank[2]) < Integer.parseInt(tableau[1][i])) {
                mostCoffeeDrank = new String[]{String.valueOf(i), tableau[0][i], tableau[1][i]};
            }

            System.out.println(i + " | \"" + tableau[0][i] + "\" | " + tableau[1][i] + checkValue(Integer.parseInt(tableau[1][i])));
        }

        // Exercice #2
        System.out.println("\nLa personne #"+ mostCoffeeDrank[0] + " as bu le plus de café avec un total de " + mostCoffeeDrank[2] + checkValue(Integer.parseInt(mostCoffeeDrank[2])));

        // Exercice #3 + 4
        System.out.println("\n" + tableauHeader);
        for(int i = 0; i<tableau[0].length;i++){
            int nbr_cafe;

            if(Integer.parseInt(tableau[1][i]) < 1){
                nbr_cafe = Integer.parseInt(tableau[1][i]);
            } else {
                nbr_cafe = Integer.parseInt(tableau[1][i]) - 1;
            }

            System.out.println(i + " | \"" + tableau[0][i] + "\" | " + nbr_cafe + checkValue(nbr_cafe));
        }

        // Exercice #5
        for(int i = 0; i<tableau[0].length;i++){
            Calendar calendar = Calendar.getInstance();
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(tableau[0][i]);
            calendar.setTime(date);

            if(monthNames[calendar.get(Calendar.MONTH)].equals("May")){
                neeEnMai++;
            }
        }

        System.out.println("\nIl y a " + neeEnMai + " personnes née au moi de Mai.");

    }

    public static String checkValue(int nbr_cafe){
        String msg;
        if(nbr_cafe <= 1){
            msg = " tasse";
        } else {
            msg = " tasses";
        }
        return msg;
    }
}
