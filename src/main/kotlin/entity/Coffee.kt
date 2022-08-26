package entity

interface Coffee {
    fun getIngredients(): List<Ingredient>
    fun getCoffeeName(): String
}