package org.example.MyWitcher.algorithms.tasks.t6;

import java.util.Arrays;
import java.util.Locale;

/**
 * Напишите класс BaseConverter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгейты, и так далее. У класса должен быть метод convert, который
 * и делает конвертацию.
 * */
public class BaseConverter {
    public static void main(String[] args) {
        double temperature = 36.6;
        System.out.println("t = " + new CelsiusConverter().getConverterValue(temperature));
        System.out.println("t = " + new KelvinConverter().getConverterValue(temperature));
        System.out.println("t = " + new FahrenheitConverter().getConverterValue(temperature));


        System.out.println(Converter.getInstance().getConverterValue(temperature));
    }
}

interface Converter {
    double getConverterValue(double baseValue);

    static Converter getInstance(){
        Locale locale = Locale.getDefault();
        String[] fahrenheitCountries = {"RU", "US", "BZ", "KY", "PW"};

        boolean isFahrenheitCountry = Arrays.asList(fahrenheitCountries).contains(locale.getCountry());

        if(isFahrenheitCountry)
            return new CelsiusConverter();
        else
            return new FahrenheitConverter();
    }
}

class CelsiusConverter implements Converter {
    @Override
    public double getConverterValue(double baseValue) {
        return baseValue;
    }
}

class KelvinConverter implements Converter {
    @Override
    public double getConverterValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConverter implements Converter {
    @Override
    public double getConverterValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}