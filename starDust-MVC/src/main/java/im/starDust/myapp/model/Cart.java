//package im.starDust.myapp.model;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class Cart {
//	private String cartId;
//	private Map<String, CartItem> cartItems;
//	private double grandtotal;
//
//	public Cart() {
//		cartItems = new HashMap<String, CartItem>();
//		grandtotal = 0;
//
//	}
//	public Cart(String cartId){
//		this.cartId=cartId;
//		grandtotal = 0;
//	}
//	/**
//	 * @return the cartId
//	 */
//	public String getCartId() {
//		return cartId;
//	}
//
//	/**
//	 * @param cartId
//	 *            the cartId to set
//	 */
//	public void setCartId(String cartId) {
//		this.cartId = cartId;
//	}
//
//	/**
//	 * @return the cartItems
//	 */
//	public Map<String, CartItem> getCartItems() {
//		return cartItems;
//	}
//
//	/**
//	 * @param cartItems
//	 *            the cartItems to set
//	 */
//	public void setCartItems(Map<String, CartItem> cartItems) {
//		this.cartItems = cartItems;
//	}
//
//	/**
//	 * @return the grandtotal
//	 */
//	public double getGrandtotal() {
//		return grandtotal;
//	}
//
//	/**
//	 * @param grandtotal
//	 *            the grandtotal to set
//	 */
//	public void setGrandtotal(double grandtotal) {
//		this.grandtotal = grandtotal;
//	}
//
//	public void addCartItem(CartItem item) {
//		cartItems = new HashMap<String, CartItem>();
//		String productId = item.getProduct().getProductId();
//
//		if (cartItems.containsKey(productId)) {
//			CartItem existingItem = cartItems.get(productId);
//			existingItem.setQuantity(existingItem.getQuantity() + item.getQuantity());
//			cartItems.put(productId, existingItem);
//		} else {
//			cartItems.put(productId, item);
//		}
//		updateGrandTotal();
//	}
//
//	public void removeCartItem(CartItem item) {
//		String productId = item.getProduct().getProductId();
//		cartItems.remove(productId);
//		updateGrandTotal();
//
//	}
//
//	public void updateGrandTotal() {
//		grandtotal = 0;
//		for (CartItem item : cartItems.values()) {
//			grandtotal = grandtotal+item.getTotalPrice();
//		}
//	}
//}
