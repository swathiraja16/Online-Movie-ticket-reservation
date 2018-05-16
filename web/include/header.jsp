<div class="header">
		   <div class="col-sm-8 header-left">
					 <div class="logo">
						<a href="index.html" style="font-size: 25px">MOVIE BOOKING</a>
					 </div>
					 <div class="menu">
						  <a class="toggleMenu" href="#"><img src="images/nav.png" alt="" /></a>
						    <ul class="nav" id="nav">
						    	<li class="active"><a href="index.jsp">Home</a></li>
						    	<li><a href="movies.jsp">Movies</a></li>
						    	
								<div class="clearfix"></div>
							</ul>
							<script type="text/javascript" src="js/responsive-nav.js"></script>
				    </div>	
				     <!-- start search-->
				      <div class="search-box">
							<div id="sb-search" class="sb-search">
								<form>
									<input class="sb-search-input" placeholder="Enter your search term..." type="search" name="search" id="search">
									<input class="sb-search-submit" type="submit" value="">
									<span class="sb-icon-search"> </span>
								</form>
							</div>
						</div>
						<!----search-scripts---->
						<script src="js/classie.js"></script>
						<script src="js/uisearch.js"></script>
						<script>
							new UISearch( document.getElementById( 'sb-search' ) );
						</script>
						<!----//search-scripts---->						
	    		    <div class="clearfix"></div>
	    	    </div>
	            <div class="col-sm-4 header_right">
	    		      <% if(session.getAttribute("session_id")==null){ %>
	    		      <div id="loginContainer"><a href="#" id="loginButton"><img src="images/login.png"><span>Login</span></a>
						    <div id="loginBox">                
						        <form id="loginForm" action="check.jsp">
						                <fieldset id="body">
						                	<fieldset>
						                          <label for="email">Email Address</label>
						                          <input type="text" name="email" id="email">
						                    </fieldset>
						                    <fieldset>
						                            <label for="password">Password</label>
						                            <input type="password" name="password" id="password">
						                     </fieldset>
						                    <input type="submit" id="login" value="Sign in">
						                	
						            	</fieldset>
						                 <span><a href="signup.jsp">Signup?</a></span>
							      </form>
				              </div>
			             </div>
			             <%}else{ %>
			              <a href="logout.jsp" id="loginButton"><div id="loginContainer"><a href="logout.jsp" id="loginButton"><img src="images/login.png"><span><%=session.getAttribute("session_name") %> | Logout</span></a></div></a>
			             <%} %>
		                 <div class="clearfix"></div>
	                 </div>
	                <div class="clearfix"></div>
   </div>