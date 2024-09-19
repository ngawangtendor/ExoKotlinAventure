import kotlin.math.max

fun missileMagique(
    nomCaster: String,
    nomCible: String,
    scoreAttaqueCaster: Int,
    scoreDefenseTotalCible: Int,
    nombrePvCible: Int
): Unit {
    var nouveauPv = nombrePvCible
    repeat(scoreAttaqueCaster / 2) {

        var degats = lanceDes(1, 6)
        degats-= scoreDefenseTotalCible
        degats= max(degats,0)
        println(
            "${nomCaster} lance une missile magique et inflige " +
                    "${degats} points de dégâts a ${nomCible}"
        )
        if(nouveauPv<0){
            nouveauPv=0
        }
    }

}
fun main(){
    missileMagique("dhikask", "moi", 5,
        4,5)
}