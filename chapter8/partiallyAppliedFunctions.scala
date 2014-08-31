val someNumbers = List(-11, -10, -5, 0, 5, 10)

// 引数をとってprintlnを実行する関数リテラル（無名関数）
println("(x: Int) => println(x)")
someNumbers.foreach((x: Int) => println(x))
println("(x) => println(x)")
someNumbers.foreach((x) => println(x))
println("x => println(x)")
someNumbers.foreach(x => println(x))


// 部分適用された関数
def sum(a: Int, b: Int, c: Int) = a + b + c

// 普通に呼ぶ
val result = sum(1, 2, 3)
println("sum(1,2,3)")
println(result)

// 引数を一切渡さない部分適用関数式
val f = sum _
println("f(1,2,3)")
println(f(1, 2, 3))

// 引数を2つだけ渡す部分適用関数式
val g = sum(1, (_: Int), 3)
println("g(2)")
println(g(2))

// 部分適用を使ってforeachを書き直す
// printlnに引数を一切渡さない部分適用関数式
println("println _")
someNumbers.foreach(println _)

// foreach呼び出しの場合は関数が必要ということが判断できるので
// アンダースコアは必要ない
println("println")
someNumbers.foreach(println)

