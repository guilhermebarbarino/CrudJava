package Tarefas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value =  "/tarefas", produces = MediaType.APPLICATION_JSON_VALUE)
public class TarefasApi {
	
	@Autowired
	private TarefasFacade tarefasFacade;
	
	@PostMapping
	@ResponseBody
	public TarefaDto criar(@RequestBody TarefaDto tarefaDto) {
		return tarefasFacade.criar(tarefaDto);
	}
	
	@PutMapping("/{tarefaId}")
	@ResponseBody
	public TarefaDto ataulizar(@PathVariable("tarefaId") Long tarefaId,
			@RequestBody TarefaDto tarefaDto) {
		return tarefasFacade.atualizar(tarefaDto, tarefaId);
	}
	
	@GetMapping
	@ResponseBody
	public List<TarefaDto> getall(){
		return tarefasFacade.getAll();		
	}
	
	@DeleteMapping("/{tarefaId}")
	@ResponseBody
	public String deletar(@PathVariable("tarefaId") Long tarefaId) {
		return tarefasFacade.delete(tarefaId);
	}
	
	
	

}
