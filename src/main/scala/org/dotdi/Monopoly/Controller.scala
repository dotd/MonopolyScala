package org.dotdi.Monopoly

case class Controller(numPlayers:Int, numCells:Int = 40) {
  val cellState = Array.fill[CellState](numCells)(CellState())
  
}