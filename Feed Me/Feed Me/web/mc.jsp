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


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
	<title>FEEDME</title>

	<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
	
        <link rel="stylesheet" type="text/css" href="css/main2.css">
    

</head>
<body>

<div class="wrapper2 clearfix"> 



<div class="topbar clearfix">
<div class="head clearfix">
    
    <div class="head1">
      <img src="img/logo2.PNG" alt="" height="75" width="75">  
    </div><!--head1-->
    
    <div class="head2">
  <font face="verdana" size="10" color="orange">
  <b>FEED ME</b>
  </font>

  </div><!--head2-->
  
</div><!--head-->

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
					<li><a href=" product.jsp" >Back</a></li>
					
					</font>

				</ul>



</div><!--subbar-->



<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
     url="jdbc:mysql://localhost/feed"
     user="root"  password=""/>

<sql:query dataSource="${snapshot}" var="result">
SELECT * from mc;
</sql:query>

<div class="viewcart">
   <a href="cart.jsp">
<img border="0"  src="img/view.png" width="150" height="50">
</a>
    
</div><!--viewcart-->


  <div class="table">
       <table border="0" >
<tr>

<th>PRODUCT</th>
<th>DESCRIPTION</th>
<th>PRICE(Rs)</th>
<th>QTY</th>
<th>ADDTOCART</th>
</tr>

<c:forEach var="row" items="${result.rows}">
<tr>
    
 

<td> ${row.product}</td>
<td><c:out value="${row.des}"/></td>
<td><c:out value="${row.price}"/></td>



<form action="AddToCart1" method="GET">
    
    <input type="hidden" name="des" value="${row.des}"/>
    <input type="hidden" name="price" value= "${row.price}"/>
    <td><input type="text" name="qty" /></td>
     <td><button type="submit" ></td>
    
 
</form>
</c:forEach>
</div><!--table-->





</div><!--wrapper-->



</body>
</html>