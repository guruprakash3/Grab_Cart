package com.pack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.UserDao;
import com.pack.model.Login;
import com.pack.model.Product;
import com.pack.model.User;

@Transactional
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void saveUser(User user) {
		System.out.println("Inside saveEmp service");
		userDao.saveUser(user);

	}

	public boolean fetchUser(Login log) {
		boolean b=userDao.fetchUser(log);
		return b;	
	}

	public void saveProduct(Product pd) {
		System.out.println("inside save pet service impl");
		userDao.saveProduct(pd);
	}

	public List<Product> viewProduct() {
		List<Product> l=userDao.viewProduct();
		return l;
	}

}
