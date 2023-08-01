class Stack
{
    public int size,top=-1;
    public int []arr;

    public Stack(int size)
    {
        arr=new int[size];
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int pop()throws StackUnderFlow
    {
        int x=-1;
        if(top==-1)
        {
            throw new StackUnderFlow();
        }
        x=arr[top];
        top--;
        return x;
    }
    
    public void push(int n)throws StackOverFlow
    {
        if(top==arr.length-1)
        {
            throw new StackOverFlow();
        }
        top++;
        arr[top]=n;
    
    }
    
}

class StackOverFlow extends Exception
{
    public String toString()
    {
        return "Stack Full";
    }
}
class StackUnderFlow extends Exception
{
    public String toString()
    {
        return "Stack empty";
    }
}
public class StackException {
    public static void main(String[] args) {
        Stack s=new Stack(1);
        
        /* try
        {
            s.push(10);
            s.push(20);
            s.push(30);
            s.push(40);
            s.push(50);
            s.push(60);
            

        }
        catch(StackOverFlow err)
        {
            System.out.println(err);
        } */
        
        
        /* for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
        } */
        /* System.out.println("");
        System.out.println(s.arr[0]);
        System.out.println(s.arr[1]);
        System.out.println(s.arr[2]);
        System.out.println(s.arr[3]);
        System.out.println(s.arr[4]); */
        //System.out.println(s.arr[5]);

        try
        {
            s.pop();
            s.pop();
            s.pop();
            
        }
        catch(StackUnderFlow err)
        {
            System.out.println(err.getMessage());
        }
        System.out.println("");

        
    }
}