import scala.util.Try

object Test extends App {

  def hello = "Hi"

  println(hello)

  def lift[T,R](f:T=>R):Try[T]=>Try[R] = ???

}
