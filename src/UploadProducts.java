import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;


import com.oreilly.servlet.*;
import db.DBConnectivity;



import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;
public class UploadProducts extends HttpServlet
{
public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
res.setContentType("text/html");
PrintWriter out = res.getWriter();
ServletContext context = getServletContext();
String dirName =context.getRealPath("\\uploads");
String file_name=null,pic1=null,trailer_name=null,mid=null,student_id=null,qty=null;
try{
MultipartRequest multi = new MultipartRequest 
(req,dirName,1000*1024*1024);

Enumeration params = multi.getParameterNames();
while (params.hasMoreElements()){
String name = (String)params.nextElement();
String value = multi.getParameter(name);
out.println( name + " = " + value);
if(name.equalsIgnoreCase("name"))
{
	file_name=multi.getParameter(name);		
}
if(name.equalsIgnoreCase("trailer_name"))
{
	trailer_name=multi.getParameter(name);		
}
if(name.equalsIgnoreCase("mid"))
{
	mid=multi.getParameter(name);		
}

}
out.println("</pre>");
out.println("<h3> files : </h3>");
out.println("<pre>");
Enumeration files = multi.getFileNames();
	while (files.hasMoreElements()){
	String name = (String)files.nextElement();
	String filename = multi.getFilesystemName(name);
	String type = multi.getContentType(name);
	File f = multi.getFile(name);
	
System.out.println("name : " + name+"file name : "+ filename+"type : "+type);

if(name.equals("pic1")){pic1=filename;}
	
if (f!=null){
out.println("length : " +f.length());
	
out.println();
}

}
	//res.sendRedirect("fileupload.jsp");
	Connection con = DBConnectivity.getCon();
	Statement st = con.createStatement();

	
	//****************************************************************************
	File folder = new File(context.getRealPath("/")+"uploads\\");
	
    File[] listOfFiles = folder.listFiles();
    
   // String fname = id+"F"+".jpg";

    
    for (int i = 0; i < listOfFiles.length; i++) {

        if (listOfFiles[i].isFile()) {
        	
            File temp = new File(context.getRealPath("/")+"uploads\\"+file_name);
            temp.renameTo(new File(context.getRealPath("/")+"uploads\\"+file_name));
            
        	
        }
    }

    //     pic1=file_name;
      
//*************************************
    Statement st1=con.createStatement();
    st1.execute("insert into movie_trailer(trailer_id, movie_id, trailer,video_link)values(0,'"+mid+"','"+trailer_name+"','"+pic1+"')");


	
	
		res.sendRedirect("admin/movie_trailer.jsp?mid="+mid);
}
catch(Exception e){

System.out.println(e+"---");
e.printStackTrace(out);

}

}
}