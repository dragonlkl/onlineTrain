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
          })
          .when('/ylh/mainslide/:classid', {
            templateUrl: 'ylh/eliteclass.html',
            controller: 'EliteClassCtrl',
            controllerAs: 'eliteClass'
          })
          .when('/ylh/superstarcourse', {
            templateUrl: 'ylh/superstarcourse.html',
            controller: 'SuperStarCourseCtrl',
            controllerAs: 'SuperStarCourse'
          })
          .when('/ylh/elitecourse', {
            templateUrl: 'ylh/elitecourse.html',
            controller: 'EliteCourseCtrl',
            controllerAs: 'elitecourse'
          })
          .when('/ylh/topicarticle', {
            templateUrl: 'ylh/topicarticle.html',
            controller: 'TopicArticleCtrl',
            controllerAs: 'topicarticle'
          })
          .when('/ylh/datebar', {
            templateUrl: 'ylh/datebar.html',
            controller: 'dateBarCtrl',
            controllerAs: 'datebar'
          })
          .when('/careerpreview/onlinecourse', {
            templateUrl: 'careerpreview/careerpreviewonlinecourse.html',
            controller: 'OnlineCourseCtrl',
            controllerAs: 'onlinecourse'
          })
          .when('/careerpreview/offlinecourse', {
            templateUrl: 'careerpreview/careerpreviewofflinecourse.html',
            controller: 'OfflineCourseCtrl',
            controllerAs: 'offlinecourse'
          })
          .when('/careerpreview/offlineclass/:offclassid', {
            templateUrl: 'careerpreview/careerpreviewofflineclass.html',
            controller: 'OfflineClassCtrl',
            controllerAs: 'offlineclass'
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
      $http.get('/ylh/eliteclass.json/'+$routeParams.classid).success(function(data) {
    	    $scope.data= data;
    	  });
  }])
  .controller('SuperStarCourseCtrl', ['$scope','$http','$route','$routeParams','$location',
    function($scope,$http,$route, $routeParams, $location) {
      this.$route = $route;
      this.$location = $location;
      this.$routeParams = $routeParams;
      $http.get('/ylh/superstarcourse.json').success(function(data) {
    	    $scope.data= data;
    	  });
  }])
  .controller('EliteCourseCtrl', ['$scope','$http','$route','$routeParams','$location',
    function($scope,$http,$route, $routeParams, $location) {
      this.$route = $route;
      this.$location = $location;
      this.$routeParams = $routeParams;
      $http.get('/ylh/elitecourse.json').success(function(data) {
    	    $scope.data= data;
    	  });
  }])
  .controller('TopicArticleCtrl', ['$scope','$http','$route','$routeParams','$location',
    function($scope,$http,$route, $routeParams, $location) {
      this.$route = $route;
      this.$location = $location;
      this.$routeParams = $routeParams;
      $http.get('/ylh/topicarticle.json').success(function(data) {
    	    $scope.data= data;
    	  });
  }])
  .controller('dateBarCtrl', ['$scope','$http','$route','$routeParams','$location',
    function($scope,$http,$route, $routeParams, $location) {
      this.$route = $route;
      this.$location = $location;
      this.$routeParams = $routeParams;
      $http.get('/ylh/datebar.json').success(function(data) {
    	    $scope.data= data;
    	  });
  }])
  .controller('OnlineCourseCtrl', ['$scope','$http','$route','$routeParams','$location',
    function($scope,$http,$route, $routeParams, $location) {
      this.$route = $route;
      this.$location = $location;
      this.$routeParams = $routeParams;
      $http.get('/careerpreview/onlinecourse.json').success(function(data) {
    	    $scope.data= data;
    	  });
  }])
  .controller('OfflineCourseCtrl', ['$scope','$http','$route','$routeParams','$location',
    function($scope,$http,$route, $routeParams, $location) {
      this.$route = $route;
      this.$location = $location;
      this.$routeParams = $routeParams;
      $http.get('/careerpreview/offlinecourse.json').success(function(data) {
    	    $scope.data= data;
    	  });
  }])
  .controller('OfflineClassCtrl', ['$scope','$http','$route','$routeParams','$location',
    function($scope,$http,$route, $routeParams, $location) {
      this.$route = $route;
      this.$location = $location;
      this.$routeParams = $routeParams;
      $http.get('/careerpreview/offlineclass.json'+$routeParams.offclassid).success(function(data) {
    	    $scope.data= data;
    	  });
  }]);
})(window.angular);
