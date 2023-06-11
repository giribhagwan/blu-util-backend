package com.embel.pectrotec.bluetoothUtil.controller;

import com.embel.pectrotec.bluetoothUtil.domain.DeviceStream;
import com.embel.pectrotec.bluetoothUtil.service.DeviceStreamService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<DeviceStream> getByWorkOrderNo(@RequestParam String workOrderNumber){
        return deviceStreamService.getByWorkOrderNo(workOrderNumber);
    }
    @GetMapping("/getStreamBy")
    public List<DeviceStream> getByWorkOrderNo(@RequestParam String workOrderNumber,
                                               @RequestParam String jobType){
        return deviceStreamService.getByWorkOrderNo(jobType,workOrderNumber);
    }
}
