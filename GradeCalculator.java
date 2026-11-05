import java.util.Locale;
import java.util.Scanner;
public class GradeCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
scanner.useLocale(Locale.US);
String again;
System.out.println("=== STUDENT===");
do {
System.out.print("Enter your name: ");
String Tunombre = scanner.nextLine();
System.out.println("=== STUDENT GRADE CALCULATOR ===");
System.out.print("Enter the first grade: ");
double grade1 = scanner.nextDouble();
System.out.print("Enter the second grade: ");
double grade2 = scanner.nextDouble();
System.out.print("Enter the third grade: ");
double grade3 = scanner.nextDouble();
double average = (grade1 + grade2 + grade3) / 3;
// Punto 3: nota más alta y más baja
double highest = Math.max(grade1, Math.max(grade2, grade3));
System.out.println("\nStudent: " + Tunombre);
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
}
