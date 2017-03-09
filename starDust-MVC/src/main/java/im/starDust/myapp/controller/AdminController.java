package im.starDust.myapp.controller;

import im.starDust.myapp.dao.ProductDao;
import im.starDust.myapp.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Controller
public class AdminController {

	private Path path;
	private String url = "D:/upload/images/";

	@Autowired
	private ProductDao productDao;

	@RequestMapping("/admin")
	public String adminPage(Model model) {
		return "admin";
	}

	@RequestMapping("/admin/productInventory")
	public String productInventory(Model model) {
		List<Product> products = productDao.getAllProducts();
		model.addAttribute("products", products);
		return "productInventory";
	}

	@RequestMapping("/admin/productInventory/addProduct")
	public String addProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "addProduct";
	}

	@RequestMapping(value = "/admin/productInventory/addProduct", method = RequestMethod.POST)
	public String addProductPost(@Valid @ModelAttribute("product") Product product, BindingResult result, Model model,
			HttpServletRequest request) throws IOException {
		if (result.hasErrors()) {
			return "addProduct";
		}
		MultipartFile productImage = product.getProductImage();
		// String rootDirectory =
		// request.getSession().getServletContext().getRealPath("/"); // TODO
		// path = Paths.get(rootDirectory + "\\WEB-INF\\resources\\images\\" +
		// product.getProductId() + ".png");
		
		
		//DB
		productDao.addProduct(product);
		if (productImage != null && !productImage.isEmpty()) {

			path = Paths.get(url + product.getProductId() + ".png");
			try {
				productImage.transferTo(new File(path.toString()));
			} catch (Exception e) {
				Files.delete(path);
				e.printStackTrace();
				throw new RuntimeException("productImage saving failed");
			}
		}
		//show web page
		return "redirect:/admin/productInventory"; 
	}

	@RequestMapping("/admin/productInventory/deleteProduct/{id}")
	public String deleteProduct(@PathVariable int id, Model model) {
		productDao.deleteProduct(id);
		path = Paths.get(url + id + ".png");
		if (Files.exists(path)) {
			try {
				Files.delete(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new RuntimeException("delete failed");
			}

		}
		return "redirect:/admin/productInventory";
	}

	@RequestMapping("/admin/productInventory/editProduct/{id}")
	public String editProduct(@PathVariable int id, Model model) {
		Product product = productDao.getProductById(id);
		model.addAttribute("product", product);
		return "editProduct";
	}

	@RequestMapping(value = "admin/productInventory/editProduct", method = RequestMethod.POST)
	public String editProductPost(@Valid BindingResult result, @ModelAttribute("product") Product product,
			Model model) {

		if (result.hasErrors()) {
			return "editProduct";
		}
		MultipartFile productImage = product.getProductImage();
		path = Paths.get(url + product.getProductId() + ".png");
		if (productImage != null && !productImage.isEmpty()) {
			try {
				productImage.transferTo(new File(path.toString()));
			} catch (Exception e) {
				e.printStackTrace();
				throw new RuntimeException("productImage saving failed");
			}
		}
		productDao.editProduct(product);
		return "redirect:/admin/productInventory";
	}
}
