<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ogrenci Listesi</title>
</head>
<body>
<h1>Ogrenci Listesi</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Ad</th><th>Soyad</th><th>Bolum</th><th>Duzenle</th><th>Sil</th></tr>  
   <c:forEach var="ogr" items="${list}">   
   <tr>  
   <td>${ogr.id}</td>  
   <td>${ogr.ad}</td>  
   <td>${ogr.soyad}</td>  
   <td>${ogr.bolum}</td>  
   <td><a href="editogr/${ogr.id}">Duzenle</a></td>  
   <td><a href="deleteogr/${ogr.id}">Sil</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="/ogrform">Yeni Ogrenci Ekle</a>  

</body>
</html>