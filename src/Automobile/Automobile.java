package Automobile;

public class Automobile {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

    public Automobile(String brand, String model, int productionYear, String productionCountry, String color, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;

        if (brand.equals("Null") || brand.equals("") || brand.equals(" ")) {
            this.brand = "default";
        }
        if (model.equals("Null") || model.equals("") || model.equals(" ")) {
            this.model = "default";
        }
        if (productionCountry.equals("Null") || productionCountry.equals("") || productionCountry.equals(" ")) {
            this.productionCountry = "default";
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        }
        if (color.equals("Null") || color.equals("") || color.equals(" ")) {
            this.color = "белого";
        }
        if (productionYear <= 0) {
            this.productionYear = 2000;
        }
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + productionYear + " год выпуска," + " сборка в " + productionCountry + ", " + color + " цвета," + " объем двигателя - " + engineVolume + " л.";
    }
}





