import java.math.*;
public class MathPackage {
    public static void main(String[] args) {
        int a=-436;
        System.out.println(Math.abs(a));

        int b=27;
        System.out.println(Math.cbrt(b));

        int c=7;
        System.out.println(Math.decrementExact(c));

        //float d=12.3258f;
        float d=1232.58f;
        System.out.println(Math.getExponent(d));

        int e=59;
        System.out.println(Math.floorDiv(e,8));

        int f=1;
        System.out.println(Math.exp(f));
        System.out.println(StrictMath.exp(f));

        int g=10000;
        System.out.println(Math.log10(g));

        int h=436;
        System.out.println(Math.max(h,43));

        int i=45;
        System.out.println(Math.tan(i*Math.PI/180));

        int j=180;
        System.out.println((float)Math.toRadians(j));

        float k=3.1415927f;
        System.out.println(Math.toDegrees(k));

        int l=1;
        System.out.println(Math.toDegrees(Math.tanh(l)));
        System.out.println(StrictMath.toDegrees(Math.tanh(l)));

        System.out.println(Math.random());
        System.out.println(Math.random()*10000);

        int m=2;
        System.out.println(Math.pow(m,4));

        int n=25;
        System.out.println(Math.multiplyExact(n,4));

        float o=12.5f;
        System.out.println(Math.nextAfter(o,11));
        System.out.println(Math.nextAfter(o, 13));

    }
}
