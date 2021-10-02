package com.spring.common;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public interface ICommonService<T> {
	
	public T save(HttpServletRequest request);
	public T getById(int id);
	public T update(HttpServletRequest request);
	public List<T> getAll();
	public T delete(int id);
}
