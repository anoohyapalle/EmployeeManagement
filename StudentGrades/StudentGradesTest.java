public class StudentGradesTest {
    public static void main(String[] args) {
        // Create an instance of StudentGrades
        StudentGrades grades = new StudentGrades();

        grades.addStudent(new Student(1, "Anoohya", 'A'));
        grades.addStudent(new Student(2, "Devika", 'B'));
        grades.addStudent(new Student(3, "Praisee", 'C'));

        System.out.println("Students after adding:");
        grades.displayStudents();

        System.out.println("\nUpdating grade for student ID 2 to 'A':");
        grades.updateStudentGrade(2, 'A');
        grades.displayStudents();

        System.out.println("\nRemoving student ID 3:");
        grades.removeStudent(3);
        grades.displayStudents();
    }
}
