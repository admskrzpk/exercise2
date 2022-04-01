import Isogram.isIsogram
import org.scalatest.flatspec.AnyFlatSpec

class IsogramSpec extends AnyFlatSpec {
  val a = "lumberjacks"
  val b = "background"
  val c = "downstream"
  val d = "six-year-old"
  val e = "123dasdd!"
  val f = "isograms"

  it should "check if word is an isogram" in {
    isIsogram(a) == true
    isIsogram(b) == true
    isIsogram(c) == true
    isIsogram(d) == true
    isIsogram(e) == false
    isIsogram(f) == false

  }
}
