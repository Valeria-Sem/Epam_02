package epam.task_2.store.service;

import epam.task_2.store.data.Item;

import java.util.ArrayList;

public interface ApplianceService {

	ArrayList<Item> readApplianceData() throws ServiceException;
	ArrayList<Item> readApplianceDataByCriteria(String criteria) throws ServiceException;
}
