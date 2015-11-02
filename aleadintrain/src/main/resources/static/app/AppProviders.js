angular.module('aleadin', []).
  config(['$routeProvider', function($routeProvider) {
  $routeProvider.
      when('/ylh/main.do', {templateUrl: 'yinlinghuimain.html',   controller: YingLinHuiCtrl});
}]);