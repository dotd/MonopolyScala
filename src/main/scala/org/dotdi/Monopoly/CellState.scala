package org.dotdi.Monopoly

import scala.collection.mutable.Set

case class CellState(
  var owner:Player = null,
  var numHouses:Int = 0,
  var numHotels:Int = 0,
  val whoOnMe:Set[Player] = Set.empty[Player])