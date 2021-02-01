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
        
       
        		
         System.out.println("enter the cordinates of the second line");
	        int x11=sc.nextInt();
	        int y11=sc.nextInt();
	        int x22=sc.nextInt();
	        int y22=sc.nextInt();
	        System.out.println("ur cordinates second line are : ("+x11+ "," +y11+ ")" );
	        System.out.println("ur cordinates are second line are : ("+x22+ "," +y22+ ")" );
	        int a11=x22-x11;
	        int a22=y22-y11;
	        
	        int sq11=(int)Math.pow(a11, 2);
	        int sq22=(int)Math.pow(a22, 2);
	        int value11=sq11+sq22;
	        
	        int value22=(int)Math.sqrt(value11);
	        System.out.println("length of the second line is " +value22);
	        
	        if(value2==value22)
	        {
	        	System.out.println("both the lines are equal in length");
	        }
	        else
	        {
	        	System.out.println("both lines are not equal");

                        if(value2 >value22)
	        	{
	        		System.out.println("length of line1 is greater then line 2");
	        	}
	        	
	        	else {
	        		   System.out.println("length of line2 is greater then line 1");
	        	     }
	        }

	}


        
	

	

         
       }