app.controller('languageSelectorController', ['$scope', '$http','$location','LanguageService', function ($scope, $http,$location,LanguageService) {

    $scope.setLangPython = function () {
        LanguageService.setLanguage('python');
        $location.path('/student/coding');
    };

    $scope.setLangJava = function () {
        LanguageService.setLanguage('text/x-java');
        $location.path('/student/coding');
    };

    $scope.setLangC = function () {
        LanguageService.setLanguage('text/x-csrc');
        $location.path('/student/coding');
    }

}]);