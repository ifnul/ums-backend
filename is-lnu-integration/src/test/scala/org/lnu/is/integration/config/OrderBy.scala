package org.lnu.is.integration.config

class OrderBy(field: String, order: OrderByType.OrderByType) {
  var fields: String = field
  var orders:  OrderByType.OrderByType = order
 
  override def toString(): String = fields + "-" + orders.toString() 
}