package org.example.MyWitcher.pattern.structural.adapter.ex2;

import org.example.MyWitcher.pattern.structural.adapter.ex2.adapters.SquarePegAdapter;
import org.example.MyWitcher.pattern.structural.adapter.ex2.round.RoundHole;
import org.example.MyWitcher.pattern.structural.adapter.ex2.round.RoundPeg;
import org.example.MyWitcher.pattern.structural.adapter.ex2.square.SquarePeg;

public class Main {
    public static void main(String[] args) {
        // Круглое к круглому — всё работает.
        RoundHole hole = new RoundHole(5);
        RoundPeg rPeg = new RoundPeg(5);
        if (hole.fits(rPeg)){
            System.out.println("Круглый штифт r5 подходит к круглому отверстию r5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Не скомпилируется.

        // Адаптер решит проблему.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)){
            System.out.println("Квадратный штифт w2 подходит к круглому отверстию r5.");
        }
        if (!hole.fits(largeSqPegAdapter)){
            System.out.println("Квадратный штифт w20 не входит в круглое отверстие r5.");
        }
    }
}
