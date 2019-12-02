
public class NextLoopy {
	public static void main(String args[]) {
		
		for(int i=1; i < 10; i++) {
			System.out.print("i = " + i + "\t");
			
			for(int j=1; j < i+1; j++) { 
				
				if (j == 1 || j == i) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
	}
	
	
	for(int o=8; o > 0 ; o--) {
		System.out.print("i = " + o + "\t");
		
		for(int l=1; l < o+1; l++) { 
			
			if (l == 1 || l == o) {
			System.out.print("*");
			}else {
				System.out.print(" ");
			}
			
		}
		System.out.println("");
}
}

}

//i = 1	*
//i = 2	**
//i = 3	* *
//i = 4	*  *
//i = 5	*   *
//i = 6	*    *
//i = 7	*     *
//i = 8	*      *
//i = 9	*       *
//i = 8	*      *
//i = 7	*     *
//i = 6	*    *
//i = 5	*   *
//i = 4	*  *
//i = 3	* *
//i = 2	**
//i = 1	*

