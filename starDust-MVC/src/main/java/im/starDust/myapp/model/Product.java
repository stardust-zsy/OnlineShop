/**
 * 
 */
package im.starDust.myapp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Administrator
 *
 */
@Entity
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3861070367052577766L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	@NotEmpty(message = "The productName can not be null")
	private String productName;
	private String productCategory;
	private String productDescription;
	@Min(value = 0, message = "The productPrice must more than zero")
	private double productPrice;
	private String productCondition;
	private String productStatus;
	private int unitInStock;
	private String productManufacturer;

	@Transient
	private MultipartFile productImage;

	@OneToMany(mappedBy = "product", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JsonIgnore
//	private List<CartItem> cartItemList;

	/**
	 * @return the productImage
	 */
	public MultipartFile getProductImage() {
		return productImage;
	}

	/**
	 * @param productImage
	 *            the productImage to set
	 */
	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	/**
	 * @return the product
	 */
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	/**
	 * @param product
	 *            the product to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productCategory
	 */
	public String getProductCategory() {
		return productCategory;
	}

	/**
	 * @param productCategory
	 *            the productCategory to set
	 */
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}

	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}

	/**
	 * @param productDescription
	 *            the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	/**
	 * @return the productPrice
	 */
	public double getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice
	 *            the productPrice to set
	 */
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * @return the productCondition
	 */
	public String getProductCondition() {
		return productCondition;
	}

	/**
	 * @param productCondition
	 *            the productCondition to set
	 */
	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}

	/**
	 * @return the productStatus
	 */
	public String getProductStatus() {
		return productStatus;
	}

	/**
	 * @param productStatus
	 *            the productStatus to set
	 */
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	/**
	 * @return the unitInStock
	 */
	public int getUnitInStock() {
		return unitInStock;
	}

	/**
	 * @param unitInStock
	 *            the unitInStock to set
	 */
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

	/**
	 * @return the productManufacturer
	 */
	public String getProductManufacturer() {
		return productManufacturer;
	}

	/**
	 * @param productManufacturer
	 *            the productManufacturer to set
	 */
	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}

	/**
	 * @return the cartItemList
	 */
//	public List<CartItem> getCartItemList() {
//		return cartItemList;
//	}
//
//	/**
//	 * @param cartItemList the cartItemList to set
//	 */
//	public void setCartItemList(List<CartItem> cartItemList) {
//		this.cartItemList = cartItemList;
//	}

}
