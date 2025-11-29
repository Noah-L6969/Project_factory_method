/**
 * Small demo to show the abstract factory producing two product types.
 * Usage:
 *   java FactoryDemo bunny
 *   java FactoryDemo reese
 */
public class FactoryDemo {
    public static void main(String[] args) {
        ChocolateFactory factory;

        if (args.length > 0 && args[0].equalsIgnoreCase("bunny")) {
            factory = new EasterBunnyFactory();
            System.out.println("Selected EasterBunnyFactory");
        } else {
            factory = new NotReeseFactory();
            System.out.println("Selected NotReeseFactory (default)");
        }

        Chocolate choc = factory.createChocolate();
        Wrapper wrap = factory.createWrapper();

        // demonstrate product creation and their related wrapper
        choc.create();
        wrap.wrap();
    }
}
