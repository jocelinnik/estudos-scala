import java.io._

object Script extends App {
    val arquivos = new File(".").listFiles()
    val extensoesImgs = List(".jpg", ".jpeg", ".gif", ".png")

    def ehImagem(nomeArq: String) = extensoesImgs.exists(nomeArq.endsWith(_))

    arquivos.filter(arq => ehImagem(arq.getName)).foreach(_.delete)
}
