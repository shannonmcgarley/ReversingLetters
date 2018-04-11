package XYZ

import org.scalatest.{MustMatchers, WordSpec}

class ReverseLetteringSpec extends WordSpec with MustMatchers {

  "the function" should {
    "return an output of Y when given an input of X" in {

      XYZ.ReverseLettering.function(
        "X") mustEqual "Y"
    }
  }

}
