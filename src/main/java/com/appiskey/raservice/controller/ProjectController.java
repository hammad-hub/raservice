package com.appiskey.raservice.controller;

import com.appiskey.raservice.model.Project;
import com.appiskey.raservice.service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "${app.url}" + "/project")
public class ProjectController extends BaseController<ProjectService,Project>{

//    @PostMapping("/pro")
//    @ResponseStatus(value = HttpStatus.CREATED)
//    public Project insert(@RequestBody Project item) {
//        p
//        return service.insert(item);
//    }

}
