app.controller('exerciseStudentController', ['$scope','$http','$location', 'ExcerciseService', function($scope,$http,$location, ExcerciseService) {

    $scope.go = function ( path ) {
        $location.path( path );
    };

	$scope.getExercises = function() {
    		$http.get('http://localhost:1919/exercise/all').then(function(data) {
    			$scope.exercises = data.data;
    		});	
    	};

	$scope.doExcercise = function (id) {
        ExcerciseService.setExcercise(id);
		$location.path('/student/workbench');
    }

}]);