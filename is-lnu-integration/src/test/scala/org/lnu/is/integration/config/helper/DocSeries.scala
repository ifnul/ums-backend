package org.lnu.is.integration.config.helper

import java.util.Random

object DocSeries {

  def generate(): String = {
    
    val names = List(
        "КС", 
        "ВС", 
        "АХ",
        "ІК" , 
        "ІВ", 
        "АІ", 
        "ТИ"
        )
    
    val random = new Random
    val randomIndex = random.nextInt(names.size)
    
    names(randomIndex)
  }  
  
}