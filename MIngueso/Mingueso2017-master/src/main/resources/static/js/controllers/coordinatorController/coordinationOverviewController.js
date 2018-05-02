app.controller('coordinationOverviewController', ['$scope','$http','$location','$routeParams', function($scope,$http,$location,$routeParams) {
    $scope.spinner = true;


    $scope.go = function ( path ) {
        $location.path( path );
    };

    console.log($routeParams.param2);
    $scope.name = "";
    $scope.teacher = ""
    $scope.students = [];
    $scope.getStudentsCoordination = function() {
        $http.get('http://localhost:1919/student/coordination/'+$routeParams.param1).then(function(data) {
            console.log(data)
            $scope.students = data.data;
            $scope.teacher = 'Profesor: '+ data.data[0].coordination.teacher.lastName + ' ' + data.data[0].coordination.teacher.rut;
            $scope.name = 'Coordinacion: '+ $routeParams.param2;

            var sumCompleted = 0;
            var totals = data.data[0].statistic.totals;

            for (var i=0; i<$scope.students.length; i++) {
                sumCompleted = sumCompleted + $scope.students[i].statistic.done_completes;
            }

            var average = sumCompleted/$scope.students.length;


            $scope.data1 = [
                {
                    key: "Avance",
                    y: average,
                    color: '#0c69ff'
                },
                {
                    key: "Faltante",
                    y: totals-average,
                    color: '#ef6e0b'
                }
            ];

            $scope.spinner = false;
        });
    };


    $scope.getStudentsCoordination();

    $scope.options1= {
        chart: {
            type: 'pieChart',
            height: 350,
            x: function(d){return d.key;},
            y: function(d){return d.y;},
            showLabels: true,
            duration: 500,
            labelThreshold: 0.01,
            labelSunbeamLayout: true,
            legend: {
                margin: {
                    top: 5,
                    right: 35,
                    bottom: 5,
                    left: 0
                }
            }
        }
    };

    $scope.viewStatistics = function(mail){
        console.log(mail);
        $location.path('/coordinator/singleStudentStatistics/'+ mail);
    };

}])
