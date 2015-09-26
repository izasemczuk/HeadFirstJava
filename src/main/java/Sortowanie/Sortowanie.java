package Sortowanie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by izunia on 2015-09-21.
 */
public class Sortowanie {

    public static void main(String[] args) {

        List<Integer> dni = new ArrayList<Integer>();
        dni.add(1);
        dni.add(3);
        dni.add(7);
        dni.add(9);
        dni.add(11);
        dni.add(15);
        dni.add(17);
        dni.add(20);

        System.out.println(dni);

        int poczatek = 0;
        int ostatni = 0;
        boolean dziura = false;
        List<String> wynik = new ArrayList<String>();

        for (int dzien : dni) {

            if (dni.indexOf(dzien) == 0) {
                poczatek = dzien;
                ostatni = dzien;
            } else if (dni.indexOf(dzien) == dni.size() - 1) {
                if (dzien - ostatni == 1 && dziura == true) {
                    wynik.add(Integer.toString(poczatek) + "-" + Integer.toString(dzien));
                } else if (dzien - ostatni != 1 && dziura == true) {
                    wynik.add(Integer.toString(poczatek) + "-" + Integer.toString(ostatni) + ", " + Integer.toString(dzien));
                } else if (dzien - ostatni == 1 && dziura == false) {
                    wynik.add(Integer.toString(poczatek) + "-" + Integer.toString(dzien));
                } else {
                    wynik.add(Integer.toString(ostatni) + ", " + Integer.toString(dzien));
                }

            } else {

                if (dzien - ostatni == 1) {
                    ostatni = dzien;
                    dziura = true;
                } else {
                    if (dziura == true) {
                        wynik.add(Integer.toString(poczatek) + "-" + Integer.toString(ostatni) + ", ");
                        poczatek = dzien;
                        ostatni = dzien;
                        dziura = false;
                    } else {
                        wynik.add(Integer.toString(ostatni) + ", ");
                        poczatek = dzien;
                        ostatni = dzien;
                        dziura = false;
                    }


                }


            }
        }


        for (String wynikowy : wynik) {
            System.out.print(wynikowy);
        }

    }


}

