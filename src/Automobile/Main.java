package Automobile;


public class Main {
    public static void main(String[] args) {

        Automobile[] automobiles = {
                new Automobile("Lada", "Granta", 2015, "России", "желтого", 1.7),
                new Automobile("Audi", "A8 50 L TDI quattro", +2020, "Германии", "черный", 3.0),
                new Automobile("BMW", "Z8", 2021, "Германии", "черный", 3.0),
                new Automobile("Kia", "Sportage", 2018, "Южной Корее", "красный", 2.4),
                new Automobile("Hyundai", "Avante", 2016, "Южной Корее", "оранжевый", 1.6),
                new Automobile("", " ", 0, "", "", 0),
        };
        for (Automobile value : automobiles) {
            System.out.println(value);
        }
    }
}