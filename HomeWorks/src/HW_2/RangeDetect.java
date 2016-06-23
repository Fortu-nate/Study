package HW_2;

public class RangeDetect {

	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]);
		
		if (x == 1)
			System.out.println("в самый раз");
		else if (x == 2)
			System.out.println("много");
		else if (x == 5)
			System.out.println("мало");
		else
			System.out.println("другой вариант");
		
		
		switch (x) {
		case 2:
			System.out.println("много");
			break;
		case 5:
			System.out.println("мало");
			break;
		case 1:
			System.out.println("в самый раз");
			break;
		default:
			System.out.println("другой вариант");
		}
	}

}
