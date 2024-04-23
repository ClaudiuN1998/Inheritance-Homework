package Inheritance;

public class Electronics extends Product{
    String type;
    double lenght;
    double width;
    double height;
    double weight;

    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public double getLenght(){
        return lenght;
    }
    public void setLenght(double lenght){
        this.lenght=lenght;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getWeight(){
        return weight;
    }
    public void setWeight(double weight){
        this.weight=weight;
    }
}
