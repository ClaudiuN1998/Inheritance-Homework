package Inheritance;

public class Cosmetics extends Product{
    public String color;
    public double weight;

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
}
