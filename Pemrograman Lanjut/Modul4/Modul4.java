package tugas3;
public class Modul4 {
    int hari = 500;

    public void ProgramKonversi (){
        int konvtahun = hari / 365;
        int sisatahun = hari % 365;
        
        int konvbulan = sisatahun / 30;
        int sisabulan = sisatahun % 30;
        
        int konvhari = sisabulan;

        System.out.println(hari + " Hari = "+ "Tahun " + konvtahun + " Bulan " + konvbulan + " Hari " + konvhari);
    }

    public static void main(String[] args) {
        Modul4 run = new Modul4();
        run.ProgramKonversi();
    }

}

