package com.pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.model.Login;
import com.pack.model.Product;
import com.pack.model.User;
import com.pack.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String loadForm(ModelMap map) {
		User user = new User();
		map.addAttribute("userForm", user);
		return "userRegn";
	}

	@RequestMapping(value = "/userLogin", method = RequestMethod.GET)
	public String loadForm1(ModelMap map) {
		Login log = new Login();
		map.addAttribute("userForm1", log);
		return "login";
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String saveUser(@Validated @ModelAttribute("userForm") User user, BindingResult result, ModelMap map) {
		if (result.hasErrors()) {
			return "userRegn";
		} else {
			System.out.println("Inside controller");
			userService.saveUser(user);
			return "registered";
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String saveUser1(@Validated @ModelAttribute("userForm1") Login log, BindingResult result, ModelMap map) {
		String s = "Login";
		String msg = "Invalid username and password";
		if (result.hasErrors()) {
			return s;
		} else {
			System.out.println("Inside controller");
			boolean b = userService.fetchUser(log);
			if (b == true) {
				map.addAttribute("userList1", log.getUserName());
				s = "loginSucess";
				msg = null;
			}
			map.addAttribute("msg1", msg);
			return s;
		}

	}

	@RequestMapping(value = "/addProduct", method = RequestMethod.GET)
	public String loadForm2(ModelMap map) {
		Product p = new Product();
		map.addAttribute("Productaddcommand", p);
		return "ProductAdd";
	}

	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public String ProductDetails(@Validated @ModelAttribute("Productaddcommand") Product pd, BindingResult br,
			ModelMap mp) {
		String s = "ProductAdd";
		if (br.hasErrors()) {
			return s;
		} else {
			System.out.println("inside ProductDetails");
			userService.saveProduct(pd);
			/* mp.addAttribute("Details", pd); */
			return "ProductForm";
		}

	}

	@RequestMapping(value = "/viewProduct")
	public String viewProduct1(ModelMap mp1) {
		Product pd1 = new Product();
		List<Product> list = userService.viewProduct();
		mp1.addAttribute("Product", list);
		return "fetchProduct";

	}

	@RequestMapping(value = "/sell")
	public String sell() {
		return "sellProduct";
	}

	@RequestMapping(value = "/buy")
	public String buy() {
		return "buyProduct";
	}

}
