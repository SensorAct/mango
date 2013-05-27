package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dataSourceList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(9);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/toolbar.tag");
    _jspx_dependants.add("/WEB-INF/tags/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_tag_page_0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tag_page_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:page
    org.apache.jsp.tag.web.page_tag _jspx_th_tag_page_0 = new org.apache.jsp.tag.web.page_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_page_0      );
    }
    _jspx_th_tag_page_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_page_0.setDwr("DataSourceListDwr");
    _jspx_th_tag_page_0.setOnload("init");
    _jspx_th_tag_page_0.setJspBody(new dataSourceList_jspHelper( 0, _jspx_page_context, _jspx_th_tag_page_0, null));
    _jspx_th_tag_page_0.doTag();
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_0 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_0.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_0.setKey("common.enabledToggle");
    _jspx_th_m2m2_translate_0.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_0 = _jspx_th_m2m2_translate_0.doStartTag();
    if (_jspx_th_m2m2_translate_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_0);
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_1 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_1.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_1.setKey("common.disabledToggle");
    _jspx_th_m2m2_translate_1.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_1 = _jspx_th_m2m2_translate_1.doStartTag();
    if (_jspx_th_m2m2_translate_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_1);
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_2 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_2.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_2.setKey("common.edit");
    _jspx_th_m2m2_translate_2.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_2 = _jspx_th_m2m2_translate_2.doStartTag();
    if (_jspx_th_m2m2_translate_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_2);
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_3 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_3.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_3.setKey("common.delete");
    _jspx_th_m2m2_translate_3.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_3 = _jspx_th_m2m2_translate_3.doStartTag();
    if (_jspx_th_m2m2_translate_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_3);
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_4 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_4.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_4.setKey("common.copy");
    _jspx_th_m2m2_translate_4.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_4 = _jspx_th_m2m2_translate_4.doStartTag();
    if (_jspx_th_m2m2_translate_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_4);
    return false;
  }

  private boolean _jspx_meth_m2m2_translate_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  m2m2:translate
    com.serotonin.m2m2.web.taglib.TranslateTag _jspx_th_m2m2_translate_5 = (com.serotonin.m2m2.web.taglib.TranslateTag) _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.get(com.serotonin.m2m2.web.taglib.TranslateTag.class);
    _jspx_th_m2m2_translate_5.setPageContext(_jspx_page_context);
    _jspx_th_m2m2_translate_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_m2m2_translate_5.setKey("emport.export");
    _jspx_th_m2m2_translate_5.setEscapeDQuotes(true);
    int _jspx_eval_m2m2_translate_5 = _jspx_th_m2m2_translate_5.doStartTag();
    if (_jspx_th_m2m2_translate_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_m2m2_translate_key_escapeDQuotes_nobody.reuse(_jspx_th_m2m2_translate_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_0.setKey("dsList.dsDeleteConfirm");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_tag_img_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_0 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_0      );
    }
    _jspx_th_tag_img_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_0.setParent(_jspx_parent);
    _jspx_th_tag_img_0.setPng("icon_ds");
    _jspx_th_tag_img_0.setTitle("dsList.dataSources");
    _jspx_th_tag_img_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_1.setKey("dsList.dataSources");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_tag_help_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_0 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_0      );
    }
    _jspx_th_tag_help_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_0.setParent(_jspx_parent);
    _jspx_th_tag_help_0.setId("dataSourceList");
    _jspx_th_tag_help_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_1 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_1      );
    }
    _jspx_th_tag_img_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_1.setParent(_jspx_parent);
    _jspx_th_tag_img_1.setPng("icon_ds_add");
    _jspx_th_tag_img_1.setTitle("common.add");
    _jspx_th_tag_img_1.setOnclick("addDataSource()");
    _jspx_th_tag_img_1.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_2.setKey("dsList.name");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_3.setKey("dsList.type");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_4.setKey("dsList.connection");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_5.setKey("dsList.status");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_tag_img_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_2 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_2      );
    }
    _jspx_th_tag_img_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_2.setParent(_jspx_parent);
    _jspx_th_tag_img_2.setPng("hourglass");
    _jspx_th_tag_img_2.setTitle("common.loading");
    _jspx_th_tag_img_2.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_6.setKey("dsList.emptyList");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_7.setKey("dsList.copy");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_8.setKey("common.xid");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_9.setKey("dsEdit.name");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_10.setKey("pointEdit.props.deviceName");
    int _jspx_eval_fmt_message_10 = _jspx_th_fmt_message_10.doStartTag();
    if (_jspx_th_fmt_message_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_10);
    return false;
  }

  private boolean _jspx_meth_fmt_message_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_11 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_11.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_11.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_11.setKey("common.copy");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_12.setKey("common.cancel");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_13.setKey("dsList.export");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_14.setKey("common.close");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private class dataSourceList_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public dataSourceList_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n  <style type=\"text/css\">\r\n    .mangoForm ul { margin: 0; padding: 0; }\r\n    .mangoForm ul li { margin-bottom: 5px; list-style: none; }\r\n    .mangoForm label { width: 100px; text-align: right; padding-right: 10px; display: inline-block; }\r\n    .mangoForm label.required { font-weight: bold; }\r\n  </style>\r\n  <script type=\"text/javascript\">\r\n    dojo.require(\"dijit.Dialog\");\r\n    dojo.require(\"dijit.form.Form\");\r\n    dojo.require(\"dijit.form.ValidationTextBox\");\r\n    dojo.require(\"dijit.form.Button\");\r\n    \r\n    function init() {\r\n        DataSourceListDwr.init(function(response) {\r\n        \thide(\"hourglass\");\r\n        \t\r\n        \tvar dss = response.data.dataSources;\r\n            dwr.util.removeAllRows(\"dataSourceList\");\r\n            if (dss.length == 0)\r\n                show(\"noDataSources\");\r\n            else {\r\n            \thide(\"noDataSources\");\r\n            \tdwr.util.addRows(\"dataSourceList\", dss,\r\n                    [\r\n                        function(ds) { return \"<b>\"+ ds.name +\"</b>\"; },\r\n                        function(ds) { return ds.typeDescription; },\r\n");
      out.write("                        function(ds) { return ds.connectionDescription; },\r\n                        function(ds) {\r\n                        \tif (ds.enabled) {\r\n                        \t\treturn writeImage(\"dsImg\"+ ds.id, null, \"database_go\", \r\n                        \t\t\t\t\"");
      if (_jspx_meth_m2m2_translate_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\", \r\n                        \t\t\t\t\"toggleDataSource(\"+ ds.id +\")\");\r\n                        \t}\r\n                            return writeImage(\"dsImg\"+ ds.id, null, \"database_stop\", \r\n                                    \"");
      if (_jspx_meth_m2m2_translate_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\", \r\n                                    \"toggleDataSource(\"+ ds.id +\")\");\r\n                        },\r\n                        function(ds) {\r\n                        \tvar s = \"\";\r\n                        \ts += '<a href=\"data_source_edit.shtm?dsid='+ ds.id +'\">';\r\n                        \ts += writeImage(null, null, \"icon_ds_edit\",\r\n                        \t\t\t\"");
      if (_jspx_meth_m2m2_translate_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\", null);\r\n                        \ts += \"</a>\";\r\n                        \t\r\n                            s += writeImage(\"deleteDataSourceImg\"+ ds.id, null, \"icon_ds_delete\", \r\n                                    \"");
      if (_jspx_meth_m2m2_translate_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\", \r\n                                    \"deleteDataSource(\"+ ds.id +\")\");\r\n                            \r\n                            s += writeImage(\"copyDataSourceImg\"+ ds.id, null, \"icon_ds_add\", \r\n                                    \"");
      if (_jspx_meth_m2m2_translate_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\", \r\n                                    \"copyDataSource(\"+ ds.id +\")\");\r\n                            \r\n                            s += writeImage(\"exportDataSourceImg\"+ ds.id, null, \"emport\", \r\n                                    \"");
      if (_jspx_meth_m2m2_translate_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\", \r\n                                    \"exportDataSource(\"+ ds.id +\")\");\r\n                        \r\n                        \treturn s;\r\n                      \t}\r\n                    ],\r\n                    {\r\n                        rowCreator: function(options) {\r\n                            var tr = document.createElement(\"tr\");\r\n                            tr.id = \"dataSourceRow\"+ options.rowData.id;\r\n                            tr.className = \"row\"+ (options.rowIndex % 2 == 0 ? \"\" : \"Alt\");\r\n                            return tr;\r\n                        },\r\n                        cellCreator: function(options) {\r\n                            var td = document.createElement(\"td\");\r\n                            if (options.cellNum == 3)\r\n                                td.align = \"center\";\r\n                            return td;\r\n                        }\r\n                    }\r\n            \t);\r\n            }\r\n            \r\n            if (response.data.types) {\r\n                dwr.util.addOptions(\"dataSourceTypes\", response.data.types, \"key\", \"value\");\r\n");
      out.write("                show(\"dataSourceTypesContent\");\r\n            }\r\n        });\r\n        \r\n        copyDataSourceDialog.onHide = cancelCopyDataSource;\r\n    }\r\n    \r\n    function toggleDataSource(dataSourceId) {\r\n        var imgNode = $(\"dsImg\"+ dataSourceId);\r\n        if (!hasImageFader(imgNode)) {\r\n        \tstartImageFader(imgNode);\r\n            DataSourceListDwr.toggleDataSource(dataSourceId, function(result) {\r\n                updateStatusImg($(\"dsImg\"+ result.id), result.enabled);\r\n            });\r\n        }\r\n    }\r\n    \r\n    function updateStatusImg(imgNode, enabled) {\r\n        stopImageFader(imgNode);\r\n        setDataSourceStatusImg(enabled, imgNode);\r\n    }\r\n    \r\n    function deleteDataSource(dataSourceId) {\r\n        if (confirm(\"");
      if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\")) {\r\n            startImageFader(\"deleteDataSourceImg\"+ dataSourceId);\r\n            DataSourceListDwr.deleteDataSource(dataSourceId, function(dataSourceId) {\r\n                stopImageFader(\"deleteDataSourceImg\"+ dataSourceId);\r\n                // Delete the data source row\r\n                var row = $(\"dataSourceRow\"+ dataSourceId);\r\n                row.parentNode.removeChild(row);\r\n            });\r\n        }\r\n    }\r\n    \r\n    function copyDataSource(fromDataSourceId) {\r\n        startImageFader(\"copyDataSourceImg\"+ fromDataSourceId);\r\n        DataSourceListDwr.dataSourceInfo(fromDataSourceId, function(response) {\r\n            $set(\"copyId\", fromDataSourceId);\r\n            $set(\"copyName\", response.data.name);\r\n            $set(\"copyXid\", response.data.xid);\r\n            $set(\"copyDeviceName\", response.data.deviceName);\r\n            copyDataSourceDialog.show();\r\n        });\r\n    }\r\n    \r\n    function sumbitCopyDataSource() {\r\n        DataSourceListDwr.copyDataSource($get(\"copyId\"), $get(\"copyName\"), $get(\"copyXid\"), $get(\"copyDeviceName\"),\r\n");
      out.write("                function(response) {\r\n                    if (response.hasMessages) {\r\n                        for (var i=0; i<response.messages.length; i++) {\r\n                            var m = response.messages[i];\r\n                            var x;\r\n                            if (m.contextKey == \"dataSourceName\")\r\n                                x = dijit.byId(\"copyName\");\r\n                            else if (m.contextKey == \"xid\")\r\n                                x = dijit.byId(\"copyXid\");\r\n                            if (x) {\r\n                                x.focus();\r\n                                x.displayMessage(m.contextualMessage);\r\n                                break;\r\n                            }\r\n                        }\r\n                    }\r\n                    else\r\n                        window.location = \"data_source_edit.shtm?dsid=\"+ response.data.newId;\r\n                }\r\n        );\r\n    }\r\n    \r\n    function cancelCopyDataSource() {\r\n        stopImageFader(\"copyDataSourceImg\"+ $get(\"copyId\"));\r\n");
      out.write("    }\r\n    \r\n    function addDataSource() {\r\n        window.location = \"data_source_edit.shtm?typeId=\"+ $get(\"dataSourceTypes\");\r\n    }\r\n    \r\n    function exportDataSource(dataSourceId) {\r\n        DataSourceListDwr.exportDataSourceAndPoints(dataSourceId, function(json) {\r\n            $set(\"exportData\", json);\r\n            dataSourceExportDialog.show();\r\n        });\r\n    }\r\n  </script>\r\n  \r\n  <table>\r\n    <tr>\r\n      <td>\r\n        ");
      if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n        <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</span>\r\n        ");
      if (_jspx_meth_tag_help_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n      </td>\r\n      <td align=\"right\" id=\"dataSourceTypesContent\" style=\"display:none\">\r\n        <select id=\"dataSourceTypes\"></select>\r\n        ");
      if (_jspx_meth_tag_img_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\r\n      </td>\r\n    </tr>\r\n\r\n    <tr>\r\n      <td colspan=\"2\">\r\n        <table>\r\n          <tr class=\"rowHeader\">\r\n            <td>");
      if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n            <td>");
      if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n            <td>");
      if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n            <td>");
      if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td>\r\n            <td></td>\r\n          </tr>\r\n          \r\n          <tr id=\"hourglass\" class=\"row\"><td colspan=\"5\" align=\"center\">");
      if (_jspx_meth_tag_img_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td></tr>\r\n          <tr id=\"noDataSources\" class=\"row\" style=\"display:none;\"><td colspan=\"5\">");
      if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</td></tr>\r\n          <tbody id=\"dataSourceList\"></tbody>\r\n        </table>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  \r\n  <div data-dojo-type=\"dijit.Dialog\" data-dojo-id=\"copyDataSourceDialog\" title=\"");
      if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\" style=\"display: none\">\r\n    <form data-dojo-type=\"dijit.form.Form\">\r\n      <div class=\"dijitDialogPaneContentArea mangoForm\">\r\n        <ul>\r\n          <li>\r\n            <label for='copyXid' class=\"required\">");
      if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</label>\r\n            <div id=\"copyXid\" data-dojo-type=\"dijit.form.ValidationTextBox\" data-dojo-id=\"copyXid\"></div>\r\n          </li>\r\n          <li>\r\n            <label for='copyName' class=\"required\">");
      if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</label>\r\n            <div id=\"copyName\" data-dojo-type=\"dijit.form.ValidationTextBox\" data-dojo-id=\"copyName\"></div>\r\n          </li>\r\n          <li>\r\n            <label for='copyDeviceName'>");
      if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</label>\r\n            <div id=\"copyDeviceName\" data-dojo-type=\"dijit.form.ValidationTextBox\"></div>\r\n          </li>\r\n        </ul>\r\n        <input type=\"hidden\" id=\"copyId\"/>\r\n      </div>\r\n      <div class=\"dijitDialogPaneActionBar\">\r\n        <button data-dojo-type=\"dijit.form.Button\" type=\"button\" data-dojo-props=\"onClick:sumbitCopyDataSource\">");
      if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</button>\r\n        <button data-dojo-type=\"dijit.form.Button\" type=\"button\" data-dojo-props=\"onClick:function() {copyDataSourceDialog.hide();}\">");
      if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</button>\r\n      </div>\r\n    </form>\r\n  </div>\r\n  \r\n  <div data-dojo-type=\"dijit.Dialog\" data-dojo-id=\"dataSourceExportDialog\" title=\"");
      if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("\" style=\"display: none\">\r\n    <form data-dojo-type=\"dijit.form.Form\">\r\n      <div class=\"dijitDialogPaneContentArea mangoForm\">\r\n        <textarea rows=\"40\" cols=\"100\" id=\"exportData\"></textarea>\r\n      </div>\r\n      <div class=\"dijitDialogPaneActionBar\">\r\n        <button data-dojo-type=\"dijit.form.Button\" type=\"button\" data-dojo-props=\"onClick:function() {dataSourceExportDialog.hide();}\">");
      if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      out.write("</button>\r\n      </div>\r\n    </form>\r\n  </div>\r\n");
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
