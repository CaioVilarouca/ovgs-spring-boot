package com.api.ovgs.controller;

import com.api.ovgs.dto.SchedulingReponseDTO;
import com.api.ovgs.dto.SchedulingResquetDTO;
import com.api.ovgs.service.SchedulingService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/scheduling")
public class SchedulingController {

    private final SchedulingService schedulingService;

    public SchedulingController(SchedulingService schedulingService) {
        this.schedulingService = schedulingService;
    }

    @PostMapping
    public SchedulingReponseDTO createScheduling(@RequestBody SchedulingResquetDTO schedulingResquetDTO){
        return schedulingService.createNewScheduling(schedulingResquetDTO);
    }
}
