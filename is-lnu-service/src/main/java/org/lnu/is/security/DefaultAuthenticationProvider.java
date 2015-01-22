package org.lnu.is.security;

import java.util.ArrayList;
import java.util.Collection;

import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.lnu.is.dao.dao.user.UserDao;
import org.lnu.is.domain.user.User;
import org.lnu.is.domain.user.group.UserGroup;
import org.lnu.is.domain.user.role.UserRole;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * Default Authentication Provider.
 * @author ivanursul
 *
 */
public class DefaultAuthenticationProvider implements AuthenticationProvider {
    private static final Logger LOG = LoggerFactory.getLogger(DefaultAuthenticationProvider.class);

    @Resource(name = "userDao")
    private UserDao userDao;
    
    @Override
    public boolean supports(final Class<?> clazz) {
    	return clazz.equals(UsernamePasswordAuthenticationToken.class);
    }

    @Override
    @Transactional
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
        User user = getUser(login, password);
        loadLazyFields(user);
        
        Collection<GrantedAuthority> authorities = getAuthorities(user);
        
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(login, password, authorities);
        token.setDetails(user);

        return token;
    }

    /**
     * Method for loading lazy objects.
     * @param user
     */
    private void loadLazyFields(final User user) {
    	Hibernate.initialize(user.getGroups());
        Hibernate.initialize(user.getUserGroups());
        
        for (UserGroup userGroup : user.getUserGroups()) {
			Hibernate.initialize(userGroup.getGroup());
		}
        
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
            user =  userDao.getUserByLogin(login);
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

    	for (UserRole userRole : principal.getUserRoles()) {
    		GrantedAuthority authority = new SimpleGrantedAuthority(userRole.getRole().getTitle());
    		authorities.add(authority);
    	}
    	
        return authorities;
    }
}
