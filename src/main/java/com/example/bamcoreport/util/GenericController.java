package com.example.bamcoreport.util;

import com.example.bamcoreport.services.CrudService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
public abstract class GenericController<D, E> {

    private final CrudService<D, E> service;

    public GenericController(CrudService<D, E> service) {
        this.service = service;
        log.info("CrudController created");
    }

    @GetMapping(value = {"", "/"})
    @ApiOperation(value = "List all ")
    //@ApiImplicitParam(name = "Authorization", value = "Bearer token", required = true, dataType = "string", paramType = "header")
    public ResponseEntity<List<D>> getAll() {
        try {
            log.info("getting all : " + service.getClass().getSimpleName() + " successfully");
            return ResponseEntity.ok(service.getAll());

        } catch (Exception e) {
            log.error("Error while getting all entities", e.getMessage());
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping(value = {"/{id}"})
    @ApiOperation(value = "Get by id")
    @ApiImplicitParam(name = "id", value = "Entity id", required = true, dataType = "Long", paramType = "path")
    public ResponseEntity<D> getById(@PathVariable Long id) {
        return (ResponseEntity<D>) ResponseEntity.ok(service.find(id));
    }

    @PostMapping(value = {"", "/"})
    @ApiOperation(value = "Create a new one")
    @ApiImplicitParam(name = "entity", value = "Entity", required = true, dataType = "E", paramType = "body")
    public ResponseEntity<D> create(E entity) {
        return (ResponseEntity<D>) ResponseEntity.ok(service.create(entity));
    }


    @PutMapping(value = {"/{id}"})
    @ApiOperation(value = "Update by id")
     @ApiImplicitParam(name = "id", value = "Entity id", required = true, dataType = "Long", paramType = "path")
    public ResponseEntity<D> update(@PathVariable Long id, E entity) {
        return (ResponseEntity<D>) ResponseEntity.ok(service.update(id, entity));
    }

    @DeleteMapping(value = {"/{id}"})
    @ApiOperation(value = "Delete  by id")
    @ApiImplicitParam(name = "id", value = "Entity id", required = true, dataType = "Long", paramType = "path")
    public ResponseEntity<D> delete(@PathVariable Long id) {
        Optional<D> optional = (Optional<D>) service.find(id);
        if (optional.isPresent()) {
            service.delete(id);
        }
        return (ResponseEntity<D>) ResponseEntity.ok(optional.get());

    }

}
