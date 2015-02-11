package org.lnu.is.integration.config.helper

import java.util.Random

object FatherName {
  
  def generate(): String = {
    
    val names = List(
        "Іванович", 
        "Олегович", 
        "Ростиславович",
        "Михайлович" , 
        "Тарасович", 
        "Назарович", 
        "Максимович", 
        "Любомирович", 
        "Анатолійович",
        "Віталійович", 
        "Вікторович", 
        "Ернестович",
        "Петрович", 
        "Васильович",
        "Соломонович", 
        "Абдулович", 
        "Зіновійович", 
        "Артурович", 
        "Артемович", 
        "Олексійович", 
        "Андрійович", 
        "Богданович", 
        "Володимир",         
        "Сергійович" 
        )
    
    val random = new Random
    val randomIndex = random.nextInt(names.size)
    
    names(randomIndex)
  }
  
}