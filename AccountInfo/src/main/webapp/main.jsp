<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="vo.MemberDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
 <!-- createAccount.jsp�� �̵��ϴ� ��ư -->
  <button onclick="goToCreateAccount()">���� ����</button>

  <!-- ���� ���� -->
<%
	MemberDTO dto = new MemberDTO();
	//DTO ��ü�� ������ ����
	dto.setMemberId("gj98");
	dto.setName("John Doe");
	dto.setEmail("johndoe@example.com");


	session.setAttribute("dto", dto);
%>
<script>
    // createAccount.jsp�� �̵��ϴ� �Լ�
  function goToCreateAccount() {
      window.location.href = "createAccount.jsp";
  }
</script>
</body>
</html>