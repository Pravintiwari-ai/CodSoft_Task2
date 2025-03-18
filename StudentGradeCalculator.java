package CodSoft_Task2;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        
        int totalMarks = 0;
        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            totalMarks += scanner.nextInt();
        }
        
        double percentage = (double) totalMarks / numSubjects;
        char grade;
        
        if (percentage >= 90) 
        grade = 'A';
        else if (percentage >= 80)
         grade = 'B';
        else if (percentage >= 70)
         grade = 'C';
        else if (percentage >= 60) 
        grade = 'D';
        else
         grade = 'F';
        
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Average Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        
        scanner.close();
}
}