package Tugas1;

import java.util.Scanner;

public class tugas1 {
	private String NIM;
	private String inf = "10370311";
	private boolean cek;
	private String Nama;
	private String Email;
	private String umm = "@webmail.umm.ac.id";
	private String hp;
	private String gender;

	Scanner scan = new Scanner(System.in);

	public void InputNIM() {

		do {
			try {

				System.out.println("Input NIM anda : ");
				NIM = scan.nextLine();

				if (NIM.contains(inf)) {
					cek = false;

					if (NIM.matches("[0-9]*")) {
						if (NIM.length() == 15) {

						} else {
							cek = true;
							throw new Exception("Digit NIM anda harus berjumlah 15!");
						}
					} else {
						cek = true;
						throw new Exception("Harap menginput NIM dengan angka!");
					}
				} else {
					cek = true;
					throw new Exception("Mohon maaf, NIM anda diluar program studi Informatika!");
				}

			} catch (Exception e) {
				cek = true;
				System.out.println(e.getMessage());
			}
		} while (cek);
	}

	public void InputNama() {

		do {
			try {
				System.out.println("Input Nama Anda : ");
				Nama = scan.nextLine();

				if (Nama.matches("([a-zA-Z\s])*")) {
					cek = false;
				} else {
					cek = true;
					throw new Exception("Input nama Anda dengan benar!");
				}
			} catch (Exception e) {
				cek = true;
				System.out.println(e.getMessage());
			}
		} while (cek);
	}

	public void InputEmail() {
		do {
			try {
				System.out.println("Input Email UMM Anda : ");
				Email = scan.nextLine();

				if (Email.contains(umm)) {
					cek = false;
				} else {
					cek = true;
					throw new Exception("Email anda tidak sesuai!");
				}

			} catch (Exception e) {
				cek = true;
				System.out.println(e.getMessage());
			}

		} while (cek);
	}

	public void Inputhp() {
		do {
			try {
				System.out.println("Input Nomor HP Anda : ");
				hp = scan.nextLine();

				if (hp.length() > 10 && hp.length() < 14 && hp.matches("[0-9]*")) {
					cek = false;
				} else {
					cek = true;
					throw new Exception("Nomor HP anda tidak sesuai!");
				}

			} catch (Exception e) {
				cek = true;
				System.out.println(e.getMessage());
			}

		} while (cek);
	}

	public void Inputgender() {
		do {
			try {
				System.out.println("Input gender Anda : (L/P)");
				gender = scan.nextLine();

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
					throw new Exception("Mohon input dengan 'L' atau 'P'!");
				}

			} catch (Exception e) {
				cek = true;
				System.out.println(e.getMessage());
			}

		} while (cek);

	}

	public void print() {
		System.out.println("\n\n\n\n");
		System.out.println("Data Anda :\n");
		System.out.println("NIM	: " + NIM);
		System.out.println("Nama	: " + Nama);
		System.out.println("Email	: " + Email);
		System.out.println("No. HP	: " + hp);
		System.out.println("Gender	: " + gender);
	}
}