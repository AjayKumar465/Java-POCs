<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en"  class="no-js">
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
#image{
 border-radius: 25px;
    border: 2px solid #73AD21;
    padding: 20px; 
    width: 200px;
    height: 150px; 
}
</style>
<script src="http://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.2/modernizr.js"></script>
</head><!--/head-->

<body class="homepage">
<div  class="se-pre-con"></div>
<c:set var="map" value="${user}"/>

<c:set var="userFullD" value="${map['udetails']}"/>

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
                        <li class="active"><a href="index.jsp">Home</a></li>
                        <li><a href="about-us.html">About Us</a></li>
                       
                  
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages <i class="fa fa-angle-down"></i></a>
                            <ul class="dropdown-menu">
                                <li><a href="404.html">Premium Resume templates</a></li>
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
<center><h1 style="color:#808080;">Upload Photo</h1></center>

 <form  action="preview" method="post" enctype="multipart/form-data" >
 
    <div class="accordion" id="searchAccordion">
      <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse"
            data-parent="#searchAccordion" href="#collapseOne">part-2</a>
        </div>
        <div id="collapseOne" class="accordion-body collapse in">
          <div class="accordion-inner">
           
       
              <h2 style="color:#ff4000">Upload:</h2>
              <input id="fileUpload"  type="file" name="uphoto" required/> 
<h2 align="right">Photo</h2>
<div id="image-holder" align="right" >
<p id="image">Not selected</p>
         </div>
         <div>
         <c:if test="${userFullD.getPhotoPath() ne null}">
         <h2>Previous Photo</h2>
         <img src=<c:out value="${userFullD.getPhotoPath()}" /> id="image" alt="" />
         </c:if>
         </div>
                
<center><input type="submit" value="view"></center>
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

$(document).ready(function() {
    $("#fileUpload").on('change', function() {
      //Get count of selected files
      var countFiles = $(this)[0].files.length;
      var imgPath = $(this)[0].value;
      var extn = imgPath.substring(imgPath.lastIndexOf('.') + 1).toLowerCase();
      var image_holder = $("#image-holder");
      image_holder.empty();
      if (extn == "gif" || extn == "png" || extn == "jpg" || extn == "jpeg") {
        if (typeof(FileReader) != "undefined") {
          //loop for each file selected for uploaded.
          for (var i = 0; i < countFiles; i++) 
          {
            var reader = new FileReader();
            reader.onload = function(e) {
              $("<img />", {
            	  
                "src": e.target.result,
                "class": "thumb-image",
                "id":"image"
              }).appendTo(image_holder);
            }
            image_holder.show();
            reader.readAsDataURL($(this)[0].files[i]);
          }
        } else {
          alert("This browser does not support FileReader.");
        }
      } else {
        alert("Pls select only images");
      }
    });
  });


//Wait for window load
$(window).load(function() {
	// Animate loader off screen
	$(".se-pre-con").fadeOut("slow");;
});

</script>

