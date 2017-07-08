
<%@page import="com.nacre.online_assesment.util.StringConstants"%>
<%@page import="com.nacre.online_assesment.util.URLConstants"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

  <c:set var="path" value="<%=application.getContextPath()%>"></c:set>
		<style type="text/css">
/* 		div#sidebar {
    width: 20%;
} */
div#sidebar li{
height:50px;
}

		</style>
			<style>
			.main-content-inner {
       width: 80%;
}
			</style>
<!-- -------------------- -->
<div id="navbar" class="navbar navbar-default">

			<div class="navbar-container" id="navbar-container">
				<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
					<span class="sr-only">Toggle sidebar</span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>
				</button>

				<div class="navbar-header pull-left">
					<a href="index.html" class="navbar-brand">
						<small>
							<img src='${path}/assets/images/nacre/nacre.png' title="NACRE SOFTWARE SEEVICES"  width='30px' class='img-rounded'>
							HR Team
						</small>
					</a>
				</div>

				<div class="navbar-buttons navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
					
					<jsp:include page="../hr/hr_jp_noti.jsp"></jsp:include>
						
						<!-- Vijay Notifications -->
						<%-- 	<li class="purple">
						<a href="#" data-toggle="dropdown" class="dropdown-toggle" > 
						<i class="ace-icon fa fa-bell icon-animated-bell"></i> 
	 					<span class="badge badge-success" id="mainNotificationCount"></span>
						</a>

						<ul
							class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
							<li class="dropdown-header">
								 <i class="ace-icon fa fa-bell icon-animated-bell"></i>
							<span id="notificationCount"></span>
								Notification
							</li>

							<li class="dropdown-content">
								<ul class="dropdown-menu dropdown-navbar" id="notificationDetails">
								</ul>
							<li class="dropdown-footer"><a href="<%=application.getContextPath()%>/jsp/admin/adminSeeAllNotifications.jsp"> See all
											notifications <i class="ace-icon fa fa-arrow-right"></i>
									</a>
							</li>
						</ul>		
						</li>
 --%>						<!-- vijay noti end -->

						<li class="light-blue">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" height="95%" width="100px" src="<%=session.getAttribute(StringConstants._SESSION_USER_IMG) %>" alt="User Photo" />
								<span class="user-info">
									<small>Welcome,</small>
									<%=session.getAttribute(StringConstants._SESSION_USER_NAME) %>
								</span>

								<i class="ace-icon fa fa-caret-down"></i>
							</a>

							<ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="${path}/<%=URLConstants._CHANGE_PWD_URL%>">
										<i class="ace-icon fa fa-cog"></i>
										Change Password
									</a>
								</li>

							
								<li class="divider"></li>

								<li>
									<a href="${path}/<%=URLConstants.LOGOUT_URL%>">
										<i class="ace-icon fa fa-power-off"></i>
										Logout
									</a>
								</li>
							</ul>
						</li>					
						</ul>
				</div>
			</div><!-- /.navbar-container -->
		</div>



						























