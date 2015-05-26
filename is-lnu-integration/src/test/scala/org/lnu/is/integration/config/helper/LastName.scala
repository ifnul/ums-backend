package org.lnu.is.integration.config.helper

import java.util.Random

object LastName {
  
  def generate(): String = {
    
    val names = List(
        "Пилипишин", 
        "Кострів", 
        "Самуренко",
        "Джусів" , 
        "Карпинишин", 
        "Іванець", 
        "Хомяченко", 
        "Вартопуз", 
        "Голуб", 
        "Парфенюк", 
        "Олійник", 
        "Янукович", 
        "Дубик", 
        "Хусейн", 
        "Обама", 
        "Меркель", 
        "Оланд", 
        "Кадиров", 
        "Валенса", 
        "Норріс", 
        "Кенобі", 
        "Швідкохліб",
        "Данилишин", 
        "Коростець", 
        "Вітчекінений",
        "Закомітенко", 
        "Фейлишин", 
        "Антонюк", 
        "Мерджинкович", 
        "Пуленко", 
        "Фетченко", 
        "Заспрінгенко" 
        )
    
    val random = new Random
    val randomIndex = random.nextInt(names.size)
    
    names(randomIndex)
  }
  
}