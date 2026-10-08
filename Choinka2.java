import java.util.Scanner;

public class Choinka2 {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.print("podaj dlugosc");

		int c = myObj.nextInt();

		for (int a=c; a<10; a++){
			for (int b=0; b<=a ; b++){
				System.out.print("#");
			}
		System.out.println("");
		}
	}
}