import java.util.*;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Elemen : ");
        int jumlahElemen = input.nextInt();
        int[] array = new int[jumlahElemen];
        System.out.println("Masukkan Semua Elemen : ");
        for(int i=0;i < jumlahElemen;i++){
            array[i] = input.nextInt();
        }
    Arrays.sort(array);
    for(int index:array){
        System.out.println("Telah diurutkan : " +index);
        }
    }
}