class Mahasiswa {
    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void display() {
        System.out.println("Mahasiswa: " + nama);
    }
}

class Dosen {
    private String nama;

    public Dosen(String nama) {
        this.nama = nama;
    }

    public void display() {
        System.out.println("Dosen: " + nama + "\n");
    }

    public void mengajar(Mahasiswa mhs) {
        System.out.println("Dosen " + nama + " mengajar mahasiswa " + mhs.getNama() + "\n");
    }
}

public class Association {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Ariel");
        Dosen dosen = new Dosen("Warren Buffet");

        mhs.display();
        dosen.display();
    }
}
