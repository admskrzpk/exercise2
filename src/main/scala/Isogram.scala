object Isogram extends App {

  def isIsogram(s: String): Boolean = {
    val letters = s.toLowerCase.filter(_.isLetter)
    letters.distinct == letters
  }
}
