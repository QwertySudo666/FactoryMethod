import entity.CoffeeType
import factory.CoffeeFactory

fun main() {
    val coffeeFactory = CoffeeFactory()
    val latte = coffeeFactory.makeCoffee(CoffeeType.LATTE)
    val espresso = coffeeFactory.makeCoffee(CoffeeType.ESPRESSO)
    val americano = coffeeFactory.makeCoffee(CoffeeType.AMERICANO)

    println("You are drinking ${latte.getCoffeeName()}")
    println("You are drinking ${espresso.getCoffeeName()}")
    println("You are drinking ${americano.getCoffeeName()}")
}