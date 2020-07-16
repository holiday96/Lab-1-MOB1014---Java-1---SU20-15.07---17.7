package L1;

import java.util.ArrayList;
import java.util.Scanner;

public class L12 {
	public static double insertNumber() {
		while (true) {
			try {
				double d = Double.parseDouble(new Scanner(System.in).nextLine());
				return d;
			} catch (Exception e) {
				System.out.println("Nhập sai! Mời nhập lại số!!");
				continue;
			}
		}
	}

	// In mảng
	public static void output(ArrayList<Double> li) {
		System.out.println("\nMảng của ta gồm có " + li.size() + " phần tử");
		for (Double i : li) {
			System.out.println("Phần tử " + (li.indexOf(i) + 1) + ": " + i);
		}
	}

	// In MAX của mảng
	public static void max(ArrayList<Double> li) {
		double max = li.get(0);
		for (Double d : li) {
			if (d > max)
				max = d;
		}
		System.out.println("\nPhần tử TO nhất của mảng tại vị trí " + (li.indexOf(max) + 1) + " có giá trị = " + max);
	}

	// In MIN của mảng
	public static void min(ArrayList<Double> li) {
		double min = li.get(0);
		for (Double d : li) {
			if (d < min)
				min = d;
		}
		System.out.println("\nPhần tử BÉ nhất của mảng tại vị trí " + (li.indexOf(min) + 1) + " có giá trị = " + min);
	}

	// In ra các phần tử chia hết cho 3 và 2
	public static void divide(ArrayList<Double> li) {
		System.out.println("\nCác phần tử chia hết cho 2 và 3:");
		for (Double i : li) {
			if (i % 2 == 0 && i % 3 == 0)
				System.out.println("Phần tử tại vị trí " + (li.indexOf(i) + 1) + " có giá trị = " + i);
		}
	}

	// Sắp xếp mảng từ bé tới lớn và in ra màn hình
	public static void sort(ArrayList<Double> li) {
		System.out.println("\nMảng sau khi sắp xếp từ bé --> lớn");
		for (int i = 0; i < li.size() - 1; i++) {
			for (int j = i + 1; j < li.size(); j++) {
				if (li.get(i) > li.get(j)) {
					double temp = li.get(i);
					li.set(i, li.get(j));
					li.set(j, temp);
				}
			}
		}
		for (Double i : li) {
			System.out.println("Phần tử " + (li.indexOf(i) + 1) + ": " + i);
		}
	}

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<Double>();

		System.out.println("===== NHẬP MẢNG SỐ BẤT KỲ =====");
		System.out.print("Mời nhập số phần tử mảng: ");
		int n;
		while (true) {
			try {
				n = Integer.parseInt(new Scanner(System.in).nextLine());
				break;
			} catch (Exception e) {
				System.out.println("Nhập số phần tử cũng sai (* ￣︿￣)!! NHẬP LẠIII!!!!");
				continue;
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print("Phần tử " + (i + 1) + ": ");
			list.add(insertNumber());
		}

		System.out.println("===============================");
		output(list);
		max(list);
		min(list);
		divide(list);
		sort(list);
	}
}
