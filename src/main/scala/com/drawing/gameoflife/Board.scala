package com.drawing.gameoflife

import CellStatus._

class Board(val width: Int, val height: Int) {
  require(width > 0, "Board must have positive width!")
  require(height > 0, "Board must have positive height!")

  private val board = Array.ofDim[Cell](width, height)
  init()

  private def init(): Unit = {
    for (x <- 0 to width - 1; y <- 0 to height -1)
      board(x)(y) = Cell(Dead)
  }

  def aliveNeighbourCount(x: Int, y: Int): Int = ???

}
