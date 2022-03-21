package com.as.warehouse.controller;

import com.as.warehouse.model.Tool;
import com.as.warehouse.service.ToolService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/tools")
public class ToolController {

    private ToolService toolService;

    public ToolController(ToolService toolService) {
        this.toolService = toolService;
    }

    @GetMapping()
    public ResponseEntity<List<Tool>> getTools(){
        return toolService.getListOfTools();
    }

    @GetMapping("/{id}")
    public Tool getTool(@PathVariable Long id){
        return toolService.getToolById(id);
    }

    @PostMapping()
    public Tool addTool(@RequestBody @Valid Tool tool){
        return toolService.addTool(tool);
    }

    @DeleteMapping({"/{id}"})
    public void deleteTool(@PathVariable Long id){
        toolService.deleteTool(id);
    }

}
