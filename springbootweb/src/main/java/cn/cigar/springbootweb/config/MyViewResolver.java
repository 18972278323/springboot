package cn.cigar.springbootweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@Configuration
public class MyViewResolver{

    @Bean
    public ViewResolver getMyView() {
        return new ViewResolveCigar();
    }



    public static class ViewResolveCigar  implements ViewResolver{

        @Override
        public View resolveViewName(String viewName, Locale locale) throws Exception {
            return null;
        }
    }
}
