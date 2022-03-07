package com.cgi.etcp.orch.dto;

import lombok.Data;
import java.util.Date;

//create the structure of the object from the database

@Data
public class OwnerDTO {

    private int id;
    private String name;
    private String language;
    private Date created;
    private String createdBy;
    private Date updated;
    private String updatedBy;


}
