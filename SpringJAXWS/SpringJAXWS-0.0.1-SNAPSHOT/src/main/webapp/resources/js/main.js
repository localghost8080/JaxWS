function simpleWS(){
	document.behavCompetencyMasterForm.action="<%=request.getContextPath()%>/openNewBehavCompetencyMaster.htm";
	document.behavCompetencyMasterForm.method="POST";
	document.behavCompetencyMasterForm.submit();
}