package com.as.warehouse.service;

import com.as.warehouse.model.Tool;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ToolService {

    Tool getToolById(Long id);

    ResponseEntity<List<Tool>> getListOfTools();

    Tool addTool(Tool tool);

    void deleteTool(Long id);

}
