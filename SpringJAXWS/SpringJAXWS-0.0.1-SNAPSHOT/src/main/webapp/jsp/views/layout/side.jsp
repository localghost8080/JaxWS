<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>
<h3 class="text-center"><s:message code="springws.main.menu"/></h3>
<ul>
<li><a href="<%=request.getContextPath()%>/simpleWS.htm">Simple WebService call</a></li>
<li>Simple WebService with rich params</li>
<li>WebService returning rich object </li>
<li>WebService accepting and returning collections </li>
<li>WebService accepting and returning streams</li>
</ul>
</div>