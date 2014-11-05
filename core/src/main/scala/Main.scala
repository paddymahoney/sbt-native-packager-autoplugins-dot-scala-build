object Main extends App {
 println("core main is running!")
 for {
  x <- 1 to 100
  } yield {
  println(x)
  }
}
