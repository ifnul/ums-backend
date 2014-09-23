var mainModule = angular.module("mainModule", ['ngResource', 'ui.bootstrap']);

mainModule.factory('Pictures', function ($resource) {
    return $resource('http://localhost:8080/funny-pictures-rest-api/api/pictures/:id', {}, {'query': {method: 'GET', isArray: false}});
});

mainModule.filter('groupBy', function () {
    return function (items, groupedBy) {
        if (items) {
            var finalItems = [], thisGroup;
            for (var i = 0; i < items.length; i++) {
                if (!thisGroup) {
                    thisGroup = [];
                }
                thisGroup.push(items[i]);
                if (((i + 1) % groupedBy) === 0) {
                    finalItems.push(thisGroup);
                    thisGroup = null;
                }
            }
            if (thisGroup) {
                finalItems.push(thisGroup);
            }
            return finalItems;
        }
    };
});

mainModule.directive('header', function () {
    return {
        restrict: 'E',
        templateUrl: "../html/directives/header.html"

    };
});

mainModule.directive('footer', function () {
    return {
        restrict: 'E',
        templateUrl: "../html/directives/footer.html"

    };
});

mainModule.controller('MainControler', [ '$scope', '$http' , 'Pictures' , function ($scope, $http, Pictures) {
    $scope.imagePreview = "test.jpeg";
    $scope.alerts = [];
    $scope.currentPage = 0;
    $scope.totalItems = 11;
    $scope.itemsPerPage = 6;
    $scope.test ={};

    Pictures.query({
        offset : 0,
        limit : 10
    }, function (pictures) {
        $scope.pictures = pictures.entities;
        $scope.test = $scope.pictures;
    }, function (error) {
        $scope.totalItems = 0;
        $scope.alerts.push({type: 'danger', msg: error.statusText + " " + error.status });
    });

    $scope.pageChanged = function () {
        console.log('Page changed to: ' + $scope.currentPage);
    };

    $scope.showPagination = function () {
        return $scope.totalItems != 0;
    };

    $scope.closeAlert = function (index) {
        $scope.alerts.splice(index, 1);
    };

} ]);


