var app = angular.module('app', ['ui.mask']);

app.controller('ctrl', function($scope) {
  $scope.text = "11111111111111";
  $scope.read = function() 
  {    
    console.log(angular.element('#text').val());    
  }
});