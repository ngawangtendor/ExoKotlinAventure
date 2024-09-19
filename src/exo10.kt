fun afficheIventaire(nomPersonnage : String,
                     inventaire : MutableList<String>){
    println("Inventaire de ${nomPersonnage}")
    for ((index , item) in inventaire.withIndex()){
        println("${index+1}, = ${item}")
    }

}
fun main(){
    val inventaire = mutableListOf("salut", "bonjour", "hello")
    afficheIventaire("dhikash",  inventaire)
}