import java.util.Locale;
import java.util.Scanner;
public class GradeCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
scanner.useLocale(Locale.US);
String again;
do {
System.out.print("Enter your name: ");
String StudentName = scanner.nextLine();
System.out.println("=== STUDENT GRADE CALCULATOR ===");
double grade1 = readGrade(scanner, "Enter the first grade (0-10): ");
double grade2 = readGrade(scanner, "Enter the second grade (0-10): ");
double grade3 = readGrade(scanner, "Enter the third grade (0-10): ");
double average = (grade1 + grade2 + grade3) / 3;
double highest = Math.max(grade1, Math.max(grade2, grade3));
System.out.println("\nStudent: " + StudentName);
double lowest = Math.min(grade1, Math.min(grade2, grade3));
// Punto 4: media con dos decimales
System.out.printf("%nStudent average: %.2f%n", average);
System.out.println("Highest grade: " + highest);
System.out.println("Lowest grade: " + lowest);
if (average >= 5) {
System.out.println("Result: PASSED");
} else {
System.out.println("Result: FAILED");
}

// Punto 5: repetir con otro estudiante
System.out.print("\nCalculate another student? (yes/no): ");
again = scanner.next();
scanner.nextLine();
System.out.println();
} while (again.equalsIgnoreCase("yes"));

System.out.println("Adios");
scanner.close();
}
// Pide una nota y repite la pregunta hasta que esté entre 0 y 10
    public static double readGrade(Scanner scanner, String message) {
        double grade;
        do {
            System.out.print(message);
            grade = scanner.nextDouble();
            if (grade < 0 || grade > 10) {
                System.out.println("Invalid grade. It must be between 0 and 10.");
            }
        } while (grade < 0 || grade > 10);
        return grade;
    }
}
