/**
 * 
 */

var cartApp = angular.module("cartApp", []);
cartApp.controller("cartCtrl", function($scope, $http) {
	$scope.refreshCart = function(cartId) {
		$http.get('/myapp/rest/cart/' + $scope.cartId).success(function(data) {
			$scope.cart = data;
		})
	};
//TODO
	
	
	
	
	
	$scope.clearCart = function() {
		$http,delete ('/myapp/rest/cart/' + $scope.cartId).success($scope.refreshCart($scope.cartId));
	};

	$scope.initCartId = function(cartId) {
		$scope.cartId = cartId;
		$scope.refreshCart(cartId);
	};

	$scope.addToCart = function(productId) {
		$http.put('/myapp/rest/cart/add/' + productId).success(function(data) {
			$scope.refreshCart($http.get('/myapp/rest/cart/cartId'));
			alert("Product successfully added to the cart!")
		});
	};

	$scope.removeFromCart = function(productId) {
		$http.put('/myapp/rest/cart/remove/' + productId).success(
				function(data) {
					$scope.refreshCart($http.get('/myapp/rest/cart/cartId'));
				});
	};
});