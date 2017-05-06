<%-- 
    Document   : products
    Created on : Jan 21, 2017, 11:24:06 AM
    Author     : Madhuranga
--%>

        
      
   <%-- 
    Document   : index
    Created on : Jan 21, 2017, 10:52:28 AM
    Author     : Madhuranga
--%>
<!DOCTYPE html>
<html>
<head>
	<title>FEEDME</title>

	<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
        <link rel="stylesheet" type="text/css" href="css/main3.css">

</head>
<body>

<div class="wrapper"> 



<div class="topbar clearfix">

<div class="head">
  <font face="verdana" size="10" color="orange">
<marquee behavior="scroll" direction="left"><b>FEED ME</b></marquee>
</font>
</div>


<div class="logo">
  

</div>

<div class="social">
      
      <ul>
          
          <li><a href=" href" = "###" ><i class="fa fa-linkedin" aria-hidden="true"></i></a></li>
          <li><a href=" href" = "###" ><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
          <li><a href=" href" = "###" ><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
          <li><a href=" href" = "###" ><i class="fa fa-twitter" aria-hidden="true"></i></a></li>


        </ul>

    </div><!--social-->
</div><!--topbar-->
<div class="subbar clearfix">

	<ul>
					<font face="verdana" >
					<li><a href=" href" = "###" >Back</a></li>
					
					</font>

				</ul>



</div><!--subbar-->

  <div class="table">
       <table border="0" >
<tr>

<th>PRODUCT</th>
<th>IMAGE</th>
<th>PRICE(Rs)</th>
<th>QTY</th>
<th>ADDTOCART</th>
</tr>

<tr>
    
   
<td>malith</td>

<td><c:out value="${row.availableqty}"/></td>
<td> ${row.url}</td>
<td><c:out value="${row.price}"/></td>
<td><c:out value="${row.price}"/></td>

</div><!--table-->





</div><!--wrapper-->



</body>
</html>