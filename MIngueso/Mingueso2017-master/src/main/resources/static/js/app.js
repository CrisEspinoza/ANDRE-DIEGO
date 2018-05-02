var app = angular.module('Myapp',['ngRoute', 'ui.codemirror', 'googleplus','nvd3']);

app.config(['GooglePlusProvider', function(GooglePlusProvider) {
    GooglePlusProvider.init({
        clientId: '401475042622-io17gpkn0aqungvhhm9mfnitc3ls5jh3.apps.googleusercontent.com',
        apiKey: 'XBpM08bYtNfDvY45D4ITlxAz',
        hostedDomain: 'usach.cl'
    });

}]);

app.factory('userService',['$rootScope',function($rootScope){
    var user = {};
    return {
        getUser : function () {
            return user;
        },

        setUser : function (email, name, hd, id, picture, role) {
            user.email = email;
            user.name = name;
            user.hd = hd;
            user.id = id;
            user.picture = picture;
            user.role = role;
        }
    }
}]);

app.factory('LanguageService',['$rootScope',function($rootScope){
    var language = null;
    return {
        getLanguage : function () {
            return language;
        },

        setLanguage : function (lang) {
            language = lang;
        }
    }
}]);

app.factory('ExcerciseService',['$rootScope',function ($rootScope) {
    var excercise = null;
    return{
        getExcercise : function () {
            return excercise;
        },

        setExcercise : function (exce) {
            excercise = exce;
        }
    }
}]);



app.config(function($routeProvider){
    $routeProvider

        //Student
        .when('/student/home',{
            templateUrl: 'js/views/student/homeStudent.html',
            controller: 'homeStudentController'
        })

        .when('/student/language',{
            templateUrl: 'js/views/student/languageSelectorView.html',
            controller: 'languageSelectorController'
        })

        .when('/student/coding',{
                    templateUrl: 'js/views/student/coding.html',
                    controller: 'codingViewController'
        })

        .when('/student/exercisesStudent',{
                    templateUrl: 'js/views/student/exercisesStudent.html',
                    controller: 'exerciseStudentController'
        })

        .when('/student/workbench',{
                    templateUrl: 'js/views/student/studentWorkbench.html',
                    controller: 'studentWorkbenchController'
        })

        //Teacher
        .when('/teacher/home',{
            templateUrl: 'js/views/teacher/homeTeacher.html',
            controller: 'homeTeacherController'
        })

        .when('/teacher/exercises',{
                    templateUrl: 'js/views/teacher/exercises.html',
                    controller: 'exercisesController'
        })

        .when('/teacher/listCourses',{
                    templateUrl: 'js/views/teacher/listCourses.html',
                    controller: 'listCoursesController'
        })

        .when('/teacher/newStudent',{
                    templateUrl: 'js/views/teacher/newStudent.html',
                    controller: 'newStudentController'
        })

        .when('/teacher/newExercise',{
                    templateUrl: 'js/views/teacher/newExercise.html',
                    controller: 'newExerciseController'
        })

        .when('/teacher/listStudent',{
            templateUrl: 'js/views/teacher/listStudentTeacher.html',
            controller: 'listStudentControllerTeacher'
        })
        .when('/teacher/studentStatistics/:param1',{
            templateUrl: 'js/views/teacher/studentStatistics.html',
            controller: 'studentStatisticsController'
        })

        //Coordinator

        .when('/coordinator/newExercises',{
                    templateUrl: 'js/views/coordinator/newExercisesCoordinator.html',
                    controller: 'newExercisesCoordinatorController'
        })

        .when('/coordinator/newTeacher',{
                    templateUrl: 'js/views/coordinator/newTeacher.html',
                    controller: 'newTeacherController'
        })

        .when('/coordinator/listTeacher',{
                    templateUrl: 'js/views/coordinator/listTeacher.html',
                    controller: 'listTeacherController'
        })

        .when('/coordinator/listStudent',{
                    templateUrl: 'js/views/coordinator/listStudent.html',
                    controller: 'listStudentController'
        })

        .when('/coordinator/home',{
                    templateUrl: 'js/views/coordinator/homeCoordinator.html',
                    controller: 'homeCoordinatorController'
        })
        .when('/coordinator/listCoordinations',{
            templateUrl: 'js/views/coordinator/listCoordinations.html',
            controller: 'listCoordinationsController'
        })
        .when('/coordinator/coordinationOverview/:param1/:param2',{
            templateUrl: 'js/views/coordinator/coordinationOverview.html',
            controller: 'coordinationOverviewController'
        })

        .when('/coordinator/singleStudentStatistics/:param1',{
            templateUrl: 'js/views/coordinator/singleStudentStatistics.html',
            controller: 'singleStudentStatisticsController'
        })

        //Administrator
        .when('/administrator/home',{
                    templateUrl: 'js/views/administrator/homeAdmin.html',
                    controller: 'homeAdministratorController'
        })

        .when('/administrator/modifyCoordinator/:idCoordinator',{
                    templateUrl: 'js/views/administrator/modifyCoordinator.html',
                    controller: 'modifyCoordinatorController'
        })

        .when('/administrator/modifyStudent',{
                    templateUrl: 'js/views/administrator/modifyStudent.html',
                    controller: 'modifyStudentController'
        })

        .when('/administrator/modifyTeacher',{
                    templateUrl: 'js/views/administrator/modifyTeacher.html',
                    controller: 'modifyTeacherController'
        })

        .when('/administrator/newUser',{
                    templateUrl: 'js/views/administrator/newUser.html',
                    controller: 'newUserController'
        })

        .when('/administrator/listCoordinator',{
                    templateUrl: 'js/views/administrator/listCoordinator.html',
                    controller: 'listCoordinatorController'
        })

        .when('/administrator/listStudent',{
                    templateUrl: 'js/views/administrator/listStudentTeacher.html',
                    controller: 'listStudentController'
        })

        .when('/administrator/listTeacher',{
                    templateUrl: 'js/views/administrator/listTeacher.html',
                    controller: 'listTeacherController'
        })

        //Other
        .when('/login',{
                    templateUrl: 'js/views/login.html',
                    controller: 'loginController'
        })

        .otherwise({
            redirectTo: '/index'
        });
});

app.run( function($rootScope, $location,userService) {

    // register listener to watch route changes
    $rootScope.$on( "$routeChangeStart", function(event, next, current) {
        if ( userService.getUser().role == null ) {
            // no logged user, we should be going to #login
            if ( next.templateUrl == "js/views/login.html" ) {
                // already going to #login, no redirect needed
            }
            else {
                // not going to #login, we should redirect now
                $location.path( "/login" );
            }
        }
        else if(userService.getUser().role == 'student'){
            console.log(next.templateUrl);
            if ( next.templateUrl == "js/views/student/coding.html" || next.templateUrl == "js/views/student/exercisesStudent.html"||
                next.templateUrl == "js/views/student/homeStudent.html" || next.templateUrl == "js/views/student/languageSelectorView.html" ||
                next.templateUrl == "js/views/student/studentWorkbench.html") {
                // already going to #login, no redirect needed
            }
            else {
                // not going to #login, we should redirect now
                $location.path( "/student/home" );
            }
        }
        else if(userService.getUser().role == 'teacher'){
            console.log(next.templateUrl)
            if ( next.templateUrl == "js/views/teacher/exercises.html" || next.templateUrl == "js/views/teacher/homeTeacher.html"||
                next.templateUrl == "js/views/teacher/newExercise.html" || next.templateUrl == "js/views/teacher/newStudent.html"||
                next.templateUrl == "js/views/teacher/listCourses.html"|| next.templateUrl == "js/views/teacher/studentStatistics.html"||
                next.templateUrl == "js/views/teacher/listStudentTeacher.html") {
                // already going to #login, no redirect needed
            }
            else {
                // not going to #login, we should redirect now
                $location.path( "/teacher/home" );
            }
        }
        else if(userService.getUser().role == 'coordinator'){
            if ( next.templateUrl == "js/views/coordinator/homeCoordinator.html" || next.templateUrl == "js/views/coordinator/listStudent.html"||
                next.templateUrl == "js/views/coordinator/listTeacher.html" || next.templateUrl == "js/views/coordinator/modifyStudent.html"||
                next.templateUrl == "js/views/coordinator/modifyTeacher.html"||next.templateUrl == "js/views/coordinator/newExercisesCoordinator.html"||
                next.templateUrl == "js/views/coordinator/newTeacher.html" || next.templateUrl == "js/views/coordinator/listCoordinations.html"
            || next.templateUrl == "js/views/coordinator/coordinationOverview.html" || next.templateUrl == "js/views/coordinator/singleStudentStatistics.html") {
                // already going to #login, no redirect needed
            }
            else {
                // not going to #login, we should redirect now
                $location.path( "/coordinator/home" );
            }
        }
        else if(userService.getUser().role == 'administrator'){
            if ( next.templateUrl == "js/views/administrator/homeAdmin.html" || next.templateUrl == "js/views/administrator/listCoordinator.html"||
                next.templateUrl == "js/views/administrator/listStudentTeacher.html" || next.templateUrl == "js/views/administrator/listTeacher.html"||
                next.templateUrl == "js/views/administrator/modifyTeacher.html"||next.templateUrl == "js/views/administrator/modifyStudent.html"||
                next.templateUrl == "js/views/administrator/modifyCoordinator.html"||next.templateUrl == "js/views/administrator/newUser.html") {
                // already going to #login, no redirect needed
            }
            else {
                // not going to #login, we should redirect now
                $location.path( "/administrator/home" );
            }
        }

    });
});
