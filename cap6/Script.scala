case class Foto(id: String, owner: String, server: Int, title: String)

object ExecutorExemplos {
    def executarSets() = {
        val foto1 = new Foto("id1", "jcranky", 1, "uma foto do jcranky")
        val foto2 = new Foto("id2", "jcranky", 1, "uma foto do jcranky")
        val foto3 = new Foto("id3", "jcranky", 1, "uma foto do jcranky")

        val fotos = Set(foto1, foto2, foto3, foto1)

        val foto4 = new Foto("id4", "jcranky", 1, "uma foto do jcranky")
        val novasFotos = fotos + foto4

        val menosFotos = fotos - foto1

        fotos.foreach(println)
        println()
        novasFotos.foreach(println)
        println()
        menosFotos.foreach(println)
    }

    def executarLists() = {
        val foto1 = new Foto("id1", "jcranky", 1, "uma foto do jcranky")
        val foto2 = new Foto("id2", "jcranky", 1, "uma foto do jcranky")
        val foto3 = new Foto("id3", "jcranky", 1, "uma foto do jcranky")

        // val fotos = List(foto1, foto2, foto3, foto1)
        // val fotos = foto1 :: foto2 :: foto3 :: foto1 :: Nil
        val fotos = Nil.::(foto1).::(foto3).::(foto2).::(foto1)

        def printaLista(lista: List[Foto]): Unit = {
            lista match {
                case head :: Nil => println(head)
                case head :: tail => 
                    println(head)
                    printaLista(tail)
                case Nil =>
            }
        }

        printaLista(fotos)
    }

    def executarTuplas() = {
        val dadosFoto = (123, "jcranky", "reunião dos scaladores")

        println(s"id: ${dadosFoto._1} - owner: ${dadosFoto._2} - title: ${dadosFoto._3}")
    }

    def executarMaps() = {
        val services = Map(
            ("busca", "flickr.photos.search"),
            ("tamanhos", "flickr.photos.getSizes")
        )
        val services2 = Map(
            "busca" -> "flickr.photos.search",
            "tamanhos" -> "flickr.photos.getSizes"
        )
        val novosServices = services + ("untagged" -> "flickr.photos.getUntagged")
        val menosServices = services - "busca"
        val servicesAtualizados = services.updated("busca", "flickr.photos.newSearch")

        val metodoBusca = services("busca")
        val metodoBuscaOpt = services.get("busca")
        val metodoBuscaOpt2 = services.getOrElse("busca", "método padrão")

        println(services == services2)
        println(metodoBusca)
        println(metodoBuscaOpt)
        println(metodoBuscaOpt2)
        println()
        services.foreach(println)
        novosServices.foreach(println)
        menosServices.foreach(println)
        servicesAtualizados.foreach(println)
    }

    def executarArrays() = {
        val foto1 = new Foto("id1", "jcranky", 1, "uma foto do jcranky")
        val foto2 = new Foto("id2", "jcranky", 1, "uma foto do jcranky")
        val foto3 = new Foto("id3", "jcranky", 1, "uma foto do jcranky")

        val fotos = Array(foto1, foto2, foto3, foto1)

        println(fotos(0))
    }
}

object Script extends App {
    // ExecutorExemplos.executarSets()
    // ExecutorExemplos.executarLists()
    // ExecutorExemplos.executarTuplas()
    // ExecutorExemplos.executarMaps()
    ExecutorExemplos.executarArrays()
}
