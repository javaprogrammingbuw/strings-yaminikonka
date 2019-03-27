import java.util.Scanner;

//advanced

public class Expand {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
          System.out.println("enter the your String: ");
          String s=scan.nextLine();
          expand(s);
	}
		
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee 

		public static void expand(String string){
		// String string=scan.nextLine();

		//This should have been done in a seperate method

		String string=scan.nextLine();
            String store="0";
		for(int i=0;i<string.length();i++){
			char c=string.charAt(i);
                if(Character.isDigit(c)){
                   store+=c;
                }else{

                	int n=Integer.parseInt(store);
                	if(n==0){
                		System.out.print(c);
                	}else{
                		for(int j=0;j<n;j++){
                		System.out.print(c);
                	    }
                	}
                	
                	store="0";
                }
		} 
		
	}
}
	

