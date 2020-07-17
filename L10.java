package L1;

import java.util.Scanner;

public class L10 {
	public static void main(String[] args) {
		// Nhập
		Scanner sc = new Scanner(System.in);

		// Input n số thành viên trong gia đình
		int n;
		while (true) {
			System.out.print("Nhập số thành viên trong gia đình: ");
			try {
				n = Integer.parseInt(sc.nextLine());
				if (n <= 0) {
					System.out.println("Số thành viên không hợp lệ!");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("Dữ liệu vừa nhập sai!! Nhập lại!!");
				continue;
			}
		}

		// Nhập Số đo cân nặng cho từng người
		double[] weightFamily = new double[n];
		System.out.println("\nNhập cân nặng");
		for (int i = 0; i < weightFamily.length; i++) {
			while (true) {
				System.out.print("Thành viên thứ " + (i + 1) + ": ");
				try {
					weightFamily[i] = Double.parseDouble(sc.nextLine());
					if (weightFamily[i] <= 0) {
						System.out.println("Số đo cân nặng không hợp lệ!");
						continue;
					}
					break;
				} catch (Exception e) {
					System.out.println("Nhập dữ liệu sai! Nhập lại nào!!");
					continue;
				}
			}
		}

		// In ra cân nặng lớn hơn 50 kg
		System.out.println("=======================================");
		int count = 0;
		for (double d : weightFamily) {
			if (d > 50)
				count++;
		}
		if (count == 0)
			System.out.println("\nKhông có ai trên 50kg cả!!");
		else {
			System.out.println("\nThành viên có cân nặng > 50kg: ");
			for (int i = 0; i < weightFamily.length; i++) {
				if (weightFamily[i] > 50)
					System.out.println("Thành viên thứ " + (i + 1) + ": " + weightFamily[i]);
			}
		}

		// In ra cân nặng chia hết cho 2
		System.out.println("=======================================");
		count = 0;
		for (double d : weightFamily) {
			if (d % 2 == 0)
				count++;
		}
		if (count == 0)
			System.out.println("\nKhông có ai có cân nặng chia hết cho 2 cả!!");
		else {
			System.out.println("\nThành viên có cân nặng chia hết cho 2: ");
			for (int i = 0; i < weightFamily.length; i++) {
				if (weightFamily[i] % 2 == 0)
					System.out.println("Thành viên thứ " + (i + 1) + ": " + weightFamily[i]);
			}
		}

		// In ra cân nặng lớn nhất
		System.out.println("=======================================");
		double max = weightFamily[0];
		for (double d : weightFamily) {
			if (d > max)
				max = d;
		}
		System.out.println("\nThành viên nặng ký nhất trong gia đình nặng: " + max);
	}
}
