package com.drawing.gameoflife

case class Cell(val isAlive: CellStatus.Value)

object CellStatus extends Enumeration {
  val Alive = Value("Alive")
  val Dead = Value("Dead")
}
