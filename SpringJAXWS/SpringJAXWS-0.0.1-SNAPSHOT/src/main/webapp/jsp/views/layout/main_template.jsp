<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
<meta http-equiv="X-UA-Compatible" content="IE=8" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" media="all" type="text/css" href="/SpringJAXWS/resources/css/baselayout.css" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="/SpringJAXWS/resources/js/main.js"></script>
<title>
	<tiles:insertAttribute name="title"	defaultValue="SpringJaxWS" ignore="true">
	</tiles:insertAttribute>
</title>

<body>
	<table class="baseTable">
	<tr>
		<td colspan="2">
			<tiles:insertAttribute name="header"></tiles:insertAttribute>
		</td>
	</tr>
	<tr>
		<td width="15%"><tiles:insertAttribute name="side-panel"></tiles:insertAttribute></td>
		<td><tiles:insertAttribute name="content"></tiles:insertAttribute></td>
	</tr>
	<tr>
		<td colspan="2">
			<tiles:insertAttribute name="footer"></tiles:insertAttribute>
		</td>
	</tr>
	</table>
</body>
</html>