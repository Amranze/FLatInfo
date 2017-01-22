package flatinfo.core.models.entities.user;

public class ShowInfo {
	private boolean phoneDisplayed;
	private boolean fbUrlDisplayed;
	private boolean linkedinUrlDisplayed;
	private boolean twitterDisplayed;
	private boolean adresseDisplayed;
	private boolean birthdateDisplayed;
	
	public ShowInfo() {
		super();
	}
	public ShowInfo(boolean phoneDisplayed, boolean fbUrlDisplayed,
			boolean linkedinUrlDisplayed, boolean twitterDisplayed,
			boolean adresseDisplayed, boolean birthdateDisplayed) {
		super();
		this.phoneDisplayed = phoneDisplayed;
		this.fbUrlDisplayed = fbUrlDisplayed;
		this.linkedinUrlDisplayed = linkedinUrlDisplayed;
		this.twitterDisplayed = twitterDisplayed;
		this.adresseDisplayed = adresseDisplayed;
		this.birthdateDisplayed = birthdateDisplayed;
	}
	public boolean isPhoneDisplayed() {
		return phoneDisplayed;
	}
	public void setPhoneDisplayed(boolean phoneDisplayed) {
		this.phoneDisplayed = phoneDisplayed;
	}
	public boolean isFbUrlDisplayed() {
		return fbUrlDisplayed;
	}
	public void setFbUrlDisplayed(boolean fbUrlDisplayed) {
		this.fbUrlDisplayed = fbUrlDisplayed;
	}
	public boolean isLinkedinUrlDisplayed() {
		return linkedinUrlDisplayed;
	}
	public void setLinkedinUrlDisplayed(boolean linkedinUrlDisplayed) {
		this.linkedinUrlDisplayed = linkedinUrlDisplayed;
	}
	public boolean isTwitterDisplayed() {
		return twitterDisplayed;
	}
	public void setTwitterDisplayed(boolean twitterDisplayed) {
		this.twitterDisplayed = twitterDisplayed;
	}
	public boolean isAdresseDisplayed() {
		return adresseDisplayed;
	}
	public void setAdresseDisplayed(boolean adresseDisplayed) {
		this.adresseDisplayed = adresseDisplayed;
	}
	public boolean isBirthdateDisplayed() {
		return birthdateDisplayed;
	}
	public void setBirthdateDisplayed(boolean birthdateDisplayed) {
		this.birthdateDisplayed = birthdateDisplayed;
	}

}
