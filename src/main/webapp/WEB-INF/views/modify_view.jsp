<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글내용 수정</title>
</head>
<body>

		<h2>글 내용 수정</h2>
	<hr>
	<table width="500" border="1" cellspacing="0" cellpadding="0">
		<form action="modify">
		<input type="hidden" value="${dtos.mid }" name="bid">
		<tr>
			<th width="100">글번호</th>
			<td>${dtos.mid }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input type="text" value="${dtos.mwriter }" size="60" name="mwriter"></td>
		</tr>
		<tr>
			<th valign="top">내 용</th>
			<td height="100" valign="top">			
			<textarea rows="10" cols="45" name="mcontent">${dtos.mcontent }</textarea>
			</td>
		</tr>
		
			<td colspan="2" align="right">				
				<input type="submit" value="완료">
				<input type="reset" value="취소">
				<input type="button" value="목록" onclick="javascript:window.location='list'">
			</td>
		</tr>
		</form>
	</table>

</body>
</html>