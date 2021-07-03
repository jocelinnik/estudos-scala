case class Foto(id: String, owner: String, server: Int, title: String, tags: Option[List[String]])

object Funcoes {
    def funcao_ordenacao() = {
        def ehMaior(x: Int, y: Int) = x < y

        val numeros = List(1, 3, 5, 2, 4)
        val ordenada = numeros sortWith ehMaior

        println(ordenada)
    }

    def funcao_filter_find() = {
        def fotoJCranky(foto: Foto) = foto.owner == "jcranky"
        def fotoDe(owner: String, foto: Foto) = foto.owner == owner

        val foto1 = new Foto("id1", "jcranky", 1, "uma foto do jcranky", None)
        val foto2 = new Foto("id2", "macacoinfinito", 1, "uma foto do jcranky", None)
        val foto3 = new Foto("id3", "jcranky", 1, "uma foto do jcranky", None)

        val fotos = List(foto1, foto2, foto3)
        // val fotosDoJCranky = fotos.filter(fotoJCranky)
        val fotosDoJCranky = fotos.filter(fotoDe("jcranky", _))
        // val fotosDoJCranky = fotos filter fotoJCranky
        val fotoDoJCrankyOpt = fotos find fotoJCranky

        // println(fotosDoJCranky)
        println(fotoDoJCrankyOpt)
    }

    /*def funcao_map_list() = {
        def geraLi(foto: Foto): scala.xml.Elem = <li>{foto.title}</li>

        val foto1 = new Foto("id1", "jcranky", 1, "uma foto do jcranky", None)
        val foto2 = new Foto("id2", "macacoinfinito", 1, "uma foto do jcranky", None)
        val foto3 = new Foto("id3", "jcranky", 1, "uma foto do jcranky", None)

        val fotos = List(foto1, foto2, foto3)

        // val lis = fotos map geraLi
        val html = 
            <html>
                <body>
                    <ul>
                        {fotos map geraLi}
                    </ul>
                </body>
            </html>
        
        println(html)
    }*/

    def funcao_map_option() = {
        val foto = new Foto("id1", "jcranky", 1, "uma foto do jcranky", None)

        val tagsText = foto.tags.map(tags => tags.mkString(",")).getOrElse("")

        println(tagsText)
    }

    def funcao_flat_map() = {
        def buscarFotos(tag: Option[String]): List[Foto] = ???

        val tags = List("scala", "java", "typesafe")
        val fotos = tags.flatMap(tag => buscarFotos(Some(tag)))
    }

    def funcao_fold_reduce() = {
        val numeros = List(1,2,3,4,5)
        val soma = numeros.reduceLeft((acumulado, x) => acumulado + x)

        def somar(x: Int, y: Int) = x + y
        val somaManual = somar(somar(somar(somar(1, 2), 3), 4), 5)

        val foto1 = new Foto("id1", "jcranky", 1, "uma foto do jcranky", Some(List("livro", "scala")))
        val foto2 = new Foto("id2", "macacoinfinito", 1, "uma foto do jcranky", Some(List("scala", "jcranky")))
        val foto3 = new Foto("id3", "jcranky", 1, "uma foto do jcranky", Some(List("livro", "jcranky")))

        val fotos = List(foto1, foto2, foto3)
        val tags = fotos.foldLeft(Set.empty[String])((tags, foto) => foto.tags.map(tags ++ _).getOrElse(tags))

        // println(soma)
        // println(somaManual)
        println(tags)
    }
}

object Script extends App {
    // Funcoes.funcao_ordenacao()
    // Funcoes.funcao_filter_find()
    // Funcoes.funcao_map_list()
    // Funcoes.funcao_map_option()
    Funcoes.funcao_fold_reduce()
}
