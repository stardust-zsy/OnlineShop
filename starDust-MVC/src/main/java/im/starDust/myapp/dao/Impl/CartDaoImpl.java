///**
// * 
// */
//package im.starDust.myapp.dao.Impl;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.dom4j.IllegalAddException;
//import org.springframework.stereotype.Repository;
//
//import im.starDust.myapp.dao.CartDao;
//import im.starDust.myapp.model.Cart;
//
///**
// * @author Administrator
// *
// */
//@Repository
//public class CartDaoImpl implements CartDao {
//	private Map<String, Cart> listCarts;
//
//	public CartDaoImpl() {
//		listCarts = new HashMap<String, Cart>();
//	}
//
//	public Cart create(Cart cart) {
//		if (listCarts.keySet().contains(cart.getCartId())) {
//			throw new IllegalAddException(String.format("can not create cartId:", cart.getCartId()));
//		}
//		listCarts.put(cart.getCartId(), cart);
//
//		return cart;
//	}
//
//	public Cart read(String cartId) {
//
//		return listCarts.get(cartId);
//	}
//
//	public void update(String cartId, Cart cart) {
//		if (!listCarts.keySet().contains(cartId)) {
//			throw new IllegalAddException(String.format("can not update cart:", cart.getCartId()));
//		}
//		listCarts.put(cartId, cart);
//	}
//
//	public void delete(String cartId) {
//		if (!listCarts.keySet().contains(cartId)) {
//			throw new IllegalAddException(String.format("can not delete cart:", cartId));
//		}
//		listCarts.remove(cartId);
//	}
//
//}
