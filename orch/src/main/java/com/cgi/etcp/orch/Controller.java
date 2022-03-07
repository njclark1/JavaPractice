package com.cgi.etcp.orch;


import com.cgi.etcp.orch.dto.OwnerDTO;
import com.cgi.etcp.orch.service.FeignService;
import com.cgi.etcp.orch.service.OwnerService;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/orchestrate/v1")
public class Controller {

    @Autowired private FeignService feignService;
    @Autowired private Properties properties;

    @GetMapping("/owner/{ownerId}")
    public OwnerDTO getOwner(@PathVariable("ownerId") final int pOwnerId) {
        /* return ownerService.getOwner(pOwnerId) */
        return feignService.read(properties.getSecret(), pOwnerId);
                //.orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

/*    @PostMapping("/owner/setLang")
    public OwnerDTO setLang(
            @RequestParam("id") final int pOwnerId,
            @RequestBody() final OwnerDTO pDTO){
        return ownerService.setLanguage(pOwnerId, pDTO.getLanguage())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.EXPECTATION_FAILED));
    }*/
}
