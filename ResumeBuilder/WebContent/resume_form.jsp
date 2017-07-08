4<!DOCTYPE html>
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
                        <li ><a href="index.jsp">Home</a></li>
                        <li><a href="login.jsp">Login</a></li>
             
                        <li><a href="about-us.html">About Us</a></li>
                       
                  
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="404.html">Premium template</a></li>
                                <li><a href="404.html">Interview Tricks</a></li>
                                <li><a href="404.html">Shortcodes</a></li>
                            </ul>
                        </li>
                        
                        <li><a href="contact-us.html">Contact</a></li>                        
                    </ul>
                </div>
            </div><!--/.container-->
        </nav><!--/nav-->
		
    </header><!--/header-->

    <section id="main-slider" class="no-margin">


    <div class="container">
<center><h1 style="color:#808080;">Create Resume Here</h1></center>

 <form  action="setUdetails" method="post" >
 
    <div class="accordion" id="searchAccordion">
      <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse"
            data-parent="#searchAccordion" href="#collapseOne">Resume through form</a>
        </div>
        <div id="collapseOne" class="accordion-body collapse in">
          <div class="accordion-inner">
           
       
              <h2 style="color:#ff4000">Basic Details:</h2>
                
                  <label>Select Entry Level:</label>
  <select   name="entry-level" required>
    <option value="">select</option>
  
    <option value="fresher">Fresher</option>
    <option value="experianced">Experianced</option>
  </select>
               
           &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                
                  <label>Full name:</label> <input  type="text" name="uname" required />
       
             &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
         
            <label>Mobile number:</label> <input  type="number" name="mno" required />
                <hr>
         
            <label>Email:</label> <input  type="email" name="email" required />
           &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
             
            <label>DOB:</label> <input  type="date" name="dob" required/>
           &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
             
<hr>
             
                     <hr>
      
                <label >country:</label>
                  <select  id="countries" name="ucountry">
               <option value="getCntrs">select</option>
  </select> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<label > State:</label>
                  <select  id="state" name="ustate">
               <option>select</option>
  </select>   &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <label >city:</label>
                  <select  id="city" name="ucity">
               <option>select</option>
  </select>
  
    
 <hr>
  <label>Address:</label>
  <textarea rows="5" id="comment" name="uadd" required></textarea>
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
  <textarea ows="5" id="comment" name="userObj" required></textarea>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
  <label>Habbits:</label>
  <textarea  rows="5" id="comment" name="habbit" required></textarea>
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
              
  <label>Strengths:</label>
  <textarea rows="5"  name="strength" required></textarea>

              </div>
             <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse"
            data-parent="#searchAccordion" href="#collapseThree">Eduction
            </a>
        </div> <div id="collapseThree" class="accordion-body collapse">
          <div class="accordion-inner">

              <h2 style="color:#ff4000">Schooling:</h2>
               
                  <label>School name:</label> <input class="input-large" type="text" name="school_name" required/>
               &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                  <label>Board:</label> <input class="input-medium typeahead"
                     type="text" name="sboard" required/>
                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
       &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                  <label>Date of passing:</label> <input class="input-large typeahead"
                    type="date" name="sdop" required />
      &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                  <label>Marks(%):</label> <input class="input-large typeahead"
                    type="text" name="um" required />
              <hr>
               
              <h2 style="color:#ff4000">+2 or Intermidiate or PUC:</h2>
 
              
            
                  <label>College name:</label> <input class="input-large" type="text" name="college_name" required/>
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  
                  <label>Board:</label> <input class="input-medium typeahead"
                     type="text" name="cboard" required/>
              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                  <label>Date of passing:</label> <input class="input-large typeahead"
                    type="date" name="cdop" required />
               &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
                  <label>Marks(%):</label> <input class="input-large typeahead"
                    type="text" name="cm" required />
                
                <h2 style="color:#ff4000">Graduation:</h2>
 
              
         
                  <label>College name:</label> <input class="input-large" type="text" name="grad_clg_name" required/>
   &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  
                  <label>Board:</label> <input class="input-medium typeahead" type="text" name="grad_board" required/>
                &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
            
               
                  <label>Date of passing:</label> <input class="input-large typeahead"
                    type="date" name="grad_dop" required />
          &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
            
                  <label>Marks(%):</label> <input class="input-large typeahead"
                    type="text" name="grad_marks" required />
               </div>
              </div></div>
              <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse"
            data-parent="#searchAccordion" href="#collapseFour">Project
            </a>
        </div> <div id="collapseFour" class="accordion-body collapse">
          <div class="accordion-inner">
          <h2 style="color:#ff4000">Project 1:</h2>
  
               
               
                  <label>Title:</label> <input class="input-large" type="text" name="pro1-title" required/>
                
          
                  <label>Team size:</label> <input 
                     type="number" name="pro1-tsize" required/>
               
               
                  <label>Domain:</label> <input 
                    type="text" name="pro1-domain" required />
          
              
                  <label>Role:</label> <input 
                    type="text" name="pro1-role" required />
              
        
  <label>Description:</label>
  <textarea  rows="5" name="pro1-desc" required></textarea>
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
  <textarea  rows="5" id="comment" name="tech_skills" required></textarea>
</div></div></div>
      
      
       </div>
      
       </div>    
     <div align="center"><input type="submit" value="Submit">
      
      </div>
     

    </div></div>
            </form></div>

            <section>
             <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse"
            data-parent="#searchAccordion" href="#collapseSix">Create  through Excel Sheet</a>
        </div>
        <div id="collapseSix" class="accordion-body collapse">
          <div class="accordion-inner">
            <form action="excel" method="post" enctype="multipart/form-data">
            
            <label></label>
            <input type="file" name='excel'>
            <input type="submit" value="upload">
       
            </form></div>
</div></div>
             
    
</section>
  <!--/#services-->


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
	var country = $("#countries").val();
	  if($("#countries").val()=="getCntrs"){
	$.get('getcountries', {
		cname : country
	},
	function(response) {

		        var select = $('#countries');
		        select.find('option').remove();
		          $.each(response, function(index, value) {
		          $('<option>').val(value).text(value).appendTo(select);
		      });
		        });}
	
	$('#countries').change(function(event) {
		var country = $("#countries").val();
		  
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
		var statename = $("#state").val();
		  
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