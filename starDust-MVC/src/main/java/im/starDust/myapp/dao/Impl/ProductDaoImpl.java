/**
 * 
 */
package im.starDust.myapp.dao.Impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import im.starDust.myapp.dao.ProductDao;
import im.starDust.myapp.model.Product;

/**
 * @author Administrator
 *
 */
@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addProduct(Product product) {
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(product);
		session.flush();
		session.close();
	}

	public Product getProductById(int id) {
		Session session = sessionFactory.openSession();
		Product product = (Product) session.get(Product.class, id);
		session.flush();
		session.close();
		return product;
	}
	
	public List<Product> getAllProducts(){
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Product");
		@SuppressWarnings("unchecked")
		List<Product> products = query.list();
		session.flush();
		session.close();
		return products;
	}
	
	public void deleteProduct(int id) {
		Session session = sessionFactory.openSession();
		session.delete(getProductById(id));
		session.flush();
	}
	
	public void editProduct(Product product){
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(product);
		session.flush();
		session.close();
	}
}
