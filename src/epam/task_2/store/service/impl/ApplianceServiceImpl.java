package epam.task_2.store.service.impl;

import epam.task_2.store.dao.DAOException;
import epam.task_2.store.dao.DAOFactory;
import epam.task_2.store.dao.FindApplianceDAO;
import epam.task_2.store.data.Item;
import epam.task_2.store.service.ApplianceService;
import epam.task_2.store.service.ServiceException;

import java.util.ArrayList;

public class ApplianceServiceImpl implements ApplianceService {


	@Override
	public ArrayList<Item> readApplianceData() throws ServiceException {
		DAOFactory factory = DAOFactory.getInstance();
		FindApplianceDAO applianceDAO = factory.getApplianceDAO();

		ArrayList<Item> items = null;
		try {
			items = applianceDAO.readApplianceData();
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		return items;
	}

	@Override
	public ArrayList<Item> readApplianceDataByCriteria(String criteria) throws ServiceException {
		DAOFactory factory = DAOFactory.getInstance();
		FindApplianceDAO applianceDAO = factory.getApplianceDAO();

		ArrayList<Item> items = null;
		try {
			items = applianceDAO.readApplianceDataByCriteria(criteria);
		} catch (DAOException e) {
			throw new ServiceException(e);
		}

		return items;
	}
}

