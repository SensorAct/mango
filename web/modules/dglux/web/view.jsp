<%@page import="java.net.URLEncoder"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>
<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html lang="en">
<base href="${pagePath}/core/"/>
<!-- 
  Smart developers always View Source. 
  
  This application was built using Adobe Flex, an open source framework
  for building rich Internet applications that get delivered via the
  Flash Player or to desktops via Adobe AIR. 
  
  Learn more about Flex at http://flex.org
// -->

<head>
  <meta http-equiv='Content-Type' content='text/html; charset=utf-8' />
  
  <!--  BEGIN Browser History required section -->
  <link rel='stylesheet' type='text/css' href='history/history.css' />
  <!--  END Browser History required section -->
  
  <title>DGLux</title>
  <link rel="icon" href="/images/favicon.ico"/>
  <link rel="shortcut icon" href="/images/favicon.ico"/>
  <script src='AC_OETags.js' language='javascript'></script>
  
  <!--  BEGIN Browser History required section -->
  <script src='history/history.js' language='javascript'></script>
  <!--  END Browser History required section -->
  
  <style>
    body { margin: 0px;  }
  </style>
  <script language='JavaScript' type='text/javascript'>
    <!--
    // -----------------------------------------------------------------------------
    // Globals
    // Major version of Flash required
    var requiredMajorVersion = 10;
    // Minor version of Flash required
    var requiredMinorVersion = 1;
    // Minor version of Flash required
    var requiredRevision = 0;
    // -----------------------------------------------------------------------------
    // -->
  </script>
</head>
 
<body  bgcolor='#000000'>
  <script language='JavaScript' type='text/javascript'>
    <!--
    // Version check for the Flash Player that has the ability to start Player Product Install (6.0r65)
    var hasProductInstall = DetectFlashVer(6, 0, 65);
    
    // Version check based upon the values defined in globals
    var hasRequestedVersion = DetectFlashVer(requiredMajorVersion, requiredMinorVersion, requiredRevision);
    
    var cnt = 6;
    function redirect() {
        if (cnt-- == 0)
            window.location = "/";
        else {
            var el = document.getElementById('allowMsg');
            el.innerHTML="Redirecting to Login page in "+cnt;
            setTimeout('redirect()',1000);
        }
    }
    
    if (!${allowAccess}) {
        alternateContent = '<center><br><br><div style="width:600; height:250; color: black; background-color: white"><br><br><h2>This is not a public view : <br><br> '
                + window.location+'<br><br>' + '<a id="allowMsg" href=/></a></div>';
        document.write(alternateContent);  // insert non-flash content
        setTimeout('redirect()',1000);
    }
    else if (hasProductInstall && !hasRequestedVersion ) {
        // DO NOT MODIFY THE FOLLOWING FOUR LINES
        // Location visited after installation is complete if installation is required
        var MMPlayerType = (isIE == true) ? 'ActiveX' : 'PlugIn';
        var MMredirectURL = window.location;
        document.title = document.title.slice(0, 47) + ' - Flash Player Installation';
        var MMdoctitle = document.title;
        
        AC_FL_RunContent(
            'src', 'playerProductInstall',
            'FlashVars', 'MMredirectURL='+MMredirectURL+'&MMplayerType='+MMPlayerType+'&MMdoctitle='+MMdoctitle+'',
            'width', '100%',
            'height', '100%',
            'align', 'middle',
            'id', 'dglux',
            'quality', 'high',
            'bgcolor', '#869ca7',
            'name', 'dglux',
            'allowScriptAccess','sameDomain',
            'type', 'application/x-shockwave-flash',
            'wmode', 'transparent',
            'pluginspage', 'http://www.adobe.com/go/getflashplayer',
            'flashvars', '${flashVars}'
        );
    }
    else if (hasRequestedVersion) {
        // if we've detected an acceptable version
        // embed the Flash Content SWF when all tests are passed
        AC_FL_RunContent(
                'src', 'dglux',
                'width', '100%',
                'height', '100%',
                'align', 'middle',
                'id', 'dglux',
                'quality', 'high',
                'bgcolor', '#869ca7',
                'name', 'dglux',
                'allowScriptAccess','sameDomain',
                'type', 'application/x-shockwave-flash',
                'wmode', 'transparent',
                'pluginspage', 'http://www.adobe.com/go/getflashplayer',
                'flashvars', '${flashVars}'
        );
    }
    else {  // flash is too old or we can't detect the plugin
        var alternateContent = 'Alternate HTML content should be placed here. '
                + 'This content requires the Adobe Flash Player. '
                + '<a href=http://www.adobe.com/go/getflash/>Get Flash</a>';
        document.write(alternateContent);  // insert non-flash content
    }
    // -->
  </script>
  <noscript>
    <object classid='clsid:D27CDB6E-AE6D-11cf-96B8-444553540000'
            id='dglux' width='100%' height='100%'
            codebase='http://fpdownload.macromedia.com/get/flashplayer/current/swflash.cab'>
            <param name='movie' value='dglux.swf' />
            <param name='quality' value='high' />
            <param name='bgcolor' value='#869ca7' />
            <param name='wmode' value='transparent' />
            <param name='flashvars' value='${flashVars}' />
            <param name='allowScriptAccess' value='sameDomain' />
            <embed src='dglux.swf' quality='high' bgcolor='#869ca7'
                width='100%' height='100%' name='dglux' align='middle'
                play='true'
                loop='false'
                quality='high'
                wmode='transparent'
                flashvars='${flashVars}'
                allowScriptAccess='sameDomain'
                type='application/x-shockwave-flash'
                pluginspage='http://www.adobe.com/go/getflashplayer'>
            </embed>
    </object>
  </noscript>
</body>
</html>