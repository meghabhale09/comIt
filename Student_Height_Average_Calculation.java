public class Student_Height_Average_Calculation {
    enum Name {
        Sam, Mac, Tina, Lina, ping, Krish, Kedar, John, Donald, Vish;
    }


    public static void main(String[] args) {
        Name[] names = Name.values();
        Student[] students = new Student[names.length];
        int[] heights = new int[]{50,100, 100, 60, 100, 150, 130, 100, 70, 100};
        for(int i=0; i<names.length; i++){
            students[i] = new Student(names[i].name(), heights[i]);
        }

        System.out.println(averageHeight(students));

        heightCalculaion(students);
    }

    public static int averageHeight(Student[] students){
        int sum=0;
        for (Student s :students) {
            sum += s.getHeight();
        }
        return sum/students.length;
    }

    public static void heightCalculaion(Student[] students){
        int avgHeight = averageHeight(students);
        int belowAvg=0 , aboveAvg = 0;
        for (Student s :students) {
            if( s.getHeight()> avgHeight)   aboveAvg++;
            else if( s.getHeight() < avgHeight) belowAvg++;
        }

        System.out.println("\ntotal number of students Above Average Height  " + aboveAvg
                +"\ntotal number of students below Average Height  " + belowAvg);
    }

}
