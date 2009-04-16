<%
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html; charset=UTF-8");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html debug="true">
  <head>
    
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" type="text/css" href="javascript/extjs/resources/css/ext-all.css" />
    
    
    <script type="text/javascript" src="javascript/extjs/adapter/ext/ext-base.js"></script>
    <script type="text/javascript" src="javascript/extjs/ext-all.js"></script>
    
    
    <!--  ANNIS config -->
    <script type="text/javascript" src="javascript/annis/config.js"></script>
    
    <script type="text/javascript" src="javascript/annis/RowExpander.js"></script>
    <script type="text/javascript" src="javascript/annis/ColumnNodeUI.js"></script>
    <script type="text/javascript" src="javascript/annis/Url.js"></script>
    
    <!-- A Localization Script File comes here -->
    <!-- <script type="text/javascript">
        Ext.onReady(myNameSpace.app.init, myNameSpace.app);
    </script> -->
    
    <!--  ANNIS Modules -->
    <script type="text/javascript" src="javascript/annis/toolbarMain.js"></script>
    <script type="text/javascript" src="javascript/annis/windowCorpusList.js"></script>
    <script type="text/javascript" src="javascript/annis/MetaDataWindow.js"></script>
    <script type="text/javascript" src="javascript/annis/windowSearch.js"></script>
    <script type="text/javascript" src="javascript/annis/windowSearchResult.js"></script>
    
    <title>Annis&sup2; Corpus Search</title>
    
    <link rel="stylesheet" type="text/css" href="css/annis.css" />
  </head>
  <body>
    <div id="toolbar"></div>
    <div id="workspace"></div>
    <div id="windowSearchResult"></div>
    <div id="windowCorpusList"></div>
  </body>
</html>