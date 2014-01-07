<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<body>
<style>
table
{width:70%}
{
border-collapse:collapse;
}
.cd
{background-color:#A7C942;
height: 30px}
.cdd
{
background-color:#EAF2D3
}
td
{text-align: center}
td
{
padding:5px;
}
</style>

 <table border="1">

<thead class="cd">
    <tr>

      <th>Attributes</th>
      <th>values</th>
    </tr>
  </thead>
       <tr>
               <td>Name</td>
		<td> Nafiz </td>
       </tr>
       <tr class="cdd">
               <td>fb ID</td>
		<td>3223</td>
       </tr>
       <tr>
               <td>email</td>
		<td>dhrubonill@yahoo.com</td>
       </tr>
       <tr class="cdd">
               <td>First Name</td>
		<td>Nafiz</td>
       </tr>
 	<tr>
               <td>Last name</td>
		<td>Rahman</td>
       </tr>
 <tr class="cdd">
               <td>user name</td>
		<td>dhrubonill</td>
</tr>
</head>
<h1>
	Heya!!!!! 
</h1>
<p>This is my first project</p>
<a href="${pageContext.request.contextPath}/newpage">another page link</a>

<P>  The time on the server is ${serverTime}. </P>
<button type="button" onclick="myFunction()">Try it</button>
<script>
function myFunction()
{
	alert("Hellow world!");
}
</script>
<form>
First number: <input type="text" id=n1 name="firstname"><br>
Last number: <input type="text" id=n2 name="lastname">
<button type="button" onclick="sum()">Try it</button>
<p id="demo2">Result?? </p>
Email: <input type="text" id=n3 name="n3"> <br>
<button type="submit" onclick="validForm()">Submit</button>

</form>
<script>
function sum() 
{ 
    var fn, ln, result; 
    fn = parseInt(document.getElementById("n1").value, 10);
    ln = parseInt(document.getElementById("n2").value, 10);
    result =  (fn+ln); 
    document.getElementById("demo2").innerHTML = result; 
}
function validForm()
{
	var x=document.button[""]["n3"].value;
	var atpos=x.indexOf("@");
	var dotpos=x.lastIndexOf(".");
	if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
	  {
	  alert("Not a valid e-mail address");
	  return false;
	  }
}
</script>
</body>
</html>
