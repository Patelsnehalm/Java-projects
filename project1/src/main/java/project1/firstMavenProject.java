package project1;

public class firstMavenProject {
	 static int sum(int...arr)
		{
		
		  int result=0;
		  for (int a:arr)
		  {
			  result+=a;
		  }
		 
			return result;
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
	           System.out.println("the value of a,b,c is:"+sum(4,6,8));
				/*
				 * System.out.println("the value of a,b,c,d  is:"+sum(4,6,8,7));
				 * System.out.println("the value of a,b,c,d and e is:"+sum(4,4,7,6,8));
				 * System.out.println("the value of a,b,c,d,e and f is:"+sum(4,6,8,7,8,9));
				 */
		}
	
	
}
