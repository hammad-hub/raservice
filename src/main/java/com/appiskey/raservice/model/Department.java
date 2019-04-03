package com.appiskey.raservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.util.List;

/**
 * Created by khawar on 1/30/19.
 */

@EqualsAndHashCode(callSuper=true)
@Data
@Entity
@Table
public class Department extends BaseModel{
//    private String departmentName;
  //  private String departmentHod;
    private int departmentBench;

//    @OneToMany
//    @JoinColumn(name = "resource_id")
//    private List<Resource> departmentResources;


    @ManyToOne
    @JoinColumn(name="resource_id")
    @NotFound(action= NotFoundAction.IGNORE)
    @JsonIgnore
    private Resource departmentHod;

}
