Project: Abstract Factory - Chocolate Demo

This small demo shows an Abstract Factory that produces a family of related products.

Products:
- Chocolate (product interface)
- Wrapper (new product interface added to demonstrate multiple product abstractions)

Factories:
- `EasterBunnyFactory` produces an `EasterBunny` (Chocolate) and `BunnyWrapper` (Wrapper)
- `NotReeseFactory` produces a `NotReeses` (Chocolate) and `ReeseWrapper` (Wrapper)

How to compile and run (Linux / zsh):

1. Compile:
   javac *.java

2. Run Bunny factory demo:
   java FactoryDemo bunny

3. Run Reese factory demo (default):
   java FactoryDemo reese

This demonstrates the Abstract Factory requirement of producing multiple related products, and the client (`FactoryDemo`) depends only on the abstract factory and product interfaces.
