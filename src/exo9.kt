fun soins(nomCaster : String,
          scoreAttaqueCaster : Int,
          pvCible : Int,
          pvMixiCible : Int,
          ismortOuVivant : Boolean) : Unit{

    var scoreSoin = scoreAttaqueCaster / 2
    var pvRestants = pvCible
    if (ismortOuVivant == true)  {
        var degats = scoreAttaqueCaster
        pvRestants = (pvRestants - degats)
        if (pvRestants < 0){
            pvRestants = 0
            println(" scoreSoin true${nomCaster}, ${pvRestants}, ${scoreSoin}")
        }
    }else {
        var degatsss = scoreAttaqueCaster
        pvRestants = (pvRestants + degatsss)
        if (pvRestants > pvMixiCible){
            pvRestants = pvMixiCible
            println(" scoreSoin false${nomCaster}, ${pvRestants}, ${scoreSoin}")
        }
    }
}
fun main(){
    soins("dhikash", 10, 2, 15, true)
}