class Karyawan {
    private String name;

    public Karyawan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Perusahaan {
    private Karyawan karyawan;

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public void showKaryawan() {
        System.out.println("Karyawan: " + karyawan.getName() + "\n");
    }
}

public class Aggregation {
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan();
        Karyawan karyawan = new Karyawan("Joko Kopling");
        perusahaan.setKaryawan(karyawan);

        perusahaan.showKaryawan();
    }
}
