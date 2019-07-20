package shapes;

import java.text.DecimalFormat;

public class Circle {
    private final String name;
    private float radius, height;

    public Circle(String name, float radius) {
        this.name = name;
        this.radius = radius;
        this.height = 0;
    }

    public Circle(String name, float radius, float height) {
        this.name = name;
        this.radius = radius;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double printArea(){
        return (Math.PI * radius*radius);
    }

     public double printCircumference(){
         return(2 * Math.PI * radius);
     }

    public float getHeight() {
        return height;
    }

    public double printVolume(){
         return  printArea() * height;

     }

     public boolean  isCircle(){
        return height==0;
     }

    @Override
    public String toString() {

        DecimalFormat format = new DecimalFormat("#.##");
        String  cylinerine = isCircle()? name + "is not cylinder. Can not compute volume\n."
                : name + " is a cylinder. It's volume is \n" + format.format(printVolume());

        return " " + name + " has following properties \n" + name + "'s area is equal to " + format.format(printArea()) + " meters squared\n" +
                name + "'s circumference is equal to " + format.format(printCircumference()) + " meters squared \n" +  cylinerine;
    }
}
