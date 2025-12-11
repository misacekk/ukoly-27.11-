import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        //Úkol 1 (Testování)

        /*long start = System.currentTimeMillis();
        String řetězec = "";
        for (int i = 0; i < 1000; i++) {
            řetězec += "x";
        }
        long end = System.currentTimeMillis();
        System.out.println("String čas: " + (end - start) + " milisekund");

        start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 1000; i++) {
            stringBuffer.append("x");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer čas: " + (end - start) + " milisekund");
        System.out.println("-----------------------------------------------------");*/

        //Úkol 2 (Rezervace)
        /*System.out.println("Zadej větu");
        String veta1 = sc.nextLine(); throw new IllegalArgumentException();
        if (veta1.equals("")) {
            System.out.println("Věta je prázdná");
        }*/


        //Úkol 3 (Slovní fotbal)

        //Úkol 4 (Analýza textu)
        /*String veta = "Ahoj Pepo dnes je hezký den. Je ti 15 let a měříš 178 cm a tvoje oblíbené číslo je 6.";
        int pocetPismen = 0;
        int pocetMal = 0;
        int pocetVel = 0;
        int pocetCislic = 0;

        for (char c : veta.toCharArray()) {
            if (Character.isDigit(c)) {
                pocetCislic++;
            }
        }

        for (char c : veta.toCharArray()) {
            if (Character.isLetter(c)) {
                pocetPismen++;
            }
        }

        for (char c : veta.toCharArray()) {
            if (Character.isLowerCase(c)) {
                pocetMal++;
            }
        }

        for (char c : veta.toCharArray()) {
            if (Character.isUpperCase(c)) {
                pocetVel++;
            }
        }

        String[] vety = veta.split("[.!?]");
        String[] slova = veta.split("[\\s+]");

        int pocetSlov = slova.length;
        int pocetVet = vety.length;

        System.out.println("Počet písmen je: " + pocetPismen);
        System.out.println("Počet malých a velkých písmen je: " + pocetMal + " a " + pocetVel);
        System.out.println("Počet číslic je: " + pocetCislic);
        System.out.println("Počet slov je: " + pocetSlov);
        System.out.println("Počet vět je: " + pocetVet);
        System.out.println("-----------------------------------------------------");


        //Úkol 5 (Třída auto)*/

    }
}