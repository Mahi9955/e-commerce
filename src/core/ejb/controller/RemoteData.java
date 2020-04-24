package core.ejb.controller;

import javax.ejb.Remote;

import core.bean.Moviee;

//@Remote
public interface RemoteData {
	
	public String save(Moviee movie);
}
