import java.util.Scanner;
class morse
{
 public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
  String n[]=new String[37];
  int b[]=new int[37];
  n[0]=".-";
  n[1]="-...";
  n[2]="-.-.";
  n[3]="-..";
  n[4]=".";
  n[5]="..-.";
  n[6]="--.";
  n[7]="....";
  n[8]="..";
  n[9]=".---";
  n[10]="-.-";
  n[11]=".-..";
  n[12]="--";
  n[13]="-.";
  n[14]="---";
  n[15]=".--.";
  n[16]="--.-";
  n[17]=".-.";
  n[18]="...";
  n[19]="-";
  n[20]="..-";
  n[21]="...-";
  n[22]=".--";
  n[23]="-..-";
  n[24]="-.--";
  n[25]="--..";
  n[26]=".----";
  n[27]="..---";
  n[28]="...--";
  n[29]="....-";
  n[30]=".....";
  n[31]="-....";
  n[32]="--...";
  n[33]="---..";
  n[34]="----.";
  n[35]="-----";
  n[36]="..--";
  String st;
  int i,j,k,l,z;
  int d=65;
  for(i=0;i<26;i++)
  {
   b[i]=d;
   d++;
  }
  int d1=48;
  for(i=26;i<36;i++)
  {
   b[i]=d1;
   d1++;
  }
  b[36]=0;
  char chh;
  System.out.println("Hello Guys!! Having a good day ehhh?");
  s.nextLine();
  System.out.println("Well Then!! Let's have fun with Morse Code");
  s.nextLine();
  System.out.println("Use the table if you need it");
  for(i=0;i<n.length-1;i++)
  {
   System.out.println(n[i]+"  --->  "+((char)b[i]));
  }
  System.out.println(n[36]+"  --->  Space");  
  System.out.println("Choose:-");
  System.out.println("1. Morse Code to English Language");
  System.out.println("2. English Language to Morse code");
  System.out.println("3. Not Interested in any");
  int ch=s.nextInt();
  if(ch==1)
  {
   System.out.println("Enter the morse code");
   s.nextLine();
   st=s.nextLine();
   String a[]=st.split(" ");
   for(i=0;i<a.length;i++)
   {
	for(j=0;j<n.length;j++)
	{
	 if((a[i]).equalsIgnoreCase(n[j])==true)
	 {
	  chh=(char)b[j];
	  System.out.print(chh);
	 }
	}
   }
  }
  else if(ch==2)
  {
   System.out.println("Enter a word or a phrase");
   s.nextLine();
   st=s.nextLine().toUpperCase();
   String a[]=st.split(" ");
   for(i=0;i<a.length;i++)
   {
	char ch2[]=a[i].toCharArray();
	for(j=0;j<ch2.length;j++)
	{
     z=ch2[j];
	 for(k=0;k<b.length;k++)
	 {
	  if(z==b[k])
	  {
	   System.out.print(n[k]+" ");
	   
	  }
	 }
	}
   }
   System.out.println("");
  }
  else
  {
   System.out.println("Go to HELL!!!");
  }
  
 }
}
	   
 	  
	
   
   
   
  