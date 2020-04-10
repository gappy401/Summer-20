import  java.util.*;
public class Ques1 {
int arr[];
int front;
int rear;
int max;
Ques1(int size)
{    arr=new int[size];
     front=0;
     rear=0;
     max=size;

}
public void push(int x)
	{
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}

       // System.out.println("Inserting " + x);
      
        arr[rear] = x;
        //System.out.println(front+ " "+rear);
        rear=(rear+1)%max;
        
        
	}

	public int pop()
	{
		
		if (isEmpty())
		{
			System.out.println("UnderFlow");
			System.exit(1);
		}

       
        int ret=arr[front];
        front=(front+1)%max;
       
	///	System.out.println(ret);
		return ret;
	}

	// Utility function to return top element in a stack
	public int peek()
	{
		if (!isEmpty())
			return arr[front];
		else
			System.exit(1);

		return -1;
	}

	// Utility function to return the size of the stack


	public Boolean isEmpty()
	{
        if((front)%max==rear )
        return true;
        else
        return false;
    }
	public Boolean isFull()
	{
		return (rear+1)%max==front ;	// or return size() == max;
	}





    public static void main(String args[])
    { Scanner s=new Scanner(System.in);
       int n= s.nextInt();
        Ques1 q=new Ques1(n);
        HashMap<Integer, Integer> map 
        = new HashMap<>(); 

        for(int i=0;i<n-1;i++)
        { int x=s.nextInt();
            q.push(x);
            map.put(x,i);
       
        }
        int x=s.nextInt();
       
        for (int i=0;i<n-1;i++)
        {     int max_pow=0;
            int max=0;
            int ar[]=new int[x];
            for(int j=0;j<x;j++)
            {
                int y=q.pop();
               
                System.out.print(y+ " ");
                if(y<1)
                {

                }

            else{
                y--;

            }
            ar[j]=y;
               
                if(y>max_pow)
                {
                   
                   
                    max_pow=y;
                   
                }
                
               
            }
            for(int o=0;o<x;o++)
                {
                    if(ar[o] !=max_pow)

                   {


                   }
                   else
                   {
                       q.push(-1);
                   }
                }
                System.out.println(max_pow);
            System.out.println(map.get(max_pow+i));

        }
       
       
        

      
       
       


    }

}