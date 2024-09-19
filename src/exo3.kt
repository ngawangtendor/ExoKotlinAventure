import kotlin.random.Random

/* 50*/
fun calculDegatArme(nombreDes : Int, nombreFace : Int, qualiteArme : Int,
                    seuilActivation : Int, multiplicateur : Int)  : Int{

    var total = lanceDes(nombreDes,nombreFace)

    if (total >= seuilActivation){
        total = total * multiplicateur
    }
    total+= qualiteArme
    if (total < 0){
        total = 0
    }
    return total
}
fun main(){
    println( calculDegatArme(2,4,2,10,2))
}