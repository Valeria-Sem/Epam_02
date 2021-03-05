package epam.task_2.store.dao;

import epam.task_2.store.data.Item;

import java.util.ArrayList;

public interface FindApplianceDAO {

	ArrayList<Item> readApplianceData() throws DAOException;
	ArrayList<Item> readApplianceDataByCriteria(String criteria) throws DAOException;
}
