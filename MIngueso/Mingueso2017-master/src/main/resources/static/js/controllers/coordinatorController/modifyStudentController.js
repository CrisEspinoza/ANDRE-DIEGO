app.controller('modifyStudentController', ['$scope','$http','$location', function($scope,$http,$location) {

    $scope.title = "Home - Coordinador"

    $scope.go = function ( path ) {
        $location.path( path );
    };

}]);