package org.lnu.is.integration.config.helper

import java.util.Random

object Photo {

  def generate(): String = {
    
    val names = List(
        "http://netdna.webdesignerdepot.com/uploads/iconic_portraits/dkmb86g_747ck5j62qj_b.jpg", 
        "http://netdna.webdesignerdepot.com/uploads/iconic_portraits/dkmb86g_754hrqbxwhq_b.jpg", 
        "http://netdna.webdesignerdepot.com/uploads/iconic_portraits/dkmb86g_843dhvcnjgb_b.jpg",
        "http://netdna.webdesignerdepot.com/uploads/iconic_portraits/dkmb86g_772cqqdk4c6_b.jpg" , 
        "http://netdna.webdesignerdepot.com/uploads/iconic_portraits/dkmb86g_878c2rpg3f8_b.jpg", 
        "http://netdna.webdesignerdepot.com/uploads/iconic_portraits/dkmb86g_905rzh4cggj_b.jpg", 
        "http://netdna.webdesignerdepot.com/uploads/iconic_portraits/dkmb86g_709dn5qgrgz_b.jpg"
        )
    
    val random = new Random
    val randomIndex = random.nextInt(names.size)
    
    names(randomIndex)
  }  
  
  
}