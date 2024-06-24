import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;
		String str = scan.nextLine();
		String[] s = str.split(" ");
		int count = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals(""))continue;
			count++;
		}
		System.out.println(count);
	}
}
