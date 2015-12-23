package com.kiran.gameoflife

case class Cell(val state: CellStates.Value)

object CellStates extends Enumeration {
  val Alive = Value("Alive")
  val Dead = Value("Dead")
}
