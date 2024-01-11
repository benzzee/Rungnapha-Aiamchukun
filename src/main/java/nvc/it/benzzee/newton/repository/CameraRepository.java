package nvc.it.benzzee.newton.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import nvc.it.benzzee.newton.model.Camera;

public interface CameraRepository extends CrudRepository <Camera, Integer>{
    List<Camera> findByIpAddress(String ipAddress);
    List<Camera> findByLocation(String location);
}
