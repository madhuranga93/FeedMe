<%-- 
    Document   : signup
    Created on : Jan 21, 2017, 11:12:05 AM
    Author     : Madhuranga
--%>

<!DOCTYPE html>
<html>
<head>
	<title>FEEDME</title>

	<link rel="stylesheet" href="font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">

</head>
<body>

<div class="wrapper"> 



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
					<li><a href="index.jsp" >BACK</a></li>
					
					</font>

				</ul>



</div><!--subbar-->

  <div class="form2">
        <form action="signupservlet" method="POST">
           
            <font face="verdana" >
            Full Name      :<input type="text" name="name"/><br/>
            Contact Number :<input type="text" name="address"/><br/>
            Username       :<input type="text" name="username"    /><br/>
            Password       :<input   type="password" name="password"   /><br/>
                              <input type="submit" value="REGISTER" />
                              </font>
           
            </div><!--form2-->
            
            
        
        </form>

	


</div><!--wrapper-->



</body>
</html>