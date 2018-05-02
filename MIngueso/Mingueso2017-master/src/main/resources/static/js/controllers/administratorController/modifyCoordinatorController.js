app.controller('modifyCoordinatorController', ['$scope','$http','$location', '$routeParams', function($scope,$http,$location,$routeParams) {


    $scope.title = "Home - Administrador"

    $scope.go = function ( path ) {
        $location.path( path );
    };

    $scope.updateCoordinator = function(coordinator) {
      console.log($scope.nameUser2);
      console.log($scope.lastName2);
      console.log($scope.email2);
        var datos =
        {
                "name": $scope.nameUser2,
                "lastName": $scope.lastName2,
                "email": $scope.email2,
                "id_teacher": coordinator.id_teacher,
                "rut": coordinator.rut,
                "password": coordinator.password,
                "is_admin": coordinator.is_admin
        };
        $http.put('http://localhost:1919/teacher/' + $routeParams.idCoordinator, datos).then(function (data) {
            window.alert("Se modificó correctamente.");
            go('/administrator/listCoordinator');
        }).catch(function (data) {
            window.alert("Se ha producido un error. :(");
        })
    };

    $scope.getCoordinator = function(){
      $http.get('http://localhost:1919/teacher/' + $routeParams.idCoordinator).then(function(data) {
        $scope.coordinator = data.data;
        $scope.nameUser = $scope.coordinator.name;
        $scope.lastName = $scope.coordinator.lastName;
        $scope.email = $scope.coordinator.email;
        console.log($scope.coordinator);
      });
    };

}]);
