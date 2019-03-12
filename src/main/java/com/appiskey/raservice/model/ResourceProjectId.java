package com.appiskey.raservice.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceProjectId implements Serializable {

    @Column(name = "resource_id")
    private Integer resourceId;

    @Column(name = "project_id")
    private Integer projectId;

}