package com.spring.common;

import java.util.List;



public interface ICommonDAO <T> {
	
	public T save(T t);
	public T getById(int pid);
	public T Update(T t);
	public List<T> getAll();
	public T delete(T t);
	
}
