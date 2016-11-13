package org.dotdi.Monopoly

object Board {

  val standardCells = Array[Cell](
    Cell(idx = 0, typ = "Go", moneyChange = 200),
    Cell(idx = 1, cost = 60, typ = "Street", canBeOwned = true, name = "Mediterenian Avenue", color = "Brown",
      rent = 2, with_1_house = 10, with_2_houses = 30, with_3_houses = 90, with_4_houses = 160, with_1_hotel = 250, mortage = 30, house_price = 50, hotel_price = 250),
    Cell(idx = 2, typ = "Community Chest"),
    Cell(idx = 3, cost = 60, typ = "Street", canBeOwned = true, name = "Baltic Avenue", color = "Brown", rent = 4,
      with_1_house = 20, with_2_houses = 60, with_3_houses = 180, with_4_houses = 320, with_1_hotel = 450, mortage = 30, house_price = 50, hotel_price = 250),
    Cell(idx = 4, typ = "Income Tax", moneyChange = -200),
    // ---------------------------------------------------------------------------------------------------------
    Cell(idx = 5, cost = 200, typ = "Railroad", name = "Reading Railroad"),
    Cell(idx = 6, cost = 100, typ = "Street", canBeOwned = true, name = "Oriental Avenue", color = "Light Blue",
      rent = 6, with_1_house = 30, with_2_houses = 90, with_3_houses = 270, with_4_houses = 400, with_1_hotel = 550, mortage = 50, house_price = 50, hotel_price = 250),
    Cell(idx = 7, typ = "Chance"),
    Cell(idx = 8, cost = 100, typ = "Street", canBeOwned = true, name = "Vermont Avenue", color = "Light Blue",
      rent = 6, with_1_house = 30, with_2_houses = 90, with_3_houses = 270, with_4_houses = 400, with_1_hotel = 550, mortage = 50, house_price = 50, hotel_price = 250),
    Cell(idx = 9, cost = 100, typ = "Street", canBeOwned = true, name = "Connecticut Avenue", color = "Light Blue",
      rent = 8, with_1_house = 40, with_2_houses = 100, with_3_houses = 300, with_4_houses = 450, with_1_hotel = 600, mortage = 60, house_price = 50, hotel_price = 250),
    // ---------------------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------------------
    Cell(idx = 10, typ = "Just Visiting"),
    Cell(idx = 11, cost = 140, typ = "Street", canBeOwned = true, name = "St. Charles Place", color = "Pink",
      rent = 10, with_1_house = 50, with_2_houses = 150, with_3_houses = 450, with_4_houses = 625, with_1_hotel = 750, mortage = 70, house_price = 100, hotel_price = 500),
    Cell(idx = 12, cost = 150, typ = "Utility", name = "Electric Company"),
    Cell(idx = 13, cost = 140, typ = "Street", canBeOwned = true, name = "States Avenue", color = "Pink",
      rent = 10, with_1_house = 50, with_2_houses = 150, with_3_houses = 450, with_4_houses = 625, with_1_hotel = 750, mortage = 70, house_price = 100, hotel_price = 500),
    Cell(idx = 14, cost = 160, typ = "Street", canBeOwned = true, name = "Virginia Avenue", color = "Pink",
      rent = 12, with_1_house = 60, with_2_houses = 180, with_3_houses = 500, with_4_houses = 700, with_1_hotel = 900, mortage = 80, house_price = 100, hotel_price = 500),
    // ---------------------------------------------------------------------------------------------------------
    Cell(idx = 15, cost = 200, typ = "Railroad", name = "Pennsylvania Railroad"),
    Cell(idx = 16, cost = 180, typ = "Street", canBeOwned = true, name = "St. James Place", color = "Orange",
      rent = 14, with_1_house = 70, with_2_houses = 200, with_3_houses = 550, with_4_houses = 750, with_1_hotel = 950, mortage = 90, house_price = 100, hotel_price = 500),
    Cell(idx = 17, typ = "Community Chest"),
    Cell(idx = 18, cost = 180, typ = "Street", canBeOwned = true, name = "Tennessee Avenue", color = "Orange",
      rent = 14, with_1_house = 70, with_2_houses = 200, with_3_houses = 550, with_4_houses = 750, with_1_hotel = 950, mortage = 90, house_price = 100, hotel_price = 500),
    Cell(idx = 19, cost = 200, typ = "Street", canBeOwned = true, name = "New York Avenue", color = "Orange",
      rent = 16, with_1_house = 80, with_2_houses = 220, with_3_houses = 600, with_4_houses = 800, with_1_hotel = 1000, mortage = 100, house_price = 100, hotel_price = 500),
    // ---------------------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------------------
    Cell(idx = 20, typ = "Free Park"),
    Cell(idx = 21, cost = 220, typ = "Street", canBeOwned = true, name = "Kentucky Avenue", color = "Red",
      rent = 18, with_1_house = 90, with_2_houses = 250, with_3_houses = 700, with_4_houses = 875, with_1_hotel = 1050, mortage = 110, house_price = 150, hotel_price = 750),
    Cell(idx = 22, typ = "Chance"),
    Cell(idx = 23, cost = 220, typ = "Street", canBeOwned = true, name = "Indiana Avenue", color = "Red",
      rent = 18, with_1_house = 90, with_2_houses = 250, with_3_houses = 700, with_4_houses = 875, with_1_hotel = 1050, mortage = 110, house_price = 150, hotel_price = 750),
    Cell(idx = 24, cost = 240, typ = "Street", canBeOwned = true, name = "Illinois Avenue", color = "Red",
      rent = 20, with_1_house = 100, with_2_houses = 300, with_3_houses = 750, with_4_houses = 925, with_1_hotel = 1100, mortage = 120, house_price = 150, hotel_price = 750),
    // ---------------------------------------------------------------------------------------------------------
    Cell(idx = 25, cost = 200, typ = "Railroad", name = "B. & O. Railroad"),
    Cell(idx = 26, cost = 260, typ = "Street", canBeOwned = true, name = "Atlantic Avenue", color = "Yellow",
      rent = 22, with_1_house = 110, with_2_houses = 330, with_3_houses = 800, with_4_houses = 975, with_1_hotel = 1150, mortage = 130, house_price = 150, hotel_price = 750),
    Cell(idx = 27, cost = 260, typ = "Street", canBeOwned = true, name = "Ventor Avenue", color = "Yellow",
      rent = 22, with_1_house = 110, with_2_houses = 330, with_3_houses = 800, with_4_houses = 975, with_1_hotel = 1150, mortage = 130, house_price = 150, hotel_price = 750),
    Cell(idx = 28, cost = 150, typ = "Utility", name = "Water Company"),
    Cell(idx = 29, cost = 280, typ = "Street", canBeOwned = true, name = "Marvin Gardens", color = "Yellow",
      rent = 24, with_1_house = 120, with_2_houses = 360, with_3_houses = 850, with_4_houses = 1025, with_1_hotel = 1200, mortage = 140, house_price = 150, hotel_price = 750),
    // ---------------------------------------------------------------------------------------------------------
    // ---------------------------------------------------------------------------------------------------------
    Cell(idx = 30, typ = "Go To Jail"),
    Cell(idx = 31, cost = 300, typ = "Street", canBeOwned = true, name = "Pacific Avenue", color = "Green",
      rent = 26, with_1_house = 130, with_2_houses = 390, with_3_houses = 900, with_4_houses = 1100, with_1_hotel = 1275, mortage = 150, house_price = 200, hotel_price = 1000),
    Cell(idx = 32, cost = 300, typ = "Street", canBeOwned = true, name = "North Carolina Avenue", color = "Green",
      rent = 26, with_1_house = 130, with_2_houses = 390, with_3_houses = 900, with_4_houses = 1100, with_1_hotel = 1275, mortage = 150, house_price = 200, hotel_price = 1000),
    Cell(idx = 33, typ = "Community Chest"),
    Cell(idx = 34, cost = 320, typ = "Street", canBeOwned = true, name = "Pennsylvania Avenue", color = "Green",
      rent = 28, with_1_house = 150, with_2_houses = 450, with_3_houses = 1000, with_4_houses = 1200, with_1_hotel = 1400, mortage = 160, house_price = 200, hotel_price = 1000),
    // ---------------------------------------------------------------------------------------------------------
    Cell(idx = 35, cost = 200, typ = "Railroad", name = "Short Line Railroad"),
    Cell(idx = 36, typ = "Chance"),
    Cell(idx = 37, cost = 350, typ = "Street", canBeOwned = true, name = "Park Place", color = "Dark Blue",
      rent = 35, with_1_house = 175, with_2_houses = 500, with_3_houses = 1100, with_4_houses = 1300, with_1_hotel = 1500, mortage = 175, house_price = 200, hotel_price = 1000),
    Cell(idx = 38, typ = "Luxury Tax", moneyChange = -100),
    Cell(idx = 39, cost = 400, typ = "Street", canBeOwned = true, name = "Boardwalk", color = "Dark Blue",
      rent = 50, with_1_house = 200, with_2_houses = 600, with_3_houses = 1400, with_4_houses = 1700, with_1_hotel = 2000, mortage = 200, house_price = 200, hotel_price = 1000))

}