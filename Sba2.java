package bankinfo;

public interface At1 {
		void Bankdetails();
}
package bankinfo;

public interface At2 extends At1 {
	 void Bankdetails();
		}

			    
package bankinfo;

import java.util.Scanner;

public class Aggy implements At2 {
	int i, Accountno1=456789,pinnumber1=1234,accountnumber,pinnumber,withdraw,balance,choose,choice,deposit,count;
         Scanner scanner=new Scanner(System.in);
	 public void Bankdetails(int Accountno1,int pinnumber1)
		{   
		 
		    System.out.println("Enter the account number:");
			accountnumber=scanner.nextInt();
			System.out.println("Enter the  pinnumber:");
			pinnumber=scanner.nextInt();
		      if(accountnumber==Accountno1&&pinnumber==pinnumber1)
		      {
		    	  System.out.println("Your accountnumber and  pinnumber is correct ");
		      }
		      else
		      {
		    	  System.out.println("You entered number is incorrect");
		      }
		      
		     }
		     public	void Bankdetails()
		  	{ 
		    	   System.out.println("Automated teller machine");
		  	       System.out.println("Choose 1 for withdraw");
		    	   System.out.println("Choose 2 for deposit");
		    	   System.out.println("Choose 3 for view balance");
		    	   System.out.println("Choose 4 for exit");
		     }
		    public void Bankdetails(int balance)
		 	{ 
		    	for(i=0;i<=3;i++) {
		 		System.out.println("Choose the appropriate operation you want to perform ");
		  	   choice=scanner.nextInt();
		  	   switch(choice)
		  	   {
		  	   case 1:
		  		   System.out.println("Enter the amount to be withdrawn: ");
		  		   withdraw=scanner.nextInt();
		  		   System.out.println("Please confirm:");
		  		   choose=scanner.nextInt();
		  		   switch(choose)
		  		   {
		  		   case 1:
		  			   System.out.println("Yes");
		  			   break;
		  		   case 2:
		  			   System.out.println("No");
		  			   break;
		  		   }
		  		  
		  		   
		  		   if(balance>=withdraw)
		  		   {
		  			   balance=balance-withdraw;
		  			   System.out.println("please collect your money and remove the card");
		  			   System.out.println("Balance:"+balance);
		  		   }
		  		   else
		  		   {
		  			   System.out.println("Sorry! the balance is insufficient"); 
		  		   }
		  		   System.out.println("");
		             break;
		  	   case 2:
		  		   System.out.println("Enter amount you want to be deposited");
		  		   int deposit = scanner.nextInt();
		  		   balance=balance+deposit;
		  		   System.out.println("Your money is successfully deposited");
		  		   System.out.println("Balance:"+balance);
		  		   System.out.println("");
		  		   break;
		  	   case 3:
		  		   System.out.println("Balance:"+balance);
		  		   System.out.println("");
		  		   break;
		  	   case 4:
		  		   System.out.println("Thanks for banking with Aggy bank");
		  		   System.exit(0);
		  		   break;
		  		  }
                                  }
                                  }
                                  } 
                                  package bankinfo;

                                  public class Aggymain {

	                         public static void main(String[] args) {
		                 Aggy aggy=new Aggy();
		                 aggy.Bankdetails(456789,1234);
		                 aggy.Bankdetails();
		                 aggy.Bankdetails(100000);
		
                                  
 
		