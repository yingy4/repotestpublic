import scala.util.Try

object Test extends App {

  def hello = "Hi"

  println(hello)

  def lift[T,R](f:T=>R):Try[T]=>Try[R] = ???

  def map2[T1,T2,R](t1y:Try[T1],t2y:Try[T2])(f:(T1,T2)=>R):Try[R] = ???

  def lift2[T1,T2,R](f:(T1,T2)=>R):(Try[T1],Try[T2])=>Try[R] = ???

  def lift[T,R](f:T=>R):Option[T]=>Option[R] = ???

}
