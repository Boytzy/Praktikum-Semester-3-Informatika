package Tugas;

public class Perhitungan extends Balok {

    public int luas(Balok sisi) {
        int panjang = sisi.getPanjang();
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();
        return panjang * lebar * tinggi;
    }

    public int volume(Balok sisi) {
        int panjang = sisi.getPanjang();
        int lebar = sisi.getLebar();
        int tinggi = sisi.getTinggi();
        return 4 * panjang * lebar * tinggi;
    }

}
