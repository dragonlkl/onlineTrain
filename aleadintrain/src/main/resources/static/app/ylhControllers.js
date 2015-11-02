function YingLinHuiCtrl($scope,$http,$routeParams)
{
	$http.get('/ylh/ylhmain.json').success(function(data) {
    $scope.maindata= data;
  });
}

YingLinHuiMainCtrl.$inject = ['$scope', '$http','$routeParams'];

