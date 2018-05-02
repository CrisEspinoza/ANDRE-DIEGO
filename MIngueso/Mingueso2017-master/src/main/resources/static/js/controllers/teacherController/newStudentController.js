app.controller('newStudentController', ['$scope','$http','$location', function($scope,$http,$location) {
    $scope.title = "Home - Nuevo estudiante";

    $scope.addStudent = function() {
        var d =
            {
                "name": $scope.nameUser,
                "lastName": $scope.lastName,
                "rut": $scope.rut,
                "email": $scope.email
                //"id_coordination": $scope.id_coordination
            };
        $http.post('http://localhost:1919/student/new', d).then(function (data) {
            window.alert("Alumno agregado correctamente.");
            $scope.nameUser = "";
            $scope.rut = "";
            $scope.email = "";
            $scope.lastName = "";
        }).catch(function (data) {
            window.alert("Se ha producido un error.");
        })
    };

    $scope.go = function ( path ) {
        $location.path( path );
    };

    $scope.rutCompleter = function () {
        var rut_input = $scope.rut;
        if(rut_input.length <= 12) {
            var rut = rut_input.replace(/[^0-9kK]+/g, '');
            var rut_format = '';
            var last = rut.length - 1;
            for (var i = last; i >= 0; i--) {
                rut_format = rut[i] + rut_format;
                if (i == last)
                    rut_format = '-' + rut_format;
                else if ((last - i) % 3 == 0)
                    rut_format = '.' + rut_format;
            }
            $scope.rut = rut_format;
        }
    };

    }]);
