package com.onpe.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.onpe.model.Grupo;
import com.onpe.repository.IGrupo;

public class GrupoService implements IGrupoService{

	@Autowired
	private IGrupo igrupo;
	
	@Override
	public Grupo getGrupo(String id) {
		return igrupo.getGrupo(id);
	}

}
