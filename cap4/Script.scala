object Script extends App {
    class Foto(val id: Int, val owner: String, val title: String, val farm: Int)
    object Foto {

        def apply(id: Int, owner: String, title: String, farm: Int) = new Foto(id, owner, title, farm)

        def unapply(foto: Foto): Option[(Int, String, String, Int)] = Some(
            (
                foto.id, 
                foto.owner, 
                foto.title, 
                foto.farm
            )
        )
    }

    val foto1 = Foto(1, "jcranky", "foto do jcranky", 7)
    val foto2 = Foto(2, "vampeta", "foto do vampeta daquele jeito", 7)
    val foto3 = Foto(3, "jcranky", "foto do jcranky 2", 6)

    val fotos = List(foto1, foto2, foto3)

    val fotoUm = fotos(0)

    println(fotoUm)
}
