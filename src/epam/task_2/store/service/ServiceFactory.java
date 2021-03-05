package epam.task_2.store.service;

import epam.task_2.store.service.impl.ApplianceServiceImpl;

public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	private final ApplianceService applianceService = new ApplianceServiceImpl();
	
	private ServiceFactory() {}

	public ApplianceService getApplianceService() {

		return applianceService;
	}

	public static ServiceFactory getInstance() {
		return instance;
	}

}
