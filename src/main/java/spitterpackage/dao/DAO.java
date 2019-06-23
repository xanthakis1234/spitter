package spitterpackage.dao;

import java.util.List;

public interface DAO<T>{
	
	void insert(T t);
	void delete(T t);
	void update(T t);
	List<T> get(T t);
	List<T>	getAll();
}
