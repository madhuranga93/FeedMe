<%-- 
    Document   : checkout
    Created on : Jan 23, 2017, 11:43:40 AM
    Author     : Madhuranga
--%>



<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
	<title>FEEDME</title>

	<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/main3.css">
     
        

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
SELECT * from cart;
</sql:query>

<div class="viewcart">
   <a href="payment.jsp">
<img border="0"  src="img/Buy.png" width="150" height="40">
</a>
    
</div><!--viewcart-->

  <div class="table">
       <table border="0" >
<tr>


<th>DESCRIPTION</th>
<th>PRICE(Rs)</th>
<th> QTY</th>
<th>TOTAL</th>
<th>REMOVE</th>
</tr>


<c:forEach var="row" items="${result.rows}">
    

<tr>
    
   

<td> ${row.des}</td>
<td><c:out value="${row.price}"/></td>
<td><c:out value="${row.qty}"/></td>
<td> ${row.price * row.qty } </td>


<form action="RemoveFromCart" method="GET">
    
    <input type="hidden" name="des" value="${row.des}"/>
    
    
     <td><button type="submit" ></td>
    
 
</form>
</tr>

</c:forEach>
</div><!--table1-->






</div><!--wrapper-->



</body>
</html>
