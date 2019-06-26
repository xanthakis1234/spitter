package spitterpackage.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public interface DAO<T>{
	
	void insert(T t);
	void delete(T t);
	void update(T t);
	List<T> get(String t);
	List<T>	getAll();
}
