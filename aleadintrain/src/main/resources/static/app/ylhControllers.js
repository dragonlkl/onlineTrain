var YingLinHuiCtrl = function ($scope,$http)
{
	$http.get('/ylh/main.json').success(function(data) {
    $scope.data= data;
  });
}
app.controller("YingLinHuiCtrl",YingLinHuiCtrl);

