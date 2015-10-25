angular.module('aleadin', []).
  config(['$routeProvider', function($routeProvider) {
  $routeProvider.
      when('/ylhMain', {templateUrl: 'yinlinghuimain.html',   controller: YingLinHuiMainCtrl});
}]);