$().ready(function(){
//var form= email.val();
var password=password.val();
 form.password(function(){
var letters = /^[A-Za-z]+$/;
      if(password.match(letters))	{
return false;			 }
else{return true;}


}});




/*

("custom").validate({
numberCheck: function()
	{
	var letters = /^[A-Za-z]+$/;
      if(y.match(letters))	{
return false;			 }
else{return true;}
	}
		});*/
