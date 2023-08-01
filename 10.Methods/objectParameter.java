public class objectParameter {
    void update(int x[])
    {
        x[0]=756;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};

        objectParameter up= new objectParameter();
        up.update(arr);

        for(int x:arr)
            System.out.print(x+" ");

        System.out.println("");
    }
}
