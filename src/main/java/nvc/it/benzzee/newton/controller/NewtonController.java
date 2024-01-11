package nvc.it.benzzee.newton.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nvc.it.benzzee.newton.model.Camera;
import nvc.it.benzzee.newton.repository.CameraRepository;


@RestController
@RequestMapping("/camera")
public class NewtonController {
    @Autowired
    private CameraRepository cameraRepository;
    

    @GetMapping("")
    public Iterable<Camera> getAll(){
        return cameraRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Camera> getById(@PathVariable int id){
        return cameraRepository.findById(id);
    }

    @GetMapping("ip/{ip_address}")
    public Iterable<Camera> getByIpAddress(@PathVariable String ip_address){
        return cameraRepository.findByIpAddress(ip_address);
    }

    @GetMapping("location/{location}")
    public Iterable<Camera> getByLocation(@PathVariable String location){
        return cameraRepository.findByLocation(location);
    }

    @PostMapping("")
    public ResponseEntity<Camera> create(@RequestBody Camera camera){
        Camera newCamera = cameraRepository.save(camera);
        return ResponseEntity.status(HttpStatus.CREATED).body(newCamera);
    }

   

    

}
