public class BuilderBufferString {
    public static void main(String[] args) {
        String str1=new String("Miss");
        StringBuffer str2=new StringBuffer("Miss");
        StringBuilder str3=new StringBuilder("Taylor");

        /* System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3); */
        
        /* str1.concat(" Americana");
        str2.append(" Americana");
        str3.append(" Americana"); */

        System.out.println(str1.concat(" Americana"));
        System.out.println(str2.append(" Americana"));
        System.out.println(str3.append(" Americana"));

        System.out.println(str2.capacity());
        System.out.println(str3.capacity());

    }
}
