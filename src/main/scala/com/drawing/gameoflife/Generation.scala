package com.drawing.gameoflife

class Generation(board: Matrix) {

  def cellAt(x: Int, y: Int): Cell = board(x)(y)

  def nextGeneration: Generation = ???

  private def neighbourCount(x: Int, y: Int): Int = ???

}
