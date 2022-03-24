package com.as.warehouse.service;

import com.as.warehouse.model.Tool;
import com.as.warehouse.repository.ToolRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToolServiceImpl implements ToolService {

    private final ToolRepository toolRepository;

    public ToolServiceImpl(ToolRepository toolRepository) {
        this.toolRepository = toolRepository;
    }

    public Tool getToolById(Long id) {
        return toolRepository.getById(id);
    }

    public ResponseEntity<List<Tool>> getListOfTools() {
        return ResponseEntity.ok(toolRepository.findAll());
    }

    public Tool addTool(Tool tool) {
        return toolRepository.save(tool);
    }

    public void deleteTool(Long id) {
        toolRepository.deleteById(id);
    }

    public Long getToolQuantity(Long id) {
        Tool tool = toolRepository.findById(id).orElseThrow(()->new NullPointerException());
        return tool.getQuantity();
    }
}
