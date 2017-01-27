/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.abraham.sistema.data;

import java.util.List;


import com.abraham.sistema.model.Usuario;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UsuarioDaoImpl implements UsuarioDao {
    
	
	@Autowired
    private SessionFactory sessionFactory;

    @Override
        public void register(Usuario usuario) {
    	 BasicConfigurator.configure();
		Logger log = Logger.getLogger("Logger de Ejemplo");
    	log.warn("En el dao impl antes de insert"+usuario);

		sessionFactory.getCurrentSession().beginTransaction();
		sessionFactory.getCurrentSession().save(usuario);
		sessionFactory.getCurrentSession().getTransaction().commit();
    	
    	
			log.warn("En el dao impl segun despues de insert"+usuario);
    
      
        return;
    }

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario findByName(String nombreu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> findAllOrderedByName() {
		// TODO Auto-generated method stub
		return null;
	}
}
