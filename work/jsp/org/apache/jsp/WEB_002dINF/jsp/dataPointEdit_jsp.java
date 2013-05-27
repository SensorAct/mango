package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.vo.DataPointVO;
import com.serotonin.m2m2.DataTypes;
import com.serotonin.m2m2.vo.DataPointVO;
import com.serotonin.m2m2.DataTypes;
import com.serotonin.m2m2.vo.event.PointEventDetectorVO;
import com.serotonin.m2m2.web.mvc.controller.DataPointEditController;

public final class dataPointEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("sst:dquotEncode", com.serotonin.web.taglib.Functions.class, "dquotEncode", new Class[] {java.lang.String.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(20);
    _jspx_dependants.add("/WEB-INF/jsp/include/tech.jsp");
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/jsp/pointEdit/pointName.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/pointEdit/pointProperties.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/pointEdit/loggingProperties.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/pointEdit/valuePurge.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/pointEdit/textRenderer.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/pointEdit/chartRenderer.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/pointEdit/eventDetectors.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/pointEdit/buttons.jsp");
    _jspx_dependants.add("/WEB-INF/tags/page.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/header.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/toolbar.tag");
    _jspx_dependants.add("/WEB-INF/tags/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/help.tag");
    _jspx_dependants.add("/WEB-INF/tags/engineeringUnits.tag");
    _jspx_dependants.add("/WEB-INF/tags/timePeriods.tag");
    _jspx_dependants.add("/WEB-INF/tags/alarmLevelOptions.tag");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_bind_path;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_message_key_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_option_value;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_onchange_name_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sst_select_value_onchange_id;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_bind_path = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_option_value = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_onchange_name_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sst_select_value_onchange_id = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_bind_path.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_fmt_message_key_nobody.release();
    _jspx_tagPool_sst_select_value_name_id.release();
    _jspx_tagPool_sst_option_value.release();
    _jspx_tagPool_sst_select_value_onchange_name_id.release();
    _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.release();
    _jspx_tagPool_sst_select_value_onchange_id.release();
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_when_test.release();
    _jspx_tagPool_c_otherwise.release();
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
      out.write("\r\n\r\n");
      //  tag:page
      org.apache.jsp.tag.web.page_tag _jspx_th_tag_page_0 = new org.apache.jsp.tag.web.page_tag();
      if (_jspx_resourceInjector != null) {
        _jspx_resourceInjector.inject(_jspx_th_tag_page_0        );
      }
      _jspx_th_tag_page_0.setJspContext(_jspx_page_context);
      _jspx_th_tag_page_0.setDwr("DataPointEditDwr");
      _jspx_th_tag_page_0.setJspBody(new dataPointEdit_jspHelper( 0, _jspx_page_context, _jspx_th_tag_page_0, null));
      _jspx_th_tag_page_0.doTag();
      out.write("\r\n\r\n<script type=\"text/javascript\">\r\n  var pointList = [\r\n    ");
      if (_jspx_meth_c_forEach_5(_jspx_page_context))
        return;
      out.write("\r\n  ];\r\n</script>");
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

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n            <tr><td colspan=\"2\" class=\"formError\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</td></tr>\r\n          ");
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

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_0.setKey("pointEdit.name.goto");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty prevId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n        ");
        if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_tag_img_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_0 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_0      );
    }
    _jspx_th_tag_img_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_0.setParent(_jspx_th_c_if_1);
    _jspx_th_tag_img_0.setPng("bullet_go_left");
    _jspx_th_tag_img_0.setTitle("pagination.previous");
    _jspx_th_tag_img_0.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("window.location='data_point_edit.shtm?dpid=${prevId}'", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_img_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty nextId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n        ");
        if (_jspx_meth_tag_img_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\r\n      ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_tag_img_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_1 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_1      );
    }
    _jspx_th_tag_img_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_1.setParent(_jspx_th_c_if_2);
    _jspx_th_tag_img_1.setPng("bullet_go");
    _jspx_th_tag_img_1.setTitle("pagination.next");
    _jspx_th_tag_img_1.setOnclick((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("window.location='data_point_edit.shtm?dpid=${nextId}'", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_img_1.doTag();
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
    _jspx_th_fmt_message_1.setKey("pointEdit.props.props");
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
    _jspx_th_tag_help_0.setId("dataPointEditing");
    _jspx_th_tag_help_0.doTag();
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
    _jspx_th_tag_img_2.setPng("icon_comp");
    _jspx_th_tag_img_2.setTitle("pointEdit.props.details");
    _jspx_th_tag_img_2.doTag();
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
    _jspx_th_fmt_message_2.setKey("pointEdit.props.ds");
    int _jspx_eval_fmt_message_2 = _jspx_th_fmt_message_2.doStartTag();
    if (_jspx_th_fmt_message_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_2);
    return false;
  }

  private boolean _jspx_meth_tag_img_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_3 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_3      );
    }
    _jspx_th_tag_img_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_3.setParent(_jspx_parent);
    _jspx_th_tag_img_3.setPng("icon_ds_edit");
    _jspx_th_tag_img_3.setTitle("pointEdit.props.editDs");
    _jspx_th_tag_img_3.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_3(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_1);
    _jspx_th_fmt_message_3.setKey("common.pointName");
    int _jspx_eval_fmt_message_3 = _jspx_th_fmt_message_3.doStartTag();
    if (_jspx_th_fmt_message_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_4(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_2);
    _jspx_th_fmt_message_4.setKey("pointEdit.props.deviceName");
    int _jspx_eval_fmt_message_4 = _jspx_th_fmt_message_4.doStartTag();
    if (_jspx_th_fmt_message_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_5(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_3);
    _jspx_th_fmt_message_5.setKey("pointEdit.props.engineeringUnits");
    int _jspx_eval_fmt_message_5 = _jspx_th_fmt_message_5.doStartTag();
    if (_jspx_th_fmt_message_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_5);
    return false;
  }

  private boolean _jspx_meth_tag_engineeringUnits_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:engineeringUnits
    org.apache.jsp.tag.web.engineeringUnits_tag _jspx_th_tag_engineeringUnits_0 = new org.apache.jsp.tag.web.engineeringUnits_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_engineeringUnits_0      );
    }
    _jspx_th_tag_engineeringUnits_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_engineeringUnits_0.setParent(_jspx_th_spring_bind_3);
    _jspx_th_tag_engineeringUnits_0.setName("engineeringUnits");
    _jspx_th_tag_engineeringUnits_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_engineeringUnits_0.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_6(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_4);
    _jspx_th_fmt_message_6.setKey("pointEdit.props.chartColour");
    int _jspx_eval_fmt_message_6 = _jspx_th_fmt_message_6.doStartTag();
    if (_jspx_th_fmt_message_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_6);
    return false;
  }

  private boolean _jspx_meth_fmt_message_7(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_5);
    _jspx_th_fmt_message_7.setKey("pointEdit.plotType");
    int _jspx_eval_fmt_message_7 = _jspx_th_fmt_message_7.doStartTag();
    if (_jspx_th_fmt_message_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_7);
    return false;
  }

  private boolean _jspx_meth_fmt_message_8(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_0);
    _jspx_th_fmt_message_8.setKey("pointEdit.plotType.step");
    int _jspx_eval_fmt_message_8 = _jspx_th_fmt_message_8.doStartTag();
    if (_jspx_th_fmt_message_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_8);
    return false;
  }

  private boolean _jspx_meth_fmt_message_9(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_1);
    _jspx_th_fmt_message_9.setKey("pointEdit.plotType.line");
    int _jspx_eval_fmt_message_9 = _jspx_th_fmt_message_9.doStartTag();
    if (_jspx_th_fmt_message_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_9);
    return false;
  }

  private boolean _jspx_meth_fmt_message_10(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_10 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_10.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_2);
    _jspx_th_fmt_message_10.setKey("pointEdit.plotType.spline");
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
    _jspx_th_fmt_message_11.setKey("pointEdit.logging.props");
    int _jspx_eval_fmt_message_11 = _jspx_th_fmt_message_11.doStartTag();
    if (_jspx_th_fmt_message_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_11);
    return false;
  }

  private boolean _jspx_meth_tag_help_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_1 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_1      );
    }
    _jspx_th_tag_help_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_1.setParent(_jspx_parent);
    _jspx_th_tag_help_1.setId("pointValueLogging");
    _jspx_th_tag_help_1.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_12(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_12 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_12.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_6);
    _jspx_th_fmt_message_12.setKey("pointEdit.logging.type");
    int _jspx_eval_fmt_message_12 = _jspx_th_fmt_message_12.doStartTag();
    if (_jspx_th_fmt_message_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_13(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_13 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_13.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_3);
    _jspx_th_fmt_message_13.setKey("pointEdit.logging.type.change");
    int _jspx_eval_fmt_message_13 = _jspx_th_fmt_message_13.doStartTag();
    if (_jspx_th_fmt_message_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_14(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_14 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_14.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_4);
    _jspx_th_fmt_message_14.setKey("pointEdit.logging.type.all");
    int _jspx_eval_fmt_message_14 = _jspx_th_fmt_message_14.doStartTag();
    if (_jspx_th_fmt_message_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_14);
    return false;
  }

  private boolean _jspx_meth_fmt_message_15(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_15 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_15.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_5);
    _jspx_th_fmt_message_15.setKey("pointEdit.logging.type.never");
    int _jspx_eval_fmt_message_15 = _jspx_th_fmt_message_15.doStartTag();
    if (_jspx_th_fmt_message_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_15);
    return false;
  }

  private boolean _jspx_meth_fmt_message_16(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_16 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_16.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_6);
    _jspx_th_fmt_message_16.setKey("pointEdit.logging.type.interval");
    int _jspx_eval_fmt_message_16 = _jspx_th_fmt_message_16.doStartTag();
    if (_jspx_th_fmt_message_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_16);
    return false;
  }

  private boolean _jspx_meth_fmt_message_17(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_17 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_17.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_7);
    _jspx_th_fmt_message_17.setKey("pointEdit.logging.type.tsChange");
    int _jspx_eval_fmt_message_17 = _jspx_th_fmt_message_17.doStartTag();
    if (_jspx_th_fmt_message_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_17);
    return false;
  }

  private boolean _jspx_meth_fmt_message_18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_18 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_18.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_18.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_18.setKey("pointEdit.logging.period");
    int _jspx_eval_fmt_message_18 = _jspx_th_fmt_message_18.doStartTag();
    if (_jspx_th_fmt_message_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_18);
    return false;
  }

  private boolean _jspx_meth_fmt_message_19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_19 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_19.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_19.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_19.setKey("pointEdit.logging.every");
    int _jspx_eval_fmt_message_19 = _jspx_th_fmt_message_19.doStartTag();
    if (_jspx_th_fmt_message_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_19);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_0 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_0      );
    }
    _jspx_th_tag_timePeriods_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_0.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_0.setName("intervalLoggingPeriodType");
    _jspx_th_tag_timePeriods_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.intervalLoggingPeriodType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_timePeriods_0.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_0.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_0.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_7, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_7);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<br/>");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_fmt_message_20(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_20 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_20.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_9);
    _jspx_th_fmt_message_20.setKey("pointEdit.logging.valueType");
    int _jspx_eval_fmt_message_20 = _jspx_th_fmt_message_20.doStartTag();
    if (_jspx_th_fmt_message_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_20);
    return false;
  }

  private boolean _jspx_meth_fmt_message_21(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_8, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_21 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_21.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_8);
    _jspx_th_fmt_message_21.setKey("pointEdit.logging.valueType.instant");
    int _jspx_eval_fmt_message_21 = _jspx_th_fmt_message_21.doStartTag();
    if (_jspx_th_fmt_message_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_21);
    return false;
  }

  private boolean _jspx_meth_fmt_message_22(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_9, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_22 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_22.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_9);
    _jspx_th_fmt_message_22.setKey("pointEdit.logging.valueType.maximum");
    int _jspx_eval_fmt_message_22 = _jspx_th_fmt_message_22.doStartTag();
    if (_jspx_th_fmt_message_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_22);
    return false;
  }

  private boolean _jspx_meth_fmt_message_23(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_23 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_23.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_10);
    _jspx_th_fmt_message_23.setKey("pointEdit.logging.valueType.minimum");
    int _jspx_eval_fmt_message_23 = _jspx_th_fmt_message_23.doStartTag();
    if (_jspx_th_fmt_message_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_23);
    return false;
  }

  private boolean _jspx_meth_fmt_message_24(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_9)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_24 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_24.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_11);
    _jspx_th_fmt_message_24.setKey("pointEdit.logging.valueType.average");
    int _jspx_eval_fmt_message_24 = _jspx_th_fmt_message_24.doStartTag();
    if (_jspx_th_fmt_message_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_24);
    return false;
  }

  private boolean _jspx_meth_fmt_message_25(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_10, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_10)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_25 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_25.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_10);
    _jspx_th_fmt_message_25.setKey("pointEdit.logging.tolerance");
    int _jspx_eval_fmt_message_25 = _jspx_th_fmt_message_25.doStartTag();
    if (_jspx_th_fmt_message_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_25);
    return false;
  }

  private boolean _jspx_meth_fmt_message_26(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_26 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_26.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_11);
    _jspx_th_fmt_message_26.setKey("pointEdit.logging.discard");
    int _jspx_eval_fmt_message_26 = _jspx_th_fmt_message_26.doStartTag();
    if (_jspx_th_fmt_message_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_26);
    return false;
  }

  private boolean _jspx_meth_sst_checkbox_0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_11, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_11)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:checkbox
    com.serotonin.web.taglib.CheckboxTag _jspx_th_sst_checkbox_0 = (com.serotonin.web.taglib.CheckboxTag) _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.get(com.serotonin.web.taglib.CheckboxTag.class);
    _jspx_th_sst_checkbox_0.setPageContext(_jspx_page_context);
    _jspx_th_sst_checkbox_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_11);
    _jspx_th_sst_checkbox_0.setId("discardExtremeValues");
    _jspx_th_sst_checkbox_0.setName("discardExtremeValues");
    _jspx_th_sst_checkbox_0.setSelectedValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sst_checkbox_0.setOnclick("changeDiscard()");
    int _jspx_eval_sst_checkbox_0 = _jspx_th_sst_checkbox_0.doStartTag();
    if (_jspx_th_sst_checkbox_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.reuse(_jspx_th_sst_checkbox_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.reuse(_jspx_th_sst_checkbox_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_27(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_12)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_27 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_27.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_12);
    _jspx_th_fmt_message_27.setKey("pointEdit.logging.discardLow");
    int _jspx_eval_fmt_message_27 = _jspx_th_fmt_message_27.doStartTag();
    if (_jspx_th_fmt_message_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_27);
    return false;
  }

  private boolean _jspx_meth_fmt_message_28(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_13)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_28 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_28.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_28.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_13);
    _jspx_th_fmt_message_28.setKey("pointEdit.logging.discardHigh");
    int _jspx_eval_fmt_message_28 = _jspx_th_fmt_message_28.doStartTag();
    if (_jspx_th_fmt_message_28.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_28);
    return false;
  }

  private boolean _jspx_meth_fmt_message_29(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_29 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_29.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_29.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_29.setKey("pointEdit.logging.purge");
    int _jspx_eval_fmt_message_29 = _jspx_th_fmt_message_29.doStartTag();
    if (_jspx_th_fmt_message_29.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_29);
    return false;
  }

  private boolean _jspx_meth_sst_checkbox_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:checkbox
    com.serotonin.web.taglib.CheckboxTag _jspx_th_sst_checkbox_1 = (com.serotonin.web.taglib.CheckboxTag) _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.get(com.serotonin.web.taglib.CheckboxTag.class);
    _jspx_th_sst_checkbox_1.setPageContext(_jspx_page_context);
    _jspx_th_sst_checkbox_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_checkbox_1.setId("purgeOverride");
    _jspx_th_sst_checkbox_1.setName("purgeOverride");
    _jspx_th_sst_checkbox_1.setSelectedValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.purgeOverride}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_sst_checkbox_1.setOnclick("changePurgeOverride()");
    int _jspx_eval_sst_checkbox_1 = _jspx_th_sst_checkbox_1.doStartTag();
    if (_jspx_th_sst_checkbox_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.reuse(_jspx_th_sst_checkbox_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_checkbox_selectedValue_onclick_name_id_nobody.reuse(_jspx_th_sst_checkbox_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_30(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_30 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_30.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_30.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_30.setKey("pointEdit.logging.purgeOverride");
    int _jspx_eval_fmt_message_30 = _jspx_th_fmt_message_30.doStartTag();
    if (_jspx_th_fmt_message_30.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_30);
    return false;
  }

  private boolean _jspx_meth_fmt_message_31(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_31 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_31.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_31.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_31.setKey("pointEdit.logging.after");
    int _jspx_eval_fmt_message_31 = _jspx_th_fmt_message_31.doStartTag();
    if (_jspx_th_fmt_message_31.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_31);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_1 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_1      );
    }
    _jspx_th_tag_timePeriods_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_1.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_1.setId("purgeType");
    _jspx_th_tag_timePeriods_1.setName("purgeType");
    _jspx_th_tag_timePeriods_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.purgeType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_timePeriods_1.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_1.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_1.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_14, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_14)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_14);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.error}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("<br/>");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_fmt_message_32(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_32 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_32.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_32.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_16);
    _jspx_th_fmt_message_32.setKey("pointEdit.logging.defaultCache");
    int _jspx_eval_fmt_message_32 = _jspx_th_fmt_message_32.doStartTag();
    if (_jspx_th_fmt_message_32.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_32);
    return false;
  }

  private boolean _jspx_meth_fmt_message_33(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_bind_16, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_bind_16)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_33 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_33.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_33.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_16);
    _jspx_th_fmt_message_33.setKey("pointEdit.logging.clearCache");
    int _jspx_eval_fmt_message_33 = _jspx_th_fmt_message_33.doStartTag();
    if (_jspx_th_fmt_message_33.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_33);
    return false;
  }

  private boolean _jspx_meth_fmt_message_34(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_34 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_34.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_34.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_34.setKey("pointEdit.purge.confirm");
    int _jspx_eval_fmt_message_34 = _jspx_th_fmt_message_34.doStartTag();
    if (_jspx_th_fmt_message_34.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_34);
    return false;
  }

  private boolean _jspx_meth_fmt_message_35(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_35 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_35.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_35.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_35.setKey("pointEdit.purge.result");
    int _jspx_eval_fmt_message_35 = _jspx_th_fmt_message_35.doStartTag();
    if (_jspx_th_fmt_message_35.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_35);
    return false;
  }

  private boolean _jspx_meth_fmt_message_36(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_36 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_36.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_36.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_36.setKey("pointEdit.purge.purgeNow");
    int _jspx_eval_fmt_message_36 = _jspx_th_fmt_message_36.doStartTag();
    if (_jspx_th_fmt_message_36.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_36);
    return false;
  }

  private boolean _jspx_meth_tag_help_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_2 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_2      );
    }
    _jspx_th_tag_help_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_2.setParent(_jspx_parent);
    _jspx_th_tag_help_2.setId("pointValueLogPurging");
    _jspx_th_tag_help_2.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_37(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_37 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_37.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_37.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_37.setKey("pointEdit.purge.olderThan");
    int _jspx_eval_fmt_message_37 = _jspx_th_fmt_message_37.doStartTag();
    if (_jspx_th_fmt_message_37.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_37);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_2 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_2      );
    }
    _jspx_th_tag_timePeriods_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_2.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_2.setId("purgeNowType");
    _jspx_th_tag_timePeriods_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.purgeType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    _jspx_th_tag_timePeriods_2.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_2.setY(new Boolean(true));
    _jspx_th_tag_timePeriods_2.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_38(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_38 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_38.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_38.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_38.setKey("pointEdit.purge.all");
    int _jspx_eval_fmt_message_38 = _jspx_th_fmt_message_38.doStartTag();
    if (_jspx_th_fmt_message_38.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_38);
    return false;
  }

  private boolean _jspx_meth_fmt_message_39(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_39 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_39.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_39.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_39.setKey("pointEdit.purge.allData");
    int _jspx_eval_fmt_message_39 = _jspx_th_fmt_message_39.doStartTag();
    if (_jspx_th_fmt_message_39.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_39);
    return false;
  }

  private boolean _jspx_meth_fmt_message_40(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_40 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_40.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_40.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_40.setKey("pointEdit.purge.purgeNow");
    int _jspx_eval_fmt_message_40 = _jspx_th_fmt_message_40.doStartTag();
    if (_jspx_th_fmt_message_40.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_40);
    return false;
  }

  private boolean _jspx_meth_fmt_message_41(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_41 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_41.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_41.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_41.setKey("pointEdit.purge.warn");
    int _jspx_eval_fmt_message_41 = _jspx_th_fmt_message_41.doStartTag();
    if (_jspx_th_fmt_message_41.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_41);
    return false;
  }

  private boolean _jspx_meth_fmt_message_42(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_42 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_42.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_42.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_42.setKey("pointEdit.text.props");
    int _jspx_eval_fmt_message_42 = _jspx_th_fmt_message_42.doStartTag();
    if (_jspx_th_fmt_message_42.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_42);
    return false;
  }

  private boolean _jspx_meth_tag_help_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_3 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_3      );
    }
    _jspx_th_tag_help_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_3.setParent(_jspx_parent);
    _jspx_th_tag_help_3.setId("textRenderers");
    _jspx_th_tag_help_3.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_43(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_43 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_43.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_43.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_43.setKey("pointEdit.text.type");
    int _jspx_eval_fmt_message_43 = _jspx_th_fmt_message_43.doStartTag();
    if (_jspx_th_fmt_message_43.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_43);
    return false;
  }

  private boolean _jspx_meth_sst_select_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_3 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_onchange_id.get(com.serotonin.web.taglib.SelectTag.class);
    _jspx_th_sst_select_3.setPageContext(_jspx_page_context);
    _jspx_th_sst_select_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_select_3.setId("textRendererSelect");
    _jspx_th_sst_select_3.setOnchange("textRendererEditor.change();");
    _jspx_th_sst_select_3.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.textRenderer.typeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_select_3 = _jspx_th_sst_select_3.doStartTag();
    if (_jspx_eval_sst_select_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n          ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_3, _jspx_page_context))
          return true;
        out.write("\r\n        ");
        int evalDoAfterBody = _jspx_th_sst_select_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_sst_select_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_select_value_onchange_id.reuse(_jspx_th_sst_select_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_select_value_onchange_id.reuse(_jspx_th_sst_select_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_3);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${textRenderers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("trdef");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            ");
          if (_jspx_meth_sst_option_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n          ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_sst_option_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_12 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_12.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_sst_option_12.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${trdef.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_option_12 = _jspx_th_sst_option_12.doStartTag();
    if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_0[0]++;
        _jspx_th_sst_option_12.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_12.doInitBody();
      }
      do {
        if (_jspx_meth_fmt_message_44((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_12, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
          return true;
        int evalDoAfterBody = _jspx_th_sst_option_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_12 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_0[0]--;
    }
    if (_jspx_th_sst_option_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_12);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_12);
    return false;
  }

  private boolean _jspx_meth_fmt_message_44(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_12, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_44 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_44.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_44.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_12);
    _jspx_th_fmt_message_44.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${trdef.nameKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_message_44 = _jspx_th_fmt_message_44.doStartTag();
    if (_jspx_th_fmt_message_44.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_44);
    return false;
  }

  private boolean _jspx_meth_fmt_message_45(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_45 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_45.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_45.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_45.setKey("pointEdit.text.format");
    int _jspx_eval_fmt_message_45 = _jspx_th_fmt_message_45.doStartTag();
    if (_jspx_th_fmt_message_45.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_45);
    return false;
  }

  private boolean _jspx_meth_tag_help_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_4 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_4      );
    }
    _jspx_th_tag_help_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_4.setParent(_jspx_parent);
    _jspx_th_tag_help_4.setId("numberFormats");
    _jspx_th_tag_help_4.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_46(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_46 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_46.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_46.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_46.setKey("pointEdit.text.suffix");
    int _jspx_eval_fmt_message_46 = _jspx_th_fmt_message_46.doStartTag();
    if (_jspx_th_fmt_message_46.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_46);
    return false;
  }

  private boolean _jspx_meth_fmt_message_47(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_47 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_47.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_47.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_47.setKey("pointEdit.text.zero");
    int _jspx_eval_fmt_message_47 = _jspx_th_fmt_message_47.doStartTag();
    if (_jspx_th_fmt_message_47.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_47);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_47);
    return false;
  }

  private boolean _jspx_meth_fmt_message_48(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_48 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_48.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_48.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_48.setKey("pointEdit.text.default");
    int _jspx_eval_fmt_message_48 = _jspx_th_fmt_message_48.doStartTag();
    if (_jspx_th_fmt_message_48.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_48);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_48);
    return false;
  }

  private boolean _jspx_meth_fmt_message_49(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_49 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_49.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_49.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_49.setKey("pointEdit.text.one");
    int _jspx_eval_fmt_message_49 = _jspx_th_fmt_message_49.doStartTag();
    if (_jspx_th_fmt_message_49.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_49);
    return false;
  }

  private boolean _jspx_meth_fmt_message_50(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_50 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_50.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_50.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_50.setKey("pointEdit.text.default");
    int _jspx_eval_fmt_message_50 = _jspx_th_fmt_message_50.doStartTag();
    if (_jspx_th_fmt_message_50.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_50);
    return false;
  }

  private boolean _jspx_meth_fmt_message_51(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_51 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_51.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_51.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_51.setKey("pointEdit.text.key");
    int _jspx_eval_fmt_message_51 = _jspx_th_fmt_message_51.doStartTag();
    if (_jspx_th_fmt_message_51.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_51);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_51);
    return false;
  }

  private boolean _jspx_meth_fmt_message_52(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_52 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_52.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_52.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_52.setKey("pointEdit.text.text");
    int _jspx_eval_fmt_message_52 = _jspx_th_fmt_message_52.doStartTag();
    if (_jspx_th_fmt_message_52.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_52);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_52);
    return false;
  }

  private boolean _jspx_meth_fmt_message_53(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_53 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_53.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_53.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_53.setKey("pointEdit.text.colour");
    int _jspx_eval_fmt_message_53 = _jspx_th_fmt_message_53.doStartTag();
    if (_jspx_th_fmt_message_53.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_53);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_53);
    return false;
  }

  private boolean _jspx_meth_fmt_message_54(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_54 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_54.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_54.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_54.setKey("pointEdit.text.default");
    int _jspx_eval_fmt_message_54 = _jspx_th_fmt_message_54.doStartTag();
    if (_jspx_th_fmt_message_54.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_54);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_54);
    return false;
  }

  private boolean _jspx_meth_tag_img_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_4 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_4      );
    }
    _jspx_th_tag_img_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_4.setParent(_jspx_parent);
    _jspx_th_tag_img_4.setPng("add");
    _jspx_th_tag_img_4.setTitle("common.add");
    _jspx_th_tag_img_4.setOnclick("return textRendererEditor.addMultistateValue();");
    _jspx_th_tag_img_4.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_55(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_55 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_55.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_55.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_55.setKey("pointEdit.text.suffix");
    int _jspx_eval_fmt_message_55 = _jspx_th_fmt_message_55.doStartTag();
    if (_jspx_th_fmt_message_55.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_55);
    return false;
  }

  private boolean _jspx_meth_fmt_message_56(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_56 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_56.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_56.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_56.setKey("pointEdit.text.format");
    int _jspx_eval_fmt_message_56 = _jspx_th_fmt_message_56.doStartTag();
    if (_jspx_th_fmt_message_56.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_56);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_56);
    return false;
  }

  private boolean _jspx_meth_fmt_message_57(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_57 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_57.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_57.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_57.setKey("pointEdit.text.from");
    int _jspx_eval_fmt_message_57 = _jspx_th_fmt_message_57.doStartTag();
    if (_jspx_th_fmt_message_57.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_57);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_57);
    return false;
  }

  private boolean _jspx_meth_fmt_message_58(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_58 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_58.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_58.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_58.setKey("pointEdit.text.to");
    int _jspx_eval_fmt_message_58 = _jspx_th_fmt_message_58.doStartTag();
    if (_jspx_th_fmt_message_58.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_58);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_58);
    return false;
  }

  private boolean _jspx_meth_fmt_message_59(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_59 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_59.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_59.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_59.setKey("pointEdit.text.text");
    int _jspx_eval_fmt_message_59 = _jspx_th_fmt_message_59.doStartTag();
    if (_jspx_th_fmt_message_59.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_59);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_59);
    return false;
  }

  private boolean _jspx_meth_fmt_message_60(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_60 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_60.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_60.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_60.setKey("pointEdit.text.colour");
    int _jspx_eval_fmt_message_60 = _jspx_th_fmt_message_60.doStartTag();
    if (_jspx_th_fmt_message_60.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_60);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_60);
    return false;
  }

  private boolean _jspx_meth_fmt_message_61(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_61 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_61.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_61.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_61.setKey("pointEdit.text.default");
    int _jspx_eval_fmt_message_61 = _jspx_th_fmt_message_61.doStartTag();
    if (_jspx_th_fmt_message_61.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_61);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_61);
    return false;
  }

  private boolean _jspx_meth_tag_img_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_5 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_5      );
    }
    _jspx_th_tag_img_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_5.setParent(_jspx_parent);
    _jspx_th_tag_img_5.setPng("add");
    _jspx_th_tag_img_5.setTitle("common.add");
    _jspx_th_tag_img_5.setOnclick("return textRendererEditor.addRangeValue();");
    _jspx_th_tag_img_5.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_62(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_62 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_62.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_62.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_62.setKey("pointEdit.text.format");
    int _jspx_eval_fmt_message_62 = _jspx_th_fmt_message_62.doStartTag();
    if (_jspx_th_fmt_message_62.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_62);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_62);
    return false;
  }

  private boolean _jspx_meth_tag_help_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_5 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_5      );
    }
    _jspx_th_tag_help_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_5.setParent(_jspx_parent);
    _jspx_th_tag_help_5.setId("datetimeFormats");
    _jspx_th_tag_help_5.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_63(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_63 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_63.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_63.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_63.setKey("pointEdit.text.conversionExponent");
    int _jspx_eval_fmt_message_63 = _jspx_th_fmt_message_63.doStartTag();
    if (_jspx_th_fmt_message_63.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_63);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_63);
    return false;
  }

  private boolean _jspx_meth_c_choose_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\r\n          ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.textRenderer.typeName == \"textRendererAnalog\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              $set(\"textRendererAnalogFormat\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(form.textRenderer.format)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("\");\r\n              $set(\"textRendererAnalogSuffix\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(form.textRenderer.suffix)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("\");\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.textRenderer.typeName == \"textRendererBinary\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              $set(\"textRendererBinaryZero\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(form.textRenderer.zeroLabel)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("\");\r\n              textRendererEditor.handlerBinaryZeroColour(\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(form.textRenderer.zeroColour)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("\");\r\n              $set(\"textRendererBinaryOne\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(form.textRenderer.oneLabel)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("\");\r\n              textRendererEditor.handlerBinaryOneColour(\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(form.textRenderer.oneColour)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("\");\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.textRenderer.typeName == \"textRendererMultistate\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.textRenderer.multistateValues}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("msValue");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                textRendererEditor.addMultistateValue(\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(msValue.key)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("\",\r\n                \t\t\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(msValue.text)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("\", \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(msValue.colour)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("\");\r\n              ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.textRenderer.typeName == \"textRendererNone\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.textRenderer.typeName == \"textRendererPlain\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              $set(\"textRendererPlainSuffix\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(form.textRenderer.suffix)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("\");\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.textRenderer.typeName == \"textRendererRange\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              $set(\"textRendererRangeFormat\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(form.textRenderer.format)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("\");\r\n              ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_5, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.textRenderer.rangeValues}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("rgValue");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                textRendererEditor.addRangeValue(\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rgValue.from}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\", \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${rgValue.to}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\", \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(rgValue.text)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("\",\r\n                        \"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(rgValue.colour)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("\");\r\n              ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.textRenderer.typeName == \"textRendererTime\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              $set(\"textRendererTimeFormat\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(form.textRenderer.format)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("\");\r\n              $set(\"textRendererTimeConversionExponent\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(form.textRenderer.conversionExponent)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
        out.write("\");\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              dojo.debug(\"Unknown text renderer: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.textRenderer.typeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\r\n            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_fmt_message_64(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_64 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_64.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_64.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_64.setKey("pointEdit.text.errorParsingKey");
    int _jspx_eval_fmt_message_64 = _jspx_th_fmt_message_64.doStartTag();
    if (_jspx_th_fmt_message_64.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_64);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_64);
    return false;
  }

  private boolean _jspx_meth_fmt_message_65(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_65 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_65.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_65.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_65.setKey("pointEdit.text.listContainsKey");
    int _jspx_eval_fmt_message_65 = _jspx_th_fmt_message_65.doStartTag();
    if (_jspx_th_fmt_message_65.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_65);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_65);
    return false;
  }

  private boolean _jspx_meth_fmt_message_66(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_66 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_66.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_66.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_66.setKey("common.delete");
    int _jspx_eval_fmt_message_66 = _jspx_th_fmt_message_66.doStartTag();
    if (_jspx_th_fmt_message_66.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_66);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_66);
    return false;
  }

  private boolean _jspx_meth_fmt_message_67(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_67 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_67.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_67.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_67.setKey("pointEdit.text.errorParsingFrom");
    int _jspx_eval_fmt_message_67 = _jspx_th_fmt_message_67.doStartTag();
    if (_jspx_th_fmt_message_67.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_67);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_67);
    return false;
  }

  private boolean _jspx_meth_fmt_message_68(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_68 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_68.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_68.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_68.setKey("pointEdit.text.errorParsingTo");
    int _jspx_eval_fmt_message_68 = _jspx_th_fmt_message_68.doStartTag();
    if (_jspx_th_fmt_message_68.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_68);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_68);
    return false;
  }

  private boolean _jspx_meth_fmt_message_69(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_69 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_69.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_69.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_69.setKey("pointEdit.text.toGreaterThanFrom");
    int _jspx_eval_fmt_message_69 = _jspx_th_fmt_message_69.doStartTag();
    if (_jspx_th_fmt_message_69.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_69);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_69);
    return false;
  }

  private boolean _jspx_meth_fmt_message_70(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_70 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_70.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_70.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_70.setKey("pointEdit.text.listContainsRange");
    int _jspx_eval_fmt_message_70 = _jspx_th_fmt_message_70.doStartTag();
    if (_jspx_th_fmt_message_70.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_70);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_70);
    return false;
  }

  private boolean _jspx_meth_fmt_message_71(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_71 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_71.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_71.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_71.setKey("common.delete");
    int _jspx_eval_fmt_message_71 = _jspx_th_fmt_message_71.doStartTag();
    if (_jspx_th_fmt_message_71.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_71);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_71);
    return false;
  }

  private boolean _jspx_meth_fmt_message_72(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_72 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_72.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_72.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_72.setKey("pointEdit.chart.props");
    int _jspx_eval_fmt_message_72 = _jspx_th_fmt_message_72.doStartTag();
    if (_jspx_th_fmt_message_72.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_72);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_72);
    return false;
  }

  private boolean _jspx_meth_tag_help_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_6 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_6      );
    }
    _jspx_th_tag_help_6.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_6.setParent(_jspx_parent);
    _jspx_th_tag_help_6.setId("chartRenderers");
    _jspx_th_tag_help_6.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_73(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_73 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_73.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_73.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_73.setKey("pointEdit.chart.type");
    int _jspx_eval_fmt_message_73 = _jspx_th_fmt_message_73.doStartTag();
    if (_jspx_th_fmt_message_73.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_73);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_73);
    return false;
  }

  private boolean _jspx_meth_sst_select_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:select
    com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_4 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_onchange_id.get(com.serotonin.web.taglib.SelectTag.class);
    _jspx_th_sst_select_4.setPageContext(_jspx_page_context);
    _jspx_th_sst_select_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_sst_select_4.setId("chartRendererSelect");
    _jspx_th_sst_select_4.setOnchange("chartRendererEditor.change()");
    _jspx_th_sst_select_4.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_select_4 = _jspx_th_sst_select_4.doStartTag();
    if (_jspx_eval_sst_select_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n          ");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_select_4, _jspx_page_context))
          return true;
        out.write("\r\n        ");
        int evalDoAfterBody = _jspx_th_sst_select_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_sst_select_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_select_value_onchange_id.reuse(_jspx_th_sst_select_4);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_select_value_onchange_id.reuse(_jspx_th_sst_select_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_select_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_4);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${chartRenderers}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("crdef");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            ");
          if (_jspx_meth_sst_option_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\r\n          ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_sst_option_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sst:option
    com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_13 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
    _jspx_th_sst_option_13.setPageContext(_jspx_page_context);
    _jspx_th_sst_option_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_sst_option_13.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${crdef.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_sst_option_13 = _jspx_th_sst_option_13.doStartTag();
    if (_jspx_eval_sst_option_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_sst_option_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_forEach_3[0]++;
        _jspx_th_sst_option_13.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_sst_option_13.doInitBody();
      }
      do {
        if (_jspx_meth_fmt_message_74((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_13, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
          return true;
        int evalDoAfterBody = _jspx_th_sst_option_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_sst_option_13 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_forEach_3[0]--;
    }
    if (_jspx_th_sst_option_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_13);
      throw new SkipPageException();
    }
    _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_13);
    return false;
  }

  private boolean _jspx_meth_fmt_message_74(javax.servlet.jsp.tagext.JspTag _jspx_th_sst_option_13, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_74 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_74.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_74.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_option_13);
    _jspx_th_fmt_message_74.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${crdef.nameKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_message_74 = _jspx_th_fmt_message_74.doStartTag();
    if (_jspx_th_fmt_message_74.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_74);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_74);
    return false;
  }

  private boolean _jspx_meth_fmt_message_75(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_75 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_75.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_75.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_75.setKey("pointEdit.chart.limit");
    int _jspx_eval_fmt_message_75 = _jspx_th_fmt_message_75.doStartTag();
    if (_jspx_th_fmt_message_75.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_75);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_75);
    return false;
  }

  private boolean _jspx_meth_fmt_message_76(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_76 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_76.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_76.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_76.setKey("pointEdit.chart.timePeriod");
    int _jspx_eval_fmt_message_76 = _jspx_th_fmt_message_76.doStartTag();
    if (_jspx_th_fmt_message_76.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_76);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_76);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_3 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_3      );
    }
    _jspx_th_tag_timePeriods_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_3.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_3.setId("chartRendererImageTimePeriod");
    _jspx_th_tag_timePeriods_3.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_3.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_3.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_3.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_3.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_3.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_77(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_77 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_77.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_77.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_77.setKey("pointEdit.chart.timePeriod");
    int _jspx_eval_fmt_message_77 = _jspx_th_fmt_message_77.doStartTag();
    if (_jspx_th_fmt_message_77.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_77);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_77);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_4 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_4      );
    }
    _jspx_th_tag_timePeriods_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_4.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_4.setId("chartRendererStatsTimePeriod");
    _jspx_th_tag_timePeriods_4.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_4.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_4.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_4.setW(new Boolean(true));
    _jspx_th_tag_timePeriods_4.setMon(new Boolean(true));
    _jspx_th_tag_timePeriods_4.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_78(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_78 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_78.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_78.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_78.setKey("pointEdit.chart.includeSum");
    int _jspx_eval_fmt_message_78 = _jspx_th_fmt_message_78.doStartTag();
    if (_jspx_th_fmt_message_78.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_78);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_78);
    return false;
  }

  private boolean _jspx_meth_fmt_message_79(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_79 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_79.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_79.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_79.setKey("pointEdit.chart.limit");
    int _jspx_eval_fmt_message_79 = _jspx_th_fmt_message_79.doStartTag();
    if (_jspx_th_fmt_message_79.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_79);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_79);
    return false;
  }

  private boolean _jspx_meth_fmt_message_80(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_80 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_80.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_80.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_80.setKey("pointEdit.chart.note");
    int _jspx_eval_fmt_message_80 = _jspx_th_fmt_message_80.doStartTag();
    if (_jspx_th_fmt_message_80.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_80);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_80);
    return false;
  }

  private boolean _jspx_meth_c_choose_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_1.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
    if (_jspx_eval_c_choose_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n            ");
        if (_jspx_meth_c_when_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_when_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_when_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_when_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_when_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n            ");
        if (_jspx_meth_c_otherwise_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_1, _jspx_page_context))
          return true;
        out.write("\r\n          ");
        int evalDoAfterBody = _jspx_th_c_choose_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_1);
    return false;
  }

  private boolean _jspx_meth_c_when_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_7.setPageContext(_jspx_page_context);
    _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty form.chartRenderer}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
    return false;
  }

  private boolean _jspx_meth_c_when_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_8.setPageContext(_jspx_page_context);
    _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName == \"chartRendererTable\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
    if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              $set(\"chartRendererTableLimit\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.limit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
    return false;
  }

  private boolean _jspx_meth_c_when_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_9.setPageContext(_jspx_page_context);
    _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName == \"chartRendererImage\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
    if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              $set(\"chartRendererImageNumberOfPeriods\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.numberOfPeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\r\n              $set(\"chartRendererImageTimePeriod\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.timePeriod}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
    return false;
  }

  private boolean _jspx_meth_c_when_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_10.setPageContext(_jspx_page_context);
    _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName == \"chartRendererStats\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
    if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              $set(\"chartRendererStatsNumberOfPeriods\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.numberOfPeriods}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\r\n              $set(\"chartRendererStatsTimePeriod\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.timePeriod}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\r\n              $set(\"chartRendererStatsIncludeSum\", ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.includeSum}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(");\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
    return false;
  }

  private boolean _jspx_meth_c_when_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_11 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_11.setPageContext(_jspx_page_context);
    _jspx_th_c_when_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    _jspx_th_c_when_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName == \"chartRendererImageFlipbook\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_11 = _jspx_th_c_when_11.doStartTag();
    if (_jspx_eval_c_when_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              $set(\"chartRendererImageFlipbookLimit\", \"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.limit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\r\n            ");
        int evalDoAfterBody = _jspx_th_c_when_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_1.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_1);
    int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
    if (_jspx_eval_c_otherwise_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n              dojo.debug(\"Unknown chart renderer: ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.chartRenderer.typeName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\");\r\n            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_1);
    return false;
  }

  private boolean _jspx_meth_fmt_message_81(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_81 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_81.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_81.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_81.setKey("pointEdit.chart.missingLimit");
    int _jspx_eval_fmt_message_81 = _jspx_th_fmt_message_81.doStartTag();
    if (_jspx_th_fmt_message_81.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_81);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_81);
    return false;
  }

  private boolean _jspx_meth_fmt_message_82(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_82 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_82.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_82.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_82.setKey("pointEdit.chart.invalidLimit");
    int _jspx_eval_fmt_message_82 = _jspx_th_fmt_message_82.doStartTag();
    if (_jspx_th_fmt_message_82.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_82);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_82);
    return false;
  }

  private boolean _jspx_meth_fmt_message_83(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_83 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_83.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_83.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_83.setKey("pointEdit.chart.missingPeriods");
    int _jspx_eval_fmt_message_83 = _jspx_th_fmt_message_83.doStartTag();
    if (_jspx_th_fmt_message_83.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_83);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_83);
    return false;
  }

  private boolean _jspx_meth_fmt_message_84(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_84 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_84.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_84.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_84.setKey("pointEdit.chart.invalidPeriods");
    int _jspx_eval_fmt_message_84 = _jspx_th_fmt_message_84.doStartTag();
    if (_jspx_th_fmt_message_84.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_84);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_84);
    return false;
  }

  private boolean _jspx_meth_fmt_message_85(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_85 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_85.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_85.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_85.setKey("pointEdit.chart.missingPeriods");
    int _jspx_eval_fmt_message_85 = _jspx_th_fmt_message_85.doStartTag();
    if (_jspx_th_fmt_message_85.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_85);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_85);
    return false;
  }

  private boolean _jspx_meth_fmt_message_86(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_86 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_86.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_86.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_86.setKey("pointEdit.chart.invalidPeriods");
    int _jspx_eval_fmt_message_86 = _jspx_th_fmt_message_86.doStartTag();
    if (_jspx_th_fmt_message_86.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_86);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_86);
    return false;
  }

  private boolean _jspx_meth_fmt_message_87(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_87 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_87.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_87.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_87.setKey("pointEdit.chart.missingLimit");
    int _jspx_eval_fmt_message_87 = _jspx_th_fmt_message_87.doStartTag();
    if (_jspx_th_fmt_message_87.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_87);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_87);
    return false;
  }

  private boolean _jspx_meth_fmt_message_88(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_88 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_88.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_88.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_88.setKey("pointEdit.chart.invalidLimit");
    int _jspx_eval_fmt_message_88 = _jspx_th_fmt_message_88.doStartTag();
    if (_jspx_th_fmt_message_88.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_88);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_88);
    return false;
  }

  private boolean _jspx_meth_fmt_message_89(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_89 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_89.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_89.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_89.setKey("pointEdit.detectors.eventDetectors");
    int _jspx_eval_fmt_message_89 = _jspx_th_fmt_message_89.doStartTag();
    if (_jspx_th_fmt_message_89.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_89);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_89);
    return false;
  }

  private boolean _jspx_meth_tag_help_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:help
    org.apache.jsp.tag.web.help_tag _jspx_th_tag_help_7 = new org.apache.jsp.tag.web.help_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_help_7      );
    }
    _jspx_th_tag_help_7.setJspContext(_jspx_page_context);
    _jspx_th_tag_help_7.setParent(_jspx_parent);
    _jspx_th_tag_help_7.setId("eventDetectors");
    _jspx_th_tag_help_7.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_90(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_90 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_90.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_90.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_90.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_90 = _jspx_th_fmt_message_90.doStartTag();
    if (_jspx_th_fmt_message_90.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_90);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_90);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eventDetectors}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("eddef");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eddef.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          if (_jspx_meth_fmt_message_91((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("</option>\r\n          ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_message_91(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_91 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_91.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_91.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_fmt_message_91.setKey((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${eddef.nameKey}", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_fmt_message_91 = _jspx_th_fmt_message_91.doStartTag();
    if (_jspx_th_fmt_message_91.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_91);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_91);
    return false;
  }

  private boolean _jspx_meth_tag_img_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_6 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_6      );
    }
    _jspx_th_tag_img_6.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_6.setParent(_jspx_parent);
    _jspx_th_tag_img_6.setPng("add");
    _jspx_th_tag_img_6.setTitle("common.add");
    _jspx_th_tag_img_6.setOnclick("pointEventDetectorEditor.addEventDetector();");
    _jspx_th_tag_img_6.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_92(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_92 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_92.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_92.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_92.setKey("pointEdit.detectors.empty");
    int _jspx_eval_fmt_message_92 = _jspx_th_fmt_message_92.doStartTag();
    if (_jspx_th_fmt_message_92.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_92);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_92);
    return false;
  }

  private boolean _jspx_meth_tag_img_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_7 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_7      );
    }
    _jspx_th_tag_img_7.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_7.setParent(_jspx_parent);
    _jspx_th_tag_img_7.setPng("delete");
    _jspx_th_tag_img_7.setTitle("common.delete");
    _jspx_th_tag_img_7.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_7.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_93(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_93 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_93.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_93.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_93.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_93 = _jspx_th_fmt_message_93.doStartTag();
    if (_jspx_th_fmt_message_93.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_93);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_93);
    return false;
  }

  private boolean _jspx_meth_fmt_message_94(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_94 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_94.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_94.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_94.setKey("pointEdit.detectors.highLimitDet");
    int _jspx_eval_fmt_message_94 = _jspx_th_fmt_message_94.doStartTag();
    if (_jspx_th_fmt_message_94.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_94);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_94);
    return false;
  }

  private boolean _jspx_meth_fmt_message_95(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_95 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_95.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_95.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_95.setKey("common.xid");
    int _jspx_eval_fmt_message_95 = _jspx_th_fmt_message_95.doStartTag();
    if (_jspx_th_fmt_message_95.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_95);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_95);
    return false;
  }

  private boolean _jspx_meth_fmt_message_96(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_96 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_96.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_96.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_96.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_96 = _jspx_th_fmt_message_96.doStartTag();
    if (_jspx_th_fmt_message_96.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_96);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_96);
    return false;
  }

  private boolean _jspx_meth_fmt_message_97(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_97 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_97.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_97.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_97.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_97 = _jspx_th_fmt_message_97.doStartTag();
    if (_jspx_th_fmt_message_97.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_97);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_97);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_0 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_0      );
    }
    _jspx_th_tag_alarmLevelOptions_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_0.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_0.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_0.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_8 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_8      );
    }
    _jspx_th_tag_img_8.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_8.setParent(_jspx_parent);
    _jspx_th_tag_img_8.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_8.setPng("flag_green");
    _jspx_th_tag_img_8.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_8.setStyle("display:none;");
    _jspx_th_tag_img_8.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_98(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_98 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_98.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_98.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_98.setKey("pointEdit.detectors.highLimit");
    int _jspx_eval_fmt_message_98 = _jspx_th_fmt_message_98.doStartTag();
    if (_jspx_th_fmt_message_98.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_98);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_98);
    return false;
  }

  private boolean _jspx_meth_fmt_message_99(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_99 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_99.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_99.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_99.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_99 = _jspx_th_fmt_message_99.doStartTag();
    if (_jspx_th_fmt_message_99.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_99);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_99);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_5 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_5      );
    }
    _jspx_th_tag_timePeriods_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_5.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_5.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_5.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_5.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_5.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_5.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_5.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_9 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_9      );
    }
    _jspx_th_tag_img_9.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_9.setParent(_jspx_parent);
    _jspx_th_tag_img_9.setPng("delete");
    _jspx_th_tag_img_9.setTitle("common.delete");
    _jspx_th_tag_img_9.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_9.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_100(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_100 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_100.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_100.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_100.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_100 = _jspx_th_fmt_message_100.doStartTag();
    if (_jspx_th_fmt_message_100.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_100);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_100);
    return false;
  }

  private boolean _jspx_meth_fmt_message_101(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_101 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_101.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_101.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_101.setKey("pointEdit.detectors.lowLimitDet");
    int _jspx_eval_fmt_message_101 = _jspx_th_fmt_message_101.doStartTag();
    if (_jspx_th_fmt_message_101.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_101);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_101);
    return false;
  }

  private boolean _jspx_meth_fmt_message_102(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_102 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_102.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_102.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_102.setKey("common.xid");
    int _jspx_eval_fmt_message_102 = _jspx_th_fmt_message_102.doStartTag();
    if (_jspx_th_fmt_message_102.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_102);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_102);
    return false;
  }

  private boolean _jspx_meth_fmt_message_103(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_103 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_103.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_103.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_103.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_103 = _jspx_th_fmt_message_103.doStartTag();
    if (_jspx_th_fmt_message_103.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_103);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_103);
    return false;
  }

  private boolean _jspx_meth_fmt_message_104(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_104 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_104.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_104.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_104.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_104 = _jspx_th_fmt_message_104.doStartTag();
    if (_jspx_th_fmt_message_104.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_104);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_104);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_1 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_1      );
    }
    _jspx_th_tag_alarmLevelOptions_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_1.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_1.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_1.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_10 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_10      );
    }
    _jspx_th_tag_img_10.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_10.setParent(_jspx_parent);
    _jspx_th_tag_img_10.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_10.setPng("flag_green");
    _jspx_th_tag_img_10.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_10.setStyle("display:none;");
    _jspx_th_tag_img_10.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_105(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_105 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_105.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_105.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_105.setKey("pointEdit.detectors.lowLimit");
    int _jspx_eval_fmt_message_105 = _jspx_th_fmt_message_105.doStartTag();
    if (_jspx_th_fmt_message_105.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_105);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_105);
    return false;
  }

  private boolean _jspx_meth_fmt_message_106(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_106 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_106.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_106.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_106.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_106 = _jspx_th_fmt_message_106.doStartTag();
    if (_jspx_th_fmt_message_106.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_106);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_106);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_6 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_6      );
    }
    _jspx_th_tag_timePeriods_6.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_6.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_6.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_6.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_6.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_6.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_6.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_6.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_11 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_11      );
    }
    _jspx_th_tag_img_11.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_11.setParent(_jspx_parent);
    _jspx_th_tag_img_11.setPng("delete");
    _jspx_th_tag_img_11.setTitle("common.delete");
    _jspx_th_tag_img_11.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_11.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_107(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_107 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_107.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_107.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_107.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_107 = _jspx_th_fmt_message_107.doStartTag();
    if (_jspx_th_fmt_message_107.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_107);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_107);
    return false;
  }

  private boolean _jspx_meth_fmt_message_108(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_108 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_108.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_108.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_108.setKey("pointEdit.detectors.stateDet");
    int _jspx_eval_fmt_message_108 = _jspx_th_fmt_message_108.doStartTag();
    if (_jspx_th_fmt_message_108.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_108);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_108);
    return false;
  }

  private boolean _jspx_meth_fmt_message_109(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_109 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_109.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_109.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_109.setKey("common.xid");
    int _jspx_eval_fmt_message_109 = _jspx_th_fmt_message_109.doStartTag();
    if (_jspx_th_fmt_message_109.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_109);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_109);
    return false;
  }

  private boolean _jspx_meth_fmt_message_110(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_110 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_110.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_110.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_110.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_110 = _jspx_th_fmt_message_110.doStartTag();
    if (_jspx_th_fmt_message_110.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_110);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_110);
    return false;
  }

  private boolean _jspx_meth_fmt_message_111(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_111 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_111.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_111.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_111.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_111 = _jspx_th_fmt_message_111.doStartTag();
    if (_jspx_th_fmt_message_111.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_111);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_111);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_2(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_2 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_2      );
    }
    _jspx_th_tag_alarmLevelOptions_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_2.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_2.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_2.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_2.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_12 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_12      );
    }
    _jspx_th_tag_img_12.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_12.setParent(_jspx_parent);
    _jspx_th_tag_img_12.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_12.setPng("flag_green");
    _jspx_th_tag_img_12.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_12.setStyle("display:none;");
    _jspx_th_tag_img_12.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_112(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_112 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_112.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_112.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_112.setKey("pointEdit.detectors.state");
    int _jspx_eval_fmt_message_112 = _jspx_th_fmt_message_112.doStartTag();
    if (_jspx_th_fmt_message_112.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_112);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_112);
    return false;
  }

  private boolean _jspx_meth_fmt_message_113(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_113 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_113.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_113.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_113.setKey("pointEdit.detectors.zero");
    int _jspx_eval_fmt_message_113 = _jspx_th_fmt_message_113.doStartTag();
    if (_jspx_th_fmt_message_113.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_113);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_113);
    return false;
  }

  private boolean _jspx_meth_fmt_message_114(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_114 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_114.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_114.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_114.setKey("pointEdit.detectors.one");
    int _jspx_eval_fmt_message_114 = _jspx_th_fmt_message_114.doStartTag();
    if (_jspx_th_fmt_message_114.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_114);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_114);
    return false;
  }

  private boolean _jspx_meth_fmt_message_115(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_115 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_115.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_115.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_115.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_115 = _jspx_th_fmt_message_115.doStartTag();
    if (_jspx_th_fmt_message_115.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_115);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_115);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_7 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_7      );
    }
    _jspx_th_tag_timePeriods_7.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_7.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_7.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_7.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_7.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_7.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_7.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_7.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_13 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_13      );
    }
    _jspx_th_tag_img_13.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_13.setParent(_jspx_parent);
    _jspx_th_tag_img_13.setPng("delete");
    _jspx_th_tag_img_13.setTitle("common.delete");
    _jspx_th_tag_img_13.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_13.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_116(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_116 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_116.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_116.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_116.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_116 = _jspx_th_fmt_message_116.doStartTag();
    if (_jspx_th_fmt_message_116.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_116);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_116);
    return false;
  }

  private boolean _jspx_meth_fmt_message_117(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_117 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_117.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_117.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_117.setKey("pointEdit.detectors.stateDet");
    int _jspx_eval_fmt_message_117 = _jspx_th_fmt_message_117.doStartTag();
    if (_jspx_th_fmt_message_117.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_117);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_117);
    return false;
  }

  private boolean _jspx_meth_fmt_message_118(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_118 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_118.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_118.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_118.setKey("common.xid");
    int _jspx_eval_fmt_message_118 = _jspx_th_fmt_message_118.doStartTag();
    if (_jspx_th_fmt_message_118.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_118);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_118);
    return false;
  }

  private boolean _jspx_meth_fmt_message_119(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_119 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_119.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_119.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_119.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_119 = _jspx_th_fmt_message_119.doStartTag();
    if (_jspx_th_fmt_message_119.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_119);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_119);
    return false;
  }

  private boolean _jspx_meth_fmt_message_120(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_120 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_120.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_120.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_120.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_120 = _jspx_th_fmt_message_120.doStartTag();
    if (_jspx_th_fmt_message_120.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_120);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_120);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_3(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_3 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_3      );
    }
    _jspx_th_tag_alarmLevelOptions_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_3.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_3.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_3.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_3.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_14 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_14      );
    }
    _jspx_th_tag_img_14.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_14.setParent(_jspx_parent);
    _jspx_th_tag_img_14.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_14.setPng("flag_green");
    _jspx_th_tag_img_14.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_14.setStyle("display:none;");
    _jspx_th_tag_img_14.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_121(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_121 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_121.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_121.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_121.setKey("pointEdit.detectors.state");
    int _jspx_eval_fmt_message_121 = _jspx_th_fmt_message_121.doStartTag();
    if (_jspx_th_fmt_message_121.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_121);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_121);
    return false;
  }

  private boolean _jspx_meth_fmt_message_122(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_122 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_122.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_122.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_122.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_122 = _jspx_th_fmt_message_122.doStartTag();
    if (_jspx_th_fmt_message_122.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_122);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_122);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_8 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_8      );
    }
    _jspx_th_tag_timePeriods_8.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_8.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_8.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_8.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_8.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_8.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_8.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_8.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_15(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_15 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_15      );
    }
    _jspx_th_tag_img_15.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_15.setParent(_jspx_parent);
    _jspx_th_tag_img_15.setPng("delete");
    _jspx_th_tag_img_15.setTitle("common.delete");
    _jspx_th_tag_img_15.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_15.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_123(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_123 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_123.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_123.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_123.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_123 = _jspx_th_fmt_message_123.doStartTag();
    if (_jspx_th_fmt_message_123.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_123);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_123);
    return false;
  }

  private boolean _jspx_meth_fmt_message_124(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_124 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_124.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_124.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_124.setKey("pointEdit.detectors.changeDet");
    int _jspx_eval_fmt_message_124 = _jspx_th_fmt_message_124.doStartTag();
    if (_jspx_th_fmt_message_124.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_124);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_124);
    return false;
  }

  private boolean _jspx_meth_fmt_message_125(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_125 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_125.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_125.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_125.setKey("common.xid");
    int _jspx_eval_fmt_message_125 = _jspx_th_fmt_message_125.doStartTag();
    if (_jspx_th_fmt_message_125.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_125);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_125);
    return false;
  }

  private boolean _jspx_meth_fmt_message_126(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_126 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_126.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_126.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_126.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_126 = _jspx_th_fmt_message_126.doStartTag();
    if (_jspx_th_fmt_message_126.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_126);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_126);
    return false;
  }

  private boolean _jspx_meth_fmt_message_127(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_127 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_127.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_127.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_127.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_127 = _jspx_th_fmt_message_127.doStartTag();
    if (_jspx_th_fmt_message_127.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_127);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_127);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_4(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_4 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_4      );
    }
    _jspx_th_tag_alarmLevelOptions_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_4.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_4.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_4.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_4.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_16(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_16 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_16      );
    }
    _jspx_th_tag_img_16.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_16.setParent(_jspx_parent);
    _jspx_th_tag_img_16.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_16.setPng("flag_green");
    _jspx_th_tag_img_16.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_16.setStyle("display:none;");
    _jspx_th_tag_img_16.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_17(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_17 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_17      );
    }
    _jspx_th_tag_img_17.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_17.setParent(_jspx_parent);
    _jspx_th_tag_img_17.setPng("delete");
    _jspx_th_tag_img_17.setTitle("common.delete");
    _jspx_th_tag_img_17.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_17.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_128(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_128 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_128.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_128.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_128.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_128 = _jspx_th_fmt_message_128.doStartTag();
    if (_jspx_th_fmt_message_128.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_128);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_128);
    return false;
  }

  private boolean _jspx_meth_fmt_message_129(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_129 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_129.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_129.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_129.setKey("pointEdit.detectors.changeCounter");
    int _jspx_eval_fmt_message_129 = _jspx_th_fmt_message_129.doStartTag();
    if (_jspx_th_fmt_message_129.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_129);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_129);
    return false;
  }

  private boolean _jspx_meth_fmt_message_130(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_130 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_130.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_130.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_130.setKey("common.xid");
    int _jspx_eval_fmt_message_130 = _jspx_th_fmt_message_130.doStartTag();
    if (_jspx_th_fmt_message_130.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_130);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_130);
    return false;
  }

  private boolean _jspx_meth_fmt_message_131(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_131 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_131.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_131.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_131.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_131 = _jspx_th_fmt_message_131.doStartTag();
    if (_jspx_th_fmt_message_131.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_131);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_131);
    return false;
  }

  private boolean _jspx_meth_fmt_message_132(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_132 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_132.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_132.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_132.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_132 = _jspx_th_fmt_message_132.doStartTag();
    if (_jspx_th_fmt_message_132.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_132);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_132);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_5(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_5 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_5      );
    }
    _jspx_th_tag_alarmLevelOptions_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_5.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_5.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_5.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_5.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_18(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_18 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_18      );
    }
    _jspx_th_tag_img_18.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_18.setParent(_jspx_parent);
    _jspx_th_tag_img_18.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_18.setPng("flag_green");
    _jspx_th_tag_img_18.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_18.setStyle("display:none;");
    _jspx_th_tag_img_18.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_133(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_133 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_133.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_133.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_133.setKey("pointEdit.detectors.changeCount");
    int _jspx_eval_fmt_message_133 = _jspx_th_fmt_message_133.doStartTag();
    if (_jspx_th_fmt_message_133.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_133);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_133);
    return false;
  }

  private boolean _jspx_meth_fmt_message_134(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_134 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_134.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_134.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_134.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_134 = _jspx_th_fmt_message_134.doStartTag();
    if (_jspx_th_fmt_message_134.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_134);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_134);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_9 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_9      );
    }
    _jspx_th_tag_timePeriods_9.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_9.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_9.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_9.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_9.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_9.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_9.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_9.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_19(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_19 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_19      );
    }
    _jspx_th_tag_img_19.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_19.setParent(_jspx_parent);
    _jspx_th_tag_img_19.setPng("delete");
    _jspx_th_tag_img_19.setTitle("common.delete");
    _jspx_th_tag_img_19.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_19.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_135(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_135 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_135.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_135.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_135.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_135 = _jspx_th_fmt_message_135.doStartTag();
    if (_jspx_th_fmt_message_135.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_135);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_135);
    return false;
  }

  private boolean _jspx_meth_fmt_message_136(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_136 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_136.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_136.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_136.setKey("pointEdit.detectors.noChange");
    int _jspx_eval_fmt_message_136 = _jspx_th_fmt_message_136.doStartTag();
    if (_jspx_th_fmt_message_136.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_136);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_136);
    return false;
  }

  private boolean _jspx_meth_fmt_message_137(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_137 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_137.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_137.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_137.setKey("common.xid");
    int _jspx_eval_fmt_message_137 = _jspx_th_fmt_message_137.doStartTag();
    if (_jspx_th_fmt_message_137.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_137);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_137);
    return false;
  }

  private boolean _jspx_meth_fmt_message_138(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_138 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_138.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_138.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_138.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_138 = _jspx_th_fmt_message_138.doStartTag();
    if (_jspx_th_fmt_message_138.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_138);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_138);
    return false;
  }

  private boolean _jspx_meth_fmt_message_139(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_139 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_139.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_139.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_139.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_139 = _jspx_th_fmt_message_139.doStartTag();
    if (_jspx_th_fmt_message_139.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_139);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_139);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_6(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_6 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_6      );
    }
    _jspx_th_tag_alarmLevelOptions_6.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_6.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_6.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_6.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_6.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_20(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_20 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_20      );
    }
    _jspx_th_tag_img_20.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_20.setParent(_jspx_parent);
    _jspx_th_tag_img_20.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_20.setPng("flag_green");
    _jspx_th_tag_img_20.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_20.setStyle("display:none;");
    _jspx_th_tag_img_20.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_140(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_140 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_140.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_140.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_140.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_140 = _jspx_th_fmt_message_140.doStartTag();
    if (_jspx_th_fmt_message_140.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_140);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_140);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_10 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_10      );
    }
    _jspx_th_tag_timePeriods_10.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_10.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_10.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_10.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_10.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_10.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_10.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_10.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_21(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_21 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_21      );
    }
    _jspx_th_tag_img_21.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_21.setParent(_jspx_parent);
    _jspx_th_tag_img_21.setPng("delete");
    _jspx_th_tag_img_21.setTitle("common.delete");
    _jspx_th_tag_img_21.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_21.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_141(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_141 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_141.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_141.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_141.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_141 = _jspx_th_fmt_message_141.doStartTag();
    if (_jspx_th_fmt_message_141.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_141);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_141);
    return false;
  }

  private boolean _jspx_meth_fmt_message_142(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_142 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_142.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_142.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_142.setKey("pointEdit.detectors.noUpdate");
    int _jspx_eval_fmt_message_142 = _jspx_th_fmt_message_142.doStartTag();
    if (_jspx_th_fmt_message_142.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_142);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_142);
    return false;
  }

  private boolean _jspx_meth_fmt_message_143(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_143 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_143.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_143.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_143.setKey("common.xid");
    int _jspx_eval_fmt_message_143 = _jspx_th_fmt_message_143.doStartTag();
    if (_jspx_th_fmt_message_143.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_143);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_143);
    return false;
  }

  private boolean _jspx_meth_fmt_message_144(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_144 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_144.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_144.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_144.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_144 = _jspx_th_fmt_message_144.doStartTag();
    if (_jspx_th_fmt_message_144.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_144);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_144);
    return false;
  }

  private boolean _jspx_meth_fmt_message_145(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_145 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_145.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_145.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_145.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_145 = _jspx_th_fmt_message_145.doStartTag();
    if (_jspx_th_fmt_message_145.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_145);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_145);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_7(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_7 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_7      );
    }
    _jspx_th_tag_alarmLevelOptions_7.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_7.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_7.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_7.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_7.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_22(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_22 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_22      );
    }
    _jspx_th_tag_img_22.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_22.setParent(_jspx_parent);
    _jspx_th_tag_img_22.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_22.setPng("flag_green");
    _jspx_th_tag_img_22.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_22.setStyle("display:none;");
    _jspx_th_tag_img_22.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_146(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_146 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_146.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_146.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_146.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_146 = _jspx_th_fmt_message_146.doStartTag();
    if (_jspx_th_fmt_message_146.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_146);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_146);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_11(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_11 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_11      );
    }
    _jspx_th_tag_timePeriods_11.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_11.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_11.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_11.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_11.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_11.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_11.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_11.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_23(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_23 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_23      );
    }
    _jspx_th_tag_img_23.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_23.setParent(_jspx_parent);
    _jspx_th_tag_img_23.setPng("delete");
    _jspx_th_tag_img_23.setTitle("common.delete");
    _jspx_th_tag_img_23.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_23.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_147(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_147 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_147.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_147.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_147.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_147 = _jspx_th_fmt_message_147.doStartTag();
    if (_jspx_th_fmt_message_147.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_147);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_147);
    return false;
  }

  private boolean _jspx_meth_fmt_message_148(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_148 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_148.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_148.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_148.setKey("pointEdit.detectors.stateDet");
    int _jspx_eval_fmt_message_148 = _jspx_th_fmt_message_148.doStartTag();
    if (_jspx_th_fmt_message_148.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_148);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_148);
    return false;
  }

  private boolean _jspx_meth_fmt_message_149(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_149 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_149.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_149.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_149.setKey("common.xid");
    int _jspx_eval_fmt_message_149 = _jspx_th_fmt_message_149.doStartTag();
    if (_jspx_th_fmt_message_149.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_149);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_149);
    return false;
  }

  private boolean _jspx_meth_fmt_message_150(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_150 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_150.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_150.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_150.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_150 = _jspx_th_fmt_message_150.doStartTag();
    if (_jspx_th_fmt_message_150.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_150);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_150);
    return false;
  }

  private boolean _jspx_meth_fmt_message_151(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_151 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_151.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_151.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_151.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_151 = _jspx_th_fmt_message_151.doStartTag();
    if (_jspx_th_fmt_message_151.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_151);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_151);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_8(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_8 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_8      );
    }
    _jspx_th_tag_alarmLevelOptions_8.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_8.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_8.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_8.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_8.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_24(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_24 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_24      );
    }
    _jspx_th_tag_img_24.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_24.setParent(_jspx_parent);
    _jspx_th_tag_img_24.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_24.setPng("flag_green");
    _jspx_th_tag_img_24.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_24.setStyle("display:none;");
    _jspx_th_tag_img_24.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_152(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_152 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_152.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_152.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_152.setKey("pointEdit.detectors.state");
    int _jspx_eval_fmt_message_152 = _jspx_th_fmt_message_152.doStartTag();
    if (_jspx_th_fmt_message_152.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_152);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_152);
    return false;
  }

  private boolean _jspx_meth_fmt_message_153(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_153 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_153.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_153.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_153.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_153 = _jspx_th_fmt_message_153.doStartTag();
    if (_jspx_th_fmt_message_153.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_153);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_153);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_12(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_12 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_12      );
    }
    _jspx_th_tag_timePeriods_12.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_12.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_12.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_12.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_12.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_12.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_12.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_12.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_25(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_25 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_25      );
    }
    _jspx_th_tag_img_25.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_25.setParent(_jspx_parent);
    _jspx_th_tag_img_25.setPng("delete");
    _jspx_th_tag_img_25.setTitle("common.delete");
    _jspx_th_tag_img_25.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_25.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_154(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_154 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_154.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_154.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_154.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_154 = _jspx_th_fmt_message_154.doStartTag();
    if (_jspx_th_fmt_message_154.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_154);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_154);
    return false;
  }

  private boolean _jspx_meth_fmt_message_155(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_155 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_155.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_155.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_155.setKey("pointEdit.detectors.posCusumDet");
    int _jspx_eval_fmt_message_155 = _jspx_th_fmt_message_155.doStartTag();
    if (_jspx_th_fmt_message_155.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_155);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_155);
    return false;
  }

  private boolean _jspx_meth_fmt_message_156(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_156 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_156.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_156.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_156.setKey("common.xid");
    int _jspx_eval_fmt_message_156 = _jspx_th_fmt_message_156.doStartTag();
    if (_jspx_th_fmt_message_156.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_156);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_156);
    return false;
  }

  private boolean _jspx_meth_fmt_message_157(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_157 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_157.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_157.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_157.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_157 = _jspx_th_fmt_message_157.doStartTag();
    if (_jspx_th_fmt_message_157.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_157);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_157);
    return false;
  }

  private boolean _jspx_meth_fmt_message_158(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_158 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_158.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_158.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_158.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_158 = _jspx_th_fmt_message_158.doStartTag();
    if (_jspx_th_fmt_message_158.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_158);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_158);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_9(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_9 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_9      );
    }
    _jspx_th_tag_alarmLevelOptions_9.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_9.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_9.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_9.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_9.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_26(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_26 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_26      );
    }
    _jspx_th_tag_img_26.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_26.setParent(_jspx_parent);
    _jspx_th_tag_img_26.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_26.setPng("flag_green");
    _jspx_th_tag_img_26.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_26.setStyle("display:none;");
    _jspx_th_tag_img_26.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_159(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_159 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_159.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_159.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_159.setKey("pointEdit.detectors.posLimit");
    int _jspx_eval_fmt_message_159 = _jspx_th_fmt_message_159.doStartTag();
    if (_jspx_th_fmt_message_159.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_159);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_159);
    return false;
  }

  private boolean _jspx_meth_fmt_message_160(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_160 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_160.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_160.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_160.setKey("pointEdit.detectors.weight");
    int _jspx_eval_fmt_message_160 = _jspx_th_fmt_message_160.doStartTag();
    if (_jspx_th_fmt_message_160.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_160);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_160);
    return false;
  }

  private boolean _jspx_meth_fmt_message_161(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_161 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_161.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_161.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_161.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_161 = _jspx_th_fmt_message_161.doStartTag();
    if (_jspx_th_fmt_message_161.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_161);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_161);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_13(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_13 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_13      );
    }
    _jspx_th_tag_timePeriods_13.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_13.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_13.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_13.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_13.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_13.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_13.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_13.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_27(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_27 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_27      );
    }
    _jspx_th_tag_img_27.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_27.setParent(_jspx_parent);
    _jspx_th_tag_img_27.setPng("delete");
    _jspx_th_tag_img_27.setTitle("common.delete");
    _jspx_th_tag_img_27.setOnclick("pointEventDetectorEditor.deleteDetector(getPedId(this))");
    _jspx_th_tag_img_27.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_162(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_162 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_162.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_162.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_162.setKey("pointEdit.detectors.type");
    int _jspx_eval_fmt_message_162 = _jspx_th_fmt_message_162.doStartTag();
    if (_jspx_th_fmt_message_162.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_162);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_162);
    return false;
  }

  private boolean _jspx_meth_fmt_message_163(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_163 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_163.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_163.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_163.setKey("pointEdit.detectors.negCusumDet");
    int _jspx_eval_fmt_message_163 = _jspx_th_fmt_message_163.doStartTag();
    if (_jspx_th_fmt_message_163.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_163);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_163);
    return false;
  }

  private boolean _jspx_meth_fmt_message_164(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_164 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_164.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_164.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_164.setKey("common.xid");
    int _jspx_eval_fmt_message_164 = _jspx_th_fmt_message_164.doStartTag();
    if (_jspx_th_fmt_message_164.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_164);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_164);
    return false;
  }

  private boolean _jspx_meth_fmt_message_165(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_165 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_165.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_165.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_165.setKey("pointEdit.detectors.alias");
    int _jspx_eval_fmt_message_165 = _jspx_th_fmt_message_165.doStartTag();
    if (_jspx_th_fmt_message_165.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_165);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_165);
    return false;
  }

  private boolean _jspx_meth_fmt_message_166(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_166 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_166.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_166.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_166.setKey("common.alarmLevel");
    int _jspx_eval_fmt_message_166 = _jspx_th_fmt_message_166.doStartTag();
    if (_jspx_th_fmt_message_166.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_166);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_166);
    return false;
  }

  private boolean _jspx_meth_tag_alarmLevelOptions_10(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:alarmLevelOptions
    org.apache.jsp.tag.web.alarmLevelOptions_tag _jspx_th_tag_alarmLevelOptions_10 = new org.apache.jsp.tag.web.alarmLevelOptions_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_alarmLevelOptions_10      );
    }
    _jspx_th_tag_alarmLevelOptions_10.setJspContext(_jspx_page_context);
    _jspx_th_tag_alarmLevelOptions_10.setParent(_jspx_parent);
    _jspx_th_tag_alarmLevelOptions_10.setId("eventDetector_TEMPLATE_AlarmLevel");
    _jspx_th_tag_alarmLevelOptions_10.setOnchange("pointEventDetectorEditor.updateAlarmLevelImage(this.value, getPedId(this))");
    _jspx_th_tag_alarmLevelOptions_10.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_28(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_28 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_28      );
    }
    _jspx_th_tag_img_28.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_28.setParent(_jspx_parent);
    _jspx_th_tag_img_28.setId("eventDetector_TEMPLATE_AlarmLevelImg");
    _jspx_th_tag_img_28.setPng("flag_green");
    _jspx_th_tag_img_28.setTitle("common.alarmLevel.none");
    _jspx_th_tag_img_28.setStyle("display:none;");
    _jspx_th_tag_img_28.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_167(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_167 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_167.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_167.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_167.setKey("pointEdit.detectors.negLimit");
    int _jspx_eval_fmt_message_167 = _jspx_th_fmt_message_167.doStartTag();
    if (_jspx_th_fmt_message_167.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_167);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_167);
    return false;
  }

  private boolean _jspx_meth_fmt_message_168(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_168 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_168.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_168.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_168.setKey("pointEdit.detectors.weight");
    int _jspx_eval_fmt_message_168 = _jspx_th_fmt_message_168.doStartTag();
    if (_jspx_th_fmt_message_168.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_168);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_168);
    return false;
  }

  private boolean _jspx_meth_fmt_message_169(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_169 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_169.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_169.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_169.setKey("pointEdit.detectors.duration");
    int _jspx_eval_fmt_message_169 = _jspx_th_fmt_message_169.doStartTag();
    if (_jspx_th_fmt_message_169.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_169);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_169);
    return false;
  }

  private boolean _jspx_meth_tag_timePeriods_14(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tag:timePeriods
    org.apache.jsp.tag.web.timePeriods_tag _jspx_th_tag_timePeriods_14 = new org.apache.jsp.tag.web.timePeriods_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_timePeriods_14      );
    }
    _jspx_th_tag_timePeriods_14.setJspContext(_jspx_page_context);
    _jspx_th_tag_timePeriods_14.setParent(_jspx_parent);
    _jspx_th_tag_timePeriods_14.setId("eventDetector_TEMPLATE_DurationType");
    _jspx_th_tag_timePeriods_14.setS(new Boolean(true));
    _jspx_th_tag_timePeriods_14.setMin(new Boolean(true));
    _jspx_th_tag_timePeriods_14.setH(new Boolean(true));
    _jspx_th_tag_timePeriods_14.setD(new Boolean(true));
    _jspx_th_tag_timePeriods_14.doTag();
    return false;
  }

  private boolean _jspx_meth_fmt_message_170(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_170 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_170.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_170.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_170.setKey("pointEdit.detectors.errorParsingLimit");
    int _jspx_eval_fmt_message_170 = _jspx_th_fmt_message_170.doStartTag();
    if (_jspx_th_fmt_message_170.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_170);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_170);
    return false;
  }

  private boolean _jspx_meth_fmt_message_171(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_171 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_171.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_171.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_171.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_171 = _jspx_th_fmt_message_171.doStartTag();
    if (_jspx_th_fmt_message_171.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_171);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_171);
    return false;
  }

  private boolean _jspx_meth_fmt_message_172(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_172 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_172.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_172.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_172.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_172 = _jspx_th_fmt_message_172.doStartTag();
    if (_jspx_th_fmt_message_172.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_172);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_172);
    return false;
  }

  private boolean _jspx_meth_fmt_message_173(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_173 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_173.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_173.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_173.setKey("pointEdit.detectors.errorParsingLimit");
    int _jspx_eval_fmt_message_173 = _jspx_th_fmt_message_173.doStartTag();
    if (_jspx_th_fmt_message_173.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_173);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_173);
    return false;
  }

  private boolean _jspx_meth_fmt_message_174(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_174 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_174.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_174.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_174.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_174 = _jspx_th_fmt_message_174.doStartTag();
    if (_jspx_th_fmt_message_174.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_174);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_174);
    return false;
  }

  private boolean _jspx_meth_fmt_message_175(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_175 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_175.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_175.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_175.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_175 = _jspx_th_fmt_message_175.doStartTag();
    if (_jspx_th_fmt_message_175.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_175);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_175);
    return false;
  }

  private boolean _jspx_meth_fmt_message_176(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_176 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_176.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_176.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_176.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_176 = _jspx_th_fmt_message_176.doStartTag();
    if (_jspx_th_fmt_message_176.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_176);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_176);
    return false;
  }

  private boolean _jspx_meth_fmt_message_177(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_177 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_177.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_177.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_177.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_177 = _jspx_th_fmt_message_177.doStartTag();
    if (_jspx_th_fmt_message_177.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_177);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_177);
    return false;
  }

  private boolean _jspx_meth_fmt_message_178(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_178 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_178.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_178.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_178.setKey("pointEdit.detectors.errorParsingState");
    int _jspx_eval_fmt_message_178 = _jspx_th_fmt_message_178.doStartTag();
    if (_jspx_th_fmt_message_178.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_178);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_178);
    return false;
  }

  private boolean _jspx_meth_fmt_message_179(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_179 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_179.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_179.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_179.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_179 = _jspx_th_fmt_message_179.doStartTag();
    if (_jspx_th_fmt_message_179.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_179);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_179);
    return false;
  }

  private boolean _jspx_meth_fmt_message_180(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_180 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_180.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_180.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_180.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_180 = _jspx_th_fmt_message_180.doStartTag();
    if (_jspx_th_fmt_message_180.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_180);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_180);
    return false;
  }

  private boolean _jspx_meth_fmt_message_181(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_181 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_181.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_181.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_181.setKey("pointEdit.detectors.errorParsingChangeCount");
    int _jspx_eval_fmt_message_181 = _jspx_th_fmt_message_181.doStartTag();
    if (_jspx_th_fmt_message_181.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_181);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_181);
    return false;
  }

  private boolean _jspx_meth_fmt_message_182(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_182 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_182.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_182.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_182.setKey("pointEdit.detectors.invalidChangeCount");
    int _jspx_eval_fmt_message_182 = _jspx_th_fmt_message_182.doStartTag();
    if (_jspx_th_fmt_message_182.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_182);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_182);
    return false;
  }

  private boolean _jspx_meth_fmt_message_183(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_183 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_183.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_183.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_183.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_183 = _jspx_th_fmt_message_183.doStartTag();
    if (_jspx_th_fmt_message_183.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_183);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_183);
    return false;
  }

  private boolean _jspx_meth_fmt_message_184(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_184 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_184.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_184.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_184.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_184 = _jspx_th_fmt_message_184.doStartTag();
    if (_jspx_th_fmt_message_184.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_184);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_184);
    return false;
  }

  private boolean _jspx_meth_fmt_message_185(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_185 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_185.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_185.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_185.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_185 = _jspx_th_fmt_message_185.doStartTag();
    if (_jspx_th_fmt_message_185.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_185);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_185);
    return false;
  }

  private boolean _jspx_meth_fmt_message_186(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_186 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_186.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_186.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_186.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_186 = _jspx_th_fmt_message_186.doStartTag();
    if (_jspx_th_fmt_message_186.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_186);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_186);
    return false;
  }

  private boolean _jspx_meth_fmt_message_187(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_187 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_187.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_187.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_187.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_187 = _jspx_th_fmt_message_187.doStartTag();
    if (_jspx_th_fmt_message_187.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_187);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_187);
    return false;
  }

  private boolean _jspx_meth_fmt_message_188(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_188 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_188.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_188.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_188.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_188 = _jspx_th_fmt_message_188.doStartTag();
    if (_jspx_th_fmt_message_188.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_188);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_188);
    return false;
  }

  private boolean _jspx_meth_fmt_message_189(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_189 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_189.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_189.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_189.setKey("pointEdit.detectors.invalidState");
    int _jspx_eval_fmt_message_189 = _jspx_th_fmt_message_189.doStartTag();
    if (_jspx_th_fmt_message_189.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_189);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_189);
    return false;
  }

  private boolean _jspx_meth_fmt_message_190(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_190 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_190.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_190.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_190.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_190 = _jspx_th_fmt_message_190.doStartTag();
    if (_jspx_th_fmt_message_190.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_190);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_190);
    return false;
  }

  private boolean _jspx_meth_fmt_message_191(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_191 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_191.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_191.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_191.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_191 = _jspx_th_fmt_message_191.doStartTag();
    if (_jspx_th_fmt_message_191.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_191);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_191);
    return false;
  }

  private boolean _jspx_meth_fmt_message_192(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_192 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_192.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_192.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_192.setKey("pointEdit.detectors.errorParsingLimit");
    int _jspx_eval_fmt_message_192 = _jspx_th_fmt_message_192.doStartTag();
    if (_jspx_th_fmt_message_192.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_192);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_192);
    return false;
  }

  private boolean _jspx_meth_fmt_message_193(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_193 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_193.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_193.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_193.setKey("pointEdit.detectors.errorParsingWeight");
    int _jspx_eval_fmt_message_193 = _jspx_th_fmt_message_193.doStartTag();
    if (_jspx_th_fmt_message_193.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_193);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_193);
    return false;
  }

  private boolean _jspx_meth_fmt_message_194(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_194 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_194.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_194.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_194.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_194 = _jspx_th_fmt_message_194.doStartTag();
    if (_jspx_th_fmt_message_194.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_194);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_194);
    return false;
  }

  private boolean _jspx_meth_fmt_message_195(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_195 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_195.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_195.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_195.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_195 = _jspx_th_fmt_message_195.doStartTag();
    if (_jspx_th_fmt_message_195.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_195);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_195);
    return false;
  }

  private boolean _jspx_meth_fmt_message_196(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_196 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_196.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_196.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_196.setKey("pointEdit.detectors.errorParsingLimit");
    int _jspx_eval_fmt_message_196 = _jspx_th_fmt_message_196.doStartTag();
    if (_jspx_th_fmt_message_196.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_196);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_196);
    return false;
  }

  private boolean _jspx_meth_fmt_message_197(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_197 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_197.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_197.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_197.setKey("pointEdit.detectors.errorParsingWeight");
    int _jspx_eval_fmt_message_197 = _jspx_th_fmt_message_197.doStartTag();
    if (_jspx_th_fmt_message_197.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_197);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_197);
    return false;
  }

  private boolean _jspx_meth_fmt_message_198(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_198 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_198.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_198.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_198.setKey("pointEdit.detectors.errorParsingDuration");
    int _jspx_eval_fmt_message_198 = _jspx_th_fmt_message_198.doStartTag();
    if (_jspx_th_fmt_message_198.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_198);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_198);
    return false;
  }

  private boolean _jspx_meth_fmt_message_199(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_199 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_199.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_199.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_199.setKey("pointEdit.detectors.invalidDuration");
    int _jspx_eval_fmt_message_199 = _jspx_th_fmt_message_199.doStartTag();
    if (_jspx_th_fmt_message_199.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_199);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_199);
    return false;
  }

  private boolean _jspx_meth_fmt_message_200(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_200 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_200.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_200.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_200.setKey("common.save");
    int _jspx_eval_fmt_message_200 = _jspx_th_fmt_message_200.doStartTag();
    if (_jspx_th_fmt_message_200.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_200);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_200);
    return false;
  }

  private boolean _jspx_meth_fmt_message_201(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_201 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_201.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_201.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_12);
    _jspx_th_fmt_message_201.setKey("pointEdit.buttons.disable");
    int _jspx_eval_fmt_message_201 = _jspx_th_fmt_message_201.doStartTag();
    if (_jspx_th_fmt_message_201.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_201);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_201);
    return false;
  }

  private boolean _jspx_meth_fmt_message_202(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_202 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_202.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_202.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_12);
    _jspx_th_fmt_message_202.setKey("pointEdit.buttons.restart");
    int _jspx_eval_fmt_message_202 = _jspx_th_fmt_message_202.doStartTag();
    if (_jspx_th_fmt_message_202.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_202);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_202);
    return false;
  }

  private boolean _jspx_meth_fmt_message_203(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_203 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_203.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_203.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_2);
    _jspx_th_fmt_message_203.setKey("pointEdit.buttons.enable");
    int _jspx_eval_fmt_message_203 = _jspx_th_fmt_message_203.doStartTag();
    if (_jspx_th_fmt_message_203.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_203);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_203);
    return false;
  }

  private boolean _jspx_meth_fmt_message_204(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_204 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_204.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_204.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_204.setKey("common.cancel");
    int _jspx_eval_fmt_message_204 = _jspx_th_fmt_message_204.doStartTag();
    if (_jspx_th_fmt_message_204.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_204);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_204);
    return false;
  }

  private boolean _jspx_meth_fmt_message_205(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_205 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_205.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_205.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
    _jspx_th_fmt_message_205.setKey("pointEdit.buttons.note");
    int _jspx_eval_fmt_message_205 = _jspx_th_fmt_message_205.doStartTag();
    if (_jspx_th_fmt_message_205.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_205);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_205);
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent(null);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userPoints}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("point");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("{id:");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${point.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(",name:\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sst:dquotEncode(point.extendedName)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0));
          out.write("\"},\r\n    ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private class dataPointEdit_jspHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public dataPointEdit_jspHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public void invoke0( JspWriter out ) 
      throws Throwable
    {
      out.write("\r\n  ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n<script type=\"text/javascript\">\r\n  var dataTypeId = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.pointLocator.dataTypeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(";\r\n</script>\r\n<script type=\"text/javascript\">\r\n  dojo.require(\"dojo.store.Memory\");\r\n  dojo.require(\"dijit.form.FilteringSelect\");\r\n  \r\n  dojo.ready(function() {\r\n      // Point lookup\r\n      new dijit.form.FilteringSelect({\r\n          store: new dojo.store.Memory({ data: pointList }),\r\n          autoComplete: false,\r\n          style: \"width: 250px;\",\r\n          queryExpr: \"*${0}*\",\r\n          highlightMatch: \"all\",\r\n          required: false,\r\n          onChange: function(point) {\r\n              if (this.item)\r\n                  window.location='data_point_edit.shtm?dpid='+ this.item.id;\r\n          }\r\n      }, \"picker\");        \r\n  });\r\n  \r\n  function doSave(taskName) {\r\n      $(\"taskName\").name = taskName;\r\n      textRendererEditor.save(doSaveChartRenderer);\r\n      return false;\r\n  }\r\n  function doSaveChartRenderer() {\r\n      chartRendererEditor.save(doSavePointEventDetectors);\r\n  }\r\n  function doSavePointEventDetectors() {\r\n      pointEventDetectorEditor.save(doSaveForm);\r\n  }\r\n  function doSaveForm() {\r\n      document.forms[0].submit();\r\n");
      out.write("  }\r\n</script>\r\n\r\n<table width=\"100%\">\r\n  <tr>\r\n    <td valign=\"top\">\r\n      <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\r\n        ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_0 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_0.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_0.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_0.setPath("form");
      int[] _jspx_push_body_count_spring_bind_0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_0 = _jspx_th_spring_bind_0.doStartTag();
        if (_jspx_eval_spring_bind_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n          ");
            if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_0, _jspx_page_context, _jspx_push_body_count_spring_bind_0))
              return;
            out.write("\r\n        ");
            int evalDoAfterBody = _jspx_th_spring_bind_0.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_0.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_0);
      }
      out.write("\r\n      </table>\r\n    </td>\r\n    <td valign=\"top\" align=\"right\">\r\n      ");
      if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(":&nbsp;\r\n      <div style=\"display:inline;\"><div id=\"picker\"></div></div>\r\n      \r\n      ");
      if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n      \r\n      ");
      if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n    </td>\r\n  </tr>\r\n</table>\r\n");
      out.write("\r\n  \r\n  <form action=\"\" method=\"post\">\r\n    <input type=\"hidden\" id=\"taskName\" name=\"asdf\" value=\"\"/>\r\n    <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\">\r\n      <tr>\r\n        <td valign=\"top\">\r\n          ");
      out.write("\r\n\r\n");
      out.write("\r\n\r\n\r\n<script type=\"text/javascript\">\r\n  dojo.ready(function() {\r\n      if (dataTypeId == ");
      out.print( DataTypes.NUMERIC );
      out.write(")\r\n          show(\"engineeringUnitsSection\");\r\n      else {\r\n          $(\"plotType\").disabled = true;\r\n          $set(\"plotType\", ");
      out.print( DataPointVO.PlotTypes.STEP );
      out.write(");\r\n      }\r\n  });\r\n</script>\r\n\r\n<div class=\"borderDiv marB marR\">\r\n  <table>\r\n    <tr>\r\n      <td colspan=\"3\">\r\n        <img src=\"images/icon_comp_edit.png\"/>\r\n        <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\r\n        ");
      if (_jspx_meth_tag_help_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        <a href=\"data_point_details.shtm?dpid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      if (_jspx_meth_tag_img_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</a>\r\n      </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      <td colspan=\"2\" class=\"formField\">\r\n        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n        <a href=\"data_source_edit.shtm?dsid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dataSource.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("&pid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write('"');
      out.write('>');
      if (_jspx_meth_tag_img_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</a>\r\n      </td>\r\n    </tr>\r\n      \r\n    ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_1 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_1.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_1.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_1.setPath("form.name");
      int[] _jspx_push_body_count_spring_bind_1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_1 = _jspx_th_spring_bind_1.doStartTag();
        if (_jspx_eval_spring_bind_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_1, _jspx_page_context, _jspx_push_body_count_spring_bind_1))
              return;
            out.write("</td>\r\n        <td class=\"formField\"><input type=\"text\" name=\"name\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"/></td>\r\n        <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n      </tr>\r\n    ");
            int evalDoAfterBody = _jspx_th_spring_bind_1.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_1.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_1);
      }
      out.write("\r\n    \r\n    ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_2 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_2.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_2.setPath("form.deviceName");
      int[] _jspx_push_body_count_spring_bind_2 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_2 = _jspx_th_spring_bind_2.doStartTag();
        if (_jspx_eval_spring_bind_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_2, _jspx_page_context, _jspx_push_body_count_spring_bind_2))
              return;
            out.write("</td>\r\n        <td class=\"formField\"><input type=\"text\" name=\"deviceName\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"/></td>\r\n        <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n      </tr>\r\n    ");
            int evalDoAfterBody = _jspx_th_spring_bind_2.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_2[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_2.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_2.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_2);
      }
      out.write("\r\n    \r\n    <tbody id=\"engineeringUnitsSection\" style=\"display:none;\">\r\n      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_3 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_3.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_3.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_3.setPath("form.engineeringUnits");
      int[] _jspx_push_body_count_spring_bind_3 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_3 = _jspx_th_spring_bind_3.doStartTag();
        if (_jspx_eval_spring_bind_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n        <tr>\r\n          <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_3, _jspx_page_context, _jspx_push_body_count_spring_bind_3))
              return;
            out.write("</td>\r\n          <td class=\"formField\">");
            if (_jspx_meth_tag_engineeringUnits_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_3, _jspx_page_context, _jspx_push_body_count_spring_bind_3))
              return;
            out.write("</td>\r\n          <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n        </tr>\r\n      ");
            int evalDoAfterBody = _jspx_th_spring_bind_3.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_3[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_3.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_3.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_3);
      }
      out.write("\r\n    </tbody>\r\n    \r\n    ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_4 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_4.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_4.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_4.setPath("form.chartColour");
      int[] _jspx_push_body_count_spring_bind_4 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_4 = _jspx_th_spring_bind_4.doStartTag();
        if (_jspx_eval_spring_bind_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_4, _jspx_page_context, _jspx_push_body_count_spring_bind_4))
              return;
            out.write("</td>\r\n        <td class=\"formField\"><input type=\"text\" name=\"chartColour\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\"/></td>\r\n        <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n      </tr>\r\n    ");
            int evalDoAfterBody = _jspx_th_spring_bind_4.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_4[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_4.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_4.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_4);
      }
      out.write("\r\n    \r\n    ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_5 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_5.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_5.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_5.setPath("form.plotType");
      int[] _jspx_push_body_count_spring_bind_5 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_5 = _jspx_th_spring_bind_5.doStartTag();
        if (_jspx_eval_spring_bind_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_5, _jspx_page_context, _jspx_push_body_count_spring_bind_5))
              return;
            out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
            //  sst:select
            com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_0 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_name_id.get(com.serotonin.web.taglib.SelectTag.class);
            _jspx_th_sst_select_0.setPageContext(_jspx_page_context);
            _jspx_th_sst_select_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_5);
            _jspx_th_sst_select_0.setId("plotType");
            _jspx_th_sst_select_0.setName("plotType");
            _jspx_th_sst_select_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.plotType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            int _jspx_eval_sst_select_0 = _jspx_th_sst_select_0.doStartTag();
            if (_jspx_eval_sst_select_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\r\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_0 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_0.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
                _jspx_th_sst_option_0.setValue( Integer.toString(DataPointVO.PlotTypes.STEP) );
                int _jspx_eval_sst_option_0 = _jspx_th_sst_option_0.doStartTag();
                if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_5[0]++;
                    _jspx_th_sst_option_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_0.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_0, _jspx_page_context, _jspx_push_body_count_spring_bind_5))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_5[0]--;
                }
                if (_jspx_th_sst_option_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_0);
                out.write("\r\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_1 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_1.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
                _jspx_th_sst_option_1.setValue( Integer.toString(DataPointVO.PlotTypes.LINE) );
                int _jspx_eval_sst_option_1 = _jspx_th_sst_option_1.doStartTag();
                if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_5[0]++;
                    _jspx_th_sst_option_1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_1.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_1, _jspx_page_context, _jspx_push_body_count_spring_bind_5))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_1.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_5[0]--;
                }
                if (_jspx_th_sst_option_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_1);
                out.write("\r\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_2 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_2.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_0);
                _jspx_th_sst_option_2.setValue( Integer.toString(DataPointVO.PlotTypes.SPLINE) );
                int _jspx_eval_sst_option_2 = _jspx_th_sst_option_2.doStartTag();
                if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_5[0]++;
                    _jspx_th_sst_option_2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_2.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_2, _jspx_page_context, _jspx_push_body_count_spring_bind_5))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_2.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_5[0]--;
                }
                if (_jspx_th_sst_option_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_2);
                out.write("\r\n          ");
                int evalDoAfterBody = _jspx_th_sst_select_0.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_sst_select_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_sst_select_value_name_id.reuse(_jspx_th_sst_select_0);
              throw new SkipPageException();
            }
            _jspx_tagPool_sst_select_value_name_id.reuse(_jspx_th_sst_select_0);
            out.write("\r\n        </td>\r\n        <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n      </tr>\r\n    ");
            int evalDoAfterBody = _jspx_th_spring_bind_5.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_5[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_5.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_5.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_5);
      }
      out.write("\r\n  </table>\r\n</div>");
      out.write("\r\n          ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n\r\n\r\n\r\n<script type=\"text/javascript\">\r\n  function changeLoggingType() {\r\n      var loggingType = $get(\"loggingType\");\r\n      var tolerance = $(\"tolerance\");\r\n      var purgeOverride = $(\"purgeOverride\");\r\n      var purgePeriod = $(\"purgePeriod\");\r\n      var purgeType = $(\"purgeType\");\r\n      \r\n      if ($(\"toleranceSection\") && loggingType == ");
      out.print( DataPointVO.LoggingTypes.ON_CHANGE );
      out.write(")\r\n          // On change logging for a numeric requires a tolerance setting.\r\n          tolerance.disabled = false;\r\n      else\r\n          tolerance.disabled = true;\r\n      \r\n      if (loggingType == ");
      out.print( DataPointVO.LoggingTypes.NONE );
      out.write(") {\r\n          purgeOverride.disabled = true;\r\n          purgePeriod.disabled = true;\r\n          purgeType.disabled = true;\r\n      }\r\n      else {\r\n          purgeOverride.disabled = false;\r\n          changePurgeOverride();\r\n      }\r\n      \r\n      if (loggingType == ");
      out.print( DataPointVO.LoggingTypes.INTERVAL );
      out.write(")\r\n          show(\"intervalLoggingSection\");\r\n      else\r\n          hide(\"intervalLoggingSection\");\r\n  }\r\n  \r\n  function changePurgeOverride() {\r\n      var purgePeriod = $(\"purgePeriod\");\r\n      var purgeType = $(\"purgeType\");\r\n      if ($get(\"purgeOverride\")) {\r\n          purgePeriod.disabled = false;\r\n          purgeType.disabled = false;\r\n      }\r\n      else {\r\n          purgePeriod.disabled = true;\r\n          purgeType.disabled = true;\r\n      }\r\n  }\r\n  \r\n  function changeDiscard() {\r\n      var discard = $get(\"discardExtremeValues\");\r\n      if (discard) {\r\n          $(\"discardLowLimit\").disabled = false;\r\n          $(\"discardHighLimit\").disabled = false;\r\n      }\r\n      else {\r\n          $(\"discardLowLimit\").disabled = true;\r\n          $(\"discardHighLimit\").disabled = true;\r\n      }\r\n  }\r\n  \r\n  function clearPointCache() {\r\n      setDisabled(\"clearCacheBtn\", true);\r\n      DataPointEditDwr.clearPointCache(function() {\r\n          setDisabled(\"clearCacheBtn\", false);\r\n      });\r\n  }\r\n  \r\n  dojo.ready(function() {\r\n");
      out.write("      if (dataTypeId == ");
      out.print( DataTypes.NUMERIC );
      out.write(") {\r\n          show(\"toleranceSection\");\r\n          show(\"discardSection\");\r\n      }\r\n      else {\r\n          $(\"intervalLoggingType\").disabled = true;\r\n          $set(\"intervalLoggingType\", ");
      out.print( DataPointVO.IntervalLoggingTypes.INSTANT );
      out.write(");\r\n      }\r\n      changeLoggingType();\r\n      changeDiscard();\r\n  });\r\n</script>\r\n\r\n<div class=\"borderDiv marB marR\">\r\n  <table>\r\n    <tr><td colspan=\"3\">\r\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\r\n      ");
      if (_jspx_meth_tag_help_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n    </td></tr>\r\n    \r\n    ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_6 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_6.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_6.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_6.setPath("form.loggingType");
      int[] _jspx_push_body_count_spring_bind_6 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_6 = _jspx_th_spring_bind_6.doStartTag();
        if (_jspx_eval_spring_bind_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_6, _jspx_page_context, _jspx_push_body_count_spring_bind_6))
              return;
            out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
            //  sst:select
            com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_1 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_onchange_name_id.get(com.serotonin.web.taglib.SelectTag.class);
            _jspx_th_sst_select_1.setPageContext(_jspx_page_context);
            _jspx_th_sst_select_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_6);
            _jspx_th_sst_select_1.setId("loggingType");
            _jspx_th_sst_select_1.setName("loggingType");
            _jspx_th_sst_select_1.setOnchange("changeLoggingType();");
            _jspx_th_sst_select_1.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            int _jspx_eval_sst_select_1 = _jspx_th_sst_select_1.doStartTag();
            if (_jspx_eval_sst_select_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\r\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_3 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_3.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
                _jspx_th_sst_option_3.setValue( Integer.toString(DataPointVO.LoggingTypes.ON_CHANGE) );
                int _jspx_eval_sst_option_3 = _jspx_th_sst_option_3.doStartTag();
                if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_6[0]++;
                    _jspx_th_sst_option_3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_3.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_3, _jspx_page_context, _jspx_push_body_count_spring_bind_6))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_3.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_6[0]--;
                }
                if (_jspx_th_sst_option_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_3);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_3);
                out.write("\r\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_4 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_4.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
                _jspx_th_sst_option_4.setValue( Integer.toString(DataPointVO.LoggingTypes.ALL) );
                int _jspx_eval_sst_option_4 = _jspx_th_sst_option_4.doStartTag();
                if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_6[0]++;
                    _jspx_th_sst_option_4.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_4.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_4, _jspx_page_context, _jspx_push_body_count_spring_bind_6))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_4.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_4 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_6[0]--;
                }
                if (_jspx_th_sst_option_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_4);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_4);
                out.write("\r\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_5 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_5.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
                _jspx_th_sst_option_5.setValue( Integer.toString(DataPointVO.LoggingTypes.NONE) );
                int _jspx_eval_sst_option_5 = _jspx_th_sst_option_5.doStartTag();
                if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_6[0]++;
                    _jspx_th_sst_option_5.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_5.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_5, _jspx_page_context, _jspx_push_body_count_spring_bind_6))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_5.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_5 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_6[0]--;
                }
                if (_jspx_th_sst_option_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_5);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_5);
                out.write("\r\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_6 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_6.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
                _jspx_th_sst_option_6.setValue( Integer.toString(DataPointVO.LoggingTypes.INTERVAL) );
                int _jspx_eval_sst_option_6 = _jspx_th_sst_option_6.doStartTag();
                if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_6[0]++;
                    _jspx_th_sst_option_6.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_6.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_6, _jspx_page_context, _jspx_push_body_count_spring_bind_6))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_6.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_6 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_6[0]--;
                }
                if (_jspx_th_sst_option_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_6);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_6);
                out.write("\r\n            ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_7 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_7.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_1);
                _jspx_th_sst_option_7.setValue( Integer.toString(DataPointVO.LoggingTypes.ON_TS_CHANGE) );
                int _jspx_eval_sst_option_7 = _jspx_th_sst_option_7.doStartTag();
                if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_6[0]++;
                    _jspx_th_sst_option_7.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_7.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_7, _jspx_page_context, _jspx_push_body_count_spring_bind_6))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_7.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_7 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_6[0]--;
                }
                if (_jspx_th_sst_option_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_7);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_7);
                out.write("\r\n          ");
                int evalDoAfterBody = _jspx_th_sst_select_1.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_sst_select_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_sst_select_value_onchange_name_id.reuse(_jspx_th_sst_select_1);
              throw new SkipPageException();
            }
            _jspx_tagPool_sst_select_value_onchange_name_id.reuse(_jspx_th_sst_select_1);
            out.write("\r\n        </td>\r\n        <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n      </tr>\r\n    ");
            int evalDoAfterBody = _jspx_th_spring_bind_6.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_6[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_6.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_6.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_6);
      }
      out.write("\r\n    \r\n    <tbody id=\"intervalLoggingSection\" style=\"display:none;\">\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_fmt_message_19((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(" <input type=\"text\" name=\"intervalLoggingPeriod\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.intervalLoggingPeriod}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formError\">\r\n          ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_7 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_7.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_7.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_7.setPath("form.intervalLoggingPeriodType");
      int[] _jspx_push_body_count_spring_bind_7 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_7 = _jspx_th_spring_bind_7.doStartTag();
        if (_jspx_eval_spring_bind_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n            ");
            if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_7, _jspx_page_context, _jspx_push_body_count_spring_bind_7))
              return;
            out.write("\r\n          ");
            int evalDoAfterBody = _jspx_th_spring_bind_7.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_7[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_7.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_7.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_7);
      }
      out.write("\r\n          ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_8 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_8.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_8.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_8.setPath("form.intervalLoggingPeriod");
      int[] _jspx_push_body_count_spring_bind_8 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_8 = _jspx_th_spring_bind_8.doStartTag();
        if (_jspx_eval_spring_bind_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            int evalDoAfterBody = _jspx_th_spring_bind_8.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_8[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_8.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_8.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_8);
      }
      out.write("\r\n        </td>\r\n      </tr>\r\n      \r\n      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_9 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_9.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_9.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_9.setPath("form.intervalLoggingType");
      int[] _jspx_push_body_count_spring_bind_9 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_9 = _jspx_th_spring_bind_9.doStartTag();
        if (_jspx_eval_spring_bind_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n        <tr>\r\n          <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_9, _jspx_page_context, _jspx_push_body_count_spring_bind_9))
              return;
            out.write("</td>\r\n          <td class=\"formField\">\r\n            ");
            //  sst:select
            com.serotonin.web.taglib.SelectTag _jspx_th_sst_select_2 = (com.serotonin.web.taglib.SelectTag) _jspx_tagPool_sst_select_value_name_id.get(com.serotonin.web.taglib.SelectTag.class);
            _jspx_th_sst_select_2.setPageContext(_jspx_page_context);
            _jspx_th_sst_select_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_bind_9);
            _jspx_th_sst_select_2.setId("intervalLoggingType");
            _jspx_th_sst_select_2.setName("intervalLoggingType");
            _jspx_th_sst_select_2.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.intervalLoggingType}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            int _jspx_eval_sst_select_2 = _jspx_th_sst_select_2.doStartTag();
            if (_jspx_eval_sst_select_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
              do {
                out.write("\r\n              ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_8 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_8.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_2);
                _jspx_th_sst_option_8.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.INSTANT) );
                int _jspx_eval_sst_option_8 = _jspx_th_sst_option_8.doStartTag();
                if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_9[0]++;
                    _jspx_th_sst_option_8.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_8.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_8, _jspx_page_context, _jspx_push_body_count_spring_bind_9))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_8.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_8 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_9[0]--;
                }
                if (_jspx_th_sst_option_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_8);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_8);
                out.write("\r\n              ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_9 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_9.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_2);
                _jspx_th_sst_option_9.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.MAXIMUM) );
                int _jspx_eval_sst_option_9 = _jspx_th_sst_option_9.doStartTag();
                if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_9[0]++;
                    _jspx_th_sst_option_9.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_9.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_9, _jspx_page_context, _jspx_push_body_count_spring_bind_9))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_9.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_9 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_9[0]--;
                }
                if (_jspx_th_sst_option_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_9);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_9);
                out.write("\r\n              ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_10 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_10.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_2);
                _jspx_th_sst_option_10.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.MINIMUM) );
                int _jspx_eval_sst_option_10 = _jspx_th_sst_option_10.doStartTag();
                if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_9[0]++;
                    _jspx_th_sst_option_10.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_10.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_10, _jspx_page_context, _jspx_push_body_count_spring_bind_9))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_10.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_10 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_9[0]--;
                }
                if (_jspx_th_sst_option_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_10);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_10);
                out.write("\r\n              ");
                //  sst:option
                com.serotonin.web.taglib.OptionTag _jspx_th_sst_option_11 = (com.serotonin.web.taglib.OptionTag) _jspx_tagPool_sst_option_value.get(com.serotonin.web.taglib.OptionTag.class);
                _jspx_th_sst_option_11.setPageContext(_jspx_page_context);
                _jspx_th_sst_option_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_sst_select_2);
                _jspx_th_sst_option_11.setValue( Integer.toString(DataPointVO.IntervalLoggingTypes.AVERAGE) );
                int _jspx_eval_sst_option_11 = _jspx_th_sst_option_11.doStartTag();
                if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
                    out = _jspx_page_context.pushBody();
                    _jspx_push_body_count_spring_bind_9[0]++;
                    _jspx_th_sst_option_11.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
                    _jspx_th_sst_option_11.doInitBody();
                  }
                  do {
                    if (_jspx_meth_fmt_message_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_sst_option_11, _jspx_page_context, _jspx_push_body_count_spring_bind_9))
                      return;
                    int evalDoAfterBody = _jspx_th_sst_option_11.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                  if (_jspx_eval_sst_option_11 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
                    out = _jspx_page_context.popBody();
                    _jspx_push_body_count_spring_bind_9[0]--;
                }
                if (_jspx_th_sst_option_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_11);
                  throw new SkipPageException();
                }
                _jspx_tagPool_sst_option_value.reuse(_jspx_th_sst_option_11);
                out.write("\r\n            ");
                int evalDoAfterBody = _jspx_th_sst_select_2.doAfterBody();
                if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                  break;
              } while (true);
            }
            if (_jspx_th_sst_select_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
              _jspx_tagPool_sst_select_value_name_id.reuse(_jspx_th_sst_select_2);
              throw new SkipPageException();
            }
            _jspx_tagPool_sst_select_value_name_id.reuse(_jspx_th_sst_select_2);
            out.write("\r\n          </td>\r\n          <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n        </tr>\r\n      ");
            int evalDoAfterBody = _jspx_th_spring_bind_9.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_9[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_9.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_9.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_9);
      }
      out.write("\r\n    </tbody>\r\n    \r\n    <tbody id=\"toleranceSection\" style=\"display:none;\">\r\n      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_10 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_10.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_10.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_10.setPath("form.tolerance");
      int[] _jspx_push_body_count_spring_bind_10 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_10 = _jspx_th_spring_bind_10.doStartTag();
        if (_jspx_eval_spring_bind_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n        <tr>\r\n          <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_10, _jspx_page_context, _jspx_push_body_count_spring_bind_10))
              return;
            out.write("</td>\r\n          <td class=\"formField\">\r\n            <input id=\"tolerance\" type=\"text\" name=\"tolerance\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"formShort\"/>\r\n          </td>\r\n          <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n        </tr>\r\n      ");
            int evalDoAfterBody = _jspx_th_spring_bind_10.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_10[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_10.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_10.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_10);
      }
      out.write("\r\n    </tbody>\r\n      \r\n    <tbody id=\"discardSection\" style=\"display:none;\">\r\n      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_11 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_11.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_11.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_11.setPath("form.discardExtremeValues");
      int[] _jspx_push_body_count_spring_bind_11 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_11 = _jspx_th_spring_bind_11.doStartTag();
        if (_jspx_eval_spring_bind_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n        <tr>\r\n          <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_11, _jspx_page_context, _jspx_push_body_count_spring_bind_11))
              return;
            out.write("</td>\r\n          <td class=\"formField\">\r\n            ");
            if (_jspx_meth_sst_checkbox_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_11, _jspx_page_context, _jspx_push_body_count_spring_bind_11))
              return;
            out.write("\r\n          </td>\r\n          <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n        </tr>\r\n      ");
            int evalDoAfterBody = _jspx_th_spring_bind_11.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_11[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_11.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_11.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_11);
      }
      out.write("\r\n      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_12 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_12.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_12.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_12.setPath("form.discardLowLimit");
      int[] _jspx_push_body_count_spring_bind_12 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_12 = _jspx_th_spring_bind_12.doStartTag();
        if (_jspx_eval_spring_bind_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n        <tr>\r\n          <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_12, _jspx_page_context, _jspx_push_body_count_spring_bind_12))
              return;
            out.write("</td>\r\n          <td class=\"formField\">\r\n            <input id=\"discardLowLimit\" type=\"text\" name=\"discardLowLimit\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"formShort\"/>\r\n          </td>\r\n          <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n        </tr>\r\n      ");
            int evalDoAfterBody = _jspx_th_spring_bind_12.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_12[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_12.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_12.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_12);
      }
      out.write("\r\n      ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_13 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_13.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_13.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_13.setPath("form.discardHighLimit");
      int[] _jspx_push_body_count_spring_bind_13 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_13 = _jspx_th_spring_bind_13.doStartTag();
        if (_jspx_eval_spring_bind_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n        <tr>\r\n          <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_28((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_13, _jspx_page_context, _jspx_push_body_count_spring_bind_13))
              return;
            out.write("</td>\r\n          <td class=\"formField\">\r\n            <input id=\"discardHighLimit\" type=\"text\" name=\"discardHighLimit\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"formShort\"/>\r\n          </td>\r\n          <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n        </tr>\r\n      ");
            int evalDoAfterBody = _jspx_th_spring_bind_13.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_13[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_13.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_13.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_13);
      }
      out.write("\r\n    </tbody>\r\n      \r\n    <tr>\r\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_29((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      <td class=\"formField\">\r\n        <div>\r\n          ");
      if (_jspx_meth_sst_checkbox_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          <label for=\"purgeOverride\">");
      if (_jspx_meth_fmt_message_30((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</label>\r\n        </div>\r\n        <div>\r\n          ");
      if (_jspx_meth_fmt_message_31((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(" <input id=\"purgePeriod\" type=\"text\" name=\"purgePeriod\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.purgePeriod}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </div>\r\n      </td>\r\n      <td class=\"formError\">\r\n        ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_14 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_14.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_14.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_14.setPath("form.purgeType");
      int[] _jspx_push_body_count_spring_bind_14 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_14 = _jspx_th_spring_bind_14.doStartTag();
        if (_jspx_eval_spring_bind_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n          ");
            if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_14, _jspx_page_context, _jspx_push_body_count_spring_bind_14))
              return;
            out.write("\r\n        ");
            int evalDoAfterBody = _jspx_th_spring_bind_14.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_14[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_14.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_14.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_14);
      }
      out.write("\r\n        ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_15 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_15.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_15.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_15.setPath("form.purgePeriod");
      int[] _jspx_push_body_count_spring_bind_15 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_15 = _jspx_th_spring_bind_15.doStartTag();
        if (_jspx_eval_spring_bind_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            int evalDoAfterBody = _jspx_th_spring_bind_15.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_15[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_15.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_15.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_15);
      }
      out.write("\r\n      </td>\r\n    </tr>\r\n      \r\n    ");
      //  spring:bind
      org.springframework.web.servlet.tags.BindTag _jspx_th_spring_bind_16 = (org.springframework.web.servlet.tags.BindTag) _jspx_tagPool_spring_bind_path.get(org.springframework.web.servlet.tags.BindTag.class);
      _jspx_th_spring_bind_16.setPageContext(_jspx_page_context);
      _jspx_th_spring_bind_16.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      _jspx_th_spring_bind_16.setPath("form.defaultCacheSize");
      int[] _jspx_push_body_count_spring_bind_16 = new int[] { 0 };
      try {
        int _jspx_eval_spring_bind_16 = _jspx_th_spring_bind_16.doStartTag();
        if (_jspx_eval_spring_bind_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          org.springframework.web.servlet.support.BindStatus status = null;
          status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
          do {
            out.write("\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
            if (_jspx_meth_fmt_message_32((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_16, _jspx_page_context, _jspx_push_body_count_spring_bind_16))
              return;
            out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"defaultCacheSize\" type=\"text\" name=\"defaultCacheSize\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.value}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" class=\"formShort\"/>\r\n          <input id=\"clearCacheBtn\" type=\"button\" value=\"");
            if (_jspx_meth_fmt_message_33((javax.servlet.jsp.tagext.JspTag) _jspx_th_spring_bind_16, _jspx_page_context, _jspx_push_body_count_spring_bind_16))
              return;
            out.write("\" onclick=\"clearPointCache();\"/>\r\n        </td>\r\n        <td class=\"formError\">");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status.errorMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n      </tr>\r\n    ");
            int evalDoAfterBody = _jspx_th_spring_bind_16.doAfterBody();
            status = (org.springframework.web.servlet.support.BindStatus) _jspx_page_context.findAttribute("status");
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_bind_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          throw new SkipPageException();
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_bind_16[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_bind_16.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_bind_16.doFinally();
        _jspx_tagPool_spring_bind_path.reuse(_jspx_th_spring_bind_16);
      }
      out.write("\r\n  </table>\r\n</div>");
      out.write("\r\n          ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n\r\n<script type=\"text/javascript\">\r\n  function purgeNowAllChanged() {\r\n      var all = $get(\"purgeNowAll\");\r\n      setDisabled(\"purgeNowPeriod\", all);\r\n      setDisabled(\"purgeNowType\", all);\r\n  }\r\n  \r\n  function purgeNow() {\r\n      var all = $get(\"purgeNowAll\");\r\n      if (all && !confirm(\"");
      if (_jspx_meth_fmt_message_34((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\"))\r\n          return;\r\n  \r\n      setDisabled(\"purgeNowBtn\", true);\r\n      show(\"purgeNowWarn\");\r\n      startImageFader(\"purgeNowImg\");\r\n      DataPointEditDwr.purgeNow($get(\"purgeNowType\"), $get(\"purgeNowPeriod\"), all, purgeNowCB);\r\n  }\r\n  \r\n  function purgeNowCB(result) {\r\n      setDisabled(\"purgeNowBtn\", false);\r\n      stopImageFader(\"purgeNowImg\");\r\n      hide(\"purgeNowWarn\");\r\n      alert(\"\"+ result +\" ");
      if (_jspx_meth_fmt_message_35((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n  }\r\n</script>\r\n\r\n<div class=\"borderDiv marB marR\">\r\n  <table>\r\n    <tr><td colspan=\"3\">\r\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_36((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\r\n      ");
      if (_jspx_meth_tag_help_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n    </td></tr>\r\n    \r\n    <tr>\r\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_37((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      <td class=\"formField\">\r\n        <input id=\"purgeNowPeriod\" type=\"text\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.purgePeriod}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" class=\"formShort\"/>\r\n        ");
      if (_jspx_meth_tag_timePeriods_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n      </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_38((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      <td class=\"formField\">\r\n        <input type=\"checkbox\" id=\"purgeNowAll\" onclick=\"purgeNowAllChanged()\">\r\n        <label for=\"purgeNowAll\">");
      if (_jspx_meth_fmt_message_39((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</label>\r\n      </td>\r\n    </tr>\r\n    \r\n    <tr>\r\n      <td colspan=\"2\" align=\"center\">\r\n        <input id=\"purgeNowBtn\" type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_40((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\" onclick=\"purgeNow();\"/>\r\n      </td>\r\n    </tr>\r\n    \r\n    <tbody id=\"purgeNowWarn\" style=\"display:none\">\r\n      <tr>\r\n        <td colspan=\"2\" align=\"center\" class=\"formError\">\r\n          <img id=\"purgeNowImg\" src=\"images/warn.png\"/>\r\n          ");
      if (_jspx_meth_fmt_message_41((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n    </tbody>\r\n  </table>\r\n</div>");
      out.write("\r\n          ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n<div class=\"borderDiv marB marR\">\r\n  <table>\r\n    <tr><td colspan=\"3\">\r\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_42((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\r\n      ");
      if (_jspx_meth_tag_help_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n    </td></tr>\r\n    \r\n    <tr>\r\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_43((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      <td class=\"formField\">\r\n        ");
      if (_jspx_meth_sst_select_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n      </td>\r\n    </tr>\r\n    \r\n    <tbody id=\"textRendererAnalog\" style=\"display:none;\">\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_45((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"textRendererAnalogFormat\" type=\"text\"/>\r\n          ");
      if (_jspx_meth_tag_help_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_46((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"textRendererAnalogSuffix\" type=\"text\"/></td>\r\n      </tr>\r\n    </tbody>\r\n    <tbody id=\"textRendererBinary\" style=\"display:none;\">\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_47((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <table cellspacing=\"0\" cellpadding=\"0\">\r\n            <tr>\r\n              <td valign=\"top\"><input id=\"textRendererBinaryZero\" type=\"text\"/></td>\r\n              <td width=\"10\"></td>\r\n              <td valign=\"top\" align=\"center\">\r\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"textRendererBinaryZeroColour\"></div>\r\n                <a href=\"#\" onclick=\"textRendererEditor.handlerBinaryZeroColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_48((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(")</a>\r\n              </td>\r\n            </tr>\r\n          </table>\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_49((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <table cellspacing=\"0\" cellpadding=\"0\">\r\n            <tr>\r\n              <td valign=\"top\"><input id=\"textRendererBinaryOne\" type=\"text\"/></td>\r\n              <td width=\"10\"></td>\r\n              <td valign=\"top\" align=\"center\">\r\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"textRendererBinaryOneColour\"></div>\r\n                <a href=\"#\" onclick=\"textRendererEditor.handlerBinaryOneColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_50((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(")</a>\r\n              </td>\r\n            </tr>\r\n          </table>\r\n        </td>\r\n      </tr>\r\n    </tbody>\r\n    <tbody id=\"textRendererMultistate\" style=\"display:none;\">\r\n      <tr>\r\n        <td colspan=\"2\">\r\n          <table>\r\n            <tr>\r\n              <th>");
      if (_jspx_meth_fmt_message_51((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\r\n              <th>");
      if (_jspx_meth_fmt_message_52((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\r\n              <th>");
      if (_jspx_meth_fmt_message_53((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\r\n              <td></td>\r\n            </tr>\r\n            <tr>\r\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererMultistateKey\" value=\"\" class=\"formVeryShort\"/></td>\r\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererMultistateText\" value=\"\" class=\"formShort\"/></td>\r\n              <td valign=\"top\" align=\"center\">\r\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"textRendererMultistateColour\"></div>\r\n                <a href=\"#\" onclick=\"textRendererEditor.handlerMultistateColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_54((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(")</a>\r\n              </td>\r\n              <td valign=\"top\">\r\n                ");
      if (_jspx_meth_tag_img_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n              </td>\r\n            </tr>\r\n            <tbody id=\"textRendererMultistateTable\"></tbody>\r\n          </table>\r\n        </td>\r\n      </tr>\r\n    </tbody>\r\n    <tbody id=\"textRendererNone\" style=\"display:none;\">\r\n    </tbody>\r\n    <tbody id=\"textRendererPlain\" style=\"display:none;\">\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_55((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"textRendererPlainSuffix\" type=\"text\"/></td>\r\n      </tr>\r\n    </tbody>\r\n    <tbody id=\"textRendererRange\" style=\"display:none;\">\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_56((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"textRendererRangeFormat\" type=\"text\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td colspan=\"2\">\r\n          <table>\r\n            <tr>\r\n              <th>");
      if (_jspx_meth_fmt_message_57((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\r\n              <th>");
      if (_jspx_meth_fmt_message_58((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\r\n              <th>");
      if (_jspx_meth_fmt_message_59((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\r\n              <th>");
      if (_jspx_meth_fmt_message_60((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</th>\r\n              <td></td>\r\n            </tr>\r\n            <tr>\r\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererRangeFrom\" value=\"\" class=\"formVeryShort\"/></td>\r\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererRangeTo\" value=\"\" class=\"formVeryShort\"/></td>\r\n              <td valign=\"top\"><input type=\"text\" id=\"textRendererRangeText\" value=\"\"/></td>\r\n              <td valign=\"top\" align=\"center\">\r\n                <div dojoType=\"dijit.ColorPalette\" palette=\"3x4\" id=\"textRendererRangeColour\"></div>\r\n                <a href=\"#\" onclick=\"textRendererEditor.handlerRangeColour(null); return false;\">(");
      if (_jspx_meth_fmt_message_61((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(")</a>\r\n              </td>\r\n              <td valign=\"top\">\r\n                ");
      if (_jspx_meth_tag_img_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n              </td>\r\n            </tr>\r\n            <tbody id=\"textRendererRangeTable\"></tbody>\r\n          </table>\r\n        </td>\r\n      </tr>\r\n    </tbody>\r\n    <tbody id=\"textRendererTime\" style=\"display:none;\">\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_62((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"textRendererTimeFormat\" type=\"text\"/>\r\n          ");
      if (_jspx_meth_tag_help_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_63((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"textRendererTimeConversionExponent\" type=\"text\"/></td>\r\n      </tr>\r\n    </tbody>\r\n  </table>\r\n</div>\r\n\r\n<script type=\"text/javascript\">\r\n  dojo.require(\"dijit.ColorPalette\");\r\n  \r\n  function TextRendererEditor() {\r\n      var currentTextRenderer;\r\n      var multistateValues = new Array();\r\n      var rangeValues = new Array();\r\n      \r\n      this.init = function() {\r\n          // Colour handler events\r\n          dijit.byId(\"textRendererRangeColour\").onChange = this.handlerRangeColour;\r\n          dijit.byId(\"textRendererMultistateColour\").onChange = this.handlerMultistateColour;\r\n          dijit.byId(\"textRendererBinaryZeroColour\").onChange = this.handlerBinaryZeroColour;\r\n          dijit.byId(\"textRendererBinaryOneColour\").onChange = this.handlerBinaryOneColour;\r\n          \r\n          // Figure out which fields to populate with data.\r\n          ");
      if (_jspx_meth_c_choose_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          \r\n          textRendererEditor.change();\r\n      }\r\n  \r\n      this.change = function() {\r\n          if (currentTextRenderer)\r\n              hide($(currentTextRenderer));\r\n          currentTextRenderer = $(\"textRendererSelect\").value\r\n          show($(currentTextRenderer));\r\n      };\r\n      \r\n      this.save = function(callback) {\r\n          var typeName = $get(\"textRendererSelect\");\r\n          if (typeName == \"textRendererAnalog\")\r\n              DataPointEditDwr.setAnalogTextRenderer($get(\"textRendererAnalogFormat\"),\r\n                      $get(\"textRendererAnalogSuffix\"), callback);\r\n          else if (typeName == \"textRendererBinary\")\r\n              DataPointEditDwr.setBinaryTextRenderer($get(\"textRendererBinaryZero\"), \r\n                      dijit.byId(\"textRendererBinaryZeroColour\").selectedColour, $get(\"textRendererBinaryOne\"),\r\n                      dijit.byId(\"textRendererBinaryOneColour\").selectedColour, callback);\r\n          else if (typeName == \"textRendererMultistate\")\r\n              DataPointEditDwr.setMultistateRenderer(multistateValues, callback);\r\n");
      out.write("          else if (typeName == \"textRendererNone\")\r\n              DataPointEditDwr.setNoneRenderer(callback);\r\n          else if (typeName == \"textRendererPlain\")\r\n              DataPointEditDwr.setPlainRenderer($get(\"textRendererPlainSuffix\"), callback);\r\n          else if (typeName == \"textRendererRange\")\r\n              DataPointEditDwr.setRangeRenderer($get(\"textRendererRangeFormat\"), rangeValues, callback);\r\n          else if (typeName == \"textRendererTime\")\r\n              DataPointEditDwr.setTimeTextRenderer($get(\"textRendererTimeFormat\"),\r\n                      $get(\"textRendererTimeConversionExponent\"), callback);\r\n          else\r\n              callback();\r\n      };\r\n      \r\n      //\r\n      // List objects\r\n      this.MultistateValue = function() {\r\n          this.key;\r\n          this.text;\r\n          this.colour;\r\n      };\r\n      \r\n      this.RangeValue = function() {\r\n          this.from;\r\n          this.to;\r\n          this.text;\r\n          this.colour;\r\n      };\r\n      \r\n      //\r\n      // Multistate list manipulation\r\n");
      out.write("      this.addMultistateValue = function(theKey, text, colour) {\r\n          if (!theKey)\r\n              theKey = $get(\"textRendererMultistateKey\");\r\n          var theNumericKey = parseInt(theKey);\r\n          if (isNaN(theNumericKey)) {\r\n              alert(\"");
      if (_jspx_meth_fmt_message_64((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              return false;\r\n          }\r\n          for (var i=multistateValues.length-1; i>=0; i--) {\r\n              if (multistateValues[i].key == theNumericKey) {\r\n                  alert(\"");
      if (_jspx_meth_fmt_message_65((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(" \"+ theNumericKey);\r\n                  return false;\r\n              }\r\n          }\r\n          \r\n          var theValue = new this.MultistateValue();\r\n          theValue.key = theNumericKey;\r\n          if (text)\r\n              theValue.text = text;\r\n          else\r\n              theValue.text = $get(\"textRendererMultistateText\");\r\n          if (colour)\r\n              theValue.colour = colour;\r\n          else\r\n              theValue.colour = dijit.byId(\"textRendererMultistateColour\").selectedColour;\r\n          multistateValues[multistateValues.length] = theValue;\r\n          this.sortMultistateValues();\r\n          this.refreshMultistateList();\r\n          $set(\"textRendererMultistateKey\", theNumericKey+1);\r\n          \r\n          return false;\r\n      };\r\n      \r\n      this.removeMultistateValue = function(theValue) {\r\n          for (var i=multistateValues.length-1; i>=0; i--) {\r\n              if (multistateValues[i].key == theValue)\r\n                  multistateValues.splice(i, 1);\r\n          }\r\n          this.refreshMultistateList();\r\n");
      out.write("          return false;\r\n      };\r\n      \r\n      this.sortMultistateValues = function() {\r\n          multistateValues.sort( function(a,b) { return a.key-b.key; } );\r\n      };\r\n      \r\n      this.refreshMultistateList = function() {\r\n          dwr.util.removeAllRows(\"textRendererMultistateTable\");\r\n          dwr.util.addRows(\"textRendererMultistateTable\", multistateValues, [\r\n                  function(data) { return data.key; },\r\n                  function(data) { \r\n                      if (data.colour)\r\n                          return \"<span style='color:\"+ data.colour +\"'>\"+ data.text +\"</span>\";\r\n                      return data.text;\r\n                  },\r\n                  function(data) {\r\n                      return \"<a href='#' onclick='return textRendererEditor.removeMultistateValue(\"+ data.key +\r\n                             \");'><img src='images/bullet_delete.png' width='16' height='16' \"+\r\n                             \"title='");
      if (_jspx_meth_fmt_message_66((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("'/><\\/a>\";\r\n                  }\r\n                  ], null);\r\n      };\r\n      \r\n      //\r\n      // Range list manipulation\r\n      this.addRangeValue = function(theFrom, theTo, text, colour) {\r\n          if (!theFrom)\r\n              theFrom = parseFloat($get(\"textRendererRangeFrom\"));\r\n          if (isNaN(theFrom)) {\r\n              alert(\"");
      if (_jspx_meth_fmt_message_67((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              return false;\r\n          }\r\n          \r\n          if (!theTo)\r\n              theTo = parseFloat($get(\"textRendererRangeTo\"));\r\n          if (isNaN(theTo)) {\r\n              alert(\"");
      if (_jspx_meth_fmt_message_68((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              return false;\r\n          }\r\n          \r\n          if (isNaN(theTo >= theFrom)) {\r\n              alert(\"");
      if (_jspx_meth_fmt_message_69((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              return false;\r\n          }\r\n          \r\n          for (var i=0; i<rangeValues.length; i++) {\r\n              if (rangeValues[i].from == theFrom && rangeValues[i].to == theTo) {\r\n                  alert(\"");
      if (_jspx_meth_fmt_message_70((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write(" \"+ theFrom +\" - \"+ theTo);\r\n                  return false;\r\n              }\r\n          }\r\n          \r\n          var theValue = new this.RangeValue();\r\n          theValue.from = theFrom;\r\n          theValue.to = theTo;\r\n          if (text)\r\n              theValue.text = text;\r\n          else\r\n              theValue.text = $get(\"textRendererRangeText\");\r\n          if (colour)\r\n              theValue.colour = colour;\r\n          else\r\n              theValue.colour = dijit.byId(\"textRendererRangeColour\").selectedColour;\r\n          rangeValues[rangeValues.length] = theValue;\r\n          this.sortRangeValues();\r\n          this.refreshRangeList();\r\n          $set(\"textRendererRangeFrom\", theTo);\r\n          $set(\"textRendererRangeTo\", theTo + (theTo - theFrom));\r\n          return false;\r\n      };\r\n      \r\n      this.removeRangeValue = function(theFrom, theTo) {\r\n          for (var i=rangeValues.length-1; i>=0; i--) {\r\n              if (rangeValues[i].from == theFrom && rangeValues[i].to == theTo)\r\n                  rangeValues.splice(i, 1);\r\n");
      out.write("          }\r\n          this.refreshRangeList();\r\n          return false;\r\n      };\r\n      \r\n      this.sortRangeValues = function() {\r\n          rangeValues.sort( function(a,b) {\r\n              if (a.from == b.from)\r\n                  return a.to-b.to;\r\n              return a.from-b.from;\r\n          });\r\n      };\r\n      \r\n      this.refreshRangeList = function() {\r\n          dwr.util.removeAllRows(\"textRendererRangeTable\");\r\n          dwr.util.addRows(\"textRendererRangeTable\", rangeValues, [\r\n                  function(data) { return data.from; },\r\n                  function(data) { return data.to; },\r\n                  function(data) { \r\n                      if (data.colour)\r\n                          return \"<span style='color:\"+ data.colour +\"'>\"+ data.text +\"</span>\";\r\n                      return data.text;\r\n                  },\r\n                  function(data) {\r\n                      return \"<a href='#' onclick='return textRendererEditor.removeRangeValue(\"+\r\n                             data.from +\",\"+ data.to +\");'><img src='images/bullet_delete.png' width='16' \"+\r\n");
      out.write("                             \"height='16' title='");
      if (_jspx_meth_fmt_message_71((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("'/><\\/a>\";\r\n                  }\r\n                  ], null);\r\n      };\r\n      \r\n      //\r\n      // Color handling\r\n      this.handlerRangeColour = function(colour) {\r\n          dijit.byId(\"textRendererRangeColour\").selectedColour = colour;\r\n          $(\"textRendererRangeText\").style.color = colour;\r\n      };\r\n      this.handlerMultistateColour = function(colour) {\r\n          dijit.byId(\"textRendererMultistateColour\").selectedColour = colour;\r\n          $(\"textRendererMultistateText\").style.color = colour;\r\n      };\r\n      this.handlerBinaryZeroColour = function(colour) {\r\n          dijit.byId(\"textRendererBinaryZeroColour\").selectedColour = colour;\r\n          $(\"textRendererBinaryZero\").style.color = colour;\r\n      };\r\n      this.handlerBinaryOneColour = function(colour) {\r\n          dijit.byId(\"textRendererBinaryOneColour\").selectedColour = colour;\r\n          $(\"textRendererBinaryOne\").style.color = colour;\r\n      };\r\n  }\r\n  var textRendererEditor = new TextRendererEditor();\r\n  dojo.ready(textRendererEditor, \"init\");\r\n");
      out.write("</script>");
      out.write("\r\n          ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n<div class=\"borderDiv marB marR\">\r\n  <table>\r\n    <tr><td colspan=\"3\">\r\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_72((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\r\n      ");
      if (_jspx_meth_tag_help_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n    </td></tr>\r\n    \r\n    <tr>\r\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_73((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      <td class=\"formField\">\r\n        ");
      if (_jspx_meth_sst_select_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n      </td>\r\n    </tr>\r\n    \r\n    <tbody id=\"chartRendererNone\" style=\"display:none;\"></tbody>\r\n    <tbody id=\"chartRendererTable\" style=\"display:none;\">\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_75((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"chartRendererTableLimit\" type=\"text\" class=\"formShort\"/></td>\r\n      </tr>\r\n    </tbody>\r\n    <tbody id=\"chartRendererImage\" style=\"display:none;\">\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_76((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"chartRendererImageNumberOfPeriods\" type=\"text\" class=\"formVeryShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n    </tbody>\r\n    <tbody id=\"chartRendererStats\" style=\"display:none;\">\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_77((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"chartRendererStatsNumberOfPeriods\" type=\"text\" class=\"formVeryShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_78((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"chartRendererStatsIncludeSum\" type=\"checkbox\"/></td>\r\n      </tr>\r\n    </tbody>\r\n    <tbody id=\"chartRendererImageFlipbook\" style=\"display:none;\">\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_79((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"chartRendererImageFlipbookLimit\" type=\"text\" class=\"formShort\"/></td>\r\n      </tr>\r\n    </tbody>\r\n    \r\n    <tr>\r\n      <td colspan=\"2\">");
      if (_jspx_meth_fmt_message_80((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n    </tr>\r\n  </table>\r\n</div>\r\n\r\n<script type=\"text/javascript\">\r\n  function ChartRendererEditor() {\r\n      var currentChartRenderer;\r\n      \r\n      this.init = function() {\r\n          // Figure out which fields to populate with data.\r\n          \r\n          ");
      if (_jspx_meth_c_choose_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          \r\n          chartRendererEditor.change();\r\n      };\r\n  \r\n      this.change = function() {\r\n          if (currentChartRenderer)\r\n              hide(currentChartRenderer);\r\n          currentChartRenderer = $(\"chartRendererSelect\").value\r\n          show(currentChartRenderer);\r\n      };\r\n      \r\n      this.save = function(callback) {\r\n          var typeName = $get(\"chartRendererSelect\");\r\n          if (typeName == \"chartRendererNone\")\r\n              DataPointEditDwr.setNoneChartRenderer(callback);\r\n          else if (typeName == \"chartRendererTable\") {\r\n              var limit = parseInt($get(\"chartRendererTableLimit\"));\r\n              if (isNaN(limit))\r\n                  alert(\"");
      if (_jspx_meth_fmt_message_81((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              else if (limit < 2 || limit > 50)\r\n                  alert(\"");
      if (_jspx_meth_fmt_message_82((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              else\r\n                  DataPointEditDwr.setTableChartRenderer(limit, callback);\r\n          }\r\n          else if (typeName == \"chartRendererImage\") {\r\n              var numberOfPeriods = parseInt($get(\"chartRendererImageNumberOfPeriods\"));\r\n              if (isNaN(numberOfPeriods))\r\n                  alert(\"");
      if (_jspx_meth_fmt_message_83((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              else if (numberOfPeriods < 1)\r\n                  alert(\"");
      if (_jspx_meth_fmt_message_84((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              else\r\n                  DataPointEditDwr.setImageChartRenderer($get(\"chartRendererImageTimePeriod\"),\r\n                          numberOfPeriods, callback);\r\n          }\r\n          else if (typeName == \"chartRendererStats\") {\r\n              var numberOfPeriods = parseInt($get(\"chartRendererStatsNumberOfPeriods\"));\r\n              if (isNaN(numberOfPeriods))\r\n                  alert(\"");
      if (_jspx_meth_fmt_message_85((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              else if (numberOfPeriods < 1)\r\n                  alert(\"");
      if (_jspx_meth_fmt_message_86((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              else\r\n                  DataPointEditDwr.setStatisticsChartRenderer($get(\"chartRendererStatsTimePeriod\"), \r\n                          numberOfPeriods, $get(\"chartRendererStatsIncludeSum\"), callback);\r\n          }\r\n          else if (typeName == \"chartRendererImageFlipbook\") {\r\n              var limit = parseInt($get(\"chartRendererImageFlipbookLimit\"));\r\n              if (isNaN(limit))\r\n                  alert(\"");
      if (_jspx_meth_fmt_message_87((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              else if (limit < 2 || limit > 50)\r\n                  alert(\"");
      if (_jspx_meth_fmt_message_88((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\");\r\n              else\r\n                  DataPointEditDwr.setImageFlipbookRenderer(limit, callback);\r\n          }\r\n          else\r\n              callback();\r\n      };\r\n  }\r\n  var chartRendererEditor = new ChartRendererEditor();\r\n  dojo.ready(chartRendererEditor, \"init\");\r\n</script>");
      out.write("\r\n        </td>\r\n        <td valign=\"top\">\r\n          ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n\r\n<div class=\"borderDiv\">\r\n  <table id=\"eventDetectorTable\">\r\n    <tr><td colspan=\"2\">\r\n      <span class=\"smallTitle\">");
      if (_jspx_meth_fmt_message_89((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</span>\r\n      ");
      if (_jspx_meth_tag_help_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n    </td></tr>\r\n    \r\n    <tr>\r\n      <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_90((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      <td class=\"formField\">\r\n        <select id=\"eventDetectorSelect\">\r\n          ");
      if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </select>\r\n        ");
      if (_jspx_meth_tag_img_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n      </td>\r\n    </tr>\r\n    \r\n    <tr><td colspan=\"2\">\r\n      <div id=\"emptyListMessage\" style=\"color:#888888;padding:10px;text-align:center;\">\r\n        ");
      if (_jspx_meth_fmt_message_92((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n      </div>\r\n    </td></tr>\r\n  </table>\r\n  \r\n  <table style=\"display:none;\">\r\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_ANALOG_HIGH_LIMIT );
      out.write("\">\r\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">\r\n          ");
      if (_jspx_meth_tag_img_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_fmt_message_93((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_94((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_95((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_96((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_97((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_tag_img_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_98((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_99((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\r\n    </tbody>\r\n    \r\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_ANALOG_LOW_LIMIT );
      out.write("\">\r\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">\r\n          ");
      if (_jspx_meth_tag_img_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_fmt_message_100((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_101((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_102((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_103((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_104((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_tag_img_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_105((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_106((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\r\n    </tbody>\r\n    \r\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_BINARY_STATE );
      out.write("\">\r\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">\r\n          ");
      if (_jspx_meth_tag_img_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_fmt_message_107((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_108((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_109((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_110((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_111((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_2((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_tag_img_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_112((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <select id=\"eventDetector_TEMPLATE_State\">\r\n            <option value=\"false\">");
      if (_jspx_meth_fmt_message_113((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\r\n            <option value=\"true\">");
      if (_jspx_meth_fmt_message_114((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</option>\r\n          </select>\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_115((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\r\n    </tbody>\r\n    \r\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_MULTISTATE_STATE );
      out.write("\">\r\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">\r\n          ");
      if (_jspx_meth_tag_img_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_fmt_message_116((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_117((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_118((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_119((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_120((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_3((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_tag_img_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_121((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_State\" type=\"text\" class=\"formShort\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_122((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\r\n    </tbody>\r\n    \r\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_POINT_CHANGE );
      out.write("\">\r\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">\r\n          ");
      if (_jspx_meth_tag_img_15((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_fmt_message_123((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_124((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_125((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_126((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_127((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_4((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_tag_img_16((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\r\n    </tbody>\r\n    \r\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_STATE_CHANGE_COUNT );
      out.write("\">\r\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">\r\n          ");
      if (_jspx_meth_tag_img_17((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_fmt_message_128((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_129((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_130((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_131((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_132((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_5((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_tag_img_18((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_133((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_ChangeCount\" type=\"text\" class=\"formShort\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_134((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\r\n    </tbody>\r\n    \r\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_NO_CHANGE );
      out.write("\">\r\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">\r\n          ");
      if (_jspx_meth_tag_img_19((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_fmt_message_135((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_136((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_137((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_138((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_139((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_6((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_tag_img_20((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_140((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\r\n    </tbody>\r\n    \r\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_NO_UPDATE );
      out.write("\">\r\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">\r\n          ");
      if (_jspx_meth_tag_img_21((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_fmt_message_141((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_142((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_143((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_144((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_145((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_7((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_tag_img_22((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_146((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_11((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\r\n    </tbody>\r\n    \r\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_STATE );
      out.write("\">\r\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">\r\n          ");
      if (_jspx_meth_tag_img_23((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_fmt_message_147((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_148((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_149((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_150((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_151((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_8((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_tag_img_24((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_152((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_State\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_153((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_12((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\r\n    </tbody>\r\n    \r\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_POSITIVE_CUSUM );
      out.write("\">\r\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">\r\n          ");
      if (_jspx_meth_tag_img_25((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_fmt_message_154((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_155((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_156((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_157((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_158((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_9((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_tag_img_26((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_159((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_160((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Weight\" type=\"text\" class=\"formShort\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_161((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_13((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\r\n    </tbody>\r\n    \r\n    <tbody id=\"detectorType");
      out.print( PointEventDetectorVO.TYPE_NEGATIVE_CUSUM );
      out.write("\">\r\n      <tr><td class=\"horzSeparator\" colspan=\"2\"></td></tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">\r\n          ");
      if (_jspx_meth_tag_img_27((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_fmt_message_162((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n        <td class=\"formField\">");
      if (_jspx_meth_fmt_message_163((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_164((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Xid\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_165((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Alias\" type=\"text\" class=\"formLong\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_166((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          ");
      if (_jspx_meth_tag_alarmLevelOptions_10((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n          ");
      if (_jspx_meth_tag_img_28((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_167((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Limit\" type=\"text\" class=\"formShort\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabelRequired\">");
      if (_jspx_meth_fmt_message_168((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\"><input id=\"eventDetector_TEMPLATE_Weight\" type=\"text\" class=\"formShort\"/></td>\r\n      </tr>\r\n      <tr>\r\n        <td class=\"formLabel\">");
      if (_jspx_meth_fmt_message_169((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n        <td class=\"formField\">\r\n          <input id=\"eventDetector_TEMPLATE_Duration\" type=\"text\" class=\"formShort\"/>\r\n          ");
      if (_jspx_meth_tag_timePeriods_14((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\r\n        </td>\r\n      </tr>\r\n      <tr><td class=\"formError\" id=\"eventDetector_TEMPLATE_ErrorMessage\" colspan=\"2\"></td></tr>\r\n    </tbody>\r\n  </table>\r\n</div>\r\n\r\n<script type=\"text/javascript\">\r\n  function getPedId(node) {\r\n      while (!(node.pedId))\r\n          node = node.parentNode;\r\n      return node.pedId;\r\n  }\r\n\r\n  function PointEventDetectorEditor() {\r\n      var detectorCount = 0;\r\n  \r\n      this.init = function() {\r\n          DataPointEditDwr.getEventDetectors(this.initCB);\r\n      }\r\n      \r\n      this.initCB = function(detectorList) {\r\n          for (var i=0; i<detectorList.length; i++)\r\n              pointEventDetectorEditor.addEventDetectorCB(detectorList[i]);\r\n      }\r\n      \r\n      this.addEventDetector = function() {\r\n          DataPointEditDwr.addEventDetector($get(\"eventDetectorSelect\"), this.addEventDetectorCB);\r\n      }\r\n  \r\n      this.addEventDetectorCB = function(detector) {\r\n          detectorCount++;\r\n          hide(\"emptyListMessage\");\r\n          \r\n          // Create the appropriate tbody.\r\n");
      out.write("          var content = $(\"detectorType\"+ detector.detectorType).cloneNode(true);\r\n          updateTemplateNode(content, detector.id);\r\n          content.id = \"eventDetector\"+ detector.id;\r\n          content.pedId = detector.id;\r\n          content.pedType = detector.detectorType;\r\n          $(\"eventDetectorTable\").appendChild(content);\r\n          \r\n          // Set the values in the content controls.\r\n          if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_ANALOG_HIGH_LIMIT );
      out.write(") {\r\n              $set(\"eventDetector\"+ detector.id +\"Limit\", detector.limit);\r\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\r\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\r\n          }\r\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_ANALOG_LOW_LIMIT );
      out.write(") {\r\n              $set(\"eventDetector\"+ detector.id +\"Limit\", detector.limit);\r\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\r\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\r\n          }\r\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_BINARY_STATE );
      out.write(") {\r\n              $set(\"eventDetector\"+ detector.id +\"State\", detector.binaryState ? \"true\" : \"false\");\r\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\r\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\r\n          }\r\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_MULTISTATE_STATE );
      out.write(") {\r\n              $set(\"eventDetector\"+ detector.id +\"State\", detector.multistateState);\r\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\r\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\r\n          }\r\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_POINT_CHANGE );
      out.write(") {}\r\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_STATE_CHANGE_COUNT );
      out.write(") {\r\n              $set(\"eventDetector\"+ detector.id +\"ChangeCount\", detector.changeCount);\r\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\r\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\r\n          }\r\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_NO_CHANGE );
      out.write(") {\r\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\r\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\r\n          }\r\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_NO_UPDATE );
      out.write(") {\r\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\r\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\r\n          }\r\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_STATE );
      out.write(") {\r\n              $set(\"eventDetector\"+ detector.id +\"State\", detector.alphanumericState);\r\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\r\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\r\n          }\r\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_POSITIVE_CUSUM );
      out.write(") {\r\n              $set(\"eventDetector\"+ detector.id +\"Limit\", detector.limit);\r\n              $set(\"eventDetector\"+ detector.id +\"Weight\", detector.weight);\r\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\r\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\r\n          }\r\n          else if (detector.detectorType == ");
      out.print( PointEventDetectorVO.TYPE_NEGATIVE_CUSUM );
      out.write(") {\r\n              $set(\"eventDetector\"+ detector.id +\"Limit\", detector.limit);\r\n              $set(\"eventDetector\"+ detector.id +\"Weight\", detector.weight);\r\n              $set(\"eventDetector\"+ detector.id +\"Duration\", detector.duration);\r\n              $set(\"eventDetector\"+ detector.id +\"DurationType\", detector.durationType);\r\n          }\r\n          \r\n          $set(\"eventDetector\"+ detector.id +\"Xid\", detector.xid);\r\n          $set(\"eventDetector\"+ detector.id +\"Alias\", detector.alias);\r\n          $set(\"eventDetector\"+ detector.id +\"AlarmLevel\", detector.alarmLevel);\r\n          pointEventDetectorEditor.updateAlarmLevelImage(detector.alarmLevel, detector.id);\r\n      }\r\n      \r\n      this.updateAlarmLevelImage = function(alarmLevel, pedId) {\r\n          setAlarmLevelImg(alarmLevel, $(\"eventDetector\"+ pedId +\"AlarmLevelImg\"));\r\n      }\r\n      \r\n      this.deleteDetector = function(pedId) {\r\n          DataPointEditDwr.deleteEventDetector(pedId);\r\n          \r\n          detectorCount--;\r\n          if (detectorCount == 0)\r\n");
      out.write("              show(\"emptyListMessage\");\r\n          \r\n          var content = $(\"eventDetector\"+ pedId);\r\n          $(\"eventDetectorTable\").removeChild(content);\r\n      }\r\n      \r\n      var saveCBCount;\r\n      var saveCallback;\r\n      var runSaveCallback;\r\n      this.save = function(callback) {\r\n          var edTableNodes = $(\"eventDetectorTable\").childNodes;\r\n          saveCBCount = 0;\r\n          saveCallback = callback;\r\n          runSaveCallback = true;\r\n          \r\n          dwr.engine.beginBatch();\r\n          for (var i=0; i<edTableNodes.length; i++) {\r\n              if (!edTableNodes[i].pedId)\r\n                  continue;\r\n              \r\n              // Found a detector row.\r\n              var pedId = edTableNodes[i].pedId;\r\n              var pedType = edTableNodes[i].pedType;\r\n              var errorMessage = null;\r\n              var xid = $get(\"eventDetector\"+ pedId +\"Xid\");\r\n              var alias = $get(\"eventDetector\"+ pedId +\"Alias\");\r\n              var alarmLevel = parseInt($get(\"eventDetector\"+ pedId +\"AlarmLevel\"));\r\n");
      out.write("              \r\n              if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_ANALOG_HIGH_LIMIT );
      out.write(") {\r\n                  var limit = parseFloat($get(\"eventDetector\"+ pedId +\"Limit\"));\r\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\r\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\r\n                  \r\n                  if (isNaN(limit))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_170((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (isNaN(duration))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_171((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (duration < 0)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_172((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else {\r\n                      saveCBCount++;\r\n                      DataPointEditDwr.updateHighLimitDetector(pedId, xid, alias, limit, duration, durationType,\r\n                              alarmLevel, saveCB);\r\n                  }\r\n              }\r\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_ANALOG_LOW_LIMIT );
      out.write(") {\r\n                  var limit = parseFloat($get(\"eventDetector\"+ pedId +\"Limit\"));\r\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\r\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\r\n                  \r\n                  if (isNaN(limit))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_173((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (isNaN(duration))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_174((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (duration < 0)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_175((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else {\r\n                      saveCBCount++;\r\n                      DataPointEditDwr.updateLowLimitDetector(pedId, xid, alias, limit, duration, durationType,\r\n                              alarmLevel, saveCB);\r\n                  }\r\n              }\r\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_BINARY_STATE );
      out.write(") {\r\n                  var state = $get(\"eventDetector\"+ pedId +\"State\");\r\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\r\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\r\n                  \r\n                  if (isNaN(duration))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_176((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (duration < 0)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_177((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else {\r\n                      saveCBCount++;\r\n                      DataPointEditDwr.updateBinaryStateDetector(pedId, xid, alias, state, duration, durationType,\r\n                              alarmLevel, saveCB);\r\n                  }\r\n              }\r\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_MULTISTATE_STATE );
      out.write(") {\r\n                  var state = parseInt($get(\"eventDetector\"+ pedId +\"State\"));\r\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\r\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\r\n                  \r\n                  if (isNaN(state))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_178((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (isNaN(duration))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_179((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (duration < 0)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_180((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else {\r\n                      saveCBCount++;\r\n                      DataPointEditDwr.updateMultistateStateDetector(pedId, xid, alias, state, duration, durationType,\r\n                              alarmLevel, saveCB);\r\n                  }\r\n              }\r\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_POINT_CHANGE );
      out.write(") {\r\n                  saveCBCount++;\r\n                  DataPointEditDwr.updatePointChangeDetector(pedId, xid, alias, alarmLevel, saveCB);\r\n              }\r\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_STATE_CHANGE_COUNT );
      out.write(") {\r\n                  var count = parseInt($get(\"eventDetector\"+ pedId +\"ChangeCount\"));\r\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\r\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\r\n                  \r\n                  if (isNaN(count))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_181((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (count < 2)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_182((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (isNaN(duration))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_183((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (duration < 1)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_184((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else {\r\n                      saveCBCount++;\r\n                      DataPointEditDwr.updateStateChangeCountDetector(pedId, xid, alias, count, duration, durationType, \r\n                              alarmLevel, saveCB);\r\n                  }\r\n              }\r\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_NO_CHANGE );
      out.write(") {\r\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\r\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\r\n                  \r\n                  if (isNaN(duration))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_185((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (duration < 1)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_186((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else {\r\n                      saveCBCount++;\r\n                      DataPointEditDwr.updateNoChangeDetector(pedId, xid, alias, duration, durationType, alarmLevel,\r\n                              saveCB);\r\n                  }\r\n              }\r\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_NO_UPDATE );
      out.write(") {\r\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\r\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\r\n                  \r\n                  if (isNaN(duration))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_187((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (duration < 1)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_188((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else {\r\n                      saveCBCount++;\r\n                      DataPointEditDwr.updateNoUpdateDetector(pedId, xid, alias, duration, durationType, alarmLevel,\r\n                              saveCB);\r\n                  }\r\n              }\r\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_ALPHANUMERIC_STATE );
      out.write(") {\r\n                  var state = $get(\"eventDetector\"+ pedId +\"State\");\r\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\r\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\r\n                  \r\n                  if (state && state.length > 128)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_189((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (isNaN(duration))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_190((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (duration < 0)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_191((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else {\r\n                      saveCBCount++;\r\n                      DataPointEditDwr.updateAlphanumericStateDetector(pedId, xid, alias, state, duration, durationType, \r\n                              alarmLevel, saveCB);\r\n                  }\r\n              }\r\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_POSITIVE_CUSUM );
      out.write(") {\r\n                  var limit = parseFloat($get(\"eventDetector\"+ pedId +\"Limit\"));\r\n                  var weight = parseFloat($get(\"eventDetector\"+ pedId +\"Weight\"));\r\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\r\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\r\n                  \r\n                  if (isNaN(limit))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_192((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (isNaN(weight))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_193((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (isNaN(duration))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_194((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (duration < 0)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_195((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else {\r\n                      saveCBCount++;\r\n                      DataPointEditDwr.updatePositiveCusumDetector(pedId, xid, alias, limit, weight, duration,\r\n                              durationType, alarmLevel, saveCB);\r\n                  }\r\n              }\r\n              else if (pedType == ");
      out.print( PointEventDetectorVO.TYPE_NEGATIVE_CUSUM );
      out.write(") {\r\n                  var limit = parseFloat($get(\"eventDetector\"+ pedId +\"Limit\"));\r\n                  var weight = parseFloat($get(\"eventDetector\"+ pedId +\"Weight\"));\r\n                  var duration = parseInt($get(\"eventDetector\"+ pedId +\"Duration\"));\r\n                  var durationType = parseInt($get(\"eventDetector\"+ pedId +\"DurationType\"));\r\n                  \r\n                  if (isNaN(limit))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_196((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (isNaN(weight))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_197((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (isNaN(duration))\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_198((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else if (duration < 0)\r\n                      errorMessage = \"");
      if (_jspx_meth_fmt_message_199((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\";\r\n                  else {\r\n                      saveCBCount++;\r\n                      DataPointEditDwr.updateNegativeCusumDetector(pedId, xid, alias, limit, weight, duration,\r\n                              durationType, alarmLevel, saveCB);\r\n                  }\r\n              }\r\n              \r\n              if (errorMessage != null) {\r\n                  runSaveCallback = false;\r\n                  $(\"eventDetector\"+ pedId +\"ErrorMessage\").innerHTML = errorMessage;\r\n              }\r\n              else\r\n                  $(\"eventDetector\"+ pedId +\"ErrorMessage\").innerHTML = \"\";\r\n          }\r\n          dwr.engine.endBatch();\r\n      \r\n          // If no save calls were made, continue by calling the callback.\r\n          if (runSaveCallback && saveCBCount == 0)\r\n              callback();\r\n      };\r\n      \r\n      function saveCB() {\r\n          if (--saveCBCount == 0) {\r\n              // We're done with the callbacks. If there were no errors, call the callback.\r\n              if (runSaveCallback)\r\n                  saveCallback();\r\n");
      out.write("          }\r\n      }\r\n  }\r\n  var pointEventDetectorEditor = new PointEventDetectorEditor();\r\n  dojo.ready(pointEventDetectorEditor, \"init\");\r\n</script>");
      out.write("\r\n        </td>\r\n      </tr>\r\n    </table>\r\n  \r\n    ");
      out.write('\r');
      out.write('\n');
      out.write("\r\n\r\n<table>\r\n  <tr>\r\n    <td colspan=\"2\" align=\"center\">\r\n      <input type=\"submit\" value=\"");
      if (_jspx_meth_fmt_message_200((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\"\r\n              onclick=\"return doSave('");
      out.print( DataPointEditController.SUBMIT_SAVE );
      out.write("');\"/>\r\n      ");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_choose_2.setPageContext(_jspx_page_context);
      _jspx_th_c_choose_2.setParent(new javax.servlet.jsp.tagext.TagAdapter((javax.servlet.jsp.tagext.SimpleTag) _jspx_parent));
      int _jspx_eval_c_choose_2 = _jspx_th_c_choose_2.doStartTag();
      if (_jspx_eval_c_choose_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n        ");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_12 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_when_12.setPageContext(_jspx_page_context);
          _jspx_th_c_when_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
          _jspx_th_c_when_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.enabled}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
          int _jspx_eval_c_when_12 = _jspx_th_c_when_12.doStartTag();
          if (_jspx_eval_c_when_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n          <input type=\"submit\" value=\"");
              if (_jspx_meth_fmt_message_201((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_12, _jspx_page_context))
                return;
              out.write("\"\r\n                  onclick=\"return doSave('");
              out.print( DataPointEditController.SUBMIT_DISABLE );
              out.write("');\"/>\r\n          <input type=\"submit\" value=\"");
              if (_jspx_meth_fmt_message_202((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_12, _jspx_page_context))
                return;
              out.write("\" \r\n                  onclick=\"return doSave('");
              out.print( DataPointEditController.SUBMIT_RESTART );
              out.write("');\"/>\r\n        ");
              int evalDoAfterBody = _jspx_th_c_when_12.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_when_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
            throw new SkipPageException();
          }
          _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_12);
          out.write("\r\n        ");
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_otherwise_2.setPageContext(_jspx_page_context);
          _jspx_th_c_otherwise_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_2);
          int _jspx_eval_c_otherwise_2 = _jspx_th_c_otherwise_2.doStartTag();
          if (_jspx_eval_c_otherwise_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n          <input type=\"submit\" value=\"");
              if (_jspx_meth_fmt_message_203((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_2, _jspx_page_context))
                return;
              out.write("\"\r\n                  onclick=\"return doSave('");
              out.print( DataPointEditController.SUBMIT_ENABLE );
              out.write("');\"/>\r\n        ");
              int evalDoAfterBody = _jspx_th_c_otherwise_2.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_otherwise_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
            throw new SkipPageException();
          }
          _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_2);
          out.write("\r\n      ");
          int evalDoAfterBody = _jspx_th_c_choose_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_choose_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
        throw new SkipPageException();
      }
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_2);
      out.write("\r\n      \r\n      <input type=\"button\" value=\"");
      if (_jspx_meth_fmt_message_204((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("\"\r\n              onclick=\"window.location='data_point_details.shtm?dpid=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${form.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("';\"/>\r\n    </td>\r\n    <td></td>\r\n  </tr>\r\n  \r\n  <tr>\r\n    <td colspan=\"2\">");
      if (_jspx_meth_fmt_message_205((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return;
      out.write("</td>\r\n  </tr>\r\n</table>");
      out.write("\r\n  </form>\r\n");
      return;
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
