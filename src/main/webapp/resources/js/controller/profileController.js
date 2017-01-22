var profileApp = angular.module('ProfileApp',['ngRoute']);

profileApp.config(function($routeProvider) {
    $routeProvider
 // route for the home page
    /*.when('/', {
        templateUrl : '/user/profile',
        controller  : 'MainController'
    })*/
    .when('/friends', {
        templateUrl : 'WEB-INF/views/partials/second.html',
        controller  : 'FriendController'
    })
    .when('/pictures', {
        templateUrl : 'WEB-INF/views/partials/first.html',
        controller  : 'PictureController'
    });
    
});

profileApp.controller('FriendController', function($scope) {
    // create a message to display in our view
    $scope.info = 'Welcome to Oodles';
});
 
profileApp.controller('PictureController', function($scope) {
    $scope.info = 'About Oodles';
});