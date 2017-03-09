/**
 * 
 */
package im.starDust.myapp.dao;

import java.util.List;

import im.starDust.myapp.model.Product;

/**
 * @author Administrator
 *
 */
public interface ProductDao {
	void addProduct(Product product);
	
	Product getProductById(int Id);
	
	List<Product> getAllProducts();
	
	void deleteProduct(int id);
	
	void editProduct(Product product);
}
