import java.util.LinkedHashMap;

public class StudentGrades {
    private LinkedHashMap<Integer, Student> students = new LinkedHashMap<>();

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public void removeStudent(int studentId) {
        students.remove(studentId);
    }

    public void updateStudentGrade(int studentId, char newGrade) {
        Student student = students.get(studentId);
        if (student != null) {
            student.setGrade(newGrade);
        }
    }

    public void displayStudents() {
        System.out.println("Student Grades:");
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
}
