app = angular.module('aleadin', []);
app.controller("YingLinHuiCtrl",function YingLinHuiCtrl($scope,$http,$routeParams)
{
	$http.get('/ylh/ylhmain.json').success(function(data) {
    $scope.maindata= data;
  });
});