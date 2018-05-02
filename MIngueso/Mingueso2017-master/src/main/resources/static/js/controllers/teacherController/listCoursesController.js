app.controller('listCoursesController', ['$scope','$http','$location','userService', function($scope,$http,$location,userService) {
    $scope.title = "Home - Profesor"
    $scope.spinner = true;
    $scope.go = function ( path ) {
        $location.path( path );
    };
    $scope.getStudents = function(id) {
    		$http.get('http://localhost:1919/student/coordination'+id).then(function(data) {
    			$scope.students = data.data;
    		});
    	};

    $scope.coordinations = [];
    $scope.getCoordinations = function () {
        $scope.teacher = userService.getUser();
        console.log($scope.teacher.email);
        $http.get('http://localhost:1919/coordination/'+$scope.teacher.email).then(function(data) {
            console.log(data);
            $scope.coordinations = data.data;
            $scope.spinner = false;
        });
    };
    $scope.getCoordinations();


}]) ;
