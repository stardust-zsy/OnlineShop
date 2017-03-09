///**
// * 
// */
//package im.starDust.myapp.model;
//
//import java.io.Serializable;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//
///**
// * @author Administrator
// *
// */
//@Entity
//public class CartItem implements Serializable{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 7957011176684233748L;
//	
//	@Id
//	@GeneratedValue
//	private int cartItemId;
//	@ManyToOne
//	@JoinColumn(name="cartId")
//	@JsonIgnore
//	private Cart cart;
//	@ManyToOne
//	@JoinColumn(name="productId")
//	private Product product;
//	
//	private int quantity;
//	private double totalPrice;
//	/**
//	 * @return the cartItemId
//	 */
//	public int getCartItemId() {
//		return cartItemId;
//	}
//	/**
//	 * @param cartItemId the cartItemId to set
//	 */
//	public void setCartItemId(int cartItemId) {
//		this.cartItemId = cartItemId;
//	}
//	/**
//	 * @return the cart
//	 */
//	public Cart getCart() {
//		return cart;
//	}
//	/**
//	 * @param cart the cart to set
//	 */
//	public void setCart(Cart cart) {
//		this.cart = cart;
//	}
//	/**
//	 * @return the product
//	 */
//	public Product getProduct() {
//		return product;
//	}
//	/**
//	 * @param product the product to set
//	 */
//	public void setProduct(Product product) {
//		this.product = product;
//	}
//	/**
//	 * @return the quantity
//	 */
//	public int getQuantity() {
//		return quantity;
//	}
//	/**
//	 * @param quantity the quantity to set
//	 */
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//	/**
//	 * @return the totalPrice
//	 */
//	public double getTotalPrice() {
//		return totalPrice;
//	}
//	/**
//	 * @param totalPrice the totalPrice to set
//	 */
//	public void setTotalPrice(double totalPrice) {
//		this.totalPrice = totalPrice;
//	}
//}
