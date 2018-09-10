package home.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/manual")
public class ManualServlet extends GenericServlet {
    private static final Logger log = LoggerFactory.getLogger(ManualServlet.class);

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        if (!(servletRequest instanceof HttpServletRequest)) {
            log.warn("servletRequest is of type " + servletRequest.getClass().getName() + " not HttpServletRequest");
            return;
        }
        if (!(servletResponse instanceof HttpServletResponse)) {
            log.warn("servletResponse is of type " + servletResponse.getClass().getName() + " not HttpServletResponse");
            return;
        }
        HttpServletRequest  request  = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setContentType(MediaType.TEXT_PLAIN_VALUE);
        String message = String.format("Method: %s - Hello World!", request.getMethod());
        response.getWriter().print(message);
    }
}
