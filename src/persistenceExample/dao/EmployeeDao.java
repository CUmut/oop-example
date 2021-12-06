package persistenceExample.dao;

import persistenceExample.domain.Employee;
import persistenceExample.domain.Entity;

public class EmployeeDao extends AbstractDao {

	@Override
	public void save(Entity e) {
		db.save(e);

	}

	@Override
	public void update(Entity e) {
		db.update(e);

	}

	@Override
	public Entity retrieve(Class clazz, int id) {

		Employee e = (Employee) db.load(clazz, id);
		return e;
	}

}
