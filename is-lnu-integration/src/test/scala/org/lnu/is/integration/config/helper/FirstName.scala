package org.lnu.is.integration.config.helper

import java.util.Random

object FirstName {

  def generate(): String = {
    
    val names = List(
        "Іван", 
        "Олег", 
        "Ростислав",
        "Михайло" , 
        "Тараас", 
        "Назар", 
        "Максим", 
        "Любомир", 
        "Анатолій",
        "Віталій", 
        "Віктор", 
        "Ернест",
        "Петро", 
        "Василь", 
        "Сергій" 
        )
    
    val random = new Random
    val randomIndex = random.nextInt(names.size)
    
    names(randomIndex)
  }
  
}