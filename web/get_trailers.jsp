<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.bitm.action.DBConnectivity"%>
<%@page import="java.sql.Connection"%>

   	    		    <%
 		String trailer="";
 		Connection con = DBConnectivity.getCon();
 		Statement st = con.createStatement();
 		ResultSet rs= st.executeQuery("select trailer,video_link from movie_trailer where movie_id='"+request.getParameter("mid")+"'");
 		while(rs.next())
 		{
 			trailer=rs.getString("video_link");%>
 			<video width="320" height="240" controls>
  <source src="uploads/<%=trailer %>" type="video/mp4">
  <source src="uploads/<%=trailer %>" type="video/ogg">
  Your browser does not support the video tag.
</video>
   			     
   			   
   			<%
 		}
 		%>
   			