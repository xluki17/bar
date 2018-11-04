package com.company;

import java.util.Scanner;

public class Barman {

    Scanner odczyt = new Scanner(System.in);


    public void createDrink() {
        System.out.println("Podaj 3 składniki: ");

        String skladnik1 = odczyt.nextLine();
        String skladnik2 = odczyt.nextLine();
        String skladnik3 = odczyt.nextLine();
        System.out.println(skladnik1 + ", " + skladnik2 + ", " + skladnik3);

    }

}
