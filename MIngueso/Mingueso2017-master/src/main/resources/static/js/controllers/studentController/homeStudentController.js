app.controller('homeStudentController', ['$scope','$http','$location', function($scope,$http,$location) {

    $scope.title = "Home - Estudiante"

    $scope.go = function ( path ) {
        $location.path( path );
    };

    $scope.loginStudent = $location.path() === '/student/home';

    $scope.navigation = [
	    {"text":"Cerrar sesion",   "link":"#!/login", "condition": $scope.loginStudent}
	];

}]);