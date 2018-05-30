//package filter;
//
//import java.io.IOException;
//import javax.servlet.DispatcherType;
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebFilter(filterName = "AutorizacaoFilter", urlPatterns = {"/faces/prestador/*"}, dispatcherTypes = DispatcherType.REQUEST)
//public class AutorizacaoFilter implements Filter {
//
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//
//    }
//
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        Prestador prestador = (Prestador) ((HttpServletRequest) request).getSession().getAttribute("session");
//        if (prestador != null && prestador.getId() > 0) {
//            chain.doFilter(request, response);
//        } else {
//            String contextPath = ((HttpServletRequest) request).getContextPath();
//            ((HttpServletResponse) response).sendRedirect(contextPath + "/faces/index.xhtml");
//        }
//
//    }
//
//    @Override
//    public void destroy() {
//
//    }
//
//}
