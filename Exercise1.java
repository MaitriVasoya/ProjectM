import java.util.*;
import java.io.*;
public class Exercise1 {
    public static void main(String args[]) throws IOException
    {
        Scanner s = new Scanner(System.in);
        HashMap<String, String> hash1 = new HashMap<String, String>();
        HashMap<String, String> hash2 = new HashMap<String, String>();
        String first, last, username, pwd;
        String fname=s.next();
        File file=new File(fname);
        Scanner reader=new Scanner(file);
        while(reader.hasNext())
        {
            first=reader.next();
            last=reader.next();
            username=reader.next();
            pwd=reader.next();
            hash1.put(username,pwd);
            hash2.put(username,first+" "+last);
        }
        reader.close();
        int c=1;
        do
        {
            System.out.print("Enter username: ");
            username=s.next();
            System.out.println("");
            if(hash1.containsKey(username))
            {
                    System.out.print("Enter Password: ");
                    pwd=s.next();
                    String temp_pwd=hash1.get(username);
                    if(temp_pwd.equals(pwd))
                    {
                        System.out.println("Login successful\nWelcome "+hash2.get(username));
                        c=4;
                    }
                    else
                    {
                        if(c!=3)
                        {
                            System.out.println("Either the username or password is incorrect. You have "+ (3-c) +" more attempts.");
                        }
                        else
                        {
                            System.out.println("Sorry. Incorrect login. Please contact the system administrator.");
                        }
                        c++;
                    }
            }
        }while(c<=3);

;    }
}