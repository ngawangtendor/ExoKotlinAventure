fun calculDefenseTotal(defense : Int, typeArmure : Int, qualite : Int): Int{

    val total = defense + typeArmure + qualite
    return total
}

fun main() {
    println(calculDefenseTotal(3,2,1))

}
