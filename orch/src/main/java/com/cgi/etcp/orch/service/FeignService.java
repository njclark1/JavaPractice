package com.cgi.etcp.orch.service;

import com.cgi.etcp.orch.dto.OwnerDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="orch", url="${com.cgi.etcp.orch.ownerURL}")
public interface FeignService {

    @GetMapping("/{id}")
    OwnerDTO read(
            @RequestHeader(name="Authorization", defaultValue = "") final String secret,
            @PathVariable("id") final int pId
    );
}

