package org.is.lnu.edbo.model.authentification;

/**
 * Authentification model.
 * @author ivanursul
 *
 */
public class Authentification {

	private String login;
	private String password;
	private String applicationKey;
	private Integer clearPreviousSession;
	private String sessionGUID;

	/**
	 * Default constructor.
	 */
	public Authentification() {
		super();
	}

	/**
	 * Constructor with all parameters.
	 * @param login
	 * @param password
	 * @param applicationKey
	 * @param clearPreviousSession
	 * @param sessionGUID
	 */
	public Authentification(final String login, final String password,
			final String applicationKey, final Integer clearPreviousSession,
			final String sessionGUID) {
		super();
		this.login = login;
		this.password = password;
		this.applicationKey = applicationKey;
		this.clearPreviousSession = clearPreviousSession;
		this.sessionGUID = sessionGUID;
	}

	public String getLogin() {
		return login;
	}
	
	public void setLogin(final String login) {
		this.login = login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(final String password) {
		this.password = password;
	}
	
	public String getApplicationKey() {
		return applicationKey;
	}
	
	public void setApplicationKey(final String applicationKey) {
		this.applicationKey = applicationKey;
	}
	
	public void setClearPreviousSession(final Integer clearPreviousSession) {
		this.clearPreviousSession = clearPreviousSession;
	}

	public Integer getClearPreviousSession() {
		return clearPreviousSession;
	}

	public String getSessionGUID() {
		return sessionGUID;
	}

	public void setSessionGUID(final String sessionGUID) {
		this.sessionGUID = sessionGUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((applicationKey == null) ? 0 : applicationKey.hashCode());
		result = prime
				* result
				+ ((clearPreviousSession == null) ? 0 : clearPreviousSession
						.hashCode());
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result
				+ ((sessionGUID == null) ? 0 : sessionGUID.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Authentification other = (Authentification) obj;
		if (applicationKey == null) {
			if (other.applicationKey != null) {
				return false;
			}
		} else if (!applicationKey.equals(other.applicationKey)) {
			return false;
		}
		if (clearPreviousSession == null) {
			if (other.clearPreviousSession != null) {
				return false;
			}
		} else if (!clearPreviousSession.equals(other.clearPreviousSession)) {
			return false;
		}
		if (login == null) {
			if (other.login != null) {
				return false;
			}
		} else if (!login.equals(other.login)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (sessionGUID == null) {
			if (other.sessionGUID != null) {
				return false;
			}
		} else if (!sessionGUID.equals(other.sessionGUID)) {
			return false;
		}
		return true;
	}

}
