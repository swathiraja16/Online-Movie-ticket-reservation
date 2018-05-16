<nav class="navbar-default navbar-static-top" role="navigation">
             <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
               <h1> <a class="navbar-brand" href="index.html">Admin Pannel</a></h1>         
			   </div>
			 <div class=" border-bottom">
        	<div class="full-left">
        	  <section class="full-top">
				<button id="toggle"><i class="fa fa-arrows-alt"></i></button>	
			</section>
			
            <div class="clearfix"> </div>
           </div>
     
       
            <!-- Brand and toggle get grouped for better mobile display -->
		 
		   <!-- Collect the nav links, forms, and other content for toggling -->
		    <div class="drop-men" >
		        <ul class=" nav_1">
		           
		    		
					<li class="dropdown">
		              <a href="#" class="dropdown-toggle dropdown-at" data-toggle="dropdown"><span class=" name-caret"><%=session.getAttribute("session_name") %><i class="caret"></i></span><img src="images/wo.jpg"></a>
		              <ul class="dropdown-menu " role="menu">
		               
		                <li><a href="logout.jsp"><i class="fa fa-clipboard"></i>Logout</a></li>
		              </ul>
		            </li>
		           
		        </ul>
		     </div><!-- /.navbar-collapse -->
			<div class="clearfix">
       
     </div>
	  
		    <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                <ul class="nav" id="side-menu">
				
                    <li>
                        <a href="dashboard.jsp" class=" hvr-bounce-to-right"><i class="fa fa-dashboard nav_icon "></i><span class="nav-label">Dashboards</span> </a>
                    </li>
                   
                    <li>
                        <a href="#" class=" hvr-bounce-to-right"><i class="fa fa-indent nav_icon"></i> <span class="nav-label">Theaters</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a href="theater_add.jsp" class=" hvr-bounce-to-right"> <i class="fa fa-area-chart nav_icon"></i>Add Theater</a></li>
                            
                            <li><a href="theater_view.jsp" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>View Theaters</a></li>

					   </ul>
                    </li>
                    <li>
                        <a href="#" class=" hvr-bounce-to-right"><i class="fa fa-indent nav_icon"></i> <span class="nav-label">Movies</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a href="movie_add.jsp" class=" hvr-bounce-to-right"> <i class="fa fa-area-chart nav_icon"></i>Add Movie</a></li>
                            
                            <li><a href="movie_view.jsp" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>View Movies</a></li>
                            

					   </ul>
                    </li>
                    <li>
                        <a href="#" class=" hvr-bounce-to-right"><i class="fa fa-indent nav_icon"></i> <span class="nav-label">Movie In Theater</span><span class="fa arrow"></span></a>
                        <ul class="nav nav-second-level">
                            <li><a href="movie_update.jsp" class=" hvr-bounce-to-right"> <i class="fa fa-area-chart nav_icon"></i>Update</a></li>
                            
                            <li><a href="movie_update_view.jsp" class=" hvr-bounce-to-right"><i class="fa fa-map-marker nav_icon"></i>View Movies In Theater</a></li>
                           

					   </ul>
                    </li>
				
                    <li>
                        <a href="movies_h.jsp" class=" hvr-bounce-to-right"><i class="fa fa-picture-o nav_icon"></i> <span class="nav-label">Movies History</span> </a>
                    </li>
                     
                </ul>
            </div>
			</div>
        </nav>