package org.dotdi.Monopoly

import scala.util.Random

case class Controller(numPlayers: Int, numCells: Int = 40, maxRounds: Int = 2, random: Random = new Random()) {
  val cellState = Array.fill[CellState](numCells)(CellState())

  // Init no. players
  (0 until numPlayers).map(s=>SimplePlayer()).toArray
  
  for (r <- 0 until maxRounds) {
    for (p <- 0 until numPlayers) {
      // get 
    }
  }
}