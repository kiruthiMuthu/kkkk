package fibo;

public class fibonacci {

	public static void main(String[] args) {
		int s1=0,s2=1,s3,i,count=10;    
		 System.out.print(s1+" "+s2);
		 for(i=2;i<count;++i)    
		 {    
		  s3=s1+s2;    
		  System.out.print(" "+s3);    
		  s1=s2;    
		  s2=s3;    
		 }    
		  
		}

}
