public class NotReeseFactory implements ChocolateFactory
{

    @Override
    public Chocolate createChocolate() 
    {
        System.out.println("Combining peanut butter and chocolate...");
        return new NotReeses();
    }

 
    
}
