package persistenceExample.dao;

import persistenceExample.db.ConnectionFactory;
import persistenceExample.db.DBConnection;
import persistenceExample.domain.Entity;

public abstract class AbstractDao {

	protected DBConnection db;

	public AbstractDao() {
		ConnectionFactory factory = new ConnectionFactory();
		db = factory.getConnection();
	}

	public abstract void save(Entity e);

	public abstract void update(Entity e);

	public abstract Entity retrieve(Class clazz, int id);
}
