package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class dateRange_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(6);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/monthOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/dayOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/hourOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/minuteOptions.tag");
    _jspx_dependants.add("/WEB-INF/tags/secondOptions.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;

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

  public Object getDependants() {
    return _jspx_dependants;
  }

  private void _jspInit(ServletConfig config) {
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_fmt_message_key_nobody.release();
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

    try {
      out.write("\r\n<table>\r\n  <tr>\r\n    <td>");
      if (_jspx_meth_fmt_message_0(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td><input type=\"text\" id=\"fromYear\" class=\"formVeryShort\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromYear}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\"/></td>\r\n    <td>");
      if (_jspx_meth_tag_monthOptions_0(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td>");
      if (_jspx_meth_tag_dayOptions_0(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td>,</td>\r\n    <td>");
      if (_jspx_meth_tag_hourOptions_0(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td>:</td>\r\n    <td>");
      if (_jspx_meth_tag_minuteOptions_0(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td>:</td>\r\n    <td>");
      if (_jspx_meth_tag_secondOptions_0(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td><input type=\"checkbox\" name=\"fromNone\" id=\"fromNone\" onclick=\"updateDateRange()\"/><label\r\n            for=\"fromNone\">");
      if (_jspx_meth_fmt_message_1(_jspx_page_context))
        return;
      out.write("</label></td>\r\n  </tr>\r\n  <tr>\r\n    <td>");
      if (_jspx_meth_fmt_message_2(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td><input type=\"text\" id=\"toYear\" class=\"formVeryShort\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toYear}", java.lang.String.class, (PageContext)this.getJspContext(), null));
      out.write("\"/></td>\r\n    <td>");
      if (_jspx_meth_tag_monthOptions_1(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td>");
      if (_jspx_meth_tag_dayOptions_1(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td>,</td>\r\n    <td>");
      if (_jspx_meth_tag_hourOptions_1(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td>:</td>\r\n    <td>");
      if (_jspx_meth_tag_minuteOptions_1(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td>:</td>\r\n    <td>");
      if (_jspx_meth_tag_secondOptions_1(_jspx_page_context))
        return;
      out.write("</td>\r\n    <td><input type=\"checkbox\" name=\"toNone\" id=\"toNone\" checked=\"checked\" onclick=\"updateDateRange()\"/><label\r\n            for=\"toNone\">");
      if (_jspx_meth_fmt_message_3(_jspx_page_context))
        return;
      out.write("</label></td>\r\n  </tr>\r\n</table>\r\n");
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

  private boolean _jspx_meth_fmt_message_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(null);
    _jspx_th_fmt_message_0.setKey("common.dateRangeFrom");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_tag_monthOptions_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:monthOptions
    org.apache.jsp.tag.web.monthOptions_tag _jspx_th_tag_monthOptions_0 = new org.apache.jsp.tag.web.monthOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_monthOptions_0      );
    }
    _jspx_th_tag_monthOptions_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_monthOptions_0.setId("fromMonth");
    _jspx_th_tag_monthOptions_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromMonth}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_monthOptions_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_dayOptions_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:dayOptions
    org.apache.jsp.tag.web.dayOptions_tag _jspx_th_tag_dayOptions_0 = new org.apache.jsp.tag.web.dayOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_dayOptions_0      );
    }
    _jspx_th_tag_dayOptions_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_dayOptions_0.setId("fromDay");
    _jspx_th_tag_dayOptions_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromDay}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_dayOptions_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_hourOptions_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:hourOptions
    org.apache.jsp.tag.web.hourOptions_tag _jspx_th_tag_hourOptions_0 = new org.apache.jsp.tag.web.hourOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_hourOptions_0      );
    }
    _jspx_th_tag_hourOptions_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_hourOptions_0.setId("fromHour");
    _jspx_th_tag_hourOptions_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromHour}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_hourOptions_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_minuteOptions_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:minuteOptions
    org.apache.jsp.tag.web.minuteOptions_tag _jspx_th_tag_minuteOptions_0 = new org.apache.jsp.tag.web.minuteOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_minuteOptions_0      );
    }
    _jspx_th_tag_minuteOptions_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_minuteOptions_0.setId("fromMinute");
    _jspx_th_tag_minuteOptions_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromMinute}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_minuteOptions_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_secondOptions_0(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:secondOptions
    org.apache.jsp.tag.web.secondOptions_tag _jspx_th_tag_secondOptions_0 = new org.apache.jsp.tag.web.secondOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_secondOptions_0      );
    }
    _jspx_th_tag_secondOptions_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_secondOptions_0.setId("fromSecond");
    _jspx_th_tag_secondOptions_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fromSecond}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_secondOptions_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_1.setParent(null);
    _jspx_th_fmt_message_1.setKey("common.inception");
    int _jspx_eval_fmt_message_1 = _jspx_th_fmt_message_1.doStartTag();
    if (_jspx_th_fmt_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_2(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_2.setParent(null);
    _jspx_th_fmt_message_2.setKey("common.dateRangeTo");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_tag_monthOptions_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:monthOptions
    org.apache.jsp.tag.web.monthOptions_tag _jspx_th_tag_monthOptions_1 = new org.apache.jsp.tag.web.monthOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_monthOptions_1      );
    }
    _jspx_th_tag_monthOptions_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_monthOptions_1.setId("toMonth");
    _jspx_th_tag_monthOptions_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toMonth}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_monthOptions_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_dayOptions_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:dayOptions
    org.apache.jsp.tag.web.dayOptions_tag _jspx_th_tag_dayOptions_1 = new org.apache.jsp.tag.web.dayOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_dayOptions_1      );
    }
    _jspx_th_tag_dayOptions_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_dayOptions_1.setId("toDay");
    _jspx_th_tag_dayOptions_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toDay}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_dayOptions_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_hourOptions_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:hourOptions
    org.apache.jsp.tag.web.hourOptions_tag _jspx_th_tag_hourOptions_1 = new org.apache.jsp.tag.web.hourOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_hourOptions_1      );
    }
    _jspx_th_tag_hourOptions_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_hourOptions_1.setId("toHour");
    _jspx_th_tag_hourOptions_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toHour}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_hourOptions_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_minuteOptions_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:minuteOptions
    org.apache.jsp.tag.web.minuteOptions_tag _jspx_th_tag_minuteOptions_1 = new org.apache.jsp.tag.web.minuteOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_minuteOptions_1      );
    }
    _jspx_th_tag_minuteOptions_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_minuteOptions_1.setId("toMinute");
    _jspx_th_tag_minuteOptions_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toMinute}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_minuteOptions_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_secondOptions_1(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:secondOptions
    org.apache.jsp.tag.web.secondOptions_tag _jspx_th_tag_secondOptions_1 = new org.apache.jsp.tag.web.secondOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_secondOptions_1      );
    }
    _jspx_th_tag_secondOptions_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_secondOptions_1.setId("toSecond");
    _jspx_th_tag_secondOptions_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${toSecond}", java.lang.String.class, (PageContext)this.getJspContext(), null));
    _jspx_th_tag_secondOptions_1.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent(null);
    _jspx_th_fmt_message_3.setKey("common.latest");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }
}
