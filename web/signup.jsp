<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="com.bitm.action.DBConnectivity"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
<title>Home</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Hotel Deluxe Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--webfont-->
<link href='//fonts.googleapis.com/css?family=Montserrat:400,700' rel='stylesheet' type='text/css'>
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="js/login.js"></script>
<script src="js/jquery.easydropdown.js"></script>
<!--Animation-->
<script src="js/wow.min.js"></script>
<link href="css/animate.css" rel='stylesheet' type='text/css' />
<script>
	new WOW().init();
</script>
           <script type="text/javascript">
 
        function onlyAlphabets(e, t) {
            try {
                if (window.event) {
                    var charCode = window.event.keyCode;
                }
                else if (e) {
                    var charCode = e.which;
                }
                else { return true; }
                if ((charCode > 64 && charCode < 91) || (charCode > 96 && charCode < 123))
                    return true;
                else
                    return false;
            }
            catch (err) {
                alert(err.Description);
            }
        }
        function isNumberKeyevent(evt) //onkeypress="return isNumberKeyevent(event)"
        {
        var charCode = (evt.which) ? evt.which : event.keyCode
        if (charCode > 31 && (charCode < 48 || charCode > 57))
        return false;
        return true;
        }
        
        </script>
        <script type="text/javascript">
/**
 * DHTML phone number validation script. Courtesy of SmartWebby.com (http://www.smartwebby.com/dhtml/)
 */

// Declaring required variables
var digits = "0123456789";
// non-digit characters which are allowed in phone numbers
var phoneNumberDelimiters = "()- ";
// characters which are allowed in international phone numbers
// (a leading + is OK)
var validWorldPhoneChars = phoneNumberDelimiters + "+";
// Minimum no of digits in an international phone no.
var minDigitsInIPhoneNumber = 10;

function isInteger(s)
{   var i;
    for (i = 0; i < s.length; i++)
    {   
        // Check that current character is number.
        var c = s.charAt(i);
        if (((c < "0") || (c > "9"))) return false;
    }
    // All characters are numbers.
    return true;
}
function trim(s)
{   var i;
    var returnString = "";
    // Search through string's characters one by one.
    // If character is not a whitespace, append to returnString.
    for (i = 0; i < s.length; i++)
    {   
        // Check that current character isn't whitespace.
        var c = s.charAt(i);
        if (c != " ") returnString += c;
    }
    return returnString;
}
function stripCharsInBag(s, bag)
{   var i;
    var returnString = "";
    // Search through string's characters one by one.
    // If character is not in bag, append to returnString.
    for (i = 0; i < s.length; i++)
    {   
        // Check that current character isn't whitespace.
        var c = s.charAt(i);
        if (bag.indexOf(c) == -1) returnString += c;
    }
    return returnString;
}

function checkInternationalPhone(strPhone){
var bracket=3
strPhone=trim(strPhone)
if(strPhone.indexOf("+")>1) return false
if(strPhone.indexOf("-")!=-1)bracket=bracket+1
if(strPhone.indexOf("(")!=-1 && strPhone.indexOf("(")>bracket)return false
var brchr=strPhone.indexOf("(")
if(strPhone.indexOf("(")!=-1 && strPhone.charAt(brchr+2)!=")")return false
if(strPhone.indexOf("(")==-1 && strPhone.indexOf(")")!=-1)return false
s=stripCharsInBag(strPhone,validWorldPhoneChars);
return (isInteger(s) && s.length >= minDigitsInIPhoneNumber);
}

function ValidateForm(){
	var Phone=document.getElementById("mobile").value;
	
	if ((Phone==null)||(Phone=="")){
		//alert("Please Enter your Phone Number")
		document.getElementById("err_mob").innerHTML="enter the mobile number";
		//Phone.focus()
		return false;
	}
	document.getElementById("err_mob").innerHTML="";
	if (checkInternationalPhone(Phone)==false){
		//alert("Please Enter a Valid Phone Number")
				document.getElementById("err_mob").innerHTML="invalid mobile number";

		//Phone.value=""
		//Phone.focus()
		return false;
	}
	document.getElementById("err_mob").innerHTML="";
	return true;
 }
</script>
        
</head>
<body>
<jsp:include page="include/header.jsp"></jsp:include>
   
   
   <div class="content_middle">
   	  <div class="container">
   	    <div class="content_middle_box">
          
   	   <div class="login-bottom">
			<h2>Register</h2>
			<form action='signup_save.jsp'>
			<table>
					<tr><td>Name</td><td><input type="text" placeholder="Name" name='name' id='name' required="" onkeypress="return onlyAlphabets(event,this);"/></td></tr>
					<tr><td>&nbsp;</td></tr>
					<tr><td>Mobile</td><td><input type="text" maxlength="10" placeholder="Mobile" name='mobile' id='mobile' required="" onblur="ValidateForm();" onkeypress="return isNumberKeyevent(event)" /></td><td><span id="err_mob" style="color:red"></span></td></tr>
					<tr><td>&nbsp;</td></tr>
					<tr><td>Email</td><td><input type="email" placeholder="Email" name='email' id='email' required=""></td></tr>
					<tr><td>&nbsp;</td></tr>
					<tr><td>Password</td><td><input type="password" placeholder="Password" name='password' id='password' required=""></td></tr>
					<tr><td>&nbsp;</td></tr>
					<tr><td>Dob</td><td><input type="date" placeholder="" name='dob' id='dob' required=""></td></tr>
					<tr><td>&nbsp;</td></tr>
					<tr><td>Qualification</td><td><input type="text" placeholder="" name='qua' id='qua' required=""></td></tr>
					<tr><td>&nbsp;</td></tr>
					<tr><td>Gender</td><td><select placeholder="" name='gender' id='gender' required="">
					<option value="Male">Male</option>
					<option value="FeMale">FeMale</option>
					</select></td></tr>
					<tr><td>&nbsp;</td></tr>
			</table>	
				 
	
			</div>
			<div class="col-md-6 login-do">
				<label class="hvr-shutter-in-horizontal login-sub">
					<input type="submit" value="Submit">
					</label>
					<p>Already register</p>
				<a href="index.jsp" class="hvr-shutter-in-horizontal">Login</a>
			</div>
			</form>
			<div class="clearfix"> </div>
		</div>
   		
   		
   		  </div>
   		  
   		  </div>
   	  </div>
   </div>
   
</body>
</html>		