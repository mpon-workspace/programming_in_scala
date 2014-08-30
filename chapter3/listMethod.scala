val emptyList = List()
val coolList = List("Cool", "tools", "rule")
val thrill = "Will" :: "fill" :: "until" :: Nil
val abcd = List("a", "b") ::: List("c", "d")
val until = thrill(2)
val countOfLengthIs4 = thrill.count(s => s.length == 4)
val dropHeadList = thrill.drop(2)
val dropTailList = thrill.dropRight(2)
val untilIsExist = thrill.exists(s => s == "until")
val lengthIs4List = thrill.filter(s => s.length == 4)
val isAllEndsWithL = thrill.forall(s => s.endsWith("l"))
val head = thrill.head
val init = thrill.init
val isEmpty = thrill.isEmpty
val last = thrill.last
val length = thrill.length
val addYList = thrill.map(s => s + "y")
val commaString = thrill.mkString(", ")
val lengthIsNot4List = thrill.filterNot(s => s.length == 4)
val reverse = thrill.reverse
val sort = thrill.sortWith((s, t) => s.charAt(0).toLower < t.charAt(0).toLower)
val tail = thrill.tail

println(
  emptyList, coolList, thrill,
  abcd, until, countOfLengthIs4,
  dropHeadList, dropTailList,
  untilIsExist, lengthIs4List, isAllEndsWithL,
  head, init, isEmpty, last, length,
  addYList, commaString, lengthIsNot4List,
  sort, tail
)

println("------foreach-------")
thrill.foreach(s => print(s))
println()
thrill.foreach(print)
println()
