fun invocationArme(nomCaster : String,
                   typeArme : String) : Unit{
    var score = lanceDes(1,20)
    var laQualite : String
    if (score < 5){
        laQualite = "l'arme est commune"
    }else if (score < 10){
        laQualite = "l'arme est rare"
    }else{
        laQualite = "l'arme est épic"
    }
    if (score in 15..20){
        laQualite = "l'arme est légendaire"
    }
    println("${nomCaster} invoque un ${typeArme} ${laQualite} ")
}
fun main(){
    invocationArme("dhikash", "inde")
}