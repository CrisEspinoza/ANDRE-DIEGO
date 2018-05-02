app.controller('listStudentControllerTeacher', ['$scope','$http','$location', function($scope,$http,$location) {
    $scope.title = "Home - Profesor"
    $scope.students = [];
    $scope.go = function ( path ) {
        $location.path( path );
    };
    $scope.spinner = true;
    $scope.viewStatistics = function(mail){
        console.log(mail);
        $location.path('/teacher/studentStatistics/'+ mail);
    };

    $scope.getStudents1 = function() {
        console.log('entre');
        $http.get('http://localhost:1919/student/all').then(function(data) {
            $scope.students = data.data;
            $scope.spinner = false;
        });
    };
    $scope.getStudents1();

}]) ;