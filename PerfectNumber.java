package Array1;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Perfect no:");
		int container=0;
		int count=0;
   for(int checkno=1;container<5;checkno++) {
	   count=0;
   
	   for(int div=1;div<checkno;div++) {
		   if(checkno%div==0) {
			   count=count+div;
		   }
			   
		   }
	   
	   if(checkno==1|checkno==count) {
		   System.out.println(checkno);
		   container++;
	   }
}
	}
}
