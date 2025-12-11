import java.util.Scanner;

class Auto {
    int rychlost = 0;
    boolean pasy = false;
    boolean motor = false;

    public void zapnoutPasy() throws Exception {
        if (motor) throw new Exception("Motor běží – nelze zapnout pásy.");
        pasy = true;
    }

    public void vypnoutPasy() throws Exception {
        if (motor) throw new Exception("Motor běží – nelze vypnout pásy.");
        if (rychlost > 0) throw new Exception("Auto jede – nelze vypnout pásy.");
        pasy = false;
    }

    public void nastartovat() throws Exception {
        if (!pasy) throw new Exception("Pásy musí být zapnuté před nastartováním.");
        motor = true;
    }

    public void vypnoutMotor() throws Exception {
        if (rychlost > 0) throw new Exception("Auto jede – motor nelze vypnout.");
        motor = false;
    }

    public void zrychlit(int o) throws Exception {
        if (!motor) throw new Exception("Motor neběží – nemůžeš zrychlit.");
        rychlost += o;
    }

    public void zpomalit(int o) throws Exception {
        if (!motor) throw new Exception("Motor neběží – nemůžeš zpomalit.");
        rychlost -= o;
        if (rychlost < 0) rychlost = 0;
    }

    public void stav() {
        System.out.println("Rychlost: " + rychlost + " | Pásy: " + pasy + " | Motor: " + motor);
    }
}

