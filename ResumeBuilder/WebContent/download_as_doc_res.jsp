<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- <%@ page language="java" contentType="application/msword; charset=UTF-8"
    pageEncoding="UTF-8"%> --%>
<!DOCTYPE html>
<html>
<head>
<title>Resume Builder|Aj</title>

<meta name="viewport" content="width=device-width"/>
<meta name="description" content="The Curriculum Vitae of Joe Bloggs."/>
<meta charset="UTF-8"> 

<link href='http://fonts.googleapis.com/css?family=Rokkitt:400,700|Lato:400,300' rel='stylesheet' type='text/css'>

<!--[if lt IE 9]>
<script src="//html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<style>
html,body,div,span,object,iframe,h1,h2,h3,h4,h5,h6,p,blockquote,pre,abbr,address,cite,code,del,dfn,em,img,ins,kbd,q,samp,small,strong,sub,sup,var,b,i,dl,dt,dd,ol,ul,li,fieldset,form,label,legend,table,caption,tbody,tfoot,thead,tr,th,td,article,aside,canvas,details,figcaption,figure,footer,header,hgroup,menu,nav,section,summary,time,mark,audio,video {
border:0;
font:inherit;
font-size:100%;
margin:0;
padding:0;
vertical-align:baseline;
}

article,aside,details,figcaption,figure,footer,header,hgroup,menu,nav,section {
display:block;
}

html, body {background: #181818; font-family: 'Lato', helvetica, arial, sans-serif; font-size: 16px; color: #222;}

.clear {clear: both;}

p {
	font-size: 1em;
	line-height: 1.4em;
	margin-bottom: 20px;
	color: #444;
}

#cv {
	width: 90%;
	max-width: 800px;
	background: white;
	margin: 30px auto;
}

.mainDetails {
	padding: 25px 35px;
	border-bottom: 2px solid #cf8a05;
	background: white;
}

#name h1 {
	font-size: 2.5em;
	font-weight: 700;
	font-family: 'Rokkitt', Helvetica, Arial, sans-serif;
	margin-bottom: -6px;
}

#name h2 {
	font-size: 2em;
	margin-left: 2px;
	font-family: 'Rokkitt', Helvetica, Arial, sans-serif;
}

#mainArea {
	padding: 0 40px;
}

#headshot {
	width: 12.5%;
	float: left;
	margin-right: 30px;
}

#headshot img {
	width: 100%;
	height: auto;
	-webkit-border-radius: 50px;
	border-radius: 50px;
}

#name {
	float: left;
}

#contactDetails {
	float: right;
}

#contactDetails ul {
	list-style-type: none;
	font-size: 0.9em;
	margin-top: 2px;
}

#contactDetails ul li {
	margin-bottom: 3px;
	color: #444;
}

#contactDetails ul li a, a[href^=tel] {
	color: #444; 
	text-decoration: none;
	-webkit-transition: all .3s ease-in;
	-moz-transition: all .3s ease-in;
	-o-transition: all .3s ease-in;
	-ms-transition: all .3s ease-in;
	transition: all .3s ease-in;
}

#contactDetails ul li a:hover { 
	color: #cf8a05;
}


section {
	border-top: 1px solid #dedede;
	padding: 20px 0 0;
}

section:first-child {
	border-top: 0;
}

section:last-child {
	padding: 20px 0 10px;
}

.sectionTitle {
	float: left;
	width: 25%;
}

.sectionContent {
	float: right;
	width: 72.5%;
}

.sectionTitle h1 {
	font-family: 'Rokkitt', Helvetica, Arial, sans-serif;
	font-style: italic;
	font-size: 1.5em;
	color: #cf8a05;
}

.sectionContent h2 {
	font-family: 'Rokkitt', Helvetica, Arial, sans-serif;
	font-size: 1.5em;
	margin-bottom: -2px;
}

.subDetails {
	font-size: 0.8em;
	font-style: italic;
	margin-bottom: 3px;
}

.keySkills {
	list-style-type: none;
	-moz-column-count:3;
	-webkit-column-count:3;
	column-count:3;
	margin-bottom: 20px;
	font-size: 1em;
	color: #444;
}

.keySkills ul li {
	margin-bottom: 3px;
}

@media all and (min-width: 602px) and (max-width: 800px) {
	#headshot {
		display: none;
	}
	
	.keySkills {
	-moz-column-count:2;
	-webkit-column-count:2;
	column-count:2;
	}
}

@media all and (max-width: 601px) {
	#cv {
		width: 95%;
		margin: 10px auto;
		min-width: 280px;
	}
	
	#headshot {
		display: none;
	}
	
	#name, #contactDetails {
		float: none;
		width: 100%;
		text-align: center;
	}
	
	.sectionTitle, .sectionContent {
		float: none;
		width: 100%;
	}
	
	.sectionTitle {
		margin-left: -2px;
		font-size: 1.25em;
	}
	
	.keySkills {
		-moz-column-count:2;
		-webkit-column-count:2;
		column-count:2;
	}
}

@media all and (max-width: 480px) {
	.mainDetails {
		padding: 15px 15px;
	}
	
	section {
		padding: 15px 0 0;
	}
	
	#mainArea {
		padding: 0 25px;
	}

	
	.keySkills {
	-moz-column-count:1;
	-webkit-column-count:1;
	column-count:1;
	}
	
	#name h1 {
		line-height: .8em;
		margin-bottom: 4px;
	}
}

@media print {
    #cv {
        width: 100%;
    }
}

@-webkit-keyframes reset {
	0% {
		opacity: 0;
	}
	100% {
		opacity: 0;
	}
}

@-webkit-keyframes fade-in {
	0% {
		opacity: 0;
	}
	40% {
		opacity: 0;
	}
	100% {
		opacity: 1;
	}
}

@-moz-keyframes reset {
	0% {
		opacity: 0;
	}
	100% {
		opacity: 0;
	}
}

@-moz-keyframes fade-in {
	0% {
		opacity: 0;
	}
	40% {
		opacity: 0;
	}
	100% {
		opacity: 1;
	}
}

@keyframes reset {
	0% {
		opacity: 0;
	}
	100% {
		opacity: 0;
	}
}

@keyframes fade-in {
	0% {
		opacity: 0;
	}
	40% {
		opacity: 0;
	}
	100% {
		opacity: 1;
	}
}

.instaFade {
    -webkit-animation-name: reset, fade-in;
    -webkit-animation-duration: 1.5s;
    -webkit-animation-timing-function: ease-in;
	
	-moz-animation-name: reset, fade-in;
    -moz-animation-duration: 1.5s;
    -moz-animation-timing-function: ease-in;
	
	animation-name: reset, fade-in;
    animation-duration: 1.5s;
    animation-timing-function: ease-in;
}

.quickFade {
    -webkit-animation-name: reset, fade-in;
    -webkit-animation-duration: 2.5s;
    -webkit-animation-timing-function: ease-in;
	
	-moz-animation-name: reset, fade-in;
    -moz-animation-duration: 2.5s;
    -moz-animation-timing-function: ease-in;
	
	animation-name: reset, fade-in;
    animation-duration: 2.5s;
    animation-timing-function: ease-in;
}
 
.delayOne {
	-webkit-animation-delay: 0, .5s;
	-moz-animation-delay: 0, .5s;
	animation-delay: 0, .5s;
}

.delayTwo {
	-webkit-animation-delay: 0, 1s;
	-moz-animation-delay: 0, 1s;
	animation-delay: 0, 1s;
}

.delayThree {
	-webkit-animation-delay: 0, 1.5s;
	-moz-animation-delay: 0, 1.5s;
	animation-delay: 0, 1.5s;
}

.delayFour {
	-webkit-animation-delay: 0, 2s;
	-moz-animation-delay: 0, 2s;
	animation-delay: 0, 2s;
}

.delayFive {
	-webkit-animation-delay: 0, 2.5s;
	-moz-animation-delay: 0, 2.5s;
	animation-delay: 0, 2.5s;
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
  content: '»';
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
</head>
<body id="top">
<font color="red">
<c:set var="map" value="${user}"/>

<c:set var="user" value="${map['udto']}"/>
<c:set var="userFullD" value="${map['udetails']}"/>
<c:set var="userSch" value="${map['schooling']}"/>
<c:set var="userClg" value="${map['college']}"/>
<c:set var="userGrad" value="${map['grad']}"/>
<c:set var="userPro1" value="${map['updto']}"/>
<c:set var="userPro2" value="${map['up2dto']}"/>
<c:set var="userTech" value="${map['tech']}"/>
<%
response.setHeader("Content-Disposition","attachment; filename=\"+resume"+"\"");   

%>

</font>
<div id="cv" class="instaFade">
	<div class="mainDetails">
		<center><h2>CV</h2></center>
		
		<div id="name">
			<h5><c:out value="${user.getFullName()}"/></h1>
			<h5><c:out value="${userFullD.getEntryLevel()}"/></h2>
		</div>
		
		<div id="contactDetails" class="quickFade delayFour">
			<ul>
				<li>Email:<c:out value="${user.getEmail()}"/></a></li>
				<!-- <li>w: <a href="http://www.bloggs.com">www.bloggs.com</a></li> -->
				<li>Contact No:<c:out value="${user.getMobileNo()}"/></li>
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