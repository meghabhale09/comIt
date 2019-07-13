public class Circle {
    private String name;
    private float radius, height;

    public Circle(String name, float radius) {
        this.name = name;
        this.radius = radius;
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
         return  Math.PI * radius*radius * height;

     }
}
