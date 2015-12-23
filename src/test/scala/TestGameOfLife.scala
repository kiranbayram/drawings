import com.kiran.gameoflife.{Generation, Cell}
import com.kiran.gameoflife.CellStates._
import org.specs2.Specification

class TestGameOfLife extends Specification {

  def is = s2"""
    A dead generation must produce a dead child generation $testDeadGeneration
    A horizontal-line generation must produce a vertical-line generation $pending
    A horizontal-line generation result in same after two generations $pending
  """

  def testDeadGeneration = {
    val deadMatrix = Array.fill[Cell](2, 3) { Cell(Dead) }

    val deadGeneration = new Generation(deadMatrix)

    val nextGeneration = deadGeneration.nextGeneration

    (nextGeneration.cellAt(0, 0) mustEqual Cell(Dead)) and
    (nextGeneration.cellAt(0, 1) mustEqual Cell(Dead)) and
    (nextGeneration.cellAt(0, 2) mustEqual Cell(Dead)) and
    (nextGeneration.cellAt(1, 0) mustEqual Cell(Dead)) and
    (nextGeneration.cellAt(1, 1) mustEqual Cell(Dead)) and
    (nextGeneration.cellAt(1, 2) mustEqual Cell(Dead))
  }

}

