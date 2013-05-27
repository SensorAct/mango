package org.apache.jsp.tag.web.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menuItem_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("m2m2:menuItemIsVisible", com.serotonin.m2m2.web.taglib.Functions.class, "menuItemIsVisible", new Class[] {com.serotonin.m2m2.module.UrlMappingDefinition.class, javax.servlet.jsp.PageContext.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(3);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList _jspx_nested = null;
    java.util.ArrayList _jspx_at_begin = null;
    java.util.ArrayList _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private com.serotonin.m2m2.module.UrlMappingDefinition mi;

  public com.serotonin.m2m2.module.UrlMappingDefinition getMi() {
    return this.mi;
  }

  public void setMi(com.serotonin.m2m2.module.UrlMappingDefinition mi) {
    this.mi = mi;
  }

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    _jspInit(config);
    if( getMi() != null ) {
      _jspx_page_context.setAttribute("mi", getMi());
}

    try {
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
      _jspDestroy();
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${m2m2:menuItemIsVisible(mi, pageContext)}", java.lang.Boolean.class, (PageContext)this.getJspContext(), _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_tag_menuItem_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_0 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_0      );
    }
    _jspx_th_tag_menuItem_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_0.setParent(_jspx_th_c_if_0);
    _jspx_th_tag_menuItem_0.setHref((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi.urlPath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_menuItem_0.setSrc((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi.menuImagePath}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_menuItem_0.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi.menuKey}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_menuItem_0.setTarget((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi.target}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_menuItem_0.doTag();
    return false;
  }
}
