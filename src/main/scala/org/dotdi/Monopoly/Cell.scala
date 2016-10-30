package org.dotdi.Monopoly

case class Cell(
    typ:String = null,
    owner:String = null,
    moneyChange:Int = 0,
    idx:Int = -1,
    canBeOwned:Boolean = false,
    name:String = null,
    color:String = null,
    cost:Int = 0,
    rent:Int = 0,
    with_1_house:Int = 0,
    with_2_houses:Int = 0,
    int with_3_houses = 0;
    int with_4_houses = 0;

    int with_1_hotel = 0;

    int mortage = 0;
    int house_price = 0;
    int hotel_price = 0;
    
    int if_2_rr_owned = 50;
    int if_3_rr_owned = 100;
    int if_4_rr_owned = 200;
    
    ) {
  
}