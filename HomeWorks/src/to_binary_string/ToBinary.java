package to_binary_string;

public class ToBinary {

	public static void main(String[] args) {

		int x = 5;

		System.out.println("исходное число " + x);
		System.out.println("в двоичной системе " + Integer.toBinaryString(x));

		do {
			if (x % 2 == 0) {
				System.out.println("0");
			} else {
				System.out.println("1");
			}

			x >>= 1;

		} while (x > 0);

	}

}
