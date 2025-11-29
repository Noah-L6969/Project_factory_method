public class EasterBunnyFactory implements ChocolateFactory 
{

    @Override
    public Chocolate createChocolate() 
    {
        System.out.println("Pouring into bunny mold...");
        return new EasterBunny();
    }

   
     
}
