package uk.co.caprica.vlcjplayer.api.model.plex;

import com.google.gson.annotations.SerializedName;

public class CollectionItem{

	@SerializedName("tag")
	private String tag;

	public String getTag(){
		return tag;
	}
}