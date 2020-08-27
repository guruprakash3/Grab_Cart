package com.pack.service;

import java.util.List;

import com.pack.model.Login;
import com.pack.model.Product;
import com.pack.model.User;

public interface UserService {

	public void saveUser(User user);

	public boolean fetchUser(Login log);

	public void saveProduct(Product pd);

	public List<Product> viewProduct();

}
