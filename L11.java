package L1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L11 {
	private String name;
	private int age;

	public L11(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Hàm nhập thông tin 1 người trong gia đình
	public static void input(L11 l11) {
		Scanner sc = new Scanner(System.in);

		// Nhập tên
		while (true) {
			System.out.print("Nhập tên: ");
			l11.setName(sc.nextLine());

			if (!isAlphabet(l11.getName())) {
				System.out.println("Nhập dữ liệu sai! Chỉ được nhập ký tự chữ cái!! Mời nhập lại!!!");
				continue;
			} else
				break;
		}

		// Nhập tuổi
		while (true) {
			System.out.print("Nhập tuổi: ");
			try {
				l11.setAge(Integer.parseInt(sc.nextLine()));
				if(l11.getAge()<=0) {
					System.out.println("Số tuổi vừa nhập không hợp lệ! Nhập lại!!");
					continue;
				}
				break;
			} catch (Exception e) {
				System.out.println("Nhập tuổi sai rồi! Nhập lại xem nào!!");
				continue;
			}
		}
	}

	// Hàm xuất thông tin ng cao tuổi nhất
	public static void output(List<L11> l11) {
		L11 index = l11.get(0);
		for (L11 i : l11) {
			if (i.getAge() > index.getAge())
				index = i;
		}
		System.out.println("\nThông tin người cao tuổi nhất:");
		System.out.println("Tên: " + index.getName());
		System.out.println("Tuổi: " + index.getAge());
	}

	// Hàm check chuỗi chứa toàn bộ ký tự chữ hay k??
	public static boolean isAlphabet(String str) {
		for (char c : str.toCharArray()) {
			if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122) || (c == 32))
				continue;
			else
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
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

		List<L11> member = new ArrayList<L11>();
		for (int i = 0; i < n; i++) {
			System.out.println("\nThành viên thứ " + (i + 1));
			L11 l11 = new L11(null, 0);
			input(l11);
			member.add(l11);
		}
		output(member);
	}
}
