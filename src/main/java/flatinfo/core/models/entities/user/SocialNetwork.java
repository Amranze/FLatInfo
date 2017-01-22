package flatinfo.core.models.entities.user;

public class SocialNetwork {
	private String fbUsername;
	private String fbUrl;
	private String linkedInUsername;
	private String linkedinUrl;
	private String twitterInUsername;
	private String TwitterUrl;
	
	public SocialNetwork() {
		super();
	}

	public SocialNetwork(String fbUsername, String fbUrl,
			String linkedInUsername, String linkedinUrl,
			String twitterInUsername, String twitterUrl) {
		super();
		this.fbUsername = fbUsername;
		this.fbUrl = fbUrl;
		this.linkedInUsername = linkedInUsername;
		this.linkedinUrl = linkedinUrl;
		this.twitterInUsername = twitterInUsername;
		TwitterUrl = twitterUrl;
	}

	public String getFbUsername() {
		return fbUsername;
	}

	public void setFbUsername(String fbUsername) {
		this.fbUsername = fbUsername;
	}

	public String getFbUrl() {
		return fbUrl;
	}

	public void setFbUrl(String fbUrl) {
		this.fbUrl = fbUrl;
	}

	public String getLinkedInUsername() {
		return linkedInUsername;
	}

	public void setLinkedInUsername(String linkedInUsername) {
		this.linkedInUsername = linkedInUsername;
	}

	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public String getTwitterInUsername() {
		return twitterInUsername;
	}

	public void setTwitterInUsername(String twitterInUsername) {
		this.twitterInUsername = twitterInUsername;
	}

	public String getTwitterUrl() {
		return TwitterUrl;
	}

	public void setTwitterUrl(String twitterUrl) {
		TwitterUrl = twitterUrl;
	}
}
