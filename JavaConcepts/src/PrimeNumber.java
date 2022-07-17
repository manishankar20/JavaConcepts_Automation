

public class PrimeNumber {
	public static void main(String[] args) {
		//prime Number
		
		int p = 4;
		int temp=0;
		for(int i=2;i<=p/2;i++) {
			if(p%i==0) {
				temp++;
				break;
			}
			
		}
		if (temp==0) {
			System.out.println(p + " Prime");
		}else {
			System.out.println(p + " not Prime");
		}
		seriesOfPrime(45);
	}

	public static void seriesOfPrime(int number) {
		int p = 45;
		int temp=0;
		for(int k=3;k<=p;k++) {
			temp=0;
			for(int i=2;i<=k/2;i++) {
				if(k%i==0) {
					temp++;
				}
			}
			if (temp==0) {
				System.out.print(k + " ");
			}
		}
	}
}
