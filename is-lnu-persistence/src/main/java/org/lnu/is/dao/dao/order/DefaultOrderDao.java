package org.lnu.is.dao.dao.order;

import org.lnu.is.dao.dao.AbstractDao;
import org.lnu.is.domain.order.Order;
import org.springframework.stereotype.Repository;

/**
 * Default Order Dao.
 * @author ivanursul
 *
 */
@Repository("orderDao")
public class DefaultOrderDao extends AbstractDao<Order, Long> implements OrderDao {

	@Override
	public Class<Order> getEntityClass() {
		return Order.class;
	}

}
