package academic.driver;

//Joy Valeda Silalahi - 12S23007
//Rachel C.P Simorangkir - 12S23020

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;
import java.util.*;

public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Course> courses = new HashMap<>();
        Map<String, Student> students = new HashMap<>();
        List<Enrollment> enrollments = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if (input.equals("---")) break;

            String[] parts = input.split("#");
            String command = parts[0];

            if (command.equals("course-add") && parts.length == 5) {
                String kodeMatkul = parts[1];
                String course = parts[2];
                int sks = Integer.parseInt(parts[3]);
                String grade = parts[4];

                // Cek apakah course sudah ada
                if (!courses.containsKey(kodeMatkul)) {
                    courses.put(kodeMatkul, new Course(kodeMatkul, course, sks, grade));
                } else {
                    System.out.println("Duplicate course|"+kodeMatkul);
                }
            } 
            else if (command.equals("student-add") && parts.length == 5) {
                String nim = parts[1];
                String nama = parts[2];
                int batch = Integer.parseInt(parts[3]);
                String prodi = parts[4];

                // Cek apakah student sudah ada
                if (!students.containsKey(nim)) {
                    students.put(nim, new Student(nim, nama, batch, prodi));
                } else {
                    System.out.println("Duplicate student|"+nim);
                }
            } 
            else if (command.equals("enrollment-add") && parts.length == 5) {
                String kodeMatkul = parts[1];
                String nim = parts[2];
                String tahunAjaran = parts[3];
                String semester = parts[4];

                // Validasi terlebih dahulu course dan student
                if (!courses.containsKey(kodeMatkul)) {
                    System.out.println("invalid course|" + kodeMatkul);
                } else if (!students.containsKey(nim)) {
                    System.out.println("invalid student|" + nim);
                } else {
                    enrollments.add(new Enrollment(kodeMatkul, nim, tahunAjaran, semester));
                }
            }
        }
        scanner.close();

        // Output hasil akhir
        for (Course c : courses.values()) {
            System.out.println(c);
        }
        for (Student s : students.values()) {
            System.out.println(s);
        }
        for (Enrollment e : enrollments) {
            System.out.println(e);
        }
    }
}
