package Tugas1;
import java.util.Scanner;

class keg1{

    Scanner input = new Scanner(System.in);

    //NIM//
    public void Nim(){
        String Nim;
        boolean mbalen = true;

        do {
            try {
                System.out.print("Masukkan Nim Kamu : ");
                Nim = input.nextLine();
                Nim.contains("10370311");
                if(Nim.contains("10370311")){
                    
                }
                else{
                    throw new Exception();
                }
                if(Nim.length() != 15){
                    throw new Exception();
                }
                else{
                    mbalen = false;
                    System.out.println("NIM Anda telah ter input");;
                }
            } catch (Exception e) {
                System.out.println("Maap salah input bwang");
            }
        } while (mbalen);
    }

    //email//
    public void email(){

        String email;
        boolean mbalen = true;

        do {
            try {
                System.out.print("Masukkan email kamu : ");
            email = input.nextLine();
            email.contains("@webmail.umm.ac.id");
            if(email.contains("@webmail.umm.ac.id")){
            mbalen =false;
            }
            else{
            mbalen = true;
            throw new Exception();
             }
            } catch (Exception e) {
                System.out.println("Salah input bwang");
            }
            
        } while (mbalen);   
    }

    //Nomer//
    public void nomor(){
        String Nomer;
        System.out.print("Masukkan nomor telepon kamu : ");
        Nomer = input.nextLine();
    }
     public static void main(String[] args) {
        
        keg1 run = new keg1();
        run.Nim();
        run.email();
        run.nomor();
        
    }


}