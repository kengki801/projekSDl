package proyeksdl;

public class Dokter {
    private String Nama;
    private String JamPraktek;
    private int Ruangan;
    public Dokter(String Nama,String JamPraktek,int Ruangan){
        this.Nama = Nama;
        this.JamPraktek = JamPraktek;
        this.Ruangan = Ruangan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJamPraktek() {
        return JamPraktek;
    }

    public void setJamPraktek(String JamPraktek) {
        this.JamPraktek = JamPraktek;
    }

    public int getRuangan() {
        return Ruangan;
    }

    public void setRuangan(int Ruangan) {
        this.Ruangan = Ruangan;
    }

    @Override
    public String toString() {
        return "Dokter{" + "Nama=" + Nama + ", JamPraktek=" + JamPraktek + ", Ruangan=" + Ruangan + '}';
    }
    
}
