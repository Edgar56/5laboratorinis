/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5praktinisdarbas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author VerGil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        int choice;
        System.out.println("Iveskite viena is dveju");
        System.out.println("1-busto kreditas | 2-vartotojo kreditas");
        choice = Integer.parseInt(br.readLine());
        System.out.println("Jusu ivestas pasirinkimas:" + choice);

        Scanner klaviatura = new Scanner(System.in);
        Kredit kreditas = new Kredit();
        switch (choice) {
            case 1:
                System.out.println("Iveskite seimos pajamas: ");
               // Pajamos = klaviatura.nextDouble();
                kreditas.setPajamos(klaviatura.nextDouble());
                System.out.println("Jusu seimos pajamos: " + kreditas.getPajamos());

                System.out.println("Seimos finansiniai isipareigojimai (isiskolinimai):");
                kreditas.setIsiskolinimai(klaviatura.nextDouble());
                System.out.println("Palukanos bus: " + kreditas.getIsiskolinimai());
                if (kreditas.getIsiskolinimai() > 15000 || kreditas.getIsiskolinimai() < 0) {
                    throw new FileNotFoundException("Paskola jums nebus suteikiama del palukanu");
                }
// Set uzsetinam
                // Get gaunam reiskia
                System.out.println("Iveskite vaiku skaiciu: ");
                kreditas.setVaikukiekis(klaviatura.nextInt());
                System.out.println("Vaiku yra: " + kreditas.getVaikukiekis());
                if (kreditas.getVaikukiekis() > 10 || kreditas.getVaikukiekis() < 0) {
                    throw new FileNotFoundException("Blogai ivedete vaiku skaiciu");

                }

                System.out.println("Iveskite islaidos skirti vaikams: ");
                //vaikuislaidos = klaviatura.nextInt();
                kreditas.setVaikuislaidos(klaviatura.nextInt());
                System.out.println("Vaikui skirti  islaidos: " + kreditas.getVaikuislaidos());

                System.out.println("Busto kredito paskola: ");
               // Paskola = klaviatura.nextDouble();
                kreditas.setPaskola(klaviatura.nextDouble());
                System.out.println("Jus norite pasiskolinti: " + kreditas.getPaskola());

                System.out.println("Iveskite palukanos per menesi pvz.: 3,3");
                //palukanos = klaviatura.nextDouble();
                kreditas.setPalukanos(klaviatura.nextDouble());
                System.out.println("Jusu palukanos: " + kreditas.getPalukanos());

                System.out.println("Iveskite ant kiek menesiu imsite paskola");
                //laikotarpis = klaviatura.nextInt();
                kreditas.setLaikotarpis(klaviatura.nextInt());
                System.out.println("Jus ivedete " + kreditas.getLaikotarpis());
                if (kreditas.getLaikotarpis() > 960) {
                    throw new FileNotFoundException("Paskola tokiam ilgam laikotarpiui nesuteikiama");
                } else {
                    System.out.println("   ");
                    if (kreditas.getPaskola() >= kreditas.Check_Paskola()) {
                        throw new FileNotFoundException("Paskola nesuteikiama!");
                    } else if (kreditas.getPaskola() < kreditas.Check_Paskola_2()) {
                        System.out.println("Paskola suteikiama!");
                    }

                    if (0.0013 * kreditas.getPaskola() > 144.81) {
                        System.out.println("Kredito sutarties sudarymo mokestis bus: " + 0.0013 * kreditas.getPaskola());
                    } else if (0.0013 * kreditas.getPaskola() <= 144.81) {
                        System.out.println("Kredito sutarties sudarymo mokestis bus: " + 144.81);
                    }

                    System.out.println("");
                    kreditas.setR(kreditas.getPalukanos() / 1200);
                    kreditas.setF(Math.pow(1 + kreditas.getR(),  kreditas.getLaikotarpis()));
                    kreditas.setMonthPmt(kreditas.getPaskola() * (kreditas.getR() * kreditas.getF() / (-1 + kreditas.getF())));
                    System.out.printf("Jusu menesinis mokestis bus: %.2f", kreditas.getMonthPmt());
                    System.out.println("   ");

                    kreditas.setPelnas(kreditas.getPajamos() - kreditas.getMonthPmt() - (kreditas.getVaikuislaidos() * kreditas.getVaikukiekis()) - kreditas.getIsiskolinimai());
                    System.out.printf("Seimos pajamos atskaicius mokescius:  %.2f", kreditas.getPelnas());
                    System.out.println("   ");
                    if (kreditas.getPelnas() > 30000 || kreditas.getPelnas() < 0) {
                        throw new FileNotFoundException("Paskola jums nebus suteikiama");
                    } else {
                        System.out.println("");
                    }

                    kreditas.setTotal(kreditas.getMonthPmt() * kreditas.getLaikotarpis());
                    System.out.println("   ");
                    System.out.printf("Total amount to pay: %.2f", kreditas.getTotal());
                    System.out.println("   ");
                    System.out.println("Good Bye");
                }
                break;

            case 2:
                System.out.println("Iveskite seimos pajamas: ");
               
                kreditas.setPajamos(klaviatura.nextDouble());
                System.out.println("Jusu seimos pajamos: " + kreditas.getPajamos());

                System.out.println("Seimos finansiniai isipareigojimai (isiskolinimai):");
               // isiskolinimai = klaviatura.nextDouble();
                kreditas.setIsiskolinimai(klaviatura.nextDouble());
                System.out.println("Palukanos bus: " + kreditas.getIsiskolinimai());
                if (kreditas.getIsiskolinimai() > 5000 || kreditas.getIsiskolinimai() < 0) {
                    throw new FileNotFoundException("Paskola jums nebus suteikiama del palukanu");
                }

                System.out.println("Iveskite vaiku skaiciu: ");
               // vaikukiekis = klaviatura.nextInt();
                kreditas.setVaikukiekis(klaviatura.nextInt());
                System.out.println("Vaiku yra: " + kreditas.getVaikukiekis());
                if (kreditas.getVaikukiekis() > 10 || kreditas.getVaikukiekis() < 0) {
                    throw new FileNotFoundException("Blogai ivedete vaiku skaiciu");
                }

                System.out.println("Iveskite islaidos skirti vaikams: ");
                //vaikuislaidos = klaviatura.nextInt();
                kreditas.setVaikuislaidos(klaviatura.nextInt());
                System.out.println("Vaikui skirti  islaidos: " + kreditas.getVaikuislaidos());

                System.out.println("Vartotojo kredito paskola: ");
               // Paskola = klaviatura.nextDouble();
                kreditas.setPaskola(klaviatura.nextDouble());
                System.out.println("Jus norite pasiskolinti: " + kreditas.getPaskola());
                if (kreditas.getIsiskolinimai() > 2600 || kreditas.getIsiskolinimai() < 300) {
                    throw new FileNotFoundException("Paskola jums nebus suteikiama del paskolos limito");
                }

                System.out.println("Iveskite palukanos per menesi pvz.: 3,3");
               // palukanos = klaviatura.nextDouble();
                kreditas.setPalukanos(klaviatura.nextDouble());
                System.out.println("Jusu palukanos: " + kreditas.getPalukanos());

                System.out.println("Iveskite ant kiek menesiu imsite paskola");
                //laikotarpis = klaviatura.nextInt();
                kreditas.setLaikotarpis(klaviatura.nextInt());
                System.out.println("Jus ivedete " + kreditas.getLaikotarpis());
                if (kreditas.getLaikotarpis() > 60) {
                    throw new FileNotFoundException("Paskola tokiam ilgam laikotarpiui nesuteikiama");
                } else {
                    System.out.println("   ");
                    if (kreditas.getPaskola() >= kreditas.Check_Paskola()) {
                        throw new FileNotFoundException("Paskola nesuteikiama!");
                    } else if (kreditas.getPaskola() < kreditas.Check_Paskola_2()) {
                        System.out.println("Paskola suteikiama!");
                    }
                    System.out.println(" ");

                    if (0.0013 * kreditas.getPaskola() > 144.81) {
                        System.out.println("Kredito sutarties sudarymo mokestis bus: " + 0.0013 * kreditas.getPaskola());
                    } else if (0.0013 * kreditas.getPaskola() <= 144.81) {
                        System.out.println("Kredito sutarties sudarymo mokestis bus: " + 144.81);
                    }

                    System.out.println("");
                    //R = palukanos / 1200;
                    //F = Math.pow(1 + R, laikotarpis);
                    //MonthPmt = Paskola * (R * F / (-1 + F));
                    kreditas.setR(kreditas.getPalukanos() / 1200);
                    kreditas.setF(Math.pow(1 + kreditas.getR(),  kreditas.getLaikotarpis()));
                    kreditas.setMonthPmt(kreditas.getPaskola() * (kreditas.getR() * kreditas.getF() / (-1 + kreditas.getF())));
                    System.out.printf("Jusu menesinis mokestis bus: %.2f", kreditas.getMonthPmt());
                    System.out.println("   ");

                    //Pelnas = Pajamos - MonthPmt - (vaikuislaidos * vaikukiekis) - isiskolinimai;
                     kreditas.setPelnas(kreditas.getPajamos() - kreditas.getMonthPmt() - (kreditas.getVaikuislaidos() * kreditas.getVaikukiekis()) - kreditas.getIsiskolinimai());
                    System.out.printf("Seimos pajamos atskaicius mokescius:  %.2f", kreditas.getPelnas());
                    System.out.println("   ");
                    if (kreditas.getPelnas() > 10000 || kreditas.getPelnas() < 0) {
                        throw new FileNotFoundException("Paskola jums nebus suteikiama");
                    } else {
                        System.out.println("");
                    }

                    kreditas.setTotal(kreditas.getMonthPmt() * kreditas.getLaikotarpis());
                    System.out.println("   ");
                    System.out.printf("Total amount to pay: %.2f", kreditas.getTotal());
                    System.out.println("   ");
                    System.out.println("Good Bye");
                }
                break;
            default:
                throw new FileNotFoundException("Iterptas simbolius nezinomas(reikejo iveskite 1 arba 2)");

        }

    }

}
