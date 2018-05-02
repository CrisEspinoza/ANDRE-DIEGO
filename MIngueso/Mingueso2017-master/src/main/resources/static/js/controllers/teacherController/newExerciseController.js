app.controller('newExerciseController', ['$scope','$http','$location', function($scope,$http,$location) {
    $scope.titl = "Home - Nuevo ejercicio"

    $scope.go = function ( path ) {
        $location.path( path );
    };

	$scope.addExercise = function() {
            var d = {
                "answer": $scope.answer,
                "text": $scope.text,
                "title": $scope.otro,
                "type": $scope.type,
                "parametro1": $scope.parametro1,
                "respuesta1": $scope.resultado1,
                "parametro2": $scope.parametro2,
                "respuesta2": $scope.resultado2,
                "parametro3": $scope.parametro3,
                "respuesta3": $scope.resultado3,
                "functionName": $scope.funct
            };
            console.log(d);
    		$http.post('http://localhost:1919/exercise/new', d)
            .then(function(data) {
    			window.alert("Se agregó correctamente el enunciado.");
    			$scope.otro = "";
    			$scope.text = "";
          $scope.answer = "";
    		}).catch(function(data) {
    			window.alert("Se ha producido un error.");
    		});
    	};


}]);
