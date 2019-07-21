package practice;
import java.util.Scanner;

public class Survey {
    public static void main(String[] args) {
        Participants[] participants = new Participants[5];
        participants[0] = new Participants(123, "Female", "Working", 25000);
        participants[1] = new Participants(223, "male", "Working", 55000);
        participants[2] = new Participants(323, "male", "NotWorking", 0);
        participants[3] = new Participants(423, "male", "Working", 35000);
        participants[4] = new Participants(523, "Female", "Not Working", 0);
        int sumMale = 0, sumFemale = 0, workingMan = 0,workingWoman = 0, avgManSal=0, avgWomanSal=0;

        for (int i=0; i<participants.length;i++) {
            if(participants[i].getSex().toLowerCase().charAt(0)=='m') sumMale++;
            else    sumFemale++;
            if(participants[i].getJob().toLowerCase().charAt(0)=='w'
                    && participants[i].getSex().toLowerCase().charAt(0)=='m'){
                workingMan ++;
                avgManSal += participants[i].getSalary();
            }
            else if(participants[i].getJob().toLowerCase().charAt(0)=='w'
                    && participants[i].getSex().toLowerCase().charAt(0)=='f'){
                workingWoman ++;
                avgWomanSal += participants[i].getSalary();

            }
        }
        float avg = ((float)sumMale*100/participants.length);
        System.out.println("Percentage of Male  " + avg);

        avg = ((float)sumFemale/participants.length)*100;
        System.out.println("Percentage of Female  " +avg );

        System.out.println("WorkingMan "+ workingMan + " Average salaly is " + (avgManSal/sumMale));
        System.out.println("WorkingWoman "+ workingWoman + " Average salaly is " + (avgWomanSal/sumFemale));

    }
}