import java.util.Arrays;
import java.util.Scanner;

public class kegiatan2 {        
    
    public static String[][] book = new String[10][100];
    public static String[][] place = new String[5][10];
    
    void cekDate(int date) {
        if (date < 2018 || date > 2022) {
            
        }
    }
    
    int cekFrom(String from) {
        for(int i=0; place[i][0] != null; i++) {
            if(from.compareTo(place[i][0]) == 0) {
                return i;
            }
        }
        return 0;
    }
    
    int cekName(String name) {
        for(int i=0; book[i][0] != null; i++) {
            if (name.compareTo(book[i][0]) == 0) {
                return i;
            }
        }
        return 0;
    }
    
    void list() {
        for(int i=0; book[i][0] != null; i++) {
            System.out.println(Arrays.toString(book[i]));
        }
    }
    
    public static void main(String[] args) {        
        book[0][0] = "This is Book, Malang. 2022";  
        place[0][0] = "Malang";
        place[0][1] = "Bandung";
        place[0][2] = "Surabaya";
        
        kegiatan2 obj = new kegiatan2();
        String inName, inFrom;
        int inDate, inIndex = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Library");
        System.out.println("Nama : ");
        inName = input.nextLine();
        obj.cekName(inName);
        System.out.println("From : ");
        inFrom = input.nextLine();
        obj.cekName(inName);
        System.out.println("Date : ");
        inDate = input.nextInt();
        obj.cekDate(inDate);
        System.out.println(inName+" "+inFrom+" "+inDate);
        book[0][inIndex] = inName;
        System.out.println("Buku berhasil ditambahkan");
    }
}