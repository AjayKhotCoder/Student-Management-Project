import java.util.Scanner;

class Stud
{
	int choice,Roll;
    String Name;
    double maths,science,english,percentage = ((maths+science+english)/300)*100 ;
    
    public void setRoll(int Roll) {
		this.Roll = Roll;
	}
	public int getRoll() {
		return Roll;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	public double getMaths() {
		return maths;
	}
	public void setScience(double science) {
		this.science = science;
	}
	public double getScience() {
		return science;
	}
	public void setEnglish(double english) {
		this.english = english;
	}
	public double getEnglish() {
		return english;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public double getPercentage() {
		return percentage;
	}
	
	
}



class Controller{
	int choice,i,n=0,n2=0;
	Stud s[];
	Scanner sc = new Scanner(System.in);
	
	
	void menu()
	{
		System.out.println("\n====== :::MENU:::=====\n");
		System.out.println("1.Add Student");
		System.out.println("2.Show Students Data");
		System.out.println("3.Update Students Data");
		System.out.println("4.Search Students");
		System.out.println("5.Exit");
		
		System.out.print("Enter the Choice :");
		
		choice=Integer.parseInt(sc.nextLine());
		
		switch(choice)
        {
        case 1:
            addStd();
            break;
        case 2:
            showStd();
            break;
        case 3:
           updateStd();
            break;
        case 4:
            srchStd();
            break;
        case 0:
            //exit();
            break;
        }
	}
	
	void addStd() {
		int roll;
	    String name;
	    double Math,Sci,Eng,per;
	    
		
		System.out.println("Enter Number Of Students :");
		if(n!=0) 
		{
		n =Integer.parseInt(sc.nextLine());
		}
		else
		{
			n2 =Integer.parseInt(sc.nextLine());
		}
		n+=n2;
		s=new Stud[n]; 
		System.out.println("Ok.......");
		
		for(i=0;i<s.length;i++)
		{
			s[i]=new Stud();
			if(s[i].Roll == 0) 
			{
			System.out.println("Student "+(i+1));
			
			System.out.print("Enter Student Roll Number :");
			roll=Integer.parseInt(sc.nextLine());
			System.out.print("Enter Student Name :");
			name=sc.nextLine();
			System.out.println("Enter Maths marks :");
			Math=Double.parseDouble(sc.nextLine());
			System.out.println("Enter Science marks :");
			Sci=Double.parseDouble(sc.nextLine());
			System.out.println("Enter English marks :");
			Eng=Double.parseDouble(sc.nextLine());
			per=((Math+Eng+Sci)/300)*100;
			
			s[i].setRoll(roll);
			s[i].setName(name);
			s[i].setMaths(Math);
			s[i].setScience(Sci);
			s[i].setEnglish(Eng);
			s[i].setPercentage(per);
			}
			
		}
		
		menu();
	}	
	
	void showStd()
	{
		System.out.println("========================================================");
		System.out.println("----------:: ALL Students DATA RECORD ::-----------");
		System.out.println("========================================================");
		System.out.println("sr.no "+"\tRoll no"+"\t\tNAME"+ "\t\tMaths"+"\t\tScience"+"\t\tEnglish"+"\t\tPercentage");
		
		for(i=0;i<s.length;i++)
		{
			System.out.println((i+1)+"\t"+s[i].getRoll()+"\t\t"+s[i].getName()+"\t\t"+s[i].getMaths()+"\t\t"+s[i].getScience()+"\t\t"+s[i].getEnglish()+"\t\t"+s[i].getPercentage());
		}
		menu();
		
	}
	
	void updateStd()
	{
		int tmpRoll,ch,x=0;
		String newName = null;
        double newMath,newSci,newEng;
        
        System.out.print("Enter Your Emp ID:");
        tmpRoll=Integer.parseInt(sc.nextLine());
        for(i=0;i<s.length;i++)
        {
        	if(tmpRoll==s[i].getRoll())
        	{
        		System.out.println("sr.no "+"\tRoll no"+"\t\tNAME"+ "\t\tMaths"+"\t\tScience"+"\t\tEnglish"+"\t\tPercentage");
        		System.out.println((i+1)+"\t"+s[i].getRoll()+"\t\t"+s[i].getName()+"\t\t"+s[i].getMaths()+"\t\t"+s[i].getScience()+"\t\t"+s[i].getEnglish()+"\t\t"+s[i].getPercentage());

        		System.out.println("=================================================================");
        		System.out.println("ok....What You Want To Update.");
        		System.out.println("1.Name \n 2.Maths \n 3.Science \n 4.English");
        		System.out.print("Enter The Choice :");
        		 
        		choice=Integer.parseInt(sc.nextLine());
        		switch(choice) {
        		
        		case 1:
        			System.out.println("Your Old Name is :"+s[i].getName());
        			System.out.println("What is your Correct Name ?");
        			newName=sc.nextLine();
        			System.out.println("Your New Name is "+newName+" And Your Old Name is "+s[i].getName()+".");
        		break;
        		case 2:
        			System.out.println("Your Old Maths Marks is :"+s[i].getMaths());
        			System.out.println("What is Your Correct Marks? ");
        			newMath=Double.parseDouble(sc.nextLine());
        			System.out.println("Your New Maths Marks is "+newMath+"And Your old Marks is "+s[i].getMaths()+".");
        			System.out.println("Do you Really Want to Change?");
        			System.out.println("1.yes \n 2.No");
        			System.out.println("Enter Choice :");
        			ch=Integer.parseInt(sc.nextLine());
        			 switch(ch)
        			 {
        			 case 1:
        				 s[i].setMaths(newMath);
        				 break;
        			 case 2:
        				 menu();
        				 break;
        			 }
        		break;
        		
        	case 3:
    			System.out.println("Your Old Science Marks is :"+s[i].getScience());
    			System.out.println("What is Your Correct Marks? ");
    			newSci=Double.parseDouble(sc.nextLine());
    			System.out.println("Your New Science Marks is "+newSci+"And Your old Marks is "+s[i].getScience()+".");
    			System.out.println("Do you Really Want to Change?");
    			System.out.println("1.yes \n 2.No");
    			System.out.println("Enter Choice :");
    			ch=Integer.parseInt(sc.nextLine());
    			 switch(ch)
    			 {
    			 case 1:
    				 s[i].setScience(newSci);
    				 break;
    			 case 2:
    				 menu();
    				 break;
    			 }
    		break;
        	case 4:
    			System.out.println("Your Old English Marks is :"+s[i].getEnglish());
    			System.out.println("What is Your Correct Marks? ");
    			newEng=Double.parseDouble(sc.nextLine());
    			System.out.println("Your New English Marks is "+newEng+"And Your old Marks is "+s[i].getEnglish()+".");
    			System.out.println("Do you Really Want to Change?");
    			System.out.println("1.yes \n 2.No");
    			System.out.println("Enter Choice :");
    			ch=Integer.parseInt(sc.nextLine());
    			 switch(ch)
    			 {
    			 case 1:
    				 s[i].setEnglish(newEng);
    				 break;
    			 case 2:
    				 menu();
    				 break;
    			 }
    		break;
    		}
        		if(choice==1)
        		{
        		
        			System.out.println("Do you Really Want to Change?");
        			System.out.println("1.yes \n 2.No");
        			System.out.println("Enter Choice :");
        			ch=Integer.parseInt(sc.nextLine());
        			 switch(ch)
        			 {
        			 case 1:
        				s[i].setName(newName);
        				 break;
        			case 2:
        				 menu();
        				 break;
        				 default:
        					 System.out.println("Invalid option");
        			 }
        		}
        		else {
        			x++;
        		}
        	}
        }
        if(x==n)
        {
        	System.out.println("==========================================================");
        	System.out.println("Sorry......invalid Roll no ");
        	System.out.println("Please check your Roll");
        	System.out.println("==========================================================");
        	x=0;
        
        }
        System.out.println("Ok done record updated....");
        System.out.println("============================================================");
        menu();

	}
	
	void srchStd()
	{
		int tempRoll,x=0;
        String tempName;
        
        System.out.println("Serach by Roll no ");
        System.out.println("Enter Roll no:");
        tempRoll=Integer.parseInt(sc.nextLine());
        for(i=0;i<s.length;i++)
        {
        	if(tempRoll==s[i].getRoll())
        	{
        		System.out.println("sr.no "+"\tRoll no"+"\t\tNAME"+ "\t\tMaths"+"\t\tScience"+"\t\tEnglish"+"\t\tPercentage");
        		System.out.println((i+1)+"\t"+s[i].getRoll()+"\t\t"+s[i].getName()+"\t\t"+s[i].getMaths()+"\t\t"+s[i].getScience()+"\t\t"+s[i].getEnglish()+"\t\t"+s[i].getPercentage());
        	}
        	else {
        		x++;
        	}
        }
        if(x==n)
        {
        	System.out.println("Sorry you entered wrong Roll no ....Please enter correct Roll no.");
        	
        }
		menu();
	}
	
}


public class Student {

	public static void main(String[] args) {
		System.out.println("-----------------STUDENT MANAGEMENT SYSTEM-----------------");
		Controller c1=new Controller();
		
		c1.menu();
	}

}
