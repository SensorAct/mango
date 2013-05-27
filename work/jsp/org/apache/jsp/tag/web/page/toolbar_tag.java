package org.apache.jsp.tag.web.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.serotonin.m2m2.module.ModuleRegistry;
import com.serotonin.m2m2.module.UrlMappingDefinition;

public final class toolbar_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  static {
    _jspx_dependants = new java.util.Vector(4);
    _jspx_dependants.add("/WEB-INF/tags/decl.tagf");
    _jspx_dependants.add("/WEB-INF/tags/menuItem.tag");
    _jspx_dependants.add("/WEB-INF/tags/img.tag");
    _jspx_dependants.add("/WEB-INF/tags/page/menuItem.tag");
  }

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
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
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
    _jspx_tagPool_fmt_message_key_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(config);
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n\r\n\r\n\r\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!simple}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n  <table width=\"100%\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\" id=\"subHeader\">\r\n    <tr>\r\n      <td style=\"cursor:default\">\r\n        ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_1.setPageContext(_jspx_page_context);
          _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
          _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty sessionUser}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
          int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
          if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n          ");
              if (_jspx_meth_tag_menuItem_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
                return;
              out.write("\r\n          ");
              if (_jspx_meth_tag_menuItem_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
                return;
              out.write("\r\n          ");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
              _jspx_th_c_forEach_0.setItems( ModuleRegistry.getMenuItems().get(UrlMappingDefinition.Permission.USER) );
              _jspx_th_c_forEach_0.setVar("mi");
              int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
                if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n            ");
                    if (_jspx_meth_page_menuItem_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
                      return;
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
              out.write("\r\n                \r\n          ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_if_2.setPageContext(_jspx_page_context);
              _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
              _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionUser.dataSourcePermission}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
              int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
              if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            <img src=\"/images/menu_separator.png\"/>\r\n            ");
                  if (_jspx_meth_tag_menuItem_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  if (_jspx_meth_tag_menuItem_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
                  _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
                  _jspx_th_c_forEach_1.setItems( ModuleRegistry.getMenuItems().get(UrlMappingDefinition.Permission.DATA_SOURCE) );
                  _jspx_th_c_forEach_1.setVar("mi");
                  int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
                    if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n              ");
                        if (_jspx_meth_page_menuItem_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
                          return;
                        out.write("\r\n            ");
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
                  out.write("\r\n          ");
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
              out.write("\r\n          \r\n          <img src=\"/images/menu_separator.png\"/>\r\n          ");
              if (_jspx_meth_tag_menuItem_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
                return;
              out.write("\r\n          \r\n          ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_if_3.setPageContext(_jspx_page_context);
              _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
              _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionUser.admin}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
              int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
              if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\r\n            ");
                  if (_jspx_meth_tag_menuItem_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  if (_jspx_meth_tag_menuItem_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  if (_jspx_meth_tag_menuItem_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  if (_jspx_meth_tag_menuItem_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  if (_jspx_meth_tag_menuItem_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  if (_jspx_meth_tag_menuItem_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_3, _jspx_page_context))
                    return;
                  out.write("\r\n            ");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
                  _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_3);
                  _jspx_th_c_forEach_2.setItems( ModuleRegistry.getMenuItems().get(UrlMappingDefinition.Permission.ADMINISTRATOR) );
                  _jspx_th_c_forEach_2.setVar("mi");
                  int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
                    if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\r\n              ");
                        if (_jspx_meth_page_menuItem_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
                          return;
                        out.write("\r\n            ");
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
                  out.write("\r\n          ");
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
              out.write("\r\n          \r\n          <img src=\"/images/menu_separator.png\"/>\r\n          ");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
              _jspx_th_c_forEach_3.setItems( ModuleRegistry.getMenuItems().get(UrlMappingDefinition.Permission.ANONYMOUS) );
              _jspx_th_c_forEach_3.setVar("mi");
              int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
                if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n            ");
                    if (_jspx_meth_page_menuItem_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
                      return;
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
              out.write("\r\n          ");
              if (_jspx_meth_tag_menuItem_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
                return;
              out.write("\r\n          ");
              if (_jspx_meth_tag_menuItem_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
                return;
              out.write("\r\n        ");
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
          out.write("\r\n        ");
          //  c:if
          org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
          _jspx_th_c_if_4.setPageContext(_jspx_page_context);
          _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
          _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty sessionUser}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
          int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
          if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n          ");
              if (_jspx_meth_tag_menuItem_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
                return;
              out.write("\r\n          ");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
              _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
              _jspx_th_c_forEach_4.setItems( ModuleRegistry.getMenuItems().get(UrlMappingDefinition.Permission.ANONYMOUS) );
              _jspx_th_c_forEach_4.setVar("mi");
              int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
              try {
                int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
                if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\r\n            ");
                    if (_jspx_meth_page_menuItem_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
                      return;
                    out.write("\r\n          ");
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
              out.write("\r\n        ");
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
          out.write("\r\n        <div id=\"headerMenuDescription\" class=\"labelDiv\" style=\"position:absolute;display:none;\"></div>\r\n      </td>\r\n      \r\n      <td align=\"right\">\r\n        ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          out.write("\r\n        ");
          if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
            return;
          out.write("\r\n      </td>\r\n    </tr>\r\n  </table>\r\n");
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
      out.write('\r');
      out.write('\n');
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

  private boolean _jspx_meth_tag_menuItem_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_0 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_0      );
    }
    _jspx_th_tag_menuItem_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_0.setParent(_jspx_th_c_if_1);
    _jspx_th_tag_menuItem_0.setHref("/data_point_details.shtm");
    _jspx_th_tag_menuItem_0.setPng("icon_comp");
    _jspx_th_tag_menuItem_0.setKey("header.dataPoints");
    _jspx_th_tag_menuItem_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_1 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_1      );
    }
    _jspx_th_tag_menuItem_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_1.setParent(_jspx_th_c_if_1);
    _jspx_th_tag_menuItem_1.setHref("/events.shtm");
    _jspx_th_tag_menuItem_1.setPng("flag_white");
    _jspx_th_tag_menuItem_1.setKey("header.alarms");
    _jspx_th_tag_menuItem_1.doTag();
    return false;
  }

  private boolean _jspx_meth_page_menuItem_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  page:menuItem
    org.apache.jsp.tag.web.page.menuItem_tag _jspx_th_page_menuItem_0 = new org.apache.jsp.tag.web.page.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_page_menuItem_0      );
    }
    _jspx_th_page_menuItem_0.setJspContext(_jspx_page_context);
    _jspx_th_page_menuItem_0.setParent(_jspx_th_c_forEach_0);
    _jspx_th_page_menuItem_0.setMi((com.serotonin.m2m2.module.UrlMappingDefinition) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi}", com.serotonin.m2m2.module.UrlMappingDefinition.class, (PageContext)this.getJspContext(), null));
    _jspx_th_page_menuItem_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_2 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_2      );
    }
    _jspx_th_tag_menuItem_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_2.setParent(_jspx_th_c_if_2);
    _jspx_th_tag_menuItem_2.setHref("/event_handlers.shtm");
    _jspx_th_tag_menuItem_2.setPng("cog");
    _jspx_th_tag_menuItem_2.setKey("header.eventHandlers");
    _jspx_th_tag_menuItem_2.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_3 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_3      );
    }
    _jspx_th_tag_menuItem_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_3.setParent(_jspx_th_c_if_2);
    _jspx_th_tag_menuItem_3.setHref("/data_sources.shtm");
    _jspx_th_tag_menuItem_3.setPng("icon_ds");
    _jspx_th_tag_menuItem_3.setKey("header.dataSources");
    _jspx_th_tag_menuItem_3.doTag();
    return false;
  }

  private boolean _jspx_meth_page_menuItem_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  page:menuItem
    org.apache.jsp.tag.web.page.menuItem_tag _jspx_th_page_menuItem_1 = new org.apache.jsp.tag.web.page.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_page_menuItem_1      );
    }
    _jspx_th_page_menuItem_1.setJspContext(_jspx_page_context);
    _jspx_th_page_menuItem_1.setParent(_jspx_th_c_forEach_1);
    _jspx_th_page_menuItem_1.setMi((com.serotonin.m2m2.module.UrlMappingDefinition) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi}", com.serotonin.m2m2.module.UrlMappingDefinition.class, (PageContext)this.getJspContext(), null));
    _jspx_th_page_menuItem_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_4 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_4      );
    }
    _jspx_th_tag_menuItem_4.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_4.setParent(_jspx_th_c_if_1);
    _jspx_th_tag_menuItem_4.setHref("/users.shtm");
    _jspx_th_tag_menuItem_4.setPng("user");
    _jspx_th_tag_menuItem_4.setKey("header.users");
    _jspx_th_tag_menuItem_4.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_5 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_5      );
    }
    _jspx_th_tag_menuItem_5.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_5.setParent(_jspx_th_c_if_3);
    _jspx_th_tag_menuItem_5.setHref("/point_hierarchy.shtm");
    _jspx_th_tag_menuItem_5.setPng("folder_brick");
    _jspx_th_tag_menuItem_5.setKey("header.pointHierarchy");
    _jspx_th_tag_menuItem_5.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_6 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_6      );
    }
    _jspx_th_tag_menuItem_6.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_6.setParent(_jspx_th_c_if_3);
    _jspx_th_tag_menuItem_6.setHref("/mailing_lists.shtm");
    _jspx_th_tag_menuItem_6.setPng("book");
    _jspx_th_tag_menuItem_6.setKey("header.mailingLists");
    _jspx_th_tag_menuItem_6.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_7 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_7      );
    }
    _jspx_th_tag_menuItem_7.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_7.setParent(_jspx_th_c_if_3);
    _jspx_th_tag_menuItem_7.setHref("/publishers.shtm");
    _jspx_th_tag_menuItem_7.setPng("transmit");
    _jspx_th_tag_menuItem_7.setKey("header.publishers");
    _jspx_th_tag_menuItem_7.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_8 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_8      );
    }
    _jspx_th_tag_menuItem_8.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_8.setParent(_jspx_th_c_if_3);
    _jspx_th_tag_menuItem_8.setHref("/system_settings.shtm");
    _jspx_th_tag_menuItem_8.setPng("application_form");
    _jspx_th_tag_menuItem_8.setKey("header.systemSettings");
    _jspx_th_tag_menuItem_8.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_9 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_9      );
    }
    _jspx_th_tag_menuItem_9.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_9.setParent(_jspx_th_c_if_3);
    _jspx_th_tag_menuItem_9.setHref("/modules.shtm");
    _jspx_th_tag_menuItem_9.setPng("puzzle");
    _jspx_th_tag_menuItem_9.setKey("modules.modules");
    _jspx_th_tag_menuItem_9.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_3, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_10 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_10      );
    }
    _jspx_th_tag_menuItem_10.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_10.setParent(_jspx_th_c_if_3);
    _jspx_th_tag_menuItem_10.setHref("/emport.shtm");
    _jspx_th_tag_menuItem_10.setPng("emport");
    _jspx_th_tag_menuItem_10.setKey("header.emport");
    _jspx_th_tag_menuItem_10.doTag();
    return false;
  }

  private boolean _jspx_meth_page_menuItem_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  page:menuItem
    org.apache.jsp.tag.web.page.menuItem_tag _jspx_th_page_menuItem_2 = new org.apache.jsp.tag.web.page.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_page_menuItem_2      );
    }
    _jspx_th_page_menuItem_2.setJspContext(_jspx_page_context);
    _jspx_th_page_menuItem_2.setParent(_jspx_th_c_forEach_2);
    _jspx_th_page_menuItem_2.setMi((com.serotonin.m2m2.module.UrlMappingDefinition) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi}", com.serotonin.m2m2.module.UrlMappingDefinition.class, (PageContext)this.getJspContext(), null));
    _jspx_th_page_menuItem_2.doTag();
    return false;
  }

  private boolean _jspx_meth_page_menuItem_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  page:menuItem
    org.apache.jsp.tag.web.page.menuItem_tag _jspx_th_page_menuItem_3 = new org.apache.jsp.tag.web.page.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_page_menuItem_3      );
    }
    _jspx_th_page_menuItem_3.setJspContext(_jspx_page_context);
    _jspx_th_page_menuItem_3.setParent(_jspx_th_c_forEach_3);
    _jspx_th_page_menuItem_3.setMi((com.serotonin.m2m2.module.UrlMappingDefinition) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi}", com.serotonin.m2m2.module.UrlMappingDefinition.class, (PageContext)this.getJspContext(), null));
    _jspx_th_page_menuItem_3.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_11 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_11      );
    }
    _jspx_th_tag_menuItem_11.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_11.setParent(_jspx_th_c_if_1);
    _jspx_th_tag_menuItem_11.setHref("/logout.htm");
    _jspx_th_tag_menuItem_11.setPng("control-power");
    _jspx_th_tag_menuItem_11.setKey("header.logout");
    _jspx_th_tag_menuItem_11.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_12 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_12      );
    }
    _jspx_th_tag_menuItem_12.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_12.setParent(_jspx_th_c_if_1);
    _jspx_th_tag_menuItem_12.setHref("/help.shtm");
    _jspx_th_tag_menuItem_12.setPng("help");
    _jspx_th_tag_menuItem_12.setKey("header.help");
    _jspx_th_tag_menuItem_12.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_menuItem_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:menuItem
    org.apache.jsp.tag.web.menuItem_tag _jspx_th_tag_menuItem_13 = new org.apache.jsp.tag.web.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_menuItem_13      );
    }
    _jspx_th_tag_menuItem_13.setJspContext(_jspx_page_context);
    _jspx_th_tag_menuItem_13.setParent(_jspx_th_c_if_4);
    _jspx_th_tag_menuItem_13.setHref("/login.htm");
    _jspx_th_tag_menuItem_13.setPng("control_play_blue");
    _jspx_th_tag_menuItem_13.setKey("header.login");
    _jspx_th_tag_menuItem_13.doTag();
    return false;
  }

  private boolean _jspx_meth_page_menuItem_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  page:menuItem
    org.apache.jsp.tag.web.page.menuItem_tag _jspx_th_page_menuItem_4 = new org.apache.jsp.tag.web.page.menuItem_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_page_menuItem_4      );
    }
    _jspx_th_page_menuItem_4.setJspContext(_jspx_page_context);
    _jspx_th_page_menuItem_4.setParent(_jspx_th_c_forEach_4);
    _jspx_th_page_menuItem_4.setMi((com.serotonin.m2m2.module.UrlMappingDefinition) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mi}", com.serotonin.m2m2.module.UrlMappingDefinition.class, (PageContext)this.getJspContext(), null));
    _jspx_th_page_menuItem_4.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!empty sessionUser}", java.lang.Boolean.class, (PageContext)this.getJspContext(), null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n          <span class=\"copyTitle\">");
        if (_jspx_meth_fmt_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write(": <b>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionUser.username}", java.lang.String.class, (PageContext)this.getJspContext(), null));
        out.write("</b></span>\r\n          ");
        if (_jspx_meth_tag_img_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\r\n          ");
        if (_jspx_meth_tag_img_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\r\n          ");
        if (_jspx_meth_tag_img_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_5, _jspx_page_context))
          return true;
        out.write("\r\n        ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_fmt_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_message_0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _jspx_tagPool_fmt_message_key_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_message_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_5);
    _jspx_th_fmt_message_0.setKey("header.user");
    int _jspx_eval_fmt_message_0 = _jspx_th_fmt_message_0.doStartTag();
    if (_jspx_th_fmt_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
      throw new SkipPageException();
    }
    _jspx_tagPool_fmt_message_key_nobody.reuse(_jspx_th_fmt_message_0);
    return false;
  }

  private boolean _jspx_meth_tag_img_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_0 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_0      );
    }
    _jspx_th_tag_img_0.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_0.setParent(_jspx_th_c_if_5);
    _jspx_th_tag_img_0.setId("userMutedImg");
    _jspx_th_tag_img_0.setOnclick("MiscDwr.toggleUserMuted(setUserMuted)");
    _jspx_th_tag_img_0.setOnmouseover("hideLayerIgnoreMissing('localeEdit')");
    _jspx_th_tag_img_0.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_1 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_1      );
    }
    _jspx_th_tag_img_1.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_1.setParent(_jspx_th_c_if_5);
    _jspx_th_tag_img_1.setPng("house");
    _jspx_th_tag_img_1.setTitle("header.goHomeUrl");
    _jspx_th_tag_img_1.setOnclick("goHomeUrl()");
    _jspx_th_tag_img_1.setOnmouseover("hideLayerIgnoreMissing('localeEdit')");
    _jspx_th_tag_img_1.doTag();
    return false;
  }

  private boolean _jspx_meth_tag_img_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_5, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_2 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_2      );
    }
    _jspx_th_tag_img_2.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_2.setParent(_jspx_th_c_if_5);
    _jspx_th_tag_img_2.setPng("house_link");
    _jspx_th_tag_img_2.setTitle("header.setHomeUrl");
    _jspx_th_tag_img_2.setOnclick("setHomeUrl()");
    _jspx_th_tag_img_2.setOnmouseover("hideLayerIgnoreMissing('localeEdit')");
    _jspx_th_tag_img_2.doTag();
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${fn:length(availableLanguages) > 1}", java.lang.Boolean.class, (PageContext)this.getJspContext(), _jspx_fnmap_0)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n          <div style=\"display:inline;\" onmouseover=\"showMenu('localeEdit', null, 10, 10);\">\r\n            ");
        if (_jspx_meth_tag_img_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\r\n            <div id=\"localeEdit\" style=\"visibility:hidden;left:0px;top:15px;\" class=\"labelDiv\" onmouseout=\"hideLayer(this)\">\r\n              ");
        if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\r\n            </div>\r\n          </div>\r\n        ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      throw new SkipPageException();
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_tag_img_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  tag:img
    org.apache.jsp.tag.web.img_tag _jspx_th_tag_img_3 = new org.apache.jsp.tag.web.img_tag();
    if (_jspx_resourceInjector != null) {
      _jspx_resourceInjector.inject(_jspx_th_tag_img_3      );
    }
    _jspx_th_tag_img_3.setJspContext(_jspx_page_context);
    _jspx_th_tag_img_3.setParent(_jspx_th_c_if_6);
    _jspx_th_tag_img_3.setPng("locale");
    _jspx_th_tag_img_3.setTitle("header.changeLanguage");
    _jspx_th_tag_img_3.doTag();
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${availableLanguages}", java.lang.Object.class, (PageContext)this.getJspContext(), null));
    _jspx_th_c_forEach_5.setVar("lang");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n                <a class=\"ptr\" onclick=\"setLocale('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lang.key}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write("')\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lang.value}", java.lang.String.class, (PageContext)this.getJspContext(), null));
          out.write("</a><br/>\r\n              ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        throw new SkipPageException();
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
}
