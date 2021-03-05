package epam.task_2.store.dao;

import epam.task_2.store.dao.impl.FileFindApplianceDAOImpl;

public class DAOProvider {

    private static final DAOProvider instance = new DAOProvider();

    private final FindApplianceDAO findApplianceDAO = new FileFindApplianceDAOImpl();

    private DAOProvider() {}

    public FindApplianceDAO getReadApplianceDAO() {
        return findApplianceDAO;
    }

    public static DAOProvider getInstance() {
        return instance;
    }
}
