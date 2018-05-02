app.controller('exercisesController', ['$scope','$http','$location', function($scope,$http,$location) {
    $scope.title = "Home - Profesor"

    $scope.go = function ( path ) {
        $location.path( path );
    };
}]) ;
