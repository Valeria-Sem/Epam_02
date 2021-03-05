package epam.task_2.store.dao;

import epam.task_2.store.dao.impl.FileFindApplianceDAOImpl;

public final class DAOFactory {
	private static final DAOFactory instance = new DAOFactory();

	private final FindApplianceDAO applianceDAO = new FileFindApplianceDAOImpl();
	
	private DAOFactory() {}

	public FindApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}

	public static DAOFactory getInstance() {
		return instance;
	}
}
