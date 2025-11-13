package dao;

import java.util.List;

public interface IDAO<T> {
	public boolean create(T o);
	public boolean update(T o);
	public boolean delete(T o);
	public T findById(int id);
	public List<T> findAll();

}
