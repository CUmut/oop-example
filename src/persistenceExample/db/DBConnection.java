package persistenceExample.db;

import persistenceExample.domain.Employee;
import persistenceExample.domain.Entity;
import persistenceExample.domain.Product;

public class DBConnection {

	public void save(Object o) {
		System.out.println("Saving Object: " + o);
	}

	public void update(Object o) {
		System.out.println("Updating Object: " + o);
	}

	public Entity load(Class c, int id) {
		System.out.println("Retrieving object by id: " + id);

		Entity e = null;
		if (c.getName().equalsIgnoreCase("Product"))
			e = new Product(id, "11111111", "A pen.", 2.19, 0.01);
		else
			e = new Employee(id, "Umut", 5, "Production", "Dolar 13.50 bu zamanda bilgisayar alınmaz :)");
		return e;
	}

}
