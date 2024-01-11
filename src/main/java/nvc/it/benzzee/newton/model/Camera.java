package nvc.it.benzzee.newton.model;


import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor
@JsonIgnoreProperties({"hibernatelazyInitializer", "handler"})
public class Camera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ipAddress;
    private String name;
    private String location;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "camera")
    private List<Event> Events;

    public Camera(String IpAddress, String name, String location) {
        this.ipAddress = IpAddress;
        this.name = name;
        this.location = location;
        
    }
    

      

    
}
