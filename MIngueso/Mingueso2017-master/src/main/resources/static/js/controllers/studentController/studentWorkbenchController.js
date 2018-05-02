app.controller('studentWorkbenchController', ['$scope','$http','$location', 'ExcerciseService', function($scope,$http,$location, ExcerciseService) {
    $scope.excerciseData = null;
    $scope.tries = 0;
    $scope.excercise = ExcerciseService.getExcercise();
    $scope.spinner = true;  //Boolean to show the loader wheel
    $scope.resultsDiv = false; //Boolean to show the coding results
    $scope.buttons = true;  //Boolean to show the send button and back button
    $scope.results = false;

    $scope.codemirrorSetting = {
        mode: "python",
        lineNumbers: true,
        theme: "material"
    };

    $scope.getExercise = function() {
        $http.get('http://localhost:1919/exercise/' + $scope.excercise).then(function(data) {
            $scope.excerciseData = data.data;
        });
    };

    $scope.go = function ( path ) {
        $location.path( path );
    };

    $scope.sendExcercise = function () {
        $scope.buttons = false;
        $scope.resultsDiv =true;
        var solution = {
            "lang": "Python",
            "code": $scope.value,
            "p1": $scope.excerciseData.parametro1,
            "p2": $scope.excerciseData.parametro2,
            "p3": $scope.excerciseData.parametro3,
            "function": $scope.excerciseData.functionName
        };

        console.log(solution);
        $http.post('http://207.154.197.207:1313/code', solution).then(function (response) {
            console.log(response);
            $scope.errors = response.data.error;
            $scope.output = response.data.output;
            $scope.status = response.data.statusCode;
            console.log(status);
            $scope.buttons = true;
            $scope.spinner = false;
            $scope.results = true;
            var stats  = 0;
            if (response.data.p1 === $scope.excerciseData.respuesta1){
                stats += 1;
            }
            if (response.data.p2 === $scope.excerciseData.respuesta2){
                stats += 1;
            }
            if (response.data.p3 === $scope.excerciseData.respuesta3){
                stats += 1;
            }
            $scope.resStats = Math.round(stats/3 * 100);
            $scope.tries +=1;
        });

    }

}]);