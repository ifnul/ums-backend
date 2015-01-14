package org.lnu.is.security;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Resource;

import org.lnu.is.domain.user.User;
import org.lnu.is.service.user.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.util.Assert;

/**
 * Default Authentication Provider.
 * @author ivanursul
 *
 */
public class DefaultAuthenticationProvider implements AuthenticationProvider {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultAuthenticationProvider.class);

    @Resource(name = "userService")
    private UserService userService;
    
    @Override
    public boolean supports(final Class<?> clazz) {
    	return clazz.equals(UsernamePasswordAuthenticationToken.class);
    }

    @Override
    public Authentication authenticate(final Authentication authentication) throws AuthenticationException {
        String login = authentication.getName();
        String password = authentication.getCredentials().toString();

        return getAuthentication(login, password);
    }

    /**
     * Method for getting authentification.
     * @param login
     * @param password
     * @return authentification.
     */
    private Authentication getAuthentication(final String login, final String password) {
        User principal = getUser(login, password);
        Collection<GrantedAuthority> authorities = getAuthorities(principal);

        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(login, password, authorities);
        token.setDetails(principal);

        return token;
    }

    /**
     * Method for getting user.
     * @param login
     * @param password
     * @return user.
     */
    private User getUser(final String login, final String password) {
        User user = null;

        try {
            user =  userService.getUserByLogin(login);
            Assert.isTrue(user.getPassword().equals(password));
        } catch (Exception e) {
            LOG.error("Can't find user for login: " + login, e);
            throw new BadCredentialsException("Bad creditials for user: " + login);
        }

        return user;
    }

    /**
     * Method for getting authorities.
     * @param principal
     * @return collection of authorities.
     */
    private Collection<GrantedAuthority> getAuthorities(final User principal) {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority(principal.getRole().getSecurityCode()));

        return authorities;
    }
}
