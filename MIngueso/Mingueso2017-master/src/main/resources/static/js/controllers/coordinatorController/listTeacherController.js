app.controller('listTeacherController', ['$scope','$http','$location', function($scope,$http,$location) {

    $scope.title = "Home - Coordinador"

    $scope.go = function ( path ) {
        $location.path( path );
    };

    $scope.getTeachers = function() {
    		$http.get('http://localhost:1919/teacher/allTeachers').then(function(data) {
    			$scope.teachers = data.data;
    		});
    	};
    $scope.delTeacher = function(id) {
      	$http.delete('http://localhost:1919/teacher/' + id).then(function(data) {
          $http.get('http://localhost:1919/teacher/allTeachers').then(function(data) {
      			$scope.teachers = data.data;
      		});
        });
      };

}]);
