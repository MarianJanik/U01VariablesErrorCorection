package com.engeto.examples;

import java.math.BigDecimal;

public class Main {

    public static void ukol1()  // Chyběly úvozovky a středník
    {
        System.out.println("Hello world!");
    }

    public static void ukol2() // Karel (String) bez úvozovek
    {
        String uzivatel = "Karel";
        System.out.println(uzivatel);
    }

    public static void ukol3() // pocetLekci by měl být int (celé číslo)
    {
        int pocetLekci = 10;
        System.out.println(pocetLekci);
    }

    public static void ukol4() // desetinná tečka 10.0
    {
        double cena = 10.0;
        System.out.println(cena);
    }

    public static void ukol5() //Na měnu se používá objektový typ Bigdecimal
    {
        BigDecimal cena = BigDecimal.valueOf(0);
        for (int i = 0; i < 10; i++)
        {
            cena =cena.add(BigDecimal.valueOf(0.1));
        }
        System.out.println(cena);
        // Má vypsat "1.0". Ale vypíše "0.9999" !!!
    }

    public static void ukol6() //Na měnu se používá objektový typ Bigdecimal
    {
        BigDecimal cena =  BigDecimal.valueOf(0);
        cena = cena.add(BigDecimal.valueOf(0.1));
        System.out.println(cena);
    }

    public static void ukol7() // int použito s uvozovkami
    {
        int vykonMotoru = 120;
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() // int spojujeme pomocí + s textem (asi nějaké "přetypování proměnné")
    {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: " +velikostKosile+ ".");
    }

    public static void ukol9() //nestatická metoda se neváže na aktuální třídu
    {
        System.out.println("Metody jsou doufám bez chybičky!");
    }

    public static void main(String[] args)
    {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou zkratkou <Ctrl>+</> - použij lomítko na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();
    }
}
