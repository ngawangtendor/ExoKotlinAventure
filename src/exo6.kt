import kotlin.math.max

/* les code pas sûr*/
fun bouleDeFeu(nomCaster : String,
               nomCible : String,
               scoreAttaque : Int,
               scoreDefense : Int,
               nombrePvCible : Int) : Unit{

    var valeurPv = nombrePvCible
    var des = lanceDes(scoreAttaque / 3,6 )
    des = des - scoreDefense
    // Remplace par 0 si des est negatif
    des = max(des,0)
    var nouveauPv = valeurPv - des
    if (nouveauPv < 0){
        nouveauPv = 0
    }
    var  degats = nombrePvCible - nouveauPv
    println("${nomCaster} lance une boucle de feu et inflige ${degats} " +
            "de dégats a ${nomCible}")


}
fun main(){
    bouleDeFeu("moi", "toi", 10, 5 ,20)
}