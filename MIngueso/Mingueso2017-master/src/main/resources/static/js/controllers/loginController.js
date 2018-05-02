app.controller('loginController', ['$scope','$location','$http', 'GooglePlus','userService', function($scope,$location,$http,GooglePlus,userService) {
    $scope.title = "Inicio de sesión";

    $scope.go = function ( path ) {
         $location.path( path );
    };

    $scope.devstudent = function(){
        userService.setUser('','Developer','','','','dev')
        $location.path( '/student/home' );
    };
    $scope.devteacher = function(){
        userService.setUser('','Developer','','','','dev')
        $location.path( '/teacher/home' );
    };
    $scope.devcoord = function(){
        userService.setUser('','Developer','','','','dev')
        $location.path( '/coordinator/home' );
    };
    $scope.devadmin = function(){
        userService.setUser('','Developer','','','','dev')
        $location.path( '/administrator/home' );
    };




}]);