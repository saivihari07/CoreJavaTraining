package Saiviharioopstasks1.java;
import java.util.Scanner;
public class CellphoneMain {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			
			Contact c = new Contact();
			Contact c1 = new Contact();
			
			c.Stranger(sc.next(),sc.nextInt());
			c1.Stranger(sc1.next(),sc1.nextInt(),sc1.nextInt());
			
		}

}
