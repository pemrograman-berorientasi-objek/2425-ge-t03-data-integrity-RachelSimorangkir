package academic.model;

//Joy Valeda Silalahi - 12S23020
//Rachel C.P Simorangkir - 12S23020

public class Course {
    private String kodeMatkul;
    private String course;
    private int sks;
    private String grade;

    public Course(String kodeMatkul, String course, int sks, String grade) {
        this.kodeMatkul = kodeMatkul;
        this.course = course;
        this.sks = sks;
        this.grade = grade;
    }

    @Override
    
    public String toString() {
        return kodeMatkul + "|" + course + "|" + sks + "|" + grade;
    }
}
