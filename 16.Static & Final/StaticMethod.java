class HondaCar
{
    static double price=10;
    int a,b;

    static double onRoadPrice(String city)
    {
        if(city=="delhi")
        {
            price=price+price*0.10;
            
        }
        else if(city=="mumbai")
        {
            price=price+price*0.09;
        }
        return price;
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        System.out.println(HondaCar.onRoadPrice("delhi"));
    }
}
