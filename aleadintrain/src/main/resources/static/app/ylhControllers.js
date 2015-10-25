function YingLinHuiMainCtrl($scope,$http)
{
	$http.get('/ylhmain.json').success(function(data) {
    $scope.maindata= data;
  });
}

YingLinHuiMainCtrl.$inject = ['$scope', '$routeParams'];

