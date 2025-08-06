import java.util.Scanner;

public class Task2_Reportcard {
    String name;
    int[] marks = new int[3];
    double average;
    char grade;

    // input student details
    void inputDetails(Scanner input) {
        System.out.print("Enter student name: ");
        name = input.nextLine();

        System.out.println("Enter marks for 3 subjects:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = input.nextInt();
        }

        // compute sum and average
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = sum + marks[i]; 
        }

        average = (double) sum / 3;

        // determine grade
        if (average >= 80) {
            grade = 'A';
        } else if (average >= 60) {
            grade = 'B';
        } else if (average >= 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    // Display student report
    void displayReport() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);

        for (int i = 0; i < 3; i++) {
            System.out.println("Marks in Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Task2_Reportcard student = new  Task2_Reportcard();
        student.inputDetails(input);
        student.displayReport();

        input.close();
    }
}
