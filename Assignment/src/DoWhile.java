
public class DoWhile {

	public static void main(String[] args) {
		// for loop
		for(int i=1,j=1; i<10||j<10;i++,j++)
		  { 
			j++;
			System.out.println("i="+i+" and j="+j); 
		  }


		// while loop 
			int i=1,j=1;
			while(i<10 || j<10)
			  { 
				i++; j++;
			System.out.println("i="+i+" and j="+j); 
			  }	
			
		// Do while loop
			int i=1,j=2;
			do {
				i++;
				j++;
				System.out.println("i=" + i + " and j=" + j);
			} while (i< 10 || j< 10);


	}

}
