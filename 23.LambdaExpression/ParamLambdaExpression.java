@FunctionalInterface
interface ParamLambda 
{
    public int add(int x, int y);
}

public class ParamLambdaExpression {
    public static void main(String[] args) {



        /**********************************************/
/*******/       ParamLambda pl1=(a,b)->{return a+b;};  /*******/
/*******/                   //OR                       /*******/
/*******/       ParamLambda pl2=(c,d)->c+d;            /*******/
        /**********************************************/


        System.out.println(pl1.add(3, 7));
        System.out.println(pl2.add(6, 10));

    }
}
