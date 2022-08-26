package entity

class LatteCoffee : Coffee {
    val ingredientsList: MutableList<Ingredient> = mutableListOf()
    override fun getIngredients(): List<Ingredient> {
        return ingredientsList
    }

    override fun getCoffeeName(): String {
        return "Latte"
    }
}