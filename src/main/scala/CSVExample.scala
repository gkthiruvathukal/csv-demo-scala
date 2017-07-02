import com.github.tototoshi.csv._
import java.io._

object Main extends App {
  val reader = CSVReader.open(new File("data/sample.csv"))
  val items = reader.all()
  items foreach println
}
