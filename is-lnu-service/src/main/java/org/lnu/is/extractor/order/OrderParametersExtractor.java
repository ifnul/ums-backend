package org.lnu.is.extractor.order;

import java.util.Map;

import javax.annotation.Resource;

import org.lnu.is.annotations.ParametersExtractor;
import org.lnu.is.dao.dao.Dao;
import org.lnu.is.domain.asset.Asset;
import org.lnu.is.domain.employee.Employee;
import org.lnu.is.domain.optype.OperationType;
import org.lnu.is.domain.order.Order;
import org.lnu.is.domain.order.type.OrderType;
import org.lnu.is.domain.partner.Partner;
import org.lnu.is.domain.reason.Reason;
import org.lnu.is.domain.timeperiod.TimePeriod;
import org.lnu.is.extractor.AbstractParametersExtractor;

/**
 * Order Parameters extractor.
 * @author ivanursul
 *
 */
@ParametersExtractor("orderParametersExtractor")
public class OrderParametersExtractor extends AbstractParametersExtractor<Order> {

	@Resource(name = "orderTypeDao")
	private Dao<OrderType, Long> orderTypeDao;
	
	@Resource(name = "employeeDao")
	private Dao<Employee, Long> employeeDao;
	
	@Resource(name = "assetDao")
	private Dao<Asset, Long> assetDao;
	
	@Resource(name = "partnerDao")
	private Dao<Partner, Long> partnerDao;
	
	@Resource(name = "operationTypeDao")
	private Dao<OperationType, Long> operationTypeDao;
	
	@Resource(name = "reasonDao")
	private Dao<Reason, Long> reasonDao;
	
	@Resource(name = "orderDao")
	private Dao<Order, Long> orderDao;
	
	@Resource(name = "timePeriodDao")
	private Dao<TimePeriod, Long> timePeriodDao;
	
	@Override
	public Map<String, Object> getParameters(final Order entity, final Map<String, Object> parameters) {
		
		addParameter(entity.getOrderType(), orderTypeDao, "orderType", parameters);
		addParameter(entity.getEmployee(), employeeDao, "employee", parameters);
		addParameter(entity.getAsset(), assetDao, "asset", parameters);
		addParameter(entity.getPartner(), partnerDao, "partner", parameters);
		addParameter(entity.getOpType(), operationTypeDao, "opType", parameters);
		addParameter(entity.getReason(), reasonDao, "reason", parameters);
		addParameter(entity.getParent(), orderDao, "parent", parameters);
		addParameter(entity.getTimePeriod(), timePeriodDao, "timePeriod", parameters);
		
		addParameter(entity.getReasonText(), "reasonText", parameters);
		addParameter(entity.getDocSeries(), "docSeries", parameters);
		addParameter(entity.getDocNum(), "docNum", parameters);
		addParameter(entity.getDocDate(), "docDate", parameters);
		addParameter(entity.getDocIssued(), "docIssued", parameters);
		addParameter(entity.getEvDate(), "evDate", parameters);
		addParameter(entity.getTitle(), "title", parameters);
		addParameter(entity.getDescription(), "description", parameters);
		return parameters;
	}

}
