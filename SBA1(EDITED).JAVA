package Task;


import java.util.Scanner;
public class Reportcard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String Name[]= { "studentname","classofstudent","grade","schoolname"};
		int total=0,count;
		String subject[]=  {"rollnumber","maths","science","social","english","hindi","computerscience"};float average;
		int Marks[]=new int[6];
		System.out.println("Enter the schoolname:");
		Name[3]=scanner.nextLine();
	    System.out.println("Enter the studentname:");
		Name[0]=scanner.nextLine();
		System.out.println("Enter the class of student:");
		Name[1]=scanner.nextLine();
		System.out.println("Enter the rollnumber:");
		subject[0]=scanner.nextLine();
		System.out.println("How many subject you need to enter:");
		count=scanner.nextInt();
		System.out.println("Enter the maths mark:");
		Marks[0]=scanner.nextInt();
		System.out.println("Enter the science mark:");
		Marks[1]=scanner.nextInt();
		System.out.println("Enter the social mark:");
	    Marks[2]=scanner.nextInt();
		System.out.println("Enter the english mark:");
		Marks[3]=scanner.nextInt();
		System.out.println("Enter the hindi mark:");
	    Marks[4]=scanner.nextInt();
	    System.out.println("Enter the computer science mark:");
	    Marks[5]=scanner.nextInt();
	  
	    for(int a:Marks)
	    {
	    	total+=a;
	    
	    }
	    System.out.println("Total: "+total);
	    average=total/6;
    
	    if(average>=90&&average<=100)
	    {
	    	System.out.println(Name[2]="A+");
	    }
	    else if(average>=80&&average<=89)
	    {
	    	System.out.println(Name[2]="A");
	    }
	    else if(average>=70&&average<=79)
	    {
	    	System.out.println(Name[2]="B+");
	    }
	    else if(average>=60&&average<=69)
	    {
	    	System.out.println(Name[2]="B");
	    }
	    else if(average>=50&&average<=59)
	    {
	    	System.out.println(Name[2]="C");
	    }
	    else if(average>=40&&average<=49)
	    {
	    	System.out.println(Name[2]="D");
	    }
	    else if(average<40)
	    {
	    	System.out.println(Name[2]="E");
	    }
	    
	    System.out.println("----------------------------------------");
	    System.out.println(Name[3]);
	    System.out.println("-----------------------------------------");
	    System.out.println("Name:"+Name[0]+ "           |  "    +"Class:"+Name[1]);
	    System.out.println("-----------------------------------------");
	    System.out.println(subject[1]+      "                |      "+Marks[0]);
	    System.out.println("-----------------------------------------");
	    System.out.println(subject[2]   +   "              |      "+Marks[1]);
	    System.out.println("-----------------------------------------");
	    System.out.println(subject[3]+      "               |      "+Marks[2]);
	    System.out.println("-----------------------------------------");
	    System.out.println(subject[4]+       "              |      "+Marks[3]);
	    System.out.println("-----------------------------------------");
	    System.out.println(subject[5]  +     "                |      "+Marks[4]);
	    System.out.println("-----------------------------------------");
	    System.out.println(subject[6] +      "      |      "+Marks[5]);
	    System.out.println("-----------------------------------------");
	    System.out.println("Total   "+       "             |      "+total);
	    System.out.println("-----------------------------------------");
	    System.out.println("Average   "+     "           |      "+average);
	    System.out.println("-----------------------------------------");
	    System.out.println("Grade   "+       "             |       "+Name[2]);
	    System.out.println("--------------------------------------------");
	    
	    
	   
	    
	    
	    
		
		
		

	}

}