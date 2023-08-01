class HondaCity 
{
    static double price=10;
    int a,b;
}
public class StaticKeyword {
    public static void main(String[] args) {
        HondaCity car1=new HondaCity();
        System.out.println(car1.price);
        
        System.out.println(HondaCity.price);
        
    }
}
