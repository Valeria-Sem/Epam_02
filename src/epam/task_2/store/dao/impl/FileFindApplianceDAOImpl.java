package epam.task_2.store.dao.impl;

import epam.task_2.store.dao.FindApplianceDAO;
import epam.task_2.store.dao.DAOException;
import epam.task_2.store.data.Item;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class FileFindApplianceDAOImpl implements FindApplianceDAO {
	final String applianceDBFile = "resources\\appliances_db.txt";

	@Override
	public ArrayList<Item> readApplianceData() throws DAOException {
		BufferedReader reader;
		ArrayList<Item> items = new ArrayList<>();
		String line;

		try {
			reader = new BufferedReader(new FileReader(applianceDBFile));

			while((line = reader.readLine()) != null){
				line = line.replaceAll("\\s+","");
				String[] arg = line.split(":");

				if(arg.length == 2){
					String techniqueName = arg[0].replaceAll("\\s+","");
					String description = arg[1];
					String[] descriptions = description.split(",");

					HashMap<String, Object> values = new HashMap<String, Object>();

					for(String key : descriptions){
						String[] inputDescriptions = key.split("=");

						if (inputDescriptions.length == 2) {
							values.put(String.valueOf(inputDescriptions[0]), inputDescriptions[1]);
						}
					}
					items.add(new Item(techniqueName, values));
				}
			}

			return items;
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch(IOException e) {
			throw new DAOException(e);
		}
	}

	@Override
	public ArrayList<Item> readApplianceDataByCriteria(String criteria) throws DAOException {
		BufferedReader reader;
		ArrayList<Item> items = new ArrayList<>();
		String line;

		try {
			reader = new BufferedReader(new FileReader(applianceDBFile));

			while((line = reader.readLine()) != null){
				line = line.replaceAll("\\s+","");
				String[] arguments = line.split(":");

				if (line.contains(criteria)){
					String techniqueName = arguments[0].replaceAll("\\s+","");
					String description = arguments[1];
					String[] descriptions = description.split(",");

					HashMap<String, Object> values = new HashMap<String, Object>();

					for(String key : descriptions){
						String[] inputDescriptions = key.split("=");

						if (inputDescriptions.length == 2) {
							values.put(String.valueOf(inputDescriptions[0]), inputDescriptions[1]);
						}
					}
					items.add(new Item(techniqueName, values));
				}
			}

			return items;
		} catch (FileNotFoundException e) {
			throw new DAOException(e);
		} catch(IOException e) {
			throw new DAOException(e);
		}
	}
}
