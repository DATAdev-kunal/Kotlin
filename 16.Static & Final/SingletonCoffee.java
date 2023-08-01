class CoffeeMachine
{
    private float coffeeQty;
    private float waterQty;
    private float sugarQty;
    private float milkQty;

    static private CoffeeMachine our=null;

    
    /* private CoffeeMachine() 
    {
        coffeeQty=1;
        waterQty=2;
        sugarQty=3;
        milkQty=4;
    } */


    static public CoffeeMachine getInstance()
    {
        if(our==null)
            our=new CoffeeMachine();
        return our;
    }


}

public class SingletonCoffee {
    public static void main(String[] args) {

        CoffeeMachine c1= CoffeeMachine.getInstance();
        CoffeeMachine c2= CoffeeMachine.getInstance();
        CoffeeMachine c3= CoffeeMachine.getInstance();
        CoffeeMachine c4= CoffeeMachine.getInstance();


        System.out.println(c1+" "+c2+" "+c3+" "+c4);
        if(c1==c2 &&c2==c3&&c3==c4)
        {
            System.out.println("all same");
        }
    
    }
}
