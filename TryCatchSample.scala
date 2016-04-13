
object TryCatch {
	/** Usage: scala rounding.TryCatch filename1 filename2 ... */
	def main(args: Array[String]) = {
		/*args foreach (arg => countLines(arg))*/
		val args = Array{"text.txt"}
		args foreach (arg => countLines(arg))
	}
import scala.io.Source
import scala.util.control.NonFatal
	def countLines(fileName: String) = {
		println() // Add a blank line for legibility
		var source: Option[Source] = None
		try {
			source = Some(Source.fromFile(fileName))
			val size = source.get.getLines.size
			println(s"file $fileName has $size lines")
		} catch {			
			case NonFatal(ex) => println(s"Non fatal exception! $ex")
		} finally {
			for (s <- source) {
			println(s"Closing $fileName...")
			s.close
			}
		}
	}
}

/*
why for comprehension at the finally block?

This is a widely used idiom; use a for comprehension when you need
to test whether an Option is a Some , in which case you do some work,
or is a None , in which case you ignore it.
*/