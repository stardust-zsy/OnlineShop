///**
// * 
// */
//package im.starDust.myapp.controller;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//import im.starDust.myapp.dao.CartDao;
//import im.starDust.myapp.dao.ProductDao;
//import im.starDust.myapp.model.Cart;
//import im.starDust.myapp.model.CartItem;
//import im.starDust.myapp.model.Product;
//
///**
// * @author Administrator
// *
// */
//@Controller
//@RequestMapping("/rest/cart")
//public class CartController {
//
//	@Autowired
//	private CartDao cartDao;
//
//	@Autowired
//	private ProductDao productDao;
//
//	@RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
//	public @ResponseBody Cart read(@PathVariable(value = "cartId") String cartId) {
//		return cartDao.read(cartId);
//	}
//
//	@RequestMapping(value = "/{cartId}", method = RequestMethod.PUT)
//	@ResponseStatus(value = HttpStatus.NO_CONTENT)
//	public void update(@PathVariable(value = "cartId") String cartId, @RequestBody Cart cart) {
//		cartDao.update(cartId, cart);
//
//	}
//
//	@RequestMapping(value = "/{cartId}", method = RequestMethod.DELETE)
//	@ResponseStatus(value = HttpStatus.NO_CONTENT)
//	public void delete(@PathVariable(value = "cartId") String cartId) {
//		cartDao.delete(cartId);
//	}
//
//	@RequestMapping(value = "/add/{productId}", method = RequestMethod.PUT)
//	@ResponseStatus(value = HttpStatus.NO_CONTENT)
//	public void addItem(@PathVariable(value = "productId") String productId, HttpServletRequest request) {
//		String sessionId = request.getSession(true).getId();
//		Cart cart = cartDao.read(sessionId);
//
//		if (cart == null) {
//			cart = cartDao.create(new Cart(sessionId));
//		}
//
//		Product product = productDao.getProductById(productId);
//		if (product == null) {
//			throw new IllegalAccessError();
//		}
////		cart.addCartItem(new CartItem(product)); TODO
//		cartDao.update(sessionId, cart);
//	}
//
//	@RequestMapping(value = "/remove/{productId}", method = RequestMethod.PUT)
//	@ResponseStatus(value = HttpStatus.NO_CONTENT)
//	public void removeItem(@PathVariable String productId, HttpServletRequest request) {
//		String sessionId = request.getSession(true).getId();
//		Cart cart = cartDao.read(sessionId);
//
//		if (cart == null) {
//			cart = cartDao.create(new Cart(sessionId));
//		}
//
//		Product product = productDao.getProductById(productId);
//		if (product == null) {
//			throw new IllegalAccessError();
//		}
////		cart.removeCartItem(new CartItem(product)); TODO
//		cartDao.update(sessionId, cart);
//	}
//	
//	@ExceptionHandler(IllegalArgumentException.class)
//	@ResponseStatus(value=HttpStatus.BAD_REQUEST,reason = "Illegal request")
//	public void handlerClientErrors(Exception e){}
//	
//	@ExceptionHandler(IllegalArgumentException.class)
//	@ResponseStatus(value=HttpStatus.BAD_REQUEST,reason = "Illegal serverError")
//	public void handlerServerErrors(Exception e){}
//}