import kotlin.random.Random

/* 32min */
fun lanceDes(nombreDes : Int, nombreFace : Int) : Int{

    var nombredefois = List(nombreDes) {
        Random.nextInt(1, nombreFace + 1)
    }
    var total = 0
    for (fin in nombredefois) {
        total += fin
    }

    return total
}

fun main(){
    println(lanceDes(nombreDes = 4, nombreFace = 20))
}