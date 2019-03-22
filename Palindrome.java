public class Palindrome{

	//todo: Create a method isPalindrome which takes a String as input and returns true if it is a palindrome and false otherwise.
	//A palindrome is a word which can be read backwards and forwards in the same way., e.g. 'hannah'.
	//Ignore upper and lower case. 'Hannah' is a palindrome, too.
	//Ignore also spaces. 'Taco cat' is a valid palindrome.
	public static boolean isPalindrome(String string){
		String name1=string.toLowerCase();
		//System.out.println(name);
		// int index=name.length();
		String name="";
		//String store="";
		for(int j=0;j<name1.length();j++){
               // int c=0;
			if(!Character.isWhitespace(name1.charAt(j))){
                 name+=name1.charAt(j);
                 //store="";
			}//else{
			//	store+=name1.charAt(j);
			//}
		}	
			int index=name.length();
		    for(int i=0;i<(int)Math.round(name.length()/2);i++){

                if(name.charAt(i)==(name.charAt(index-1))){
		    	// if(name.substring(i-1,i).equalsIgnoreCase(((name.substring(index-2,index-1))))){
                    index--;
                      if(i==index||i>index){
                      	 return true;
                      }
                } else{
                	return false;
                }  
		    }return true;
		// }   
	}
    public static void main(String[] args){
		// String exname="Nebel bei Siebleben ";
		String exname="Taco cat ";
		if(isPalindrome(exname)==true){
			System.out.println(exname+" is palindrome");
		}else{
			System.out.println(exname+" is not a palindrome");
		}

		// String example = "Hannah";
		// System.out.println( "substr test : " + example.toLowerCase() + example.length());
	}

}