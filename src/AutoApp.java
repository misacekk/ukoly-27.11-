import java.util.Scanner;

class AutoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Auto a = new Auto();

        while (true) {
            a.stav();
            System.out.println("Zadej příkaz:");
            String cmd = sc.nextLine().toLowerCase();

            try {
                if (cmd.equals("zapni motor")) a.nastartovat();
                else if (cmd.equals("vypni motor")) a.vypnoutMotor();
                else if (cmd.equals("zapni pásy")) a.zapnoutPasy();
                else if (cmd.equals("vypni pásy")) a.vypnoutPasy();
                else if (cmd.startsWith("zrychli o ")) a.zrychlit(Integer.parseInt(cmd.substring(10)));
                else if (cmd.startsWith("zpomal o ")) a.zpomalit(Integer.parseInt(cmd.substring(10)));
                else System.out.println("Neznámý příkaz.");

            } catch (Exception e) {
                System.out.println("Chyba: " + e.getMessage());
            }
        }
    }
}