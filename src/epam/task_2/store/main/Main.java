package epam.task_2.store.main;

import epam.task_2.store.data.ApplianceFactory;
import epam.task_2.store.entity.Appliance;
import epam.task_2.store.service.ApplianceService;
import epam.task_2.store.service.ServiceException;
import epam.task_2.store.service.ServiceFactory;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws ServiceException {
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        ArrayList<Appliance> products = ApplianceFactory.getTechnique(service.readApplianceData());
        ArrayList<Appliance> irons = ApplianceFactory.getTechnique(service.readApplianceDataByCriteria("100"));

        PrintApplianceInfo.print(products);
        PrintApplianceInfo.print(irons);

    }
}
