package academic.model;

//Joy Valeda Silalahi - 12S23007
//Rachel C.P Simorangkir - 12S23020

public class Enrollment {
    private String kodeMatkul;
    private String nim;
    private String tahunAjaran;
    private String semester;
    private String grade;

    public Enrollment(String kodeMatkul, String nim, String tahunAjaran, String semester) {
        this.kodeMatkul = kodeMatkul;
        this.nim = nim;
        this.tahunAjaran = tahunAjaran;
        this.semester = semester;
        this.grade = "None"; // Default value
    }

    @Override
    public String toString() {
        return kodeMatkul + "|" + nim + "|" + tahunAjaran + "|" + semester + "|" + grade;
    }
}
