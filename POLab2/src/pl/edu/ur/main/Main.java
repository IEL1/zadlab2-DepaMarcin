package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

    
    public static void main(String[] args) {
        
        //zad4
         System.out.println("Podaj 10 elementow tablicy: ");
        Scanner scanner = new Scanner(System.in);

        Double a = scanner.nextDouble();

        Double b = scanner.nextDouble();

        Double c = scanner.nextDouble();

        Double d = scanner.nextDouble();

        Double e = scanner.nextDouble();

        Double f = scanner.nextDouble();

        Double g = scanner.nextDouble();

        Double h = scanner.nextDouble();

        Double i = scanner.nextDouble();

        Double j = scanner.nextDouble();

        double tab[] = {a, b, c, d, e, f, g, h, i, j};
        int l;

        System.out.println("Wybierz funkcjonalnosc ktora chcesz uzyc:");
        System.out.println("1. Wyswietlanie sumy elementow tablicy\n"
                + "2. Wyswietlanie iloczynu elementow tablicy\n"
                + "3. Wyswietlanie sredniej wartosci\n"
                + "4. Wyswietlanie wartosci minimalnej\n"
                + "5. Wyswietlanie wartosci maksymalnej ?\n");
        int fun = scanner.nextInt();
        System.out.println();
        switch (fun) {
            case 1:
                double suma = 0;
                for (l = 0; l < tab.length; l++)
                    suma += tab[l];
                System.out.println("Wartosc sumy elementow tablicy wynosi: " + suma);
                break;
            case 2:
                double iloczyn = 1;
                for (l = 0; l < tab.length; l++)
                    iloczyn *= tab[l];
                System.out.println("Wartosc iloczynu elementow tablicy wynosi: " + iloczyn);
                break;
            case 3:
                double suma3 = 0;
                for (l = 0; l < tab.length; l++)
                    suma3 += tab[l];
                double srednia = suma3 / tab.length;
                System.out.println("Srednia wartosc elementow tablicy wynosi: " + srednia);
                break;
            case 4:
                double min = tab[0];
                for (l = 1; l < tab.length; l++) {
                    if (min > tab[l])
                        min = tab[l];
                }
                System.out.println("Minimalna wartosc wynosi: " + min);
                break;

            case 5:
                double max = tab[0];
                for (l = 1; l < tab.length; l++) {
                    if (max < tab[l])
                        max = tab[l];
                }
                System.out.println("Maksymalna wartosc wsrod wynosi: " + max);
                break;

            default:
                System.out.println("Podales nieprawidlowy numer funkcjonalnosci");
                break;
               //zad6  while (true) {
                    //Scanner zad6 = new Scanner(System.in);
                   // double liczba = zad6.nextDouble();
                    //if (liczba < 0) {
                       // System.out.println("Liczba ktora podales jest mniejsza od zera");
                       // break;
                    }
                }
        }
    


    
    

