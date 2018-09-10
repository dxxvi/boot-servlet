package home;

import home.servlet.ProgrammaticServlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

@Configuration
public class ServletContextInitializer implements org.springframework.boot.web.servlet.ServletContextInitializer {
    private static final Logger log = LoggerFactory.getLogger(ServletContextInitializer.class);

    public ServletContextInitializer(Environment env) {
        System.out.printf("env is null? %s\n", env == null);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic d1 =
                servletContext.addServlet("programmatic1", new ProgrammaticServlet("programmatic1"));
        d1.addMapping("/programmatic1");
    }
}
