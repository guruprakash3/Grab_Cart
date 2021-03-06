package com.pack.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pack.model.Login;
import com.pack.model.Product;
import com.pack.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void saveUser(User emp) {
		System.out.println("Inside dao");
		sessionFactory.getCurrentSession().save(emp);

	}

	public boolean fetchUser(Login l) {
		boolean b = false;
		Query q = sessionFactory.getCurrentSession().createQuery("from User");
		List<User> list = q.list();
		for (User u : list) {
			if (u.getUserName().equals(l.getUserName()) && u.getUserPassword().equals(l.getUserPassword())) {
				b = true;
			}
		}
		return b;
	}

	public void saveProduct(Product pd) {
		System.out.println("inside savepet Daoimpl");
		sessionFactory.getCurrentSession().save(pd);

	}

	public List<Product> viewProduct() {
		Query qr = sessionFactory.getCurrentSession().createQuery("from Pet");
		List<Product> ls = qr.list();

		return ls;

	}

}
