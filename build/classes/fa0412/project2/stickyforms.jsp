<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A Sticky Form for Formatting Inputs</title>
</head>
<body bgcolor = "003344" text="cccccc">
<%
//  obtaining the inputs from the form into local variables
String first = request.getParameter("firstName");
if (first == null){
	String error = "error";
	request.setAttribute("firstName", error);
	out.print(error);
}


		
String last = request.getParameter("lastName");
if (last == null) last = "";

String email1 = request.getParameter("email1");
if (email1 == null) email1 = "";

String email2 = request.getParameter("email2");
if (email2 == null) email2 = "";

String areaCode = request.getParameter("areaCode");
if (areaCode == null) areaCode = "";

String prefix = request.getParameter("prefix");
if (prefix == null) prefix = "";

String suffix = request.getParameter("suffix");
if (suffix == null) suffix = "";

String password1 = request.getParameter("password1");
if (password1 == null) password1 = "";

String password2 = request.getParameter("password2");
if (password2 == null) password2 = "";

// checking to see if this form has been submitted
if (request.getMethod().equals("POST"))
{
// initializing a boolean for errors
boolean allEntriesPresent = true;
// initializing a string for the error message
String skipped_inputs = "";
if (first.length( ) == 0)
{

skipped_inputs = "You forgot to enter your first name<br>";
allEntriesPresent = false;

}
if (last.length( ) == 0)
{

skipped_inputs = skipped_inputs + "You forgot to enter your last name<br>";
allEntriesPresent = false;

}
if (email1.length( ) == 0)
{

skipped_inputs = skipped_inputs + "You forgot to enter your email address<br>";
allEntriesPresent = false;

}
if (email2.length( ) == 0)
{

skipped_inputs = skipped_inputs + "You forgot to enter your email address<br>";
allEntriesPresent = false;

}
if (areaCode.length( ) == 0)
{

skipped_inputs = skipped_inputs + "You forgot to enter your email address<br>";
allEntriesPresent = false;

}

if (prefix.length( ) == 0)
{

skipped_inputs = skipped_inputs + "You forgot to enter your email address<br>";
allEntriesPresent = false;

}

if (suffix.length( ) == 0)
{

skipped_inputs = skipped_inputs + "You forgot to enter your email address<br>";
allEntriesPresent = false;

}
if (password1.length( ) == 0)
{

skipped_inputs = skipped_inputs + "You forgot to enter your email address<br>";
allEntriesPresent = false;

}
if (password2.length( ) == 0)
{

skipped_inputs = skipped_inputs + "You forgot to enter your email address<br>";
allEntriesPresent = false;

}


// if all of the required fields haven't been entered
// inform the user
if (!allEntriesPresent)
{

out.println(skipped_inputs);

}
else
{

// display the name and address that have been entered
String identifierString = "Your name: " + first + " " + last + "<br>" +
"Your email: " + email1 + "<br>";
out.println("<p>" + identifierString);

}

}
%>

</body>
</html>