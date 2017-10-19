import org.scalatest.{FlatSpec, Matchers}

class TestSpec extends FlatSpec with Matchers{

  "hello" should "equals Hi" in {
    Test.hello shouldBe "Hi"
  }

}
