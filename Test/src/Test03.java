import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = Integer.parseInt(scan.nextLine());
		
		System.out.println(facto(input));
	}
	public static int facto(int input) {
		if(input<=1) {
			return input;
		}else
			return facto(input-1)*input;
	}
}
