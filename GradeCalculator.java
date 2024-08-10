import java.util.Scanner;

public class GradeCalculator {

    // Function to calculate grade based on average percentage
    public static char calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return 'A';
        } else if (averagePercentage >= 80) {
            return 'B';
        } else if (averagePercentage >= 70) {
            return 'C';
        } else if (averagePercentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take marks obtained in each subject
        System.out.print("Enter the number of subjects: ");
        int subjects = scanner.nextInt();
        double[] marks = new double[subjects];
        double totalMarks = 0;

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        // Calculate Average Percentage
        double averagePercentage = totalMarks / subjects;

        // Calculate Grade
        char grade = calculateGrade(averagePercentage);

        // Display Results
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

