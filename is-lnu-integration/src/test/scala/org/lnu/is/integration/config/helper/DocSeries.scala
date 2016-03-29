package org.lnu.is.integration.config.helper

import java.util.Random

object DocSeries {

  def generate(): String = {
    
    val names = List(
        "КС", 
        "ВС", 
        "АХ",
        "ІК", 
        "ИВ", 
        "УК", 
        "ОР", 
        "ГН", 
        "ТР", 
        "ГН", 
        "ЙЦ", 
        "ЖД", 
        "ІВ", 
        "АІ", 
        "ТИ"
        )
    
    val random = new Random
    val randomIndex = random.nextInt(names.size)
    
    names(randomIndex)
  }  
  
}