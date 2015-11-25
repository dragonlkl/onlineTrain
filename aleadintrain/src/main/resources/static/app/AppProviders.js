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
        })
        .when('/ylh/eliteclass/:classid', {
            templateUrl: 'ylh/eliteclass.html',
            controller: 'EliteClassCtrl',
            controllerAs: 'eliteClass'
          });
      
      $locationProvider.html5Mode(true);
  }])
  
  .controller('YingLinHuiMainCtrl', ['$scope','$http','$route','$routeParams','$location',
    function($scope,$http,$route, $routeParams, $location) {
      this.$route = $route;
      this.$location = $location;
      this.$routeParams = $routeParams;
      $http.get('/ylh/main.json').success(function(data) {
    	    $scope.data= data;
    	  });
  }])
  .controller('EliteClassCtrl', ['$scope','$http','$route','$routeParams','$location',
    function($scope,$http,$route, $routeParams, $location) {
      this.$route = $route;
      this.$location = $location;
      this.$routeParams = $routeParams;
      alert($routeParams.classid);
      $http.get('/ylh/eliteclass.json/'+$routeParams.classid).success(function(data) {
    	    $scope.data= data;
    	  });
  }]);
})(window.angular);
