import java.util.Scanner;

class AutoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auto a = new Auto();

        while (true) {
            a.stav();
            System.out.println("Zadej příkaz:");
            String prikaz = sc.nextLine().toLowerCase();

            try {
                if (prikaz.equals("zapni motor")) a.nastartovat();
                else if (prikaz.equals("vypni motor")) a.vypnoutMotor();
                else if (prikaz.equals("zapni pásy")) a.zapnoutPasy();
                else if (prikaz.equals("vypni pásy")) a.vypnoutPasy();
                else if (prikaz.startsWith("zrychli o ")) a.zrychlit(Integer.parseInt(prikaz.substring(10)));
                else if (prikaz.startsWith("zpomal o ")) a.zpomalit(Integer.parseInt(prikaz.substring(10)));
                else System.out.println("Neznámý příkaz.");

            } catch (Exception e) {
                System.out.println("Chyba: " + e.getMessage());
            }
        }
    }
}