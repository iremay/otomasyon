<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ogrenci Kaydi</title>
</head>
<body>
 <h1>Yeni Ogrenci Kaydi</h1>  
       <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>Ad: </td>   
          <td><form:input path="ad"  /></td>  
         </tr>    
         <tr>    
          <td>Soyad:</td>    
          <td><form:input path="soyad" /></td>  
         </tr>   
         <tr>    
          <td>Bolum:</td>    
          <td><form:input path="bolum" /></td>  
         </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Kaydet" /></td>    
         </tr>    
        </table>    
       </form:form>    

</body>
</html>