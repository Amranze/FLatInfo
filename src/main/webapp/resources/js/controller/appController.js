angular.module( "homeController", ['ngAutocomplete'])
  .controller("autoCompleteCtrl",function ($scope) {
	
	$scope.result = '';
	$scope.options = {
	  country: 'fr',
	  types: 'address'
	};    
	$scope.details = '';
	    
  });