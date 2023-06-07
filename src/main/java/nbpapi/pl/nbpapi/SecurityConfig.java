package nbpapi.pl.nbpapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/admin/**").hasRole("ADMIN") // Example: Restrict access to "/admin/**" to users with the "ADMIN" role
                .anyRequest().authenticated() // Require authentication for all other requests
                .and()
                .formLogin(); // Enable form-based login
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER") // Example: In-memory user with username "user", password "password", and role "USER"
                .and()
                .withUser("admin").password("{noop}password").roles("ADMIN"); // Example: In-memory user with username "admin", password "password", and role "ADMIN"
    }
}



