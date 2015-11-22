package com.drawing.gameoflife

import CellStates._

class Generation(matrix: Matrix) {

  private val width = matrix(0).length
  private val length = matrix.length

  def cellAt(x: Int, y: Int): Cell = matrix(x)(y)

  def nextGeneration: Generation = {
    val newMatrix: Matrix = Array.ofDim[Cell](width, length)

    for { i <- 0 to width - 1; j <- 0 to length - 1 } {
      matrix(i)(j) match {
        case Dead => {
          aliveNeighbourCount(i, j) match {
            case 3 => newMatrix(i)(j) = Cell(Alive)
            case _ => newMatrix(i)(j) = Cell(Dead)
          }
        }
        case Alive => {
          aliveNeighbourCount(i, j) match {
            case c if c == 2 || c == 3  => newMatrix(i)(j) = Cell(Alive)
            case _                      => newMatrix(i)(j) = Cell(Dead)
          }
        }
      }
    }

    new Generation(newMatrix)
  }

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
    matrix(x)(y).state == Alive

}
