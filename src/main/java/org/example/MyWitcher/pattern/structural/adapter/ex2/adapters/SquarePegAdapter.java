package org.example.MyWitcher.pattern.structural.adapter.ex2.adapters;

import org.example.MyWitcher.pattern.structural.adapter.ex2.round.RoundPeg;
import org.example.MyWitcher.pattern.structural.adapter.ex2.square.SquarePeg;

/**
 * Адаптер позволяет использовать КвадратныеКолышки и КруглыеОтверстия вместе.
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // Рассчитываем минимальный радиус, в который пролезет этот колышек.
        return Math.sqrt(Math.pow(peg.getWidth() / 2, 2) * 2);
    }
}
