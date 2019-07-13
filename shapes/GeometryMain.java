public class GeometryMain {
    public static void main(String[] args) {
        Circle[] circles = new Circle[]{new Circle("man hole",15), new Circle("Tower Of Pisa", 10, 18)};
        Recangle[] recangles = new Recangle[]{};


            for (Circle c:circles) {
                System.out.println(c.getName() + " has following properties");
                System.out.println(c.getName() + "'s area is equal to " + c.printArea() + " meters squared");
                System.out.println(c.getName() + "'s circumference is equal to " + c.printCircumference() + " meters squared");

                if(c.getHeight()==0) System.out.println(c.getName() + " is not a cylinder. Volume can not be computed");
                else System.out.println(c.getName() + "is a cylinder. It has a volume of " + c.printVolume() +" cubic meters /n");

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

