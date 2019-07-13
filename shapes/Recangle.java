public class Recangle {
    private String name;
    private float length, width, height;

    public Recangle(String name, float length, float width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }

    public Recangle(String name, float length, float width, float height) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void printArea(){
        System.out.println("Area is " + length * width);
    }

    public void printVolume(){
        if(Math.round(height)!=0) System.out.println("Volume is " +  (length * width * height));
        else System.out.println("Volume can not computed");
    }

    public  void printPerimetre(){
        System.out.println("Perimeter is " + (2 * (length + width)));
    }
}
