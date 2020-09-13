package exercises;

import java.util.ArrayList;
import java.util.List;

public class MinionSorter {
    public static void main(String[] args) {
        Minion dave = new Minion("Dave", 2, "yellow", "");
        Minion stuart = new Minion("Stuart", 1, "yellow", "");

        List<Minion> minions = new ArrayList<Minion>();
        minions.add(stuart);
        minions.add(dave);

        stuart.setMaster("");

        for (Minion minion : minions) {
            System.out.println(minion.getColor());
        }
    }

}
