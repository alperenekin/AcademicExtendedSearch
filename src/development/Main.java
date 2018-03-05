package development;

import java.util.Scanner;

/**
 * @author Alperen Ekin 230201010,Seymur Babaþlý 220201064
 *
 */
public class Main {


	public static void main(String[] args) {
		ShowMenu showmenu=new ShowMenu();
		showmenu.Start();
		System.out.println("Please make your choice");
		Scanner scn=new Scanner(System.in);
		String input =scn.nextLine();
		if(input.equals("1")) {
			OptionOne choose=new OptionOne();
			choose.Start();
			
		}
		if(input.equals("2")) {
			OptionTwo choose=new OptionTwo();
			choose.Start();
				}
		if(input.equals("3")) {
			OptionThree choose=new OptionThree();
			choose.Start();
		}
		if(input.equals("4")) {
			OptionFour choose=new OptionFour();
			choose.Start();
		}
		if(input.equals("5")) {
			OptionFive choose=new OptionFive();
			choose.Start();
		}
		scn.close();	
	}
}




