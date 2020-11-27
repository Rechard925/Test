<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<title>Test01</title>
</head>
<body>

<script>
$(document).ready(function(){
	$.getJSON('bread.json',function(data){
		var html = [];
		$.each(data,function(i,item){
			var breadType = item.breadType;
			html.push('<div>breadType: '+item.breadType+'</div>');
			html.push('<div>recipe</div>');
			html.push('<div>flour: '+item.recipe.flour+'</div>');
			html.push('<div>water: '+item.recipe.water+'</div>');
			html.push('<div>')
			if(breadType == "cream"){
				html.push('cream: '+item.recipe.cream);	
			}else if(breadType == "sugar"){
				html.push('sugar: '+item.recipe.sugar);
			}else{
				html.push('butter: '+item.recipe.butter);
			}
			html.push('</div><br>')
		});
		$('#target').html(html.join(''));
	});
});
</script>
<div id="target"></div>
</body>
</html>