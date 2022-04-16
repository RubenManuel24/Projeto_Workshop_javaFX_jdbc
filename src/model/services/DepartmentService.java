package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll(){
		List<Department> list = new ArrayList<>();
		list.add(new Department(1,"Books"));
		list.add(new Department(2,"Computers"));
		list.add(new Department(3,"Electronics"));
		list.add(new Department(4,"Desports"));
		list.add(new Department(5,"Cience"));
		list.add(new Department(6,"Arts"));
		
		return list;
	}
}