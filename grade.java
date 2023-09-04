import java.util.Scanner;

class Student {
    private String name;
    protected int physics;
    protected int chemistry;
    protected int mathematics;

    public Student(String name, int physics, int chemistry, int mathematics) {
        this.name = name;
        this.physics = physics;
        this.chemistry = chemistry;
        this.mathematics = mathematics;
    }

    public String getName() {
        return name;
    }
}

class Marksheet extends Student {
    private int totalMarks;
    private double averageMarks;
    private String grade;

    public Marksheet(String name, int physics, int chemistry, int mathematics) {
        super(name, physics, chemistry, mathematics);
    }

    public int calculateTotalMarks() {
        totalMarks = physics + chemistry + mathematics;
        return totalMarks;
    }

    public double calculateAverageMarks() {
        averageMarks = totalMarks / 3.0;
        return averageMarks;
    }

    public String calculateGrade() {
        if (averageMarks >= 80) {
            grade = "A";
        } else if (averageMarks >= 60) {
            grade = "B";
        } else if (averageMarks >= 40) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        return grade;
    }

    public void displayMarksheet() {
        System.out.println();
        System.out.println("-----------------------------------------------------------");
        System.out.println("Name: " + getName());
        System.out.println("Physics Marks: " + physics);
        System.out.println("Chemistry Marks: " + chemistry);
        System.out.println("Mathematics Marks: " + mathematics);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println();
    }
}

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        sc.nextLine();
        Marksheet[] marksheetArray = new Marksheet[numStudents];

        // Create marksheet objects for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            // marksheetArray[i] = new Marksheet(name,physics,chemistry,mathematics);
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter Physics marks: ");
            int physics = sc.nextInt();

            System.out.print("Enter Chemistry marks: ");
            int chemistry = sc.nextInt();

            System.out.print("Enter Mathematics marks: ");
            int mathematics = sc.nextInt();

            marksheetArray[i] = new Marksheet(name, physics, chemistry, mathematics);
            sc.nextLine();
        }

        for (int i = 0; i < numStudents; i++) {
            Marksheet marksheet = marksheetArray[i];
            marksheet.calculateTotalMarks();
            marksheet.calculateAverageMarks();
            marksheet.calculateGrade();
            marksheet.displayMarksheet();
        }

    }
}
