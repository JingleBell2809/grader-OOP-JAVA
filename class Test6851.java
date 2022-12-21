class Test6851
{
    public static void main(String[] args)
    {
        Object fruit = new Fruit();
        Object apple = new (Apple)fruit;
    }
}
class Fruit
{
}
class Apple extends Fruit
{
}
