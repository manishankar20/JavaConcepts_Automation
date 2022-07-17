

public class StringPalindrome {

	//String Palindrome BOB = BOB
	public static void main(String[] args) {
		withTempVariable("Malayalam");
		System.out.println(withOutTempVariable("Malayalam"));
	}
	
	
	public static void withTempVariable(String s) {
		
		String s1 = "";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		if(s.toLowerCase().equals(s1.toLowerCase())) {
			System.out.println(s + " is Palindrome");
		}else {
			System.out.println(s + " is not Palindrome");
		}
		}
	
	public static String withOutTempVariable(String s) {
		for(int i=0;i<=s.length()/2;i++) {
			if(s.toLowerCase().charAt(i)!=(s.toLowerCase().charAt(s.length()-1-i))) {
				return (s + " is not Palindrome");
			}
		}return s +" is Palindrome";
	}
}
