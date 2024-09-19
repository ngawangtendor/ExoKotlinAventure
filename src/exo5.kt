/* 11*/
fun boirePotion(personnageNomCible : String, pvCible : Int, pvMaxCible : Int,
                puissancePotion :Int) : Int{
    var exPV = pvCible
    var potion = puissancePotion +pvCible
    if (potion > pvMaxCible){
        potion = pvMaxCible
    }
    var difPv = potion -exPV
    println("${personnageNomCible} boit une potion est récupere ${difPv} PV")
    return exPV
}
fun main(){
    boirePotion("dhikash", 18,20,6)
}