package buoi3;

import java.util.Scanner;

public class SoChia7 {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		String confirm = "";
		while (true) {
			do {
				System.out.println("Nhap 1 so > 0 tu ban phim: ");
				num = sc.nextInt();
			}while(num <= 0);
			
			// check cac so u 1 -> num de tinh so luong va tong cac so % 7
			int count = 0, sum = 0;
			/*
			for(int i=1; i<= num; i++) {
				if (i%7 == 0) {
					count ++;
					sum += i;
				}
			}
			*/
			/*
			for(int i=7; i<= num; i=i+7) {
				count ++;
				sum += i;
			}
			*/
			// gan va khai bao bien khoi tao lap
			int i=1;
			while (i<= num) {
				count ++;
				sum += i;
				// thay doi gia tri dieu kien lap
				i=i+7;
			}
			System.out.printf("Tu 1 -> %d co %d so chia het cho 7 va tong = %d\n", num, count, sum);
			sc.nextLine();
			System.out.println("Ban co muon tiep tuc hay khong? (y: tiep tuc)");
			confirm = sc.nextLine();
			
			// so sanh kieu tham chieu: equals
			// equals: la ham so sanh bien confirm co bang "y"
			if (!confirm.equals("y")) {
				System.out.println("Stop.");
				break;
			}
		}
	}

}
