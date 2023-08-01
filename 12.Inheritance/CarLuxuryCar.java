class Car 
{
    public void start()
    {
        System.out.println("Car start");
    }

    public void accelarate()
    {
        System.out.println("Car accelarate");
    }
    public void changeGear()
    {
        System.out.println("Car changeGear manual");
    }
}

class LuxuryCar extends Car
{   
    @Override
    public void start()
    {
        System.out.println("Luxury Car start");
    }

    @Override
    public void accelarate()
    {
        System.out.println("Luxury Car accelarate");
    }

    @Override
    public void changeGear()
    {
        System.out.println("Luxury Car changeGear automatic");
    }

    public void roofTop()
    {
        System.out.println("Luxury Car open roof");
    }
}

public class CarLuxuryCar {
    public static void main(String[] args) {

        LuxuryCar car1=new LuxuryCar();
        Car car2=new Car();

        car1.start();
        car2.start();

        car1.accelarate();

    }
}
