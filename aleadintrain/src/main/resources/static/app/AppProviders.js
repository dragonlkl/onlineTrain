(function(angular) {
  'use strict';
angular.module('aleadin', ['ngRoute', 'ngAnimate'])
  .config(['$routeProvider', '$locationProvider',
    function($routeProvider, $locationProvider) {
      $routeProvider
        .when('/ylh/main.do', {
          templateUrl: 'ylh/yinlinghuimain.html',
          controller: 'YingLinHuiMainCtrl',
          controllerAs: 'ylhmain'
        });
      alert("config");
      $locationProvider.html5Mode(true);
  }])
  .controller('YingLinHuiMainCtrl', ['$scope','$http','$route','$routeParams','$location',
    function($scope,$http,$route, $routeParams, $location) {
      this.$route = $route;
      this.$location = $location;
      this.$routeParams = $routeParams;
      alert("wwwwwwww");
      $http.get('/ylh/main.json').success(function(data) {
    	    $scope.data= data;
    	  });
  }]);
})(window.angular);
alert("init end");
