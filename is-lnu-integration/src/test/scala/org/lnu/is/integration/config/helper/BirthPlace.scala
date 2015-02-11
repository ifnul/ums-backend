package org.lnu.is.integration.config.helper

import java.util.Random

object BirthPlace {

  def generate(): String = {
    
    val names = List(
        "81600, м. Миколаїв, проспект Грушевського, 4а", 
        "вул. Руданського, 3, м. Львів, 79005", 
        "вул. Володимира Великого, 34",
        "вул. Городоцька, 131" , 
        "пл. Ринок, 26"
        )
    
    val random = new Random
    val randomIndex = random.nextInt(names.size)
    
    names(randomIndex)
  }  
  
}