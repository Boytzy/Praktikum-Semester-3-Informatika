import java.util.Scanner;
public class kegiatan1 {
        
        Scanner input = new Scanner(System.in);

    public void nama(){
        String nama;
        boolean cek = true;
        do {
            try {
                System.out.println ("Inputkan nama anda : ");
                nama = input.nextLine();
                if (nama.matches("([a-z A-Z])*")) {
					cek = false;
				} else {
					cek = true;
                    throw new Exception();
				}
            } catch (Exception e) {
                System.out.println("Maaf, input nama anda dengan benar");
            }    
        } while (cek);        
    }

    public void nim(){
        String nim;
        boolean cek = true;
        do {
            try {
                System.out.println ("Inputkan NIM anda : ");
                nim = input.nextLine();
                if(nim.contains("10370311")){
                    cek = false;
                }
                else{
                    cek = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Maaf, NIM yang anda inputkan salah atau tidak sama dengan 15");
            }    
        } while (cek);        
    }

    public void gender(){
        String gender;
        boolean cek = true;
        do {
            try {
                System.out.println ("Input gender Anda : (L/P)");
                gender = input.nextLine();
                switch (gender) {
                    case "L":
                        cek = false;
                        gender = "Laki-laki";
                        break;
    
                    case "P":
                        cek = false;
                        gender = "Perempuan";
                        break;
    
                    default:
                        cek = true;
                        throw new Exception();
                    }
            } catch (Exception e) {
                System.out.println("Maaf, Mohon input yang sesuai dengan pilihan 'L' atau 'P'");
            }    
        } while (cek);        
    }

    public void email(){
        String email;
        boolean cek = true;
        do {
            try {
                System.out.println ("Inputkan E-mail anda : ");
                email = input.nextLine();
                if(email.contains("@webmail.umm.ac.id")){
                    cek = false;
                }
                else{
                    cek = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Maaf, inputkan E-mail anda dengan benar");
            }    
        } while (cek);        
    }

    public void nohp(){
        String nohp;
        boolean cek = true;
        do {
            try {
                System.out.println ("Inputkan nomor handphone anda : ");
                nohp = input.nextLine();
                if(nohp.matches("[0-9]*") && nohp.startsWith("62") ){
                    cek = false;
                }
                else{
                    cek = true;
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Maaf, inputkan nomor handphone anda dengan benar sesuai dengan kode telepon indonesia");
            }    
        } while (cek); 
    }


    public static void main(String[] args) {
        kegiatan1 run = new kegiatan1();
        run.nama();
        run.nim();
        run.gender();
        run.email();
        run.nohp();
    }
}
