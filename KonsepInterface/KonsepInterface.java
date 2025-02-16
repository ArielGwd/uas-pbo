package KonsepInterface;
interface pekerja {
    void bekerja();
    void gaji();
}

class Karyawan implements pekerja {
    private String nama;
    private int gaji;

    public Karyawan(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public void bekerja() {
        System.out.println("Karyawan " + nama + " sedang bekerja");
    }

    public void gaji() {
        System.out.println("Gaji Karyawan " + nama + " adalah " + gaji);
    }
}


public class KonsepInterface {
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan("Joko", 5000000);
        karyawan.bekerja();
        karyawan.gaji();
    }
}
