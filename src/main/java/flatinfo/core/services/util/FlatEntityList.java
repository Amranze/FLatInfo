package flatinfo.core.services.util;

import java.util.ArrayList;
import java.util.List;

import flatinfo.core.models.entities.flat.FlatEntity;


public class FlatEntityList {
	private List<FlatEntity> flats = new ArrayList<FlatEntity>();

	public FlatEntityList(List<FlatEntity> flats) {
		super();
		this.flats = flats;
	}

	public List<FlatEntity> getFlats() {
		return flats;
	}

	public void setFlats(List<FlatEntity> flats) {
		this.flats = flats;
	}
}
