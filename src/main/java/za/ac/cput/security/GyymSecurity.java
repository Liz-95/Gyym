package za.ac.cput.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class GyymSecurity extends WebSecurityConfigurerAdapter {
    private static final String USER_ROLE= "USER";
    private static final String ADMIN_ROLE= "ADMIN";


    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder)
        throws Exception{
        authenticationManagerBuilder
                .inMemoryAuthentication()
                .withUser("user")
                .password(encoder().encode("password"))
                .roles(USER_ROLE)
                .and()
                .withUser("admin")
                .password(encoder().encode("admin"))
                .roles(USER_ROLE, ADMIN_ROLE);
    }

    @Override
    protected void configure(HttpSecurity http) throws  Exception{

        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST, "/gyym/lookup/**/create/**").hasRole(ADMIN_ROLE);

    }

    @Bean
    public PasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }


}
