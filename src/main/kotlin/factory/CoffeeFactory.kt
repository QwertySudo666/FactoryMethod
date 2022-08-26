package factory

import entity.*

class CoffeeFactory {
    fun makeCoffee(coffeeType: CoffeeType): Coffee {
        return when (coffeeType) {
            CoffeeType.AMERICANO -> AmericanoCoffee()
            CoffeeType.ESPRESSO -> EspressoCoffee()
            CoffeeType.LATTE -> LatteCoffee()
        }
    }
}