public class Flower
{
    //declare instance variables
    private String name;
    private String color;
    private double price;
    private int quantity;
    
    //constructor without parameter
    public Flower()
    {
        this.name = "";
        this.color = "";
        this.price = 0;
        this.quantity = 0;
    }
    
    //constructor with parameter
    public Flower(String name, String color, double price, int quantity)
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }
    
    
    //getter getName()
    public String getName(){
        return name;
    }
    
    //getter getColor()
    public String getColor(){
        return color;
    }
    
    //getter getPrice()
    public double getPrice(){
        return price;
    }
    
    //getter getQuantity()
    public int getQuantity(){
        return quantity;
    }
    
    
    //setter setName()
    public void setName(String name){
        this.name = name;
    }
    
    //setter setColor()
    public void setColor(String color){
        this.color = color;
    }
    
    //setter setPrice()
    public void setPrice(double price){
        this.price = price;
    }
    
    //setter setQuantity()
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    //toString() method that displays all information about the flower
    public String toString(){
        return "Name :" + name + "\nColor :" + color + "\nPrice :" + price + "0" +"\nQuantity : " + quantity;
    }

}