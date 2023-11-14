package Tarefas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TarefasFacade {
	private static final Map<Long, TarefaDto> tarefas = new HashMap<>();
	
	public TarefaDto criar(TarefaDto tarefaDto) {
		Long proximoId = tarefas.keySet().size() + 1L;
		tarefaDto.setId(proximoId);
		tarefas.put(proximoId, tarefaDto);
		return tarefaDto;
	}
	
	public TarefaDto atualizar(TarefaDto tarefaDto, Long tarefaId) {
		tarefas.put(tarefaId, tarefaDto);
		return tarefaDto;
	}
	
	public TarefaDto getById (long tarefaId) {
		return tarefas.get(tarefas);
	}
	
	public List<TarefaDto> getAll () {
		return new ArrayList<>(tarefas.values());
	}
	
	public String delete (Long tarefaId) {
		tarefas.remove(tarefaId);
		return "DELETADO";
	}

}
