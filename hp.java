import java.util.Scanner;
class hp
{
 hp()
 {
  System.out.println("Wrong choice");
  System.exit(0);
 }
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Hello Harry Potter fans!!Here's an amazing game for you.");
  System.out.println("Are you interested in playing?(PRESS 1 OR 2)");
  System.out.println("1. Yes");
  System.out.println("2. No");
  int ch,ch1,s1,s2,s3,s4,i,j,k,ch2,ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8;
  String str;
  int a[]=new int[4];
  int chh[]=new int[6];
  int b[]=new int[8];
  int c[]=new int[8];
  s1=0;
  s2=0;
  s3=0;
  s4=0;  
  ss1=0;
  ss2=0;
  ss3=0;
  ss4=0;
  ss5=0;
  ss6=0;
  ss7=0;
  ss8=0;
  ch=s.nextInt();
  if(ch==2)
  {
   System.out.println("Then get lost Bitch, what you doing here with your ugly face?");
   System.exit(0);
  }
  else if(ch==1)
  {
   System.out.println("Okay then, Let's Start the fun!!");
   s.nextLine();
   System.out.println("We'll start with the sorting ceremony in a while but before that....");
   s.nextLine();
   System.out.println("All of you should have a little knowledge about the houses");
   s.nextLine();
   System.out.println("There are 4 houses:-");
   s.nextLine();
   System.out.println("1. Gryffindor--->Founded by Godric Gryffindor");
   s.nextLine();
   System.out.println("2. Ravenclaw--->Founded by Rowena Ravenclaw");
   s.nextLine();
   System.out.println("3. Hufflepuff--->Founded by Helga Hufflepuff");
   s.nextLine();
   System.out.println("4. Slytherin--->Founded by Salazar Slytherin");
   s.nextLine();
   System.out.println("Well, I think its time that we begin the sorting ceremony, don't you think?");
   s.nextLine();
   System.out.println("Press option 1,2,3,4 accordingly");
   s.nextLine();
   
   System.out.println("Choose your favourite pair of colour");
   System.out.println("1. Scarlet and Gold");
   System.out.println("2. Yellow and Black");
   System.out.println("3. Blue and Bronze");
   System.out.println("4. Green and Silver");
   chh[0]=s.nextInt();
   if(chh[0]==1)
   {
	s1++;
   }
   else if(chh[0]==2)
   {
	s2++;
   }
   else if(chh[0]==3)
   {
	s3++;
   }
   else if(chh[0]==4)
   {
	s4++;
   }
   else
   {
	hp ob=new hp();
   }
   s.nextLine();
   System.out.println("Choose:-");
   System.out.println("1. Air");
   System.out.println("2. Water");
   System.out.println("3. Fire");
   System.out.println("4. Earth");
   chh[1]=s.nextInt();
   if(chh[1]==1)
   {
	s3++;
   }
   else if(chh[1]==2)
   {
	s4++;
   }
   else if(chh[1]==3)
   {
	s1++;
   }
   else if(chh[1]==4)
   {
	s2++;
   }
   else
   {
	hp ob=new hp();
   }
   s.nextLine();
   System.out.println("Which Quality best describes you?");
   System.out.println("1. Confident");
   System.out.println("2. Hard Working");
   System.out.println("3. Smart");
   System.out.println("4. Brave");
   chh[2]=s.nextInt();
   if(chh[2]==1)
   {
	s4++;
   }
   else if(chh[2]==2)
   {
	s2++;
   }
   else if(chh[2]==3)
   {
	s3++;
   }
   else if(chh[2]==4)
   {
	s1++;
   }
   else
   {
	hp ob=new hp();
   }
   s.nextLine();
   System.out.println("Which Portrait would you pick to guard your bedroom?");
   System.out.println("1. Knight");
   System.out.println("2. Snake");
   System.out.println("3. Fat Lady");
   System.out.println("4. Unicorn");
   chh[3]=s.nextInt();
   if(chh[3]==1)
   {
	s2++;
   }
   else if(chh[3]==2)
   {
	s4++;
   }
   else if(chh[3]==3)
   {
	s1++;
   }
   else if(chh[3]==4)
   {
	s3++;
   }
   else
   {
	hp ob=new hp();
   }
   s.nextLine();
   System.out.println("What abilit would you like to have?");
   System.out.println("1. Extreme Intelligence");
   System.out.println("2. Flying");
   System.out.println("3. Mind Control");
   System.out.println("4. Super Strength");
   chh[4]=s.nextInt();
   if(chh[4]==1)
   {
	s3++;
   }
   else if(chh[4]==2)
   {
	s1++;
   }
   else if(chh[4]==3)
   {
	s4++;
   }
   else if(chh[4]==4)
   {
	s2++;
   }
   else
   {
	hp ob=new hp();
   }
   s.nextLine();
   System.out.println("What would you like to do when you grow up?");
   System.out.println("1. Auror");
   System.out.println("2. Ministry of Magic Official");
   System.out.println("3. Hogwarts Proffesor");
   System.out.println("4. Quidditch Player");
   chh[5]=s.nextInt();
   if(chh[5]==1)
   {
	s1++;
   }
   else if(chh[5]==2)
   {
	s4++;
   }
   else if(chh[5]==3)
   {
	s3++;
   }
   else if(chh[5]==4)
   {
	s2++;
   }
   else
   {
	hp ob=new hp();
   }
   s.nextLine();
   a[0]=s1;
   a[1]=s2;
   a[2]=s3;
   a[3]=s4;
   System.out.println("Are you READY FOR YOUR RESULTS?????");
   s.nextLine();
   for(i=0;i<4;i++)
   {
	for(j=i+1;j<4;j++)
	{
     if(a[i]<a[j])
	 {
	  k=a[i];
      a[i]=a[j];
	  a[j]=k;
	 }
	}
   }
   System.out.println("You are......");
   if(a[0]==s1)
   {
	System.out.println("GRYFFINDOR");
	str="GRYFFINDOR";
   }
   else if(a[0]==s2)
   {
	System.out.println("HUFFLEPUFF");
	str="HUFFLEPUFF";
   }
   else if(a[0]==s3)
   {
	System.out.println("RAVENCLAW");
	str="RAVENCLAW";
   }
   else 
   {
	System.out.println("SLYTHERIN");
	str="SLYTHERIN";
   }
   System.out.println("");
   System.out.println("");
   System.out.println("Five Years Later..........");
   s.nextLine();
   System.out.println("(There was a note on the Board as follows:-)");
   s.nextLine();
   System.out.println("Dear Witches and Wizards!! There will be a class of PATRONUS CHARM Tomorrow. For those who don't know, what is Patronus, Please refer to the books in the Library.");
   System.out.println("This class can only be attended by Students of 5th, 6th and 7th year");
   System.out.println("Warning: If any junior Witch or Wizard is caught attending the class, the consequences will be severe which can even result in banishment of the Witch or Wizard from Hogwarts School of Witchcraft and Wizardry. Thank you for Cooperating");
   System.out.println("If you have chocolate bars than please carry it");
   s.nextLine();
   System.out.println("As you are in your Fifth year at Hogwarts, its clear you are allowed to go. So are you interested?");
   System.out.println("1. Yes");
   System.out.println("2. No");
   ch2=s.nextInt();
   if(ch2==2)
   {
	System.out.println("Well then, continue your studies and Have A Nice Day Ahead");
   }
   else if(ch2==1)
   {
	System.out.println("Then let's go to buy some Chocolates from Hogsmeade for Tomorrow");
	s.nextLine();
	System.out.println("OKAY! So according to the library book, Patronus is a Positive Energy that protects us from the Dementors(Black hooded figures who guard the Prison of Azkaban). But to create the Patronus, your mind should be filled with happy thoughts because without it, no one can create their Patronus");
	s.nextLine();
	System.out.println("So, for now go and get some rest for tomorrow");
	s.nextLine();
	System.out.println("So we are here to learn to produce our own Patronus Charm. Let's Begin...");
	System.out.println("Choose your Favourite Spell:-");
	System.out.println("1. Expelliarmus");
	System.out.println("2. Accio");
	System.out.println("3. Stupefy");
	System.out.println("4. Reducto");
	System.out.println("5. Wingardium Leviosa");
	System.out.println("6. Sectumsempra");
	System.out.println("7. Protego");
	System.out.println("8. Lumos");
	b[0]=s.nextInt();
	switch(b[0])
	{
	 case 1:ss1++;
	        break;
	 case 2:ss8++;
	        break;
	 case 3:ss3++;
	        break;
	 case 4:ss4++;
	        break;
	 case 5:ss2++;
	        break;
	 case 6:ss6++;
            break;
	 case 7:ss5++;
	        break;
	 case 8:ss7++;
	        break;
	 default:hp ob=new hp();
	}
	System.out.println("");
	System.out.println("");
	System.out.println("Choose your favourite class:-");
	System.out.println("1. Charms");
	System.out.println("2. Arithmancy");
	System.out.println("3. Potions");
	System.out.println("4. Defence Against The Dark Arts");
	System.out.println("5. Transfiguration");
	System.out.println("6. Astronomy");
	System.out.println("7. Care Of Magical Creatures");
	System.out.println("8. Herbology");
	b[1]=s.nextInt();
	switch(b[1])
	{
	 case 1:ss2++;
	        break;
	 case 2:ss3++;
	        break;
	 case 3:ss4++;
	        break;
	 case 4:ss1++;
	        break;
	 case 5:ss5++;
	        break;
	 case 6:ss8++;
	        break;
	 case 7:ss7++;
	        break;
	 case 8:ss6++;
	        break;
	 default:hp ob=new hp();
	}
	System.out.println("");
	System.out.println("");
	System.out.println("Choose your Favourite Character:-");
	System.out.println("1. Harry Potter");
	System.out.println("2. Hermione Granger");
	System.out.println("3. Ronald Weasley");
	System.out.println("4. Ginny Weasley");
	System.out.println("5. Luna Lovegood");
	System.out.println("6. Severus Snape");
	System.out.println("7. Remus Lupin");
	System.out.println("8. Albus Dumbledore");
	b[2]=s.nextInt();
	switch(b[2])
	{
	 case 1:ss1++;
	        break;
	 case 2:ss2++;
	        break;
	 case 3:ss3++;
	        break;
	 case 4:ss4++;
	        break;
	 case 5:ss5++;
	        break;
	 case 6:ss6++;
	        break;
	 case 7:ss7++;
	        break;
	 case 8:ss8++;
	        break;
	 default:hp ob=new hp();
	}
	System.out.println("");
	System.out.println("");
	System.out.println("Pick Your favourite Object:-");
	System.out.println("1. Elder Wand");
	System.out.println("2. Sorting Hat");
	System.out.println("3. Invisibility Cloak");
	System.out.println("4. Sword Of Gryffindor");
	System.out.println("5. Golden Snitch");
	System.out.println("6. Ressurection Stone");
	System.out.println("7. Time Turner");
	System.out.println("8. DA coin");
	b[3]=s.nextInt();
	switch(b[3])
	{
	 case 1:ss8++;
	        break;
	 case 2:ss4++;
	        break;
	 case 3:ss1++;
	        break;
	 case 4:ss6++;
	        break;
	 case 5:ss5++;
	        break;
	 case 6:ss3++;
	        break;
	 case 7:ss2++;
	        break;
	 case 8:ss7++;
	        break;
	 default:hp ob=new hp();
	}
	System.out.println("");
	System.out.println("");
	System.out.println("Choose your favourite drink:-");
	System.out.println("1. Firewhisky");
	System.out.println("2. Veritaserum");
	System.out.println("3. Coffee");
	System.out.println("4. Tea");
	System.out.println("5. Pumpkin Juice");
	System.out.println("6. Butterbear");
	System.out.println("7. Hot Chocolate");
	System.out.println("8. Lemonade");
	b[4]=s.nextInt();
	switch(b[4])
	{
	 case 1:ss4++;
	        break;
	 case 2:ss6++;
	        break;
	 case 3:ss8++;
	        break;
	 case 4:ss7++;
	        break;
	 case 5:ss5++;
	        break;
	 case 6:ss1++;
	        break;
	 case 7:ss2++;
	        break;
	 case 8:ss3++;
	        break;
	 default:hp ob=new hp();
	}
	System.out.println("");
	System.out.println("");
	System.out.println("If you could hex anyone, who would it be?");
	System.out.println("1. Bellatrix");
	System.out.println("2. James Potter");
	System.out.println("3. Dolores Umbridge");
	System.out.println("4. Peter Pettigrew");
	System.out.println("5. Fenrir Greyback");
	System.out.println("6. Draco Malfoy");
	System.out.println("7. Voldemort");
	System.out.println("8. Lucius Malfoy");
	b[5]=s.nextInt();
	switch(b[5])
	{
	 case 1:ss4++;
	        break;
	 case 2:ss6++;
	        break;
	 case 3:ss2++;
	        break;
	 case 4:ss5++;
	        break;
	 case 5:ss7++;
	        break;
	 case 6:ss3++;
	        break;
	 case 7:ss1++;
	        break;
	 case 8:ss8++;
	        break;
	 default:hp ob=new hp();
	}
	System.out.println("");
	System.out.println("");
	System.out.println("Choose your favourite Superpower");
	System.out.println("1. Shapeshift");
	System.out.println("2. Healing Power");
	System.out.println("3. Teleportation");
	System.out.println("4. Time Travel");
	System.out.println("5. Being Parseltongue");
	System.out.println("6. Telekinesis");
	System.out.println("7. Ability to Fly");
	System.out.println("8. Read Minds");
	b[6]=s.nextInt();
	switch(b[6])
	{
     case 1:ss7++;
	        break;
	 case 2:ss4++;
	        break;
	 case 3:ss5++;
	        break;
	 case 4:ss3++;
	        break;
	 case 5:ss1++;
	        break;
	 case 6:ss6++;
	        break;
	 case 7:ss8++;
	        break;
	 case 8:ss2++;
	        break;
	 default:hp ob=new hp();
	}
	System.out.println("");
	System.out.println("");
	System.out.println("Pick yoyr favourite Colour");
	System.out.println("1. Red");
	System.out.println("2. Orange");
	System.out.println("3. Yellow");
	System.out.println("4. Green");
	System.out.println("5. Blue");
	System.out.println("6. Purple");
	System.out.println("7. Pink");
	System.out.println("8. Grey");
	b[7]=s.nextInt();
	switch(b[7])
	{
	 case 1:ss1++;
	        break;
	 case 2:ss2++;
	        break;
	 case 3:ss3++;
	        break;
	 case 4:ss6++;
	        break;
	 case 5:ss5++;
	        break;
	 case 6:ss8++;
	        break;
	 case 7:ss4++;
	        break;
	 case 8:ss7++;
	        break;
	 default:hp ob=new hp();
	}
	System.out.println("");
	System.out.println("");
	System.out.println("You did your Job well. You'd be exhausted and that's completely normal. You may eat your chocolate");
	System.out.println("");
	System.out.println("");
	System.out.println("Well, the results are out");
	c[0]=ss1;
	c[1]=ss2;
	c[2]=ss3;
	c[3]=ss4;
	c[4]=ss5;
	c[5]=ss6;
	c[6]=ss7;
	c[7]=ss8;
	for(i=0;i<8;i++)
	{
	 for(j=i+1;j<8;j++)
	 {
	  if(c[i]<c[j])
	  {
	   k=c[i];
	   c[i]=c[j];
	   c[j]=k;
	  }
	 }
	}
	s.nextLine();
	System.out.println("ARE YOU READY???");
	s.nextLine();
	if(c[0]==ss1)
	{
     System.out.println("Your Patronus is a......");
	 s.nextLine();
	 System.out.println("STAG");
	 s.nextLine();
	 System.out.println("Stag is the Patronus of Harry Potter and James Potter");
	}
	else if(c[0]==ss2)
	{
     System.out.println("Your Patronus is a......");
	 s.nextLine();
	 System.out.println("OTTER");
	 s.nextLine();
	 System.out.println("Otter is a Patronus of Hermione Granger");
	}
	else if(c[0]==ss3)
	{
	 System.out.println("Your Patronus is a......");
	 s.nextLine();
	 System.out.println("DOG");
	 s.nextLine();
	 System.out.println("Dog is a Patronus of Ronald Weasley");
	}
	else if(c[0]==ss4)
	{
	 System.out.println("Your Patronus is a......");
	 s.nextLine();
	 System.out.println("HORSE");
	 s.nextLine();
	 System.out.println("Horse is a Patronus of Ginny Weasley");
	}
	else if(c[0]==ss5)
	{
	 System.out.println("Your Patronus is a......");
	 s.nextLine();
	 System.out.println("HARE");
	 s.nextLine();
	 System.out.println("Hare is a Patronus of Luna Lovegood");
	}
	else if(c[0]==ss6)
	{
	 System.out.println("Your Patronus is a......");
	 s.nextLine();
	 System.out.println("DOE");
	 s.nextLine();
	 System.out.println("Doe is a Patronus of Severus Snape and Lily Potter");
	}
	else if(c[0]==ss7)
	{
	 System.out.println("Your Patronus is a......");
	 s.nextLine();
	 System.out.println("WOLF");
	 s.nextLine();
	 System.out.println("Wolf is a Patronus of Remus Lupin");
	}
	else if(c[0]==ss8)
	{
	 System.out.println("Your Patronus is a......");
	 s.nextLine();
	 System.out.println("PHOENIX");
	 s.nextLine();
	 System.out.println("Phoenix is a Patronus of Albus Dumbledore");
	}
	System.out.println("******* *     * ******* *    * *  *    *     * ");
	System.out.println("   *    *     * *     * **   * * *     *     * ");
	System.out.println("   *    ******* ******* * *  * **      *     * ");
	System.out.println("   *    *     * *     * *  * * **      *     * ");
	System.out.println("   *    *     * *     * *   ** * *     *     * ");
	System.out.println("   *    *     * *     * *    * *  *    ******* ");
   }
   else
   {
	hp ob=new hp();
   }
  }
  else
  {
   System.out.println("Wrong choice");
   System.exit(0);
  }
 }
}
  
  
	
  
   