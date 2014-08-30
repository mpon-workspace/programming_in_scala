import ChecksumAccumulator.calculate

object FallWinterSpringSummer extends App {
  // instead of main function
  for (season <- List("fall", "winter", "spring"))
    println(season + ": " + calculate(season))
}
