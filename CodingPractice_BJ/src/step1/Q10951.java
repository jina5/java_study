package step1;

import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) 
			{int a=sc.nextInt();
			if(a<0||a>10)
				continue;
			int b=sc.nextInt();
			if(b<0||b>10)
				continue;
			System.out.println(a+b);
			}
			}

}
