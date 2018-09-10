package home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Configuration
public class ServletContextInitializer implements org.springframework.boot.web.servlet.ServletContextInitializer {
    private static final Logger log = LoggerFactory.getLogger(ServletContextInitializer.class);

    public ServletContextInitializer(Environment env) {
        System.out.printf("env is null? %s\n", env == null);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        log.debug("hm ...");
    }
}
