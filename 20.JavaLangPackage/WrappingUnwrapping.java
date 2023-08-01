public class WrappingUnwrapping {
    public static void main(String[] args) {
        //Integer

        /* Integer i1=Integer.valueOf(1);//wrapping 10 in 'i1'
        Integer i2=2;//wrapping 10 in 'i2'

        int int3=3;
        Integer j=Integer.valueOf(int3);//wrapping value of int3 in 'j'

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(j); 
        
        int unwrapped_int3=j;//auto-unboxing
        System.out.println(unwrapped_int3); */

        //Byte

        /* Byte b1=Byte.valueOf("23");//wrapping 23 in 'b1'
        Byte b2=87;//wrapping 87 in 'b2'

        byte b3=63;
        Byte k=Byte.valueOf(b3);//wrapping b3 by 'k'

        /* byte unwrapped_b3=k.byteValue();//manual unboxing
        System.out.println(unwrapped_b3); */

        /* byte unwrapped_b3=k;//auto-unboxing
        System.out.println(unwrapped_b3); */

        //Float

        Float f1=Float.valueOf("123.35");//wrapping 123.35 in 'f1'
        Float f2=45.9f;//wrapping 45.9 in 'f2'

        float f3=208.33f;
        Float f4=Float.valueOf(f3);//wrapping f3 in 'f4'

        float unwrapped_f1=f1;//auto-unboxing 
        float unwrapped_f2=f2.floatValue();//manual-unboxing
        System.out.println(unwrapped_f1);
        System.out.println(unwrapped_f2);



    }
}
