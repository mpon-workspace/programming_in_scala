import scala.io.Source

def widthOfLength(s: String) = s.length.toString.length

if (args.length > 0) {
  val file = args(0)
  val lines = Source.fromFile(file).getLines().toList
  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  )
  val maxWidth = widthOfLength(longestLine)
  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }
}
else
  Console.err.println("Please enter filename")
