package im.starDust.myapp.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import im.starDust.myapp.dao.ProductDao;
import im.starDust.myapp.model.Product;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String home(Locale locale, Model model) {

		String test = "stardust";
		model.addAttribute("test", test);
		return "home";
	}

	@RequestMapping("/getProductList")
	public String getProductList(Model model) {
		// Product productList = productDao.findByProductName("guitar");

		List<Product> products = productDao.getAllProducts();
		model.addAttribute("product", products);
		return "productList";
	}

	@RequestMapping("/getProductList/viewProduct/{productId}")
	public String viewProduct(@PathVariable int productId, Model model) {
		Product product = productDao.getProductById(productId);
		model.addAttribute(product);
		return "viewProduct";
	}
}
