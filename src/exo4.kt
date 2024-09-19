/* 29 */
fun attaque(pvCible : Int, degatArme: Int, defenceCible : Int,nomCible:String, nomAttaquant:String) : Int{

    var total = degatArme - defenceCible
    if (total <= 0){
        total = 0
    }
    var pvRestant= pvCible-total

    var fin = pvCible-pvRestant

    println("${nomAttaquant} attaque ${nomCible} pour ${fin} point de dégats")
    return fin
}

fun main(){
    println( attaque(15,4,3, "lui", "moi"))
}