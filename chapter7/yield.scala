// カレントディレクトリのファイル一覧
// Array[File]
val filesHere = (new java.io.File(".")).listFiles

// ファイルの中身を行ごとのリストで取得
def fileLines(file: java.io.File) =
  scala.io.Source.fromFile(file).getLines().toList

// .scalaファイルだけを取得する
// yieldのあとがfileと指定している
// Array[File]からArray[File]を生成する
def scalaFiles = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

// .scalaファイルでパターンにマッチする行を取得する
// yieldのあとが行の文字数を指定しているので
// Array[File]からArray[Int]が生成される
def forLineLengths =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
      line <- fileLines(file)
      trimmed = line.trim
      if trimmed.matches(".*for.*")
  } yield trimmed.length

scalaFiles.foreach(println)
println(scalaFiles.getClass)
forLineLengths.foreach(println)
println(forLineLengths.getClass)
