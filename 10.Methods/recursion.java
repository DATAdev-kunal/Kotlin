public class recursion {
    static void fun(int n)
    {
        if(n>0)
        {
            System.out.print(n+ " ");
            fun(n-1);
        }
    }
    static void recu(int n)
    {
        if(n>0)
        {
            recu(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        fun(8);
        System.out.println("");
        recu(8);
        System.out.println("");
    }
}
