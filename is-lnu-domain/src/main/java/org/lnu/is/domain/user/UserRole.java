package org.lnu.is.domain.user;

/**
 * User Role enum.
 * @author ivanursul
 *
 */
public enum UserRole {
    ADMIN("ROLE_ADMIN"), 
    USER("ROLE_USER"), 
    ANONYMOUS("ROLE_ANONYMOUS");

    private final String securityCode;

    /**
     * Default constructor.
     * @param securityCode
     */
    private UserRole(final String securityCode) {
        this.securityCode = securityCode;
    }

    /**
     * Security code.
     * @return security code.
     */
    public String getSecurityCode() {
        return securityCode;
    }
}

