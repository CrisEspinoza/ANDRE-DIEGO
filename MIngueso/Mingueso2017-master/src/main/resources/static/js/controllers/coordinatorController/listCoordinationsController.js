app.controller('listCoordinationsController', ['$scope','$http','$location', function($scope,$http,$location) {
    $scope.spinner = true;
    $scope.coordinations = [];

    $scope.coordinationStatistics = function(id,name){
        $location.path('/coordinator/coordinationOverview/'+ id+'/'+name);
    };

    $scope.getAllCoordinations = function() {
        $http.get('http://localhost:1919/coordination/all').then(function(data) {
            console.log(data)
            $scope.coordinations = data.data;
            $scope.spinner = false;


        });
    };

    $scope.getAllCoordinations();

    $scope.go = function ( path ) {
        $location.path( path );
    };


}])