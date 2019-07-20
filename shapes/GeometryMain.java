package shapes;

public class GeometryMain {
    public static void main(String[] args) {
        Circle[] circles = new Circle[]{new Circle("man hole",15), new Circle("Tower Of Pisa", 10, 18)};
        Recangle[] recangles = new Recangle[]{};


            for (Circle c:circles) {
                System.out.println(c);
                findShape(c.getName(),circles);
                System.out.println();
        }


    }
    public static void findShape(String findShape,Circle[] circles){
        for (int i = 0; i < circles.length; i++) {
            if(circles[i].getName().toLowerCase().equalsIgnoreCase(findShape.toLowerCase())) System.out.println(findShape + " found at position " + (i+1));
            else System.out.println( findShape + " is not found");
        }
    }

}

