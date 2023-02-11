import java.util.Scanner;

public class SortingFor {
	int n;
	int[] array = new int[99];
	Scanner scan = new Scanner(System.in);
	
	void inputan() {
		System.out.print("Size: ");
		n = scan.nextInt();

		System.out.println("Data :");
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
	}

void sorting () {
	for (int i = 0; i < n; i++) {
		 
         for (int j = i + 1; j < n; j++) {

            if (array[j] < array[i]) {

                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        
        System.out.print(array[i] + " ");
}
}

void search() {
	System.out.print("Masukkan data keberapa: ");
	int x = scan.nextInt();
	
	System.out.println("Index ke-"+ x+": "+array[x-1]);
}

void ratio() {
	float positif = 0;
	float negatif = 0;
	float nol = 0;
	
	for (int i = 0; i < n; i++) {
		if (array[i]>0) {
			positif++;
			}
		
		else if (array[i]<0) {
			negatif++;
			}
		
		else {
			nol++;
		}
	}
	System.out.println("Positif: "+positif/n);
	System.out.println("Negatif: "+negatif/n);
	System.out.println("Zero: "+ nol/n);
	
	
}
}