package br.com.etechoracio.common.view;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.common.business.CursoSB;
import br.com.etechoracio.common.model.Curso;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope ("view")
public class CursoMB extends BaseMB {

	@Autowired
	private CursoSB cursoSB;
	
	private Curso edit = new Curso();
	
}
