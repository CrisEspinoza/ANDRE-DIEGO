app.controller('singleStudentStatisticsController', ['$scope','$http','$location','$routeParams', function($scope,$http,$location,$routeParams) {
    $scope.name= "";
    $scope.rut = "";
    $scope.mail = "";

    $scope.spinner = true;

    $scope.idc = "";
    $scope.cname = "";

    $scope.go = function ( path ) {
        $location.path( path +'/'+$scope.idc+'/'+$scope.cname);
    };



    $scope.getStudent = function(){
        $http.get('/student/get/'+$routeParams.param1).then(function (data) {
            console.log(data.data);
            $scope.name = data.data[0].name;
            $scope.rut = data.data[0].rut;
            $scope.mail = data.data[0].email;

            $scope.user = data.data[0];


            $scope.idc = $scope.user.coordination.id_coordination;
            $scope.cname = $scope.user.coordination.name_coordination;


            $scope.data1 = [
                {
                    key: "Avance",
                    y: $scope.user.statistic.done_completes,
                    color: '#0c69ff'
                },
                {
                    key: "Faltante",
                    y: $scope.user.statistic.totals-$scope.user.statistic.done_completes,
                    color: '#ef6e0b'
                }
            ];


            $scope.data2 = {
                "title": "Condicional",
                "subtitle": "[Cantidad Ejercicios]",
                "ranges": [0,$scope.user.statistic.totals_condi],
                "measures": [$scope.user.statistic.done_conditional],
                "markers": [$scope.user.statistic.done_conditional],
                "color": '#ef0a0a'
            }

            $scope.data3 = {
                "title": "Recursión",
                "subtitle": "[Cantidad Ejercicios]",
                "ranges": [0,$scope.user.statistic.totals_recursive],
                "measures":  [$scope.user.statistic.done_recursive],
                "markers": [$scope.user.statistic.done_recursive],
                "color": '#efe70a'
            }

            $scope.data4 = {
                "title": "Iteración",
                "subtitle": "[Cantidad Ejercicios]",
                "ranges": [0,$scope.user.statistic.totals_iterative],
                "measures": [$scope.user.statistic.done_iterative],
                "markers": [$scope.user.statistic.done_iterative],
                "color": '#06e815'
            }

            $scope.data5 = {
                "title": "Listas",
                "subtitle": "[Cantidad Ejercicios]",
                "ranges": [0,$scope.user.statistic.totals_list],
                "measures":[$scope.user.statistic.done_list],
                "markers": [$scope.user.statistic.done_list],
                "color": '#06e1e5'
            }

            $scope.data6 = {
                "title": "Funciones",
                "subtitle": "[Cantidad Ejercicios]",
                "ranges": [0,$scope.user.statistic.totals_function],
                "measures": [$scope.user.statistic.done_function],
                "markers": [$scope.user.statistic.done_function],
                "color": '#dd08b3'
            }


            $scope.spinner = false;
        });
    };
    $scope.getStudent();




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

    $scope.options2= {
        chart: {
            type: 'bulletChart',
            duration: 500
        }
    };


}])