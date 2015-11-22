package com.drawing.gameoflife

import CellStates._

class Generation(board: Matrix) {

  private val width = board(0).length
  private val length = board.length

  def cellAt(x: Int, y: Int): Cell = board(x)(y)

  def nextGeneration: Generation = ???

  private def aliveNeighbourCount(x: Int, y: Int): Int = {
    val minX = math.max(0, x - 1)
    val minY = math.max(0, y - 1)
    val maxX = math.min(width - 1, x + 1)
    val maxY = math.min(length - 1, x + 1)
    var count = 0

    for { i <- minX to maxX; j <- minY to maxY }
      if ((i != x) && (j != y) && isAlive(i, j))
        count += 1

    count
  }

  private def isAlive(x: Int, y: Int): Boolean =
    board(x)(y).state == Alive

}
