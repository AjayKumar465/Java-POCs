<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<!DOCTYPE html>
<html class="no-js">
<head>

<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.5.2/jquery.min.js"></script>

<title>Resume Builder|Aj</title>

<meta name="viewport" content="width=device-width"/>
<meta name="description" content="The Curriculum Vitae of Joe Bloggs."/>
<meta charset="UTF-8"> 

<link type="text/css" rel="stylesheet" href="css/styless.css">
<link href='http://fonts.googleapis.com/css?family=Rokkitt:400,700|Lato:400,300' rel='stylesheet' type='text/css'>

<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<style>
.no-js #loader { display: none;  }
.js #loader { display: block; position: absolute; left: 100px; top: 0; }
.se-pre-con {
	position: fixed;
	left: 0px;
	top: 0px;
	width: 100%;
	height: 100%;
	z-index: 9999;
	background: url(images/loading.gif) center no-repeat #fff;
}


.button {
  display: inline-block;
  border-radius: 4px;
  background-color:#808080;
  border: none;
  color: #FFFFFF;
  text-align: center;
  font-size: 15px;
  padding: 10px;
  width: 100px;
  transition: all 0.5s;
  cursor: pointer;
  margin: 5px;
}

.button span {
  cursor: pointer;
  display: inline-block;
  position: relative;
  transition: 0.5s;
}

.button span:after {
  content: '>>';
  position: absolute;
  opacity: 0;
  top: 0;
  right: -20px;
  transition: 0.5s;
}

.button:hover span {
  padding-right: 25px;
}

.button:hover span:after {
  opacity: 1;
  right: 0;
}
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
</style>
<!-- core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/main.css" rel="stylesheet">
    <link href="css/responsive.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">

<header id="header">
        <div class="top-bar">
            <div class="container">
                <div class="row">
                    <div class="col-sm-6 col-xs-4">
                        <div class="top-number"><p><i class="fa fa-phone-square"></i> 9542223544</p></div>
                    </div>
                    <div class="col-sm-6 col-xs-8">
                       <div class="social">
                            <ul class="social-share">
                                <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-linkedin"></i></a></li> 
                                <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                                <li><a href="#"><i class="fa fa-skype"></i></a></li>
                            </ul>
                            <div class="search">
                                <form role="form">
                                    <input type="text" class="search-form" autocomplete="off" placeholder="Search">
                                    <i class="fa fa-search"></i>
                                </form>
                           </div>
                       </div>
                    </div>
                </div>
            </div><!--/.container-->
        </div><!--/.top-bar-->

        <nav class="navbar navbar-inverse" role="banner">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="index.jsp"><img src="images/logo.png" alt="logo"></a>
                </div>
				
                <div class="collapse navbar-collapse navbar-right">
                    <ul class="nav navbar-nav">
                        <li><a href="pdfDownlaod">Download</a></li>
                        <li><a href="changePwd.jsp">Change Password</a></li>
                        <li><a href="logout">Logout</a></li>
                        <li><a href="about-us.html">About Us</a></li>
                       
                  
                      <!--   <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="404.jsp">Premium template</a></li>
                                <li><a href="404.jsp">Interview Tricks</a></li>
                                <li><a href="404.jsp">Shortcodes</a></li>
                            </ul>
                        </li> -->
                        
                        <li><a href="contact-us.html">Contact</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->

</head>
<body id="top">
<div  class="se-pre-con"></div>
	
<font color="red">
<c:if test="${sessionScope.uname eq null}">
<c:set var="error" value="Plz login" scope="request"></c:set>
   <jsp:forward page="login.jsp"></jsp:forward>
</c:if>



<c:set var="map" value="${user}"/>

<c:set var="user" value="${map['udto']}"/>
<c:set var="userFullD" value="${map['udetails']}"/>
<c:set var="userSch" value="${map['schooling']}"/>
<c:set var="userClg" value="${map['college']}"/>
<c:set var="userGrad" value="${map['grad']}"/>
<c:set var="userPro1" value="${map['updto']}"/>
<c:set var="userPro2" value="${map['up2dto']}"/>
<c:set var="userTech" value="${map['tech']}"/>

</font>
<div id="cv" class="instaFade">
	<div class="mainDetails">
		<div id="headshot" class="quickFade">
			<img src=<c:out value="${userFullD.getPhotoPath()}"/> alt="" />
		</div>
		
		<div id="name">
			<h1 class="quickFade delayTwo"><c:out value="${user.getFullName()}"/></h1>
			<h2 class="quickFade delayThree"><c:out value="${userFullD.getEntryLevel()}"/></h2>
		</div>
		
		<div id="contactDetails" class="quickFade delayFour">
			<ul>
				<li>e: <a href="mailto:joe@bloggs.com" target="_blank"><c:out value="${user.getEmail()}"/></a></li>
				<!-- <li>w: <a href="http://www.bloggs.com">www.bloggs.com</a></li> -->
				<li><c:out value="${user.getMobileNo()}"/></li>
			</ul>
		</div>
		<div class="clear"></div>
	</div>
	
	<div id="mainArea" class="quickFade delayFive">
		<section>
			<article>
				<div class="sectionTitle">
					<h1>Objective</h1>
				</div>
				
				<div class="sectionContent">
					<p><c:out value="${userFullD.getObj()}"/></p>
				</div>
			</article>
			<div class="clear"></div>
		</section>
		
		
		<section>
			<div class="sectionTitle">
				<h1>Education</h1>
			</div>
<div class="sectionContent">		
<table>
  <tr>
    <th>Stream</th>
    <th>Name of Institue</th>
    <th>Board/University</th>
    <th>Date of Passing</th>
    <th>Marks(%)</th>
  </tr>
  <tr>
    <td>Schooling</td>
    <td><c:out value="${userSch.getClg_or_school_name()}"></c:out></td>
    <td><c:out value="${userSch.getBoard_of_edu()}"></c:out></td>
    <td><c:out value="${userSch.getDop()}"></c:out></td>
    <td><c:out value="${userSch.getPercentage()}"></c:out></td>
    
  </tr>
  <tr>
    <td>Intermediate</td>
    <td><c:out value="${userClg.getClg_or_school_name()}"></c:out></td>
    <td><c:out value="${userClg.getBoard_of_edu()}"></c:out></td>
    <td><c:out value="${userClg.getDop()}"></c:out></td>
    <td><c:out value="${userClg.getPercentage()}"></c:out></td>
  
  </tr>
  <tr>
     <td><c:out value="Graduation"></c:out></td>
    <td><c:out value="${userGrad.getClg_or_school_name()}"></c:out></td>
    <td><c:out value="${userGrad.getBoard_of_edu()}"></c:out></td>
    <td><c:out value="${userGrad.getDop()}"></c:out></td>
    <td><c:out value="${userGrad.getPercentage()}"></c:out></td>
  
  </tr>
</table></div>
			<div class="sectionContent">
				
			</div>
			<div class="clear"></div>
		</section>
		
		
		<section>
			<div class="sectionTitle">
				<h1>Streangths</h1>
			</div>
			
			<div class="sectionContent">
				<ul class="keySkills">
					<p><c:out value="${userFullD.getStrength()}"></c:out></p>
				</ul>
			</div>
			<div class="clear"></div>
		</section>
		<section>
			<div class="sectionTitle">
				<h1>Technical skills</h1>
			</div>
			
			<div class="sectionContent">
				<ul class="keySkills">
					<p><c:out value="${userTech.getTechSkill()}"></c:out></p>
				</ul>
			</div>
			<div class="clear"></div>
		</section>
		
		<section>
			<div class="sectionTitle">
				<h1>Habbits</h1>
			</div>
			
			<div class="sectionContent">
				<ul class="keySkills">
					<p><c:out value="${userFullD.getHabbits()}"></c:out></p>
				</ul>
			</div>
			<div class="clear"></div>
	
					</section>	
			<section>
			<div class="sectionTitle">
				<h1>Projects</h1>
			</div>
			
			<div class="sectionContent">
				
					<table>
  <tr>
    <td>Title</td>
    <td><c:out value="${userPro1.getProjectTitle()}"></c:out></td>
   
  </tr>
  <tr>
    <td>Domain</td>
    <td><c:out value="${userPro1.getDomain()}"></c:out></td>
    
  </tr>
  <tr>
    <td>Team size</td>
    <td><c:out value="${userPro1.getTeamSize()}"></c:out></td>
    
  </tr>
  <tr>
    <td>role</td>
    <td><c:out value="${userPro1.getRole()}"></c:out></td>
   
  </tr>
  <tr>
    <td>Description</td>
    <td><c:out value="${userPro1.getDescription()}"></c:out></td>
   
  </tr>
 
</table>
				

			</div>
			<div class="clear"></div>
			
		</section>
		
		<section>
		
<div class='test' align="center">
  
    <a href="edit_resume_form.jsp"class="button" ><span>Edit</span></a></div>
  
</div>
 	</section>
 	<section>
 	<h1>.</h1>
 	</section>
 	<section></section><section></section>
		</div></div>
	
<script type="text/javascript">
var gaJsHost = (("https:" == document.location.protocol) ? "https://ssl." : "http://www.");
document.write(unescape("%3Cscript src='" + gaJsHost + "google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E"));
</script>
<script type="text/javascript">
var pageTracker = _gat._getTracker("UA-3753241-1");
pageTracker._initData();
pageTracker._trackPageview();
</script>
</body>
</html>
<script>

//Wait for window load
$(window).load(function() {
	// Animate loader off screen
	$(".se-pre-con").fadeOut("slow");;
});

</script>