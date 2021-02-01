import java.util.Scanner;

public class FanGeomatryUc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("welcome to the line comparision computation program");

                       Scanner sc =new Scanner(System.in);
        System.out.println("enter the cordinates of the line");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        System.out.println("ur cordinates are : ("+x1+ "," +y1+ ")" );
        System.out.println("ur cordinates are : ("+x2+ "," +y2+ ")" );
        int a1=x2-x1;
        int a2=y2-y1;
        
        int sq1=(int) Math.pow(a1, 2);
        int sq2=(int) Math.pow(a2, 2);
        
        System.out.println(a1+ " " +a2);
        int value = sq1+sq2;
        
        int value2=(int) Math.sqrt(value);
        System.out.println("length of the line is " +value2);
        
        double root;
        root=square(value);
        System.out.println("length of line with method" +root);
        		
        
        
	}

	private static double square(int value) {
		// TODO Auto-generated method stub
		double t;
		double squareroot=value/2;
		do
		{
			t=squareroot;
			squareroot=(t+(value/t))/2;
			
			
		}
		while(t-squareroot!=0);
		
		return squareroot ;
	}

         
       }