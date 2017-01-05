package flatinfo.core.services.util;

import java.util.ArrayList;
import java.util.List;

import flatinfo.core.models.entities.owner.OwnerEntity;

public class OwnerEntityList {
	private List<OwnerEntity> owners = new ArrayList<OwnerEntity>();

	public OwnerEntityList(List<OwnerEntity> owners) {
		super();
		this.owners = owners;
	}

	public List<OwnerEntity> getOwners() {
		return owners;
	}

	public void setOwners(List<OwnerEntity> owners) {
		this.owners = owners;
	}


}
