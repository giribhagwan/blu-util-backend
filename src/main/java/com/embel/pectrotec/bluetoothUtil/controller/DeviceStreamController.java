package com.embel.pectrotec.bluetoothUtil.controller;

import com.embel.pectrotec.bluetoothUtil.domain.DeviceStream;
import com.embel.pectrotec.bluetoothUtil.service.DeviceStreamService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/deviceStream")
public class DeviceStreamController {

    private final DeviceStreamService deviceStreamService;

    @PostMapping("")
    public String save(@RequestBody DeviceStream deviceStream){
        return deviceStreamService.save(deviceStream);
    }
    @GetMapping("/{id}")
    public DeviceStream get(@PathVariable Long id){
        return deviceStreamService.get(id);
    }
    @GetMapping("")
    public List<DeviceStream> getAll(){
        return deviceStreamService.getAll();
    }

    @GetMapping("/getStream")
    public List<DeviceStream> getByProcessNumber(
            @RequestParam String processNumber,
            @RequestParam("fromDate") Timestamp fromDate,
            @RequestParam("toDate") Timestamp toDate){
        return deviceStreamService.getByProcessNumber(processNumber,fromDate,toDate);
    }
    @GetMapping("/getStreamBy")
    public List<DeviceStream> getByWorkOrderNo(@RequestParam String workOrderNumber,
                                               @RequestParam String jobType){
        return deviceStreamService.getByProcessNumber(jobType,workOrderNumber);
    }

}
