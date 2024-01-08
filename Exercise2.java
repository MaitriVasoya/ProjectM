import java.util.*;
import java.io.*;
public class Exercise2
{
    public static void main(String args[])
    {
        try
        {
            Scanner s=new Scanner(System.in);
            Queue<Integer> queue=new LinkedList<>();
            String fname=s.next();
            File file=new File(fname);
            Scanner reader=new Scanner(file);
            int num=reader.nextInt();
            reader.nextLine();
            int temp[][]=new int[num][num];
            while(reader.hasNextLine())
            {
                String words[]=reader.nextLine().split(" ");
                int ver0=words[0].charAt(0)-'A';
                int ver1=words[0].charAt(0)-'A';
                temp[ver0][ver1]=1;
            }

            for(int i = 0; i < num; i++){
                for(int j = 0; j < num; j++){
                    System.out.print(temp[i][j] + " ");
                }
                System.out.println();
            }
            List<Integer> res=new ArrayList<>();
            int degree[]=new int[num];
            for(int i=0;i<num;i++)
            {
                for(int j=0;j<num;j++)
                {
                    degree[j]+=temp[i][j];
                }
            }
            for(int i=0;i<num;i++)
            {
                if(degree[i]==0)
                {
                    queue.add(i);
                }
            }
            int topnum=1;
            while(!queue.isEmpty())
            {
                int temp2=queue.poll();
                degree[temp2] = topnum;
                topnum++;
                for(int i=0;i<num;i++)
                {
                    if(temp[temp2][i]==1);
                    {
                        degree[i]--;
                        if(degree[i]==0)
                        {
                            queue.add(i);
                        }
                    }
                }

            }
            System.out.println("topnum: ");

            for(int i = 1; i <= num; i++){
                for(int j = 0; j < num; j++){
                    if(degree[j] == i){
                        System.out.print((char)(j +'A')+" ");
                    }
                }
            }
        }catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }

    }
}
