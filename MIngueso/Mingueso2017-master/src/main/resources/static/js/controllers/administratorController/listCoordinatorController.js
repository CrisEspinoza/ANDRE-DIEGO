app.controller('listCoordinatorController', ['$scope','$http','$location', function($scope,$http,$location) {

    $scope.title = "Home - Administrador";

    $scope.go = function ( path ) {
        $location.path( path );
    };

    $scope.getCoordinares = function() {
    		$http.get('http://localhost:1919/teacher/allCoordinares').then(function(data) {
    			$scope.coordinares = data.data;
    		});
    	};
    $scope.delCoordinator = function(id) {
      	$http.delete('http://localhost:1919/teacher/' + id).then(function(data) {
          $http.get('http://localhost:1919/teacher/allCoordinares').then(function(data) {
      			$scope.coordinares = data.data;
      		});
        });
      };
    $scope.goTo2 = function(idCoordinator) {
      $location.url('/administrator/modifyCoordinator/' + idCoordinator);
    };

    $scope.hola = function(){
      console.log("hola");
    };

}]);
