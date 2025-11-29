// Abstract factory: produces a family of related products
public interface ChocolateFactory 
{
    Chocolate createChocolate();
    // New abstract product in the family
    Wrapper createWrapper();
}