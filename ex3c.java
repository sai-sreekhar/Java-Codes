import java.util.Scanner;

public class ex3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of studentA: ");
        double markA1 = sc.nextDouble();
        double markA2 = sc.nextDouble();
        double markA3 = sc.nextDouble();
        
        System.out.println("Enter the marks of studentB: ");
        double markB1 = sc.nextDouble();
        double markB2 = sc.nextDouble();
        double markB3 = sc.nextDouble();
        double markB4 = sc.nextDouble();
        studentA objA = new studentA(markA1, markA2, markA3);
        System.out.println("Student 1 Percentage: " + objA.getPercentage());
        studentB objB = new studentB(markB1, markB2, markB3, markB4);
        System.out.println("Student 2 Percentage: " + objB.getPercentage());
        sc.close();
    }
}

abstract class Mark {
    abstract double getPercentage();
}

class studentA extends Mark {
    double subject1, subject2, subject3;
    double percentage = 0;

    studentA(double mark1, double mark2, double mark3) {
        subject1 = mark1;
        subject2 = mark2;
        subject3 = mark3;
    }

    @Override
    public double getPercentage() {
        percentage = (subject1 + subject2 + subject3) / 300 * 100;
        return percentage;
    }

}

class studentB extends Mark {
    double subject1, subject2, subject3, subject4;
    double percentage = 0;

    studentB(double mark1, double mark2, double mark3, double mark4) {
        subject1 = mark1;
        subject2 = mark2;
        subject3 = mark3;
        subject4 = mark4;
    }

    @Override
    public double getPercentage() {
        percentage = (subject1 + subject2 + subject3 + subject4) / 400 * 100;
        return percentage;
    }

}
