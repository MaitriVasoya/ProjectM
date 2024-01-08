import java.util.Scanner;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
class job
{
 Scanner s=new Scanner(System.in);
 String name,gen;
 int c,h,i,j;
 boolean y1,y2;
 
 job()
 {
  c=0;
  System.out.println("Enter your name");
  name=s.nextLine();
  char z[]=name.toCharArray();
  for(i=0;i<z.length;i++) 
  {
   if(Character.isDigit(z[i]))
   {
	c++;
   }
   j=z[i];
   if(j>=33&&j<=47)
   {
	c++;
   }
   if(j>=58&&j<=64)
   {
	c++;
   }
   if(j>=91&&j<=96)
   {
	c++;
   }
   if(j>=123&&j<=126)
   {
	c++;
   }
  }
  if(c!=0)
  {
   do
   {
	c=0;
	System.out.println("Enter your correct name");
	name=s.nextLine();
	char z1[]=name.toCharArray();
	for(i=0;i<z1.length;i++)
	{
	 if(Character.isDigit(z1[i]))
	 {
	  c++;
	 }
	 j=z1[i];
     if(j>=33&&j<=47)
     {
	  c++;
     }
     if(j>=58&&j<=64)
     {
	  c++;
     }
     if(j>=91&&j<=96)
     {
	  c++;
     }
     if(j>=123&&j<=126)
     {
	  c++;
     }
	}
   }while(c!=0);
  }
  h=0;
  
  System.out.println("Enter your gender. Enter Male OR Female");
  gen=s.nextLine();
  y1=gen.equalsIgnoreCase("Male");
  y2=gen.equalsIgnoreCase("Female");
  if(y1==false&&y2==false)
  {
   h++;
  }
  if(h!=0)
  {
   do
   {
	c=0;
	System.out.println("Enter either Male OR Female");
	gen=s.nextLine();
	y1=gen.equalsIgnoreCase("Male");
    y2=gen.equalsIgnoreCase("Female");
    if(y1==false&&y2==false)
    {
     c++;
    }
   }while(c!=0);
  }
 }
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  job ob=new job();
  int chh,chhh,c1,c2,c3,c4,c5,c6,c7,f1,f2,f3,f4,f5,i,sc,f,c,age,count,h;
  
  
  
  count=0;
  c=0;
  sc=0;
  i=0;
  f=0;
  
  h=0;
  System.out.println("Enter your age");
  age=s.nextInt();
  if(age<=0|| age>100)
  {
   c++;
  }
  if(c!=0)
  {
   do
   {
    h=0;
	System.out.println("Enter your correct age");
	age=s.nextInt();
	if(age<=0|| age>100)
	{
     h++;
	}
   }while(h!=0);
  }
  
  
   
  System.out.println("CONFUSED!!:( ?? Which job to take?????? Want some help haa??");
  System.out.println("1. Yes");
  System.out.println("2. No");
  
  chh=s.nextInt();
  
  
  
  if(chh==1)
  {
   System.out.println(" *               * ***** *     ***** ***** *     * *****     ***** *****  ");                                     
   System.out.println("  *             *  *     *     *     *   * **   ** *           *   *   *  ");                            
   System.out.println("   *     *     *   ***** *     *     *   * * * * * *****       *   *   *  ");   
   System.out.println("    *   * *   *    *     *     *     *   * *  *  * *           *   *   *  ");                           
   System.out.println("     * *   * *     *     *     *     *   * *     * *           *   *   *  ");
   System.out.println("      *     *      ***** ***** ***** ***** *     * *****       *   *****  ");
   System.out.println("");
   System.out.println("");
   
   System.out.println(" *     *      *      *  * *****     *     * *   *     *     * ***** ***** ");
   System.out.println(" **   **     * *     * *  *         **   **  * *      *     * *     *     ");
   System.out.println(" * * * *    *   *    **   *****     * * * *   *       *     * ****  ***** ");
   System.out.println(" *  *  *   *******   **   *         *  *  *   *       *     * *     *     ");
   System.out.println(" *     *  *       *  * *  *         *     *   *       *     * *     *     ");
   System.out.println(" *     * *         * *  * *****     *     *   *       ***** * *     ***** ");
   
   System.out.println("");
   System.out.println("");
   System.out.println("WELCOME TO MAKE MY LIFE");
   System.out.println("Press Enter");
   s.nextLine();
   s.nextLine();
   System.out.println("ENTER THE OPTION NUMBER AND NOT WHOLE OPTION OR YOU WILL COME OUT OF THE PROGRAM");
   
   System.out.println("Press Enter");
   s.nextLine();
   for(i=0;i<5;i++)
   {
	System.out.println("");
   }
   System.out.println("There will be a short interview from which our site will recommend jobs for you");
   System.out.println("Q. Your job comes under which category?");
   System.out.println("1. Aviation");
   System.out.println("2. Arts");
   System.out.println("3. Business");
   System.out.println("4. Medical");
   System.out.println("5. Technology");
   System.out.println("6. Exit");
   chhh=s.nextInt();
   if(chhh==1)
   {
	count=0;
	sc=0;
	f=0;
	if(age<18)
	{
     System.out.println("You are not eligible for this job. Age of 21 and above are only allowed for this job");
	 System.exit(0);
	}
	
	else
	{
	 System.out.println("The airline industry is a multi-billion-dollar business. The Department of Transportation organizes the industry into four categories: international, national, regional, and cargo. Could your next job be in one of those areas?");
	 System.out.println("Press Enter");
	 s.nextLine();
	 s.nextLine();
     System.out.println("Q. Do you have the certificate of FAA examination or ATP examination");
	 System.out.println("1. I hava FAA examination certificate");
	 System.out.println("2. I have ATP examination certificate");
	 System.out.println("3. I have both the certificates");
	 System.out.println("4. I don't have any certificate");
	 c1=s.nextInt();
	 
	 switch(c1)
	 {
      case 1:sc=sc+10;
	         count++;
	  break;
	  case 2:sc=sc+10;
	         count++;
	  break;
	  case 3:sc=sc+20;
	         count++;
	  break;
	  case 4:sc=sc-10;
	         count++;
	  break;
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 
     System.out.println("Q. Do you have any kind of addiction?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c2=s.nextInt();
	 switch(c2)
	 {
	  case 1:System.out.println("No addicted people are allowed for this job");
	         System.exit(0);
			 break;
	  case 2:sc=sc+10;
	        
	  break;
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 
	 System.out.println("Q. Do you have any experiance of working?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c3=s.nextInt();
	 switch(c3)
	 {
	  case 1:sc=sc+10;
	  break;
	  case 2:sc=sc+5;
	  break;
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 
	 System.out.println("Q. Why are you choosing this job?");
	 System.out.println("1. Interest");
	 System.out.println("2. Forcefully");
	 System.out.println("3. Other reason");
	 c4=s.nextInt();
	 switch(c4)
	 {
	  case 1:sc=sc+15;
	  break;
	  case 2:sc=sc+5;
	  break;
	  case 3:sc=sc+10;
	  break;
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 if(sc>25&&c1==1)
	 {
	  System.out.println("RECOMMENDED JOBS FOR YOU ARE:-");
	  System.out.println("1. Aircraft Dispatcher");
	  
	  System.out.println("2. Flight Attendent");
	 }
	 
	 else if(sc>=25&&c1==2)
	 {
	  System.out.println("RECOMMENDED JOBS FOR YOU ARE:-");
	  System.out.println("1. Aircraft Mechnic");
	  System.out.println("2. Aircraft Dispatcher");
      System.out.println("3. Flight Attendent");
	 }
	 
	 else if(sc>40&&c1==3)
	 {
	  System.out.println("RECOMMENDED JOBS FOR YOU ARE:-");
	  System.out.println("1. Airline pilot");
	  System.out.println("2. Aircraft dispatcher");
	  System.out.println("3. Aircraft Mechanic");
	  System.out.println("4. Flight Attendent");
	  
	 }
	 
	 else
	 {
	  System.out.println("You are not qualified for any job as you have no certificates.");
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Thank you and have a nice day ahead");
	  System.exit(0);
	 }
	 System.out.println("");
	 System.out.println("Press Enter");
	 s.nextLine();
	 s.nextLine();
	 System.out.println("");
	 System.out.println("THANK YOU AND HAVE A NICE DAY AHEAD");
	 System.out.println("");
	 System.out.println("Would you like to give feedback?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c6=s.nextInt();
	 if(c6==1)
	 {
	  System.out.println("Was our site useful?");
	  System.out.println("1. Very much");
	  System.out.println("2. OK OK");
	  System.out.println("3. Not at all useful");
	  System.out.println("4. Made me more confused");
	  f1=s.nextInt();
	  switch(f1)
	  {
	   case 1:System.out.println("Thank you!");
	          f=f+40;
	          break;
	   case 2:System.out.println("We will try to improve");
	          f=f+30;
	          break;
	   case 3:System.out.println("Any changes you would like to recommend(OPTIONAL)?");
	          s.nextLine();
			  s.nextLine();
			  f=f+20;
			  break;
	   case 4:System.out.println("Can you recommend some changes(optional)?");
	          s.nextLine();
			  s.nextLine();
			  f=f+10;
			  break;
	   default:System.out.println("Invalid number entered");
	           System.exit(0);
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Give suggestions to improve our site?");
	  s.nextLine();
	  s.nextLine();
	  f=f+10;
	  System.out.println("Would you like to visit our site next time?");
	  System.out.println("1. Ofcourse yes");
	  System.out.println("2. Depends");
	  System.out.println("3. Absolutely no");
	  System.out.println("4. I don't know");
	  f2=s.nextInt();
	  switch(f2)
	  {
	   case 1:System.out.println("Thank you!");
	          f=f+40;
			  break;
	   case 2:f=f+30;
	          break;
	   case 3:f=f+10;
	          break;
	   case 4:f=f+20;
	          break;
	   default:System.out.println("Invalid number");
	           System.exit(0);
	  }
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Have we shown all the necessary information that needs to be shown?");
	  System.out.println("1. Yes");
	  System.out.println("2. No");
	  f3=s.nextInt();
	  switch(f3)
	  {
	   case 1:f=f+20;
	          break;
	   case 2:f=f+10;
	          System.out.println("What did we miss out please let us know");
			  s.nextLine();
			  s.nextLine();
			  break;
	   default:System.out.println("Invalid number");
	           System.exit(0);
	  }
      System.out.println("");
      System.out.println("");
      System.out.println("Please rate our site");
      System.out.println("1. Excellent");
	  System.out.println("2. Good");
	  System.out.println("3. OK-OK");
	  System.out.println("4. Bad");
	  f4=s.nextInt();
	  switch(f4)
	  {
	   case 1:f=f+40;
	          break;
	   case 2:f=f+30;
	          break;
       case 3:f=f+20;
             break;
       case 4:f=f+10;
              break;
	   default:System.out.println("Invalid number");	
               System.exit(0);	   
	  }
	  if(f>0&&f<=60)
	  {
	   System.out.println("Upon your feedback, it seems you did not like our site. We will try something new till you come next time");
	  }
	  else if(f<=100&&f>60)
	  {
	   System.out.println("Upon your feedback, it seems you liked our site but not much. We will try to make some changes till you come next time");
	  }
	  else
	  {
		System.out.println("Upon your feedback, it seems your liked our site. Please visit again");
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Thank you and have a nice day ahead");
	  System.out.println("");
	  System.out.println(" ***** *   *     *     *   * *  *   *   * ***** *   * ");
	  System.out.println("   *   *   *    * *    **  * * *     * *  *   * *   * ");
	  System.out.println("   *   *****   *****   * * * **       *   *   * *   * ");
	  System.out.println("   *   *   *  *     *  *  ** * *      *   *   * *   * ");
	  System.out.println("   *   *   * *       * *   * *  *     *   ***** ***** ");
	 }
	 else
	 {
	  System.out.println("Please visit again and have a nice day ahead");
	  System.exit(0);
	 }
	}
   }
   else if(chhh==2)
   {
	count=0;
	sc=0;
	f=0;
    if(age<18)
    {
     System.out.println("Only 18 years and above are selected for this category job");
	 System.exit(0);
    }
    else
    {
	 System.out.println("Love art? With a little perseverance and luck, creative types can forge their careers in an arts-related field.");
	 System.out.println("Press Enter");
	 s.nextLine();
	 s.nextLine();
     System.out.println("Q. Do you have Bachelor's degree in Acting?");
     System.out.println("1. Yes");
     System.out.println("2. No");
     c1=s.nextInt();
     switch(c1)
     {
      case 1:sc=sc+10;
	         count++;
	  break;
	  case 2:sc=sc-1;
	  break;
	  
	  
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 
	 
	 System.out.println("Q. Do you have three certificates of Masters in Architecture?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c2=s.nextInt();
	 switch(c2)
	 {
      case 1:sc=sc+10;
	         count++;
	  break;
	  case 2:sc=sc-1;
	  break;
	  
	  
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 
	 
	 System.out.println("Q. Do you have Masters certificate in Arts and History?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c3=s.nextInt();
	 switch(c3)
	 {
	  case 1:sc=sc+10;
	         count++;
	  break;
	  case 2:sc=sc-1;
	  break;
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 
	 System.out.println("Q. Do you have any interest in music?");
	 System.out.println("1. Love to listen music");
	 System.out.println("2. Love to sing");
	 System.out.println("3. Love to play");
	 System.out.println("4. Love to write song and stories");
	 System.out.println("5. Not interested");
	 c4=s.nextInt();
	 switch(c4)
	 {
	  case 1:sc=sc+10;
	         count++;
	  break;
	  case 2:sc=sc+10;
	         count++;
	  break;
	  case 3:sc=sc+10;
	         count++;
	  break;
	  case 4:sc=sc+10;
	         count++;
	  break;
	  case 5:sc=sc-1;
	  break;
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 if(count==0)
	 {
	  System.out.println("You are not qualified for any job");
	  System.exit(0);
	 }
	 System.out.println("Recommended jobs for you:-");
	 for(i=0;i<1;i++)
	 {
	  if(c1==1)
	  {
	   System.out.println("Film Producer");
	  }
	  if(c2==1)
	  {
	   System.out.println("Architect");
	   System.out.println("Museum Technician");
	  }
	  if(c3==1)
	  {
	   System.out.println("Artist");
	   System.out.println("Art Appraiser");
	   System.out.println("Museum Archivists");
	   System.out.println("Art Auctioneer");
	  }
	  if(c4!=5)
	  {
	   System.out.println("Singer");
	   System.out.println("Musician");
	   System.out.println("Poet or Writer");
	  }
	  
	 }
	 System.out.println("");
	 System.out.println("Press Enter");
	 s.nextLine();
	 s.nextLine();
	 System.out.println("");
	 System.out.println("THANK YOU AND HAVE A NICE DAY AHEAD");
	 System.out.println("");
	 System.out.println("Would you like to give feedback?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c6=s.nextInt();
	 if(c6==1)
	 {
	  System.out.println("Was our site useful?");
	  System.out.println("1. Very much");
	  System.out.println("2. OK OK");
	  System.out.println("3. Not at all useful");
	  System.out.println("4. Made me more confused");
	  f1=s.nextInt();
	  switch(f1)
	  {
	   case 1:System.out.println("Thank you!");
	          f=f+40;
	          break;
	   case 2:System.out.println("We will try to improve");
	          f=f+30;
	          break;
	   case 3:System.out.println("Any changes you would like to recommend(OPTIONAL)?");
	          s.nextLine();
			  s.nextLine();
			  f=f+20;
			  break;
	   case 4:System.out.println("Can you recommend some changes(optional)?");
	          s.nextLine();
			  s.nextLine();
			  f=f+10;
			  break;
	   default:System.out.println("Invalid number entered");
	           System.exit(0);
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Give suggestions to improve our site?");
	  s.nextLine();
	  s.nextLine();
	  f=f+10;
	  System.out.println("Would you like to visit our site next time?");
	  System.out.println("1. Ofcourse yes");
	  System.out.println("2. Depends");
	  System.out.println("3. Absolutely no");
	  System.out.println("4. I don't know");
	  f2=s.nextInt();
	  switch(f2)
	  {
	   case 1:System.out.println("Thank you!");
	          f=f+40;
			  break;
	   case 2:f=f+30;
	          break;
	   case 3:f=f+10;
	          break;
	   case 4:f=f+20;
	          break;
	   default:System.out.println("Invalid number");
	           System.exit(0);
	  }
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Have we shown all the necessary information that needs to be shown?");
	  System.out.println("1. Yes");
	  System.out.println("2. No");
	  f3=s.nextInt();
	  switch(f3)
	  {
	   case 1:f=f+20;
	          break;
	   case 2:f=f+10;
	          System.out.println("What did we miss out please let us know");
			  s.nextLine();
			  s.nextLine();
			  break;
	   default:System.out.println("Invalid number");
	           System.exit(0);
	  }
      System.out.println("");
      System.out.println("");
      System.out.println("Please rate our site");
      System.out.println("1. Excellent");
	  System.out.println("2. Good");
	  System.out.println("3. OK-OK");
	  System.out.println("4. Bad");
	  f4=s.nextInt();
	  switch(f4)
	  {
	   case 1:f=f+40;
	          break;
	   case 2:f=f+30;
	          break;
       case 3:f=f+20;
             break;
       case 4:f=f+10;
              break;
	   default:System.out.println("Invalid number");	  
               System.exit(0);	   
	  }
	  if(f>0&&f<=60)
	  {
	   System.out.println("Upon your feedback, it seems you did not like our site. We will try something new till you come next time");
	  }
	  else if(f<=100&&f>60)
	  {
	   System.out.println("Upon your feedback, it seems you liked our site but not much. We will try to make some changes till you come next time");
	  }
	  else
	  {
		System.out.println("Upon your feedback, it seems your liked our site. Please visit again");
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Thank you and have a nice day ahead");
	  System.out.println("");
	  System.out.println(" ***** *   *     *     *   * *  *   *   * ***** *   * ");
	  System.out.println("   *   *   *    * *    **  * * *     * *  *   * *   * ");
	  System.out.println("   *   *****   *****   * * * **       *   *   * *   * ");
	  System.out.println("   *   *   *  *     *  *  ** * *      *   *   * *   * ");
	  System.out.println("   *   *   * *       * *   * *  *     *   ***** ***** ");
	 }
	 else
	 {
	  System.out.println("Please visit again and have a nice day ahead");
	  System.exit(0);
	 }
    }
   }
   else if(chhh==3)
   {
	count=0;
	sc=0;
	f=0;
	if(age<18)
	{
	 System.out.println("Only 18 years and above can apply under this category of job");
	 System.exit(0);
	}
	else
	{
	 System.out.println("You don't necessarily need an MBA to make it in business, although many jobs in this category will require some education past high school, as well as an aptitude for numbers.");
	 System.out.println("Press Enter");
	 s.nextLine();
	 s.nextLine();
	 System.out.println("Q. Do you have the certificate of Certified Public Accountant(CPA) exam?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c1=s.nextInt();
	 switch(c1)
	 {
	  case 1:sc=sc+10;
	         count++;
	 		 break;
	  case 2:sc=sc-1;
	         break;
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 System.out.println("Q. Do you know how to handle with computer Graphical User Interphase(GUI)?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c2=s.nextInt();
	 switch(c2)
	 {
	  case 1:sc=sc+10;
	         count++;
			 break;
	  case 2:sc=sc-1;
	         
			 break;
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 System.out.println("Q. Do you have any of this qualification?");
	 System.out.println("1. Journalism");
	 System.out.println("2. Communication");
	 System.out.println("3. English");
	 System.out.println("4. Business");
	 System.out.println("");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c3=s.nextInt();
	 switch(c3)
	 {
	  case 1:sc=sc+10;
	         count++;
			 break;
	  case 2:sc=sc-1;
	         
			 break;
	  default:System.out.println("Invalid Number");
	          System.exit(0);
	 }
	 System.out.println("Q. Do you have college degrees in Business or Economics?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c4=s.nextInt();
	 switch(c4)
	 {
	  case 1:sc=sc+10;
	         count++;
			 break;
	  case 2:sc=sc-1;
	         
			 break;
	  default:System.out.println("Invalid Number");
	          System.exit(0);
	 }
	 System.out.println("Q. Do you have any certification in Management?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c5=s.nextInt();
	 switch(c5)
	 {
	  case 1:sc=sc+10;
	         count++;
			 break;
	  case 2:sc=sc-1;
	         break;
	  default:System.out.println("Invalid Number");
	          System.exit(0);
	 }
	 
	 System.out.println("Q. Do you have Bachelor's Degree in either of this:-");
	 System.out.println("Marketing");
	 System.out.println("Market Research");
	 System.out.println("Statistics");
	 System.out.println("Computer Science");
	 System.out.println("Maths");
	 System.out.println("Social Sciences");
	 System.out.println("Business Administration");
	 System.out.println("Communication");
	 System.out.println("");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c6=s.nextInt();
	 switch(c6)
	 {
	  case 1:sc=sc+10;
	         count++;
			 break;
	  case 2:sc=sc-1;
	         break;
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 if(count==0)
	 {
	  System.out.println("You are not Qualified for any job");
	  System.exit(0);
	 }
	 System.out.println("Recommended jobs for you:-");
	 for(i=0;i<1;i++)
	 {
	  if(c1==1)
	  {
	   System.out.println("Accountant");
	  }
	  if(c2==1)
	  {
	   System.out.println("Administrative Assistant");
	  }
	  if(c3==1)
	  {
	   System.out.println("Fundraiser");
	  }
	  if(c4==1)
	  {
	   System.out.println("Insurance Agent");
	   System.out.println("Investment Banker");
	  }
	  if(c5==1)
	  {
	   System.out.println("Management");
	  }
	  if(c6==1)
	  {
	   System.out.println("Marketing");
	  }
	  
	 }
	 System.out.println("");
	 System.out.println("Press Enter");
	 s.nextLine();
	 s.nextLine();
	 System.out.println("");
	 System.out.println("THANK YOU AND HAVE A NICE DAY AHEAD");
	 System.out.println("");
	 System.out.println("Would you like to give feedback?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c7=s.nextInt();
	 if(c7==1)
	 {
	  System.out.println("Was our site useful?");
	  System.out.println("1. Very much");
	  System.out.println("2. OK OK");
	  System.out.println("3. Not at all useful");
	  System.out.println("4. Made me more confused");
	  f1=s.nextInt();
	  switch(f1)
	  {
	   case 1:System.out.println("Thank you!");
	          f=f+40;
	          break;
	   case 2:System.out.println("We will try to improve");
	          f=f+30;
	          break;
	   case 3:System.out.println("Any changes you would like to recommend(OPTIONAL)?");
	          s.nextLine();
			  s.nextLine();
			  f=f+20;
			  break;
	   case 4:System.out.println("Can you recommend some changes(optional)?");
	          s.nextLine();
			  s.nextLine();
			  f=f+10;
			  break;
	   default:System.out.println("Invalid number entered");
	           System.exit(0);
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Give suggestions to improve our site?");
	  s.nextLine();
	  s.nextLine();
	  f=f+10;
	  System.out.println("Would you like to visit our site next time?");
	  System.out.println("1. Ofcourse yes");
	  System.out.println("2. Depends");
	  System.out.println("3. Absolutely no");
	  System.out.println("4. I don't know");
	  f2=s.nextInt();
	  switch(f2)
	  {
	   case 1:System.out.println("Thank you!");
	          f=f+40;
			  break;
	   case 2:f=f+30;
	          break;
	   case 3:f=f+10;
	          break;
	   case 4:f=f+20;
	          break;
	   default:System.out.println("Invalid number");
	           System.exit(0);
	  }
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Have we shown all the necessary information that needs to be shown?");
	  System.out.println("1. Yes");
	  System.out.println("2. No");
	  f3=s.nextInt();
	  switch(f3)
	  {
	   case 1:f=f+20;
	          break;
	   case 2:f=f+10;
	          System.out.println("What did we miss out please let us know");
			  s.nextLine();
			  s.nextLine();
			  break;
	   default:System.out.println("Invalid number");
	           System.exit(0);
	  }
      System.out.println("");
      System.out.println("");
      System.out.println("Please rate our site");
      System.out.println("1. Excellent");
	  System.out.println("2. Good");
	  System.out.println("3. OK-OK");
	  System.out.println("4. Bad");
	  f4=s.nextInt();
	  switch(f4)
	  {
	   case 1:f=f+40;
	          break;
	   case 2:f=f+30;
	          break;
       case 3:f=f+20;
             break;
       case 4:f=f+10;
              break;
	   default:System.out.println("Invalid number");	 
               System.exit(0);	   
	  }
	  if(f>0&&f<=60)
	  {
	   System.out.println("Upon your feedback, it seems you did not like our site. We will try something new till you come next time");
	  }
	  else if(f<=100&&f>60)
	  {
	   System.out.println("Upon your feedback, it seems you liked our site but not much. We will try to make some changes till you come next time");
	  }
	  else
	  {
		System.out.println("Upon your feedback, it seems your liked our site. Please visit again");
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Thank you and have a nice day ahead");
	  System.out.println("");
	  System.out.println(" ***** *   *     *     *   * *  *   *   * ***** *   * ");
	  System.out.println("   *   *   *    * *    **  * * *     * *  *   * *   * ");
	  System.out.println("   *   *****   *****   * * * **       *   *   * *   * ");
	  System.out.println("   *   *   *  *     *  *  ** * *      *   *   * *   * ");
	  System.out.println("   *   *   * *       * *   * *  *     *   ***** ***** ");
	 }
	 else
	 {
	  System.out.println("Please Visit again and have a nice day ahead");
	  System.exit(0);
	 }
	}
   }
   else if(chhh==4)
   {
	sc=0;
	count=0;
	f=0;
	if(age<23)
	{
     System.out.println("Your age should be atleast of 23 years");
	 System.exit(0);
	}
	System.out.println("Look at any list of top-paying, fast-growing jobs, and you'll see healthcare jobs right at the top of the ranking. Even during the depths of the Great Recession, this industry was booming. Of course, these jobs aren't for everyone: it takes compassion and emotional fortitude to work in this field, as well as the willingness to spend time and money training.");
	System.out.println("Press Enter");
	s.nextLine();
	s.nextLine();
	System.out.println("Q. Do you have MBBS certificates of four and a half year of training and post Graduate certificates?");
	System.out.println("1. Yes");
	System.out.println("2. No");
	c1=s.nextInt();
	switch(c1)
	{
	 case 1:sc=sc+10;
	        count++;
			break;
	 case 2:sc=sc-1;
	        break;
	 default:System.out.println("Invalid number");
	         System.exit(0);
	}
	System.out.println("Q. Have you completed your coursework in nursing, anatomy, physiology, psychology, biology, microbiology and chemistry as a part of Bachelor's degree?");
	System.out.println("1. Yes");
	System.out.println("2. No");
	c2=s.nextInt();
	switch(c2)
	{
	 case 1:sc=sc+10;
	        count++;
			break;
	 case 2:sc=sc-1;
	        break;
	 default:System.out.println("Invalid number");
	         System.exit(0);
	}
	System.out.println("Q. Have you done masters in Physiology, Anatomy and have Associate degree in EMT(Emergency Medical Technicians)?");
	System.out.println("1. Yes");
	System.out.println("2. No");
	c3=s.nextInt();
	switch(c3)
	{
	 case 1:sc=sc+10;
	        count++;
			break;
	 case 2:sc=sc-1;
	        break;
	 default:System.out.println("Invalid number");
	         System.exit(0);
	}
	System.out.println("Do you have post graduate certificates in Psychology?");
	System.out.println("1. Yes");
	System.out.println("2. No");
	c4=s.nextInt();
	switch(c4)
	{
	 case 1:sc=sc+10;
	        count++;
			break;
	 case 2:sc=sc-1;
	        break;
	 default:System.out.println("Invalid Number");
	         System.exit(0);
	}
	System.out.println("Q. Do you have MSW(Masters in Social Work) or a Bachelor's degree in social work?");
	System.out.println("1. Yes");
	System.out.println("2. No");
	c5=s.nextInt();
	switch(c5)
	{
	 case 1:sc=sc+10;
	        count++;
			break;
	 case 2:sc=sc-1;
	        break;
	 default:System.out.println("Invalid number");
	         System.exit(0);
	}
	System.out.println("Q. Have you earned Doctorate in Veterinary medicine and masters in biology, microbiology, anatomy, chemistry and zoology?");
	System.out.println("1. Yes");
	System.out.println("2. No");
	c6=s.nextInt();
	switch(c6)
	{
     case 1:sc=sc+10;
	        count++;
			break;
	 case 2:sc=sc-1;
	        break;
	 default:System.out.println("Invalid number");
	         System.exit(0);
	}
	if(count==0)
	{
     System.out.println("You are not Qualified for any job");
	 System.exit(0);
	}
	System.out.println("Recommended jobs for you:-");
    for(i=0;i<1;i++)
	{
	 if(c1==1)
	 {
      System.out.println("Physician");
	 }
	 if(c2==1)
	 {
      System.out.println("Nurse");
	 }
	 if(c3==1)
	 {
      System.out.println("Emergency Medical Technician");
	 }
	 if(c4==1)
	 {
	  System.out.println("Psychologist");
	 }
	 if(c5==1)
	 {
      System.out.println("Social Worker");
	 }
	 if(c6==1)
	 {
	  System.out.println("Veterinarian");
	 }
	 
	}
	 System.out.println("");
	 System.out.println("Press Enter");
	 s.nextLine();
	 s.nextLine();
     System.out.println("");
     System.out.println("THANK YOU AND HAVE A NICE DAY AHEAD");
	 System.out.println("");
	 System.out.println("Would you like to give feedback?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c7=s.nextInt();
	 if(c7==1)
	 {
	  System.out.println("Was our site useful?");
	  System.out.println("1. Very much");
	  System.out.println("2. OK OK");
	  System.out.println("3. Not at all useful");
	  System.out.println("4. Made me more confused");
	  f1=s.nextInt();
	  switch(f1)
	  {
	   case 1:System.out.println("Thank you!");
	          f=f+40;
	          break;
	   case 2:System.out.println("We will try to improve");
	          f=f+30;
	          break;
	   case 3:System.out.println("Any changes you would like to recommend(OPTIONAL)?");
	          s.nextLine();
			  s.nextLine();
			  f=f+20;
			  break;
	   case 4:System.out.println("Can you recommend some changes(optional)?");
	          s.nextLine();
			  s.nextLine();
			  f=f+10;
			  break;
	   default:System.out.println("Invalid number entered");
	           System.exit(0);
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Give suggestions to improve our site?");
	  s.nextLine();
	  s.nextLine();
	  f=f+10;
	  System.out.println("Would you like to visit our site next time?");
	  System.out.println("1. Ofcourse yes");
	  System.out.println("2. Depends");
	  System.out.println("3. Absolutely no");
	  System.out.println("4. I don't know");
	  f2=s.nextInt();
	  switch(f2)
	  {
	   case 1:System.out.println("Thank you!");
	          f=f+40;
			  break;
	   case 2:f=f+30;
	          break;
	   case 3:f=f+10;
	          break;
	   case 4:f=f+20;
	          break;
	   default:System.out.println("Invalid number");
	           System.exit(0);
	  }
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Have we shown all the necessary information that needs to be shown?");
	  System.out.println("1. Yes");
	  System.out.println("2. No");
	  f3=s.nextInt();
	  switch(f3)
	  {
	   case 1:f=f+20;
	          break;
	   case 2:f=f+10;
	          System.out.println("What did we miss out please let us know");
			  s.nextLine();
			  s.nextLine();
			  break;
	   default:System.out.println("Invalid number");
	           System.exit(0);
	  }
      System.out.println("");
      System.out.println("");
      System.out.println("Please rate our site");
      System.out.println("1. Excellent");
	  System.out.println("2. Good");
	  System.out.println("3. OK-OK");
	  System.out.println("4. Bad");
	  f4=s.nextInt();
	  switch(f4)
	  {
	   case 1:f=f+40;
	          break;
	   case 2:f=f+30;
	          break;
       case 3:f=f+20;
             break;
       case 4:f=f+10;
              break;
	   default:System.out.println("Invalid number");
               System.exit(0);	   
                	   
	  }
	  if(f>0&&f<=60)
	  {
	   System.out.println("Upon your feedback, it seems you did not like our site. We will try something new till you come next time");
	  }
	  else if(f<=100&&f>60)
	  {
	   System.out.println("Upon your feedback, it seems you liked our site but not much. We will try to make some changes till you come next time");
	  }
	  else
	  {
		System.out.println("Upon your feedback, it seems your liked our site. Please visit again");
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Thank you and have a nice day ahead");
	  System.out.println("");
	  System.out.println(" ***** *   *     *     *   * *  *   *   * ***** *   * ");
	  System.out.println("   *   *   *    * *    **  * * *     * *  *   * *   * ");
	  System.out.println("   *   *****   *****   * * * **       *   *   * *   * ");
	  System.out.println("   *   *   *  *     *  *  ** * *      *   *   * *   * ");
	  System.out.println("   *   *   * *       * *   * *  *     *   ***** ***** ");
	 }
	 else
	 {
	  System.out.println("Please visit again and have a nice day ahead");
	  System.exit(0);
	 }
	}
    else if(chhh==5)
	{
     count=0;
	 sc=0;
	 f=0;
	 
     
	
	 if(age<23)
	 {
      System.out.println("Your age should be atleast of 23 years to get job in this category");
	  System.exit(0);
	 }
	 System.out.println("The tech industry is booming, and your career can boom right along with it. You don't necessarily need a degree to get these jobs. Pick up the necessary skills via online courses, bootcamps, or practical experience, and many employers will put you to work.");
	 System.out.println("");
	 System.out.println("Press Enter");
	 s.nextLine();
	 s.nextLine();
	 System.out.println("Q. Do you have all the following:-");
	 System.out.println("Bachelor's degree in Management Information Systems");
	 System.out.println("Bachelor's degree in Computer Science and Software Engineering");
	 System.out.println("");
	 System.out.println("");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c1=s.nextInt();
	 switch(c1)
	 {
      case 1:sc=sc+10;
	         count++;
			 break;
	  case 2:sc=sc-1;
	         break;
	  default:System.out.println("Invalid number");
	          System.exit(0);
	 }
	 System.out.println("Q. Do you have bachelor's degree in Computer Science or Software Engineering?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c2=s.nextInt();
	 switch(c2)
	 {
      case 1:sc=sc+10;
	         count++;
			 break;
	  case 2:sc=sc-1;
	         break;
	  default:System.out.println("Invalid Number");
	          System.exit(0);
	 }
	 System.out.println("Q. Do you have Associate's degree in Programming?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c3=s.nextInt();
	 switch(c3)
	 {
	  case 1:sc=sc+10;
	         count++;
			 break;
	  case 2:sc=sc-1;
	         break;
	  default:System.out.println("Invalid Number");
	          System.exit(0);
	 }
	 System.out.println("Q. Do you have Bachelor's degree in Web Developing?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c4=s.nextInt();
	 switch(c4)
	 {
      case 1:sc=sc+10;
	         count++;
			 break;
	  case 2:sc=sc-1;
	         break;
	  default:System.out.println("Invalid Number");
	          System.exit(0);
	 }
	 if(count==0)
	 {
	  System.out.println("You are not Qualified for any job");
	  System.exit(0);
	 }
	 System.out.println("Recommended jobs for you:-");
	 for(i=0;i<1;i++)
	 {
	  if(c1==1)
	  {
	   System.out.println("Database Administrator");
	   System.out.println("Software Developer");
	   System.out.println("Computer System Analyst");
	   System.out.println("Mobile App Developer");
	  }
	  if(c2==1)
	  {
	   System.out.println("Computer Programmer");
	  }
	  if(c3==1)
	  {
	   System.out.println("Software developer");
	  }
	  if(c4==1)
	  {
	   System.out.println("Web Developer");
	  }
	 }
	 System.out.println("");
	 System.out.println("Press Enter");
	 s.nextLine();
	 s.nextLine();
	 System.out.println("");
	 System.out.println("THANK YOU AND HAVE A NICE DAY AHEAD");
	 System.out.println("");
	 System.out.println("Would you like to give feedback?");
	 System.out.println("1. Yes");
	 System.out.println("2. No");
	 c7=s.nextInt();
	 if(c7==1)
	 {
	  System.out.println("Was our site useful?");
	  System.out.println("1. Very much");
	  System.out.println("2. OK OK");
	  System.out.println("3. Not at all useful");
	  System.out.println("4. Made me more confused");
	  f1=s.nextInt();
	  switch(f1)
	  {
	   case 1:System.out.println("Thank you!");
	          f=f+40;
	          break;
	   case 2:System.out.println("We will try to improve");
	          f=f+30;
	          break;
	   case 3:System.out.println("Any changes you would like to recommend(OPTIONAL)?");
	          s.nextLine();
			  s.nextLine();
			  f=f+20;
			  break;
	   case 4:System.out.println("Can you recommend some changes(optional)?");
	          s.nextLine();
			  s.nextLine();
			  f=f+10;
			  break;
	   default:System.out.println("Invalid number entered");
	           System.exit(0);
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Give suggestions to improve our site?");
	  s.nextLine();
	  s.nextLine();
	  f=f+10;
	  System.out.println("Would you like to visit our site next time?");
	  System.out.println("1. Ofcourse yes");
	  System.out.println("2. Depends");
	  System.out.println("3. Absolutely no");
	  System.out.println("4. I don't know");
	  f2=s.nextInt();
	  switch(f2)
	  {
	   case 1:System.out.println("Thank you!");
	          f=f+40;
			  break;
	   case 2:f=f+30;
	          break;
	   case 3:f=f+10;
	          break;
	   case 4:f=f+20;
	          break;
	   default:System.out.println("Invalid number");
	           System.exit(0);
	  }
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Have we shown all the necessary information that needs to be shown?");
	  System.out.println("1. Yes");
	  System.out.println("2. No");
	  f3=s.nextInt();
	  switch(f3)
	  {
	   case 1:f=f+20;
	          break;
	   case 2:f=f+10;
	          System.out.println("What did we miss out please let us know");
			  s.nextLine();
			  s.nextLine();
			  break;
	   default:System.out.println("Invalid number");
	           System.exit(0);
	  }
      System.out.println("");
      System.out.println("");
      System.out.println("Please rate our site");
      System.out.println("1. Excellent");
	  System.out.println("2. Good");
	  System.out.println("3. OK-OK");
	  System.out.println("4. Bad");
	  f4=s.nextInt();
	  switch(f4)
	  {
	   case 1:f=f+40;
	          break;
	   case 2:f=f+30;
	          break;
       case 3:f=f+20;
             break;
       case 4:f=f+10;
              break;
	   default:System.out.println("Invalid number");
               System.exit(0);	   
	  }
	  if(f>0&&f<=60)
	  {
	   System.out.println("Upon your feedback, it seems you did not like our site. We will try something new till you come next time");
	  }
	  else if(f<=100&&f>60)
	  {
	   System.out.println("Upon your feedback, it seems you liked our site but not much. We will try to make some changes till you come next time");
	  }
	  else
	  {
		System.out.println("Upon your feedback, it seems your liked our site. Please visit again");
	  }
	  
	  System.out.println("");
	  System.out.println("");
	  System.out.println("Thank you and have a nice day ahead");
	  System.out.println("");
	  System.out.println(" ***** *   *     *     *   * *  *   *   * ***** *   * ");
	  System.out.println("   *   *   *    * *    **  * * *     * *  *   * *   * ");
	  System.out.println("   *   *****   *****   * * * **       *   *   * *   * ");
	  System.out.println("   *   *   *  *     *  *  ** * *      *   *   * *   * ");
	  System.out.println("   *   *   * *       * *   * *  *     *   ***** ***** ");
	 }
	 else
	 {
      System.out.println("Please visit again and have a nice day ahead");
	  System.exit(0);
	 }
	}
	
	else if(chhh==6)
	{
	 System.out.println("Thank you and have a nice day ahead");
	 System.exit(0);
	}
	else
	{
	 System.out.println("Invalid Number");
	 System.exit(0);
	}
   }
   
   else 
   {
    System.out.println("Thank you and have a Nice day ahead");
	System.out.println("");
	System.out.println(" ***** *   *     *     *   * *  *   *   * ***** *   * ");
	System.out.println("   *   *   *    * *    **  * * *     * *  *   * *   * ");
	System.out.println("   *   *****   *****   * * * **       *   *   * *   * ");
	System.out.println("   *   *   *  *     *  *  ** * *      *   *   * *   * ");
	System.out.println("   *   *   * *       * *   * *  *     *   ***** ***** ");
    System.exit(0);
   }
   System.out.println("Do you want to apply for jobs online?");
   System.out.println("1. Yes");
   System.out.println("2. No");
   c1=s.nextInt();
   if(c1==1)
   {
    String url = "https://www.indeed.com/";

        if(Desktop.isDesktopSupported()){
            Desktop desktop = Desktop.getDesktop();
            try 
			{
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e) 
			{
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
		else
		 {
            Runtime runtime = Runtime.getRuntime();
            try 
			{
                runtime.exec("xdg-open " + url);
            } 
			catch (IOException e) 
			{
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
   }
   else
   {
	System.out.println("Thank you and have a nice day ahead");
	System.exit(0);
   }
 }
}