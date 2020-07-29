<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Duzenle</title>
</head>
<body>
  <h1>Ogrenci Düzenle</h1>  
       <form:form method="POST" action="/otomasyonsistemi/editsave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>   
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
          <td><input type="submit" value="Duzenle" /></td>    
         </tr>    
        </table>    
       </form:form>    

</body>
</html>