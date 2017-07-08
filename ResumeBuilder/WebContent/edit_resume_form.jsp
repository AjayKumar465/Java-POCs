<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home | Resume Builder</title>

<link rel="stylesheet" type="text/css"
  href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css">
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
</head><!--/head-->

<body class="homepage">
<c:set var="map" value="${user}"/>
<c:set var="user" value="${map['udto']}"/>
<c:set var="userFullD" value="${map['udetails']}"/>
<c:set var="userSch" value="${map['schooling']}"/>
<c:set var="userClg" value="${map['college']}"/>
<c:set var="userGrad" value="${map['grad']}"/>
<c:set var="userPro1" value="${map['updto']}"/>
<c:set var="userPro2" value="${map['up2dto']}"/>
<c:set var="userTech" value="${map['tech']}"/>
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
				
                                     
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
		
    </header><!--/header-->

    <section id="main-slider" class="no-margin">


    <div class="container">
<center><h1 style="color:#808080;">Edit Your Resume</h1></center>

 <form  action="setUdetails" method="post">
 
    <div class="accordion" id="searchAccordion">
      <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse"
            data-parent="#searchAccordion" href="#collapseOne">Edit</a>
        </div>
        <div id="collapseOne" class="accordion-body collapse in">
          <div class="accordion-inner">
           
       
              <h2 style="color:#ff4000">Basic Details:</h2>
                
                  <label>Select Entry Level:</label>
  <select   name="entry-level" required>
    <option value=<c:out value="${userFullD.getEntryLevel()}"/>><c:out value="${userFullD.getEntryLevel()}"/></option>  
    <option value="fresher">Fresher</option>
    <option value="experianced">Experianced</option>
  </select>
               
           &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                
                  <label>Full name:</label> <input  type="text" name="uname" value=<c:out value="${user.getFullName()}"/> required/>
       
             &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
         
            <label>Mobile number:</label> <input  type="number" name="mno" value=<c:out value="${user.getMobileNo()}"/> required/>
                <hr>
         
            <label>Email:</label> <input  type="email" name="email" value=<c:out value="${user.getEmail()}"/> required/>
           &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
             
            <label>DOB:</label> <input  type="date" name="dob" value=<c:out value="${userFullD.getDate()}"/> required/>
           &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
             
<hr>
             
                     <hr>
      
                <label >country:</label>
                  <select  id="countries" name="ucountry">
               <option value=<c:out value="${userFullD.getCoutnry()}"></c:out> selected="selected"><c:out value="${userFullD.getCoutnry()}"></c:out></option>
  </select> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<label > State:</label>
                  <select  id="state" name="ustate">
      <option value=<c:out value="${userFullD.getState()}"></c:out> selected="selected"><c:out value="${userFullD.getState()}"></c:out></option>

  </select>   &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <label >city:</label>
                  <select  id="city" name="ucity">
                  <option value=<c:out value="${userFullD.getCity()}"></c:out> selected="selected"><c:out value="${userFullD.getCity()}"></c:out></option>
                  
            
  </select>
  
    
 <hr>
  <label>Address:</label>
  <textarea rows="5" id="comment" name="uadd" required> <c:out value="${userFullD.getAddress()}"></c:out></textarea>
    <hr>
</div>
      
           <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse"
            data-parent="#searchAccordion" href="#collapseTwo">Interests And Streangths
            </a>
        </div>
        <div id="collapseTwo" class="accordion-body collapse">
          <div class="accordion-inner">
            
      
               <h2 style="color:#ff4000">Objective&Habbits:</h2>
           
              
  <label>Career Objective:</label>
  <textarea ows="5" id="comment" name="userObj"  required><c:out value="${userFullD.getObj()}"/></textarea>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
  <label>Habbits:</label>
  <textarea  rows="5" id="comment" name="habbit"          required> <c:out value="${userFullD.getHabbits()}"></c:out>
  </textarea>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
              
  <label>Strengths:</label>
  <textarea rows="5"  name="strength" required><c:out value="${userFullD.getStrength()}"/></textarea>

              </div>
             <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse"
            data-parent="#searchAccordion" href="#collapseThree">Eduction
            </a>
        </div> <div id="collapseThree" class="accordion-body collapse">
          <div class="accordion-inner">

              <h2 style="color:#ff4000">Schooling:</h2>
               
                  <label>School name:</label> <input class="input-large" type="text" name="school_name" value=<c:out value="${userSch.getClg_or_school_name()}"></c:out> required/>
               &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                  <label>Board:</label> <input class="input-medium typeahead"
                     type="text" name="sboard" value=<c:out value="${userSch.getBoard_of_edu()}"></c:out> required/>
                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                  <label>Date of passing:</label> <input class="input-large typeahead"
                    type="date" name="sdop" value=<c:out value="
                    ${userSch.getDop()}"></c:out> required/>
      &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                  <label>Marks(%):</label> <input class="input-large typeahead"
                    type="text" name="um" value=<c:out value="${userSch.getPercentage()}"></c:out> required/>
              <hr>
               
              <h2 style="color:#ff4000">+2 or Intermidiate or PUC:</h2>
 
              
            
                  <label>College name:</label> <input class="input-large" type="text" name="college_name" value=<c:out value="${userClg.getClg_or_school_name()}"></c:out> required/>
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  
                  <label>Board:</label> <input class="input-medium typeahead"
                     type="text" name="cboard" value=<c:out value="${userClg.getBoard_of_edu()}"></c:out> required/>
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                  <label>Date of passing:</label> <input class="input-large typeahead"
                    type="date" name="cdop" value=<c:out value="${userClg.getDop()}"></c:out> required />
               &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                  <label>Marks(%):</label> <input class="input-large typeahead"
                    type="text" name="cm" value=<c:out value="${userClg.getPercentage()}"></c:out> required/>
                
                <h2 style="color:#ff4000">Graduation:</h2>
 
              
         
                  <label>College name:</label> <input class="input-large" type="text" name="grad_clg_name" value=<c:out value="${userGrad.getClg_or_school_name()}"></c:out> required/>
   &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  
                  <label>Board:</label> <input class="input-medium typeahead" type="text" name="grad_board" value=<c:out value="${userGrad.getBoard_of_edu()}"></c:out> required/>
                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
            
               
                  <label>Date of passing:</label> <input class="input-large typeahead"
                    type="date" name="grad_dop" value=<c:out value="${userGrad.getDop()}"></c:out> required />
          &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            
                  <label>Marks(%):</label> <input class="input-large typeahead"
                    type="text" name="grad_marks" value=<c:out value="${userGrad.getPercentage()}"></c:out> required />
                </div>
              
              <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse"
            data-parent="#searchAccordion" href="#collapseFour">Project
            </a>
        </div> <div id="collapseFour" class="accordion-body collapse">
          <div class="accordion-inner">
          <h2 style="color:#ff4000">Project 1:</h2>
  
               
               
                  <label>Title:</label> <input class="input-large" type="text" name="pro1-title" value= <c:out value="${userPro1.getProjectTitle()}"></c:out> required/>
                
          
                  <label>Team size:</label> <input 
                     type="number" name="pro1-tsize" value=<c:out value="${userPro1.getTeamSize()}"></c:out> required/>
               
               
                  <label>Domain:</label> <input 
                    type="text" name="pro1-domain" value=<c:out value="${userPro1.getDomain()}"></c:out>  required/>
          
              
                  <label>Role:</label> <input 
                    type="text" name="pro1-role" value=<c:out value="${userPro1.getRole()}"></c:out> required />
              
        
  <label>Description:</label>
  <textarea  rows="5" name="pro1-desc" required><c:out value="${userPro1.getDescription()}"></c:out></textarea>
</div>
  <input type="button" value="Add another project" onclick="insertDiv()">
    
    <div id="answerdiv-2"></div>
            
      <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse"
            data-parent="#searchAccordion" href="#collapseFive">Technical Skills
            </a>
        </div> <div id="collapseFive" class="accordion-body collapse">
          <div class="accordion-inner">
          <h2>Technical skils:</h2>
               
        
  <label>Technolgies:</label>
  <textarea  rows="5" id="comment" name="tech_skills" required>
  <c:out value="${userTech.getTechSkill()}"></c:out></textarea>
</div></div></div>
      
      
      
      
           
     <div align="center"><input type="submit" value="Submit">
      
      </div>
     

     </div></div></div></div>
            </form>
      </div>
            
            
    </section><!--/#services-->


    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <script src="js/jquery.isotope.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/wow.min.js"></script>
</body>
</html>
<script>
var i=2;
var y=3;
function insertDiv(){
		
		for(i;i<y;i++)
		{
			var d_id = i;
$( "<div id='answerdiv-"+d_id+"'><h2 style='color:#ff4000'>Project:"+d_id+"</h2><label>Title:</label> <input  type='text' name='pro2-title' required/><label>Team size:</label> <input type='number' name='pro2-tsize' required/><label>Domain:</label> <input   type='text' name='pro2-domain' required /> <label>Role:</label> <input class='input-large typeahead' type='text' name='pro2-role' required /> <label>Description:</label> <textarea rows='5' name='pro2-desc' reqiured></textarea>" ).insertAfter( '#answerdiv-'+i )
					}
			
}  
$(document).ready(function() 
        {
	var country = $("select#countries").val();
	  if($("select#countries").val()=="getCntrs"){
	$.get('getcountries', {
		cname : country
	},
	function(response) {

		        var select = $('#countries');
		       
		          $.each(response, function(index, value) {
		          $('<option>').val(value).text(value).appendTo(select);
		      });
		        });}
	
	$('#countries').change(function(event) {
		var country = $("select#countries").val();
		  
		$.get('getstates', {
			cname : country
		},
		
		function(response) {

			        var select = $('#state');
			        select.find('option').remove();
			          $.each(response, function(index, value) {
			          $('<option>').val(value).text(value).appendTo(select);
			      });
			        });

	});
	
	$('#state').change(function(event) {
		var statename = $("select#state").val();
		  
		$.get('getcity', {
			sname : statename
		},
		
		function(response) {

			        var select = $('#city');
			        select.find('option').remove();
			          $.each(response, function(index, value) {
			          $('<option>').val(value).text(value).appendTo(select);
			      });
			        });

	});
	
        });

</script>