package mine;

public class starEx {

	public static void main(String[] args) {

		/*
		 * 1 
		 * ***** 
		 * ***** 
		 * *****
		 */

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++)
				System.out.print("*");
			System.out.println();
		}

		/*
		 * 2 
		 * * 
		 * ** 
		 * ***
		 */

		for (int j = 0; j < 3; j++) {
			for (int i = 0; i < j + 1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 3
		 * ****
		 * *** 
		 * ** 
		 * *
		 */
		
		for (int j = 3; j >=0; j--) {
			for (int i = 0; i < j+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		/*
		 * 4
		 *    *
		 *   **
		 *  ***
		 * ****
		 */
		
		for (int i=3, j = 1; j<5; i--,j++) {
			for(int n=0;n<i;n++) {
				System.out.print(" ");
			}
			for(int n=0;n<j;n++) {
				System.out.print("*");
			}
			System.out.println();
		} //변수 3개라서 별로...
		
		for (int i=1;i<5;i++) {
			for(int j=4;j>0;j--) {
				if(j>i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
			}
	
		
		/*
		 * 피라미드 별찍기 (1,3,5,7)
		 */
		
		for(int i=0;i<4;i++) {
		for(int j=4;j>i+1;j--)
			System.out.print(" ");
		for(int j=0;j<i*2+1;j++)
			System.out.print("*");
		System.out.println();
		}
			
		
		

	}

}
