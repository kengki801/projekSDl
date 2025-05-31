package proyeksdl;

public class Pasien {

    private String Nama;
    private String Umur;
    private String Keluhan;
    private int NomorAntrian;

    public Pasien(String Nama, String Umur, String Keluhan, int NomorAntrian) {
        this.Nama = Nama;
        this.Umur = Umur;
        this.Keluhan = Keluhan;
        this.NomorAntrian = NomorAntrian;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getUmur() {
        return Umur;
    }

    public void setUmur(String Umur) {
        this.Umur = Umur;
    }

    public String getKeluhan() {
        return Keluhan;
    }

    public void setKeluhan(String Keluhan) {
        this.Keluhan = Keluhan;
    }

    public int NomorAntrian() {
        return NomorAntrian;
    }

    public void setNomorAntrian(int NomorAntrian) {
        this.NomorAntrian = NomorAntrian;
    }

     public int compareTo(Pasien o){
        if (NomorAntrian==((Pasien)o).NomorAntrian()){
            return 0;
        } else if(NomorAntrian <((Pasien)o).NomorAntrian){
            return 1;
        } else {
            return -1;
        }
    }
}
