package academic.model;

//Joy Valeda Silalahi - 12S23007
//Rachel C.P Simorangkir - 12S23020

public class Student {
    private String nim;
    private String nama;
    private int batch;
    private String prodi;

    public Student(String nim, String nama, int batch, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.batch = batch;
        this.prodi = prodi;
    }

    @Override
    public String toString() {
        return nim + "|" + nama + "|" + batch + "|" + prodi;
    }
}
