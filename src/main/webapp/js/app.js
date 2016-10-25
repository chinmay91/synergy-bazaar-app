
//storeApp this variable which points to FruitStore
var storeApp = angular.module('synergyBazaar', ['ngRoute'])

					/**
					 * Configure the Routes
					 */
					.config(['$routeProvider', function ($routeProvider) {
	
							$routeProvider
							// Home
						    .when("/", {templateUrl: "views/landing.html", controller: "LandingCtrl"})
						    // Pages
						    /*.when("/about", {templateUrl: "partials/about.html", controller: "PageCtrl"})
						    .when("/faq", {templateUrl: "partials/faq.html", controller: "PageCtrl"})
						    .when("/pricing", {templateUrl: "partials/pricing.html", controller: "PageCtrl"})
						    .when("/services", {templateUrl: "partials/services.html", controller: "PageCtrl"})
						    .when("/contact", {templateUrl: "partials/contact.html", controller: "PageCtrl"})
						    // Blog
						    .when("/blog", {templateUrl: "partials/blog.html", controller: "BlogCtrl"})
						    .when("/blog/post", {templateUrl: "partials/blog_item.html", controller: "BlogCtrl"})
						    // else 404*/
						    .otherwise("/404", {templateUrl: "../views/404file.html", controller: "LandingCtrl"});
							
}]);

