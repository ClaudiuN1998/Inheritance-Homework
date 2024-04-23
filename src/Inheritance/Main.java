package Inheritance;


public class Main {
    public static void main(String[] args){
        Cosmetics lipstick = new Cosmetics();

        Electronics laptop = new Electronics();

        Fridge fridge = new Fridge();

        System.out.println(lipstick.getWeight());
        System.out.println(laptop.getLenght());
        System.out.println(fridge.getTemperature());


    }
}
