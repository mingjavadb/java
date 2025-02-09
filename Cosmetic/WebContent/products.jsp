<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.sql.*"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" />
<title>상품 목록</title>
</head>
<body>
   <jsp:include page="menu.jsp" />
   <div class="jumbotron">
      <div class="container">
         <h1 class="display-3">상품 목록</h1>
      </div>
   </div>
   <div class="container">
      <div class="row" align="center">
         <%@ include file="dbconn.jsp" %>
         <%
            PreparedStatement pstmt = null;
            ResultSet rs = null;
            
            String sql = "select * from cosmetic";
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
         %>
         <div class="col-md-4">
            <img src="./resources/img/<%=rs.getString("c_filename")%>" style="width: 100%">
            <h3><%=rs.getString("c_name")%></h3>
            <p><%=rs.getString("c_description")%>
            <p><%=rs.getString("c_price")%>원
            <p><a href="./product.jsp?c_id=<%=rs.getString("c_id")%>"class="btn btn-secondary" role="button">상세 정보 &raquo;></a>
         </div>
         <%
            }
            if (rs != null)
               rs.close();
            if (pstmt != null)
               pstmt.close();
            if (conn != null)
               conn.close();
         %>
      </div>
      <hr>
   </div>
   <jsp:include page="footer.jsp" />
</body>
</html>