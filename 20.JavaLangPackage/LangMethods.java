public class LangMethods {
    public static void main(String[] args) {
        Float a=23.8f;//wrapped 23.8 in 'a'
        Float b=24.2f;//wrapped 24.2 in 'b'
        //System.out.println(a.equals(b));

        Float c=8/0f;
        //System.out.println(c.isInfinite());
        System.out.println(c==Float.POSITIVE_INFINITY);

        Float d=(float)Math.sqrt(-1);
        //System.out.println(d.isNaN());


        
    }
}
