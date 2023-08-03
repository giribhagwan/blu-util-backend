package com.embel.pectrotec.bluetoothUtil.service;

import com.embel.pectrotec.bluetoothUtil.domain.DeviceStream;
import com.embel.pectrotec.bluetoothUtil.repository.DeviceStreamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class DeviceStreamService {
    @Autowired
    DeviceStreamRepository deviceStreamRepository;
    public String save(DeviceStream deviceStream){
        deviceStreamRepository.save(deviceStream);
        return "Saved";
    }

    public DeviceStream get(Long id) {
        return deviceStreamRepository.findById(id)
                .get();
    }

    public List<DeviceStream> getAll() {
       return deviceStreamRepository.findAll();
    }

    public List<DeviceStream> getByProcessNumber(String processNumber, Timestamp fromDate, Timestamp toDate) {
       return deviceStreamRepository.findByProcessNumberAndCreatedTimestampBetween(processNumber,fromDate,toDate);
    }

    public List<DeviceStream> getByProcessNumber(String jobType, String workOrderNumber) {
        return null;
    }
}
