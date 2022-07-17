

public class Excel {
	public static void main(String[] args) {
		String s = "uuA";
		char[] ch = s.toUpperCase().toCharArray();
		
		int temp = 0;
		int c = 0;
	
		for(int i = (ch.length-1); i>=0;i--) {
				int v = (int) ch[i]-64;
				if(i==ch.length-1) {
						temp=v;
				}else {
					
						temp = (int) (Math.pow(26, c)*v+temp);
					
				 }c++;
			}
		System.out.println(temp);
		
	}
}


