package com.embel.pectrotec.bluetoothUtil.repository;

import com.embel.pectrotec.bluetoothUtil.domain.DeviceStream;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeviceStreamRepository extends JpaRepository<DeviceStream,Long> {

    List<DeviceStream> findByWorkOrderNo(String orderNumber);

    List<DeviceStream> findByJobTypeAndWorkOrderNo(String jobType, String workOrderNumber);
}
