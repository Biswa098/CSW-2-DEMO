import java.util.*;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;
		File obj1=new File("negativeprime.txt");
		try {
			if(n<0&&isPrime(-n)) {
				
				FileWriter obj=new FileWriter("negativeprime.txt");
				obj.write(Integer.toString(n));
				obj.close();
				
			}
			
		}
		catch(IOException e) {
			System.out.print("IO exception occur");
			e.printStackTrace();
		}
		
		
			
		
	}
	static boolean isPrime(int num) {
		if(num<=1)
			return false;
		if(num==2||num==3)
			return true;
		if(num%2==0||num%3==0)
			return false;
		for(int i=5;i*i<=num;i=i+6) {
			if(num%i==0)
				return false;
		}
		return true;
			
	}
	static int sumOfDigits(int n) {
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n=n/10;
		}
		return sum;
	}

}
