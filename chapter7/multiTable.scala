// 1段分をシーケンスとして返す
// 例: 5の段
// ("   5", "  10", "  15",...
// yieldによってRangeがSeq[String]になる
def makeRowSeq(row: Int): Seq[String] =
  for (col <- 1 to 10) yield {
    val prod = (row * col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }

// 1段分を文字列として返す
// 例: 5の段
// "   5  10  15  20  25....
def makeRow(row: Int): String = makeRowSeq(row).mkString

// 1行に1段分の文字列を収めた表を返す
def multiTable(): String = {
  val tableSeq = // 各段の文字列のシーケンス
    for (row <- 1 to 10) yield makeRow(row)
  
  tableSeq.mkString("\n")
}

println(multiTable)
