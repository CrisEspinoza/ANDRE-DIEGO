app.controller('listStudentController', ['$scope','$http','$location', function($scope,$http,$location) {

    $scope.title = "Home - Administrador";

    $scope.go = function ( path ) {
        $location.path( path );
    };
    $scope.getStudents = function() {
    		$http.get('http://localhost:1919/student/all').then(function(data) {
    			$scope.students = data.data;
    		});
    	};
    $scope.delStudent = function(id) {
      	$http.delete('http://localhost:1919/student/' + id).then(function(data) {
          $http.get('http://localhost:1919/student/all').then(function(data) {
      			$scope.students = data.data;
      		});
        });
      };
}]);
