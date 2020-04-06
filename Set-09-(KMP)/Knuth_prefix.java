import java.util.*;
public class Knuth_prefix
{   public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String lookup =sc.next();
        String  word =sc.next();
        int m=word.length();
        int i=1,j=0;
        char pref[]=new char[lookup.length()];
        int n = lookup.length();
        pref=lookup.toCharArray();
        
        int pre[]=new int [n];
        pre[0]=0;
        while(i<n)
        {
        if(pref[i]==pref[j])
        {
            pre[i]=pre[j]+1; 
            i++;
            j++;

        }
        else 
        {
            if(j!=0)
            {
                j=pre[j-1]; //keep reaching to index of j-1 and set as j
            }
            else

            {
                pre[i]=0; //if j is 0 set i also to 0 and icrement i 
                    i++;
            }
        }

            
        }
        //for(int q=0;q<n;q++)
        //System.out.println(pre[q]);
    char wor[]=new char[m];
    wor=word.toCharArray();
      int a=0;
      int b=0; //a for wor max limit m , b for pre and max is n
      while(a<m)
      {
          if(pref[b]==wor[a])
          {
              a++;
              b++;

          }
          if(b==n)
          {
              System.out.println(a-b);
              b=pre[b-1];

          }
          else if(pref[a]!=wor[b] && a<m)
          {
              if(b!=0)
              {
                  b=pre[b-1];
              }
              else
                a=a+1;

          }
          
      }




    
        sc.close();

    }

}