import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = Integer.parseInt(scan.nextLine());
		
		System.out.println(facto(input,1));
	}
	public static int facto(int input,int tail) {
		if(input<=1) {
			return tail;
		}else
			return facto(input-1,tail*input);
	}
}
