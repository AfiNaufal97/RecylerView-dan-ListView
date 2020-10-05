package id.ac.politeknikharber.latihanrecylerview

object DataUsers {
    private val isiData = arrayOf(
        "Alpha","Bravo","charlie","Delta","Echo","Foxtrot","Golf","Hotel","India","Juliet"
    )

    private val isiFoto = R.drawable.android
    // getter
    val dataLengkap:ArrayList<Users>
        get(){
            val penyimpanan:ArrayList<Users> = arrayListOf()
            for(i in isiData.indices){
                val user = Users()
                user.isi = isiData[i]
                user.foto = isiFoto
                penyimpanan.add(user)
            }
            return penyimpanan
        }
}