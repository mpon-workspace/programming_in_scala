def echo(arguments: String*) {
  for (arg <- arguments)
    println(arg)
}

echo()
echo("one")
echo("one", "two")

val arr = Array("What's", "up", "doc?")
echo(arr: _*)


def speed(distance: Float, time: Float): Float = distance / time

println(speed(100, 10))
println(speed(time = 10, distance = 100))


def printTime(out: java.io.PrintStream = Console.out) =
  out println "time = " + System.currentTimeMillis

printTime()

def printTime2(out: java.io.PrintStream = Console.out,
  divisor: Int = 1) =
    out.println("time = " + System.currentTimeMillis / divisor)

printTime2(out = Console.err)
printTime2(divisor = 1000)
