import java.util.Properties

object ClienteFlickr extends App {
    // val props = new Properties()
    // props.load(getClass.getClassLoader.getResourceAsStream("config.properties"))

    // val apiKey = props.getProperty("flickr.api.key")
    // val method = "flickr.photos.search"
    // val tags = "scala"
    // val url = s"https://api.flickr.com/services/rest/?method=$method&api_key=$apiKey&tags=$tags"

    // scala.io.Source.fromURL(url).getLines().foreach(println)

    // val fotos = parseiaResultado(resultadoServico)
    // val countFotosFarm7 = fotos.count(foto => foto.farm == 7)

    val caller = new FlickrCaller("apiKey")
    println(caller.apiKey)
}
