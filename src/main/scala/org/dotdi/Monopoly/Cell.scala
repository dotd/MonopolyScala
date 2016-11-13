package org.dotdi.Monopoly

case class Cell(
    typ: String = null,
    owner: String = null,
    moneyChange: Int = 0,
    idx: Int = -1,
    canBeOwned: Boolean = false,
    name: String = null,
    color: String = null,
    cost: Int = 0,
    rent: Int = 0,
    with_1_house: Int = 0,
    with_2_houses: Int = 0,
    with_3_houses: Int = 0,
    with_4_houses: Int = 0,
    with_1_hotel: Int = 0,
    mortage: Int = 0,
    house_price: Int = 0,
    hotel_price: Int = 0,
    if_2_rr_owned: Int = 50,
    if_3_rr_owned: Int = 100,
    if_4_rr_owned: Int = 200) {
  
}