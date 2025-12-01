public class EasterBunnyFactory implements ChocolateFactory 
{

    @Override
    public Chocolate createChocolate() 
    {
        System.out.println("Pouring into bunny mold...");
        return new EasterBunny();
    }

    @Override
    public Wrapper createWrapper()
    {
        System.out.println("Selecting bunny-themed wrapper...");
        return new BunnyWrapper();
    }
   
     
}
