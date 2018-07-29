package ru.bellintegrator.practice.Org.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.bellintegrator.practice.Org.model.Org;
import ru.bellintegrator.practice.Org.service.OrgService;
import ru.bellintegrator.practice.Org.service.OrgServiceImpl;
import ru.bellintegrator.practice.Org.view.OrgView;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/", produces = APPLICATION_JSON_VALUE)
public class OrgController {

    private final OrgService orgService;

    @Autowired
    public OrgController(OrgService orgService) {
        this.orgService = orgService;
    }

    @ApiOperation(value = "getOrg_url_2", nickname = "getOrg", httpMethod = "GET") // запрашваем весь список организаций
    @GetMapping("/Org")
    public List<Org> qwe() {
        return orgService.getAllOrg();
    }


    @ApiOperation(value = "addOrg_url_4", nickname = "addOrg", httpMethod = "POST") // добавляем организации в базу
    @PostMapping("/Org")
    public void orgs_add (@RequestBody OrgView org) {}


    @ApiOperation(value = "listfiltr_Org_url_1", nickname = "filterOrg", httpMethod = "POST") // запрашиваем организации по Name
    @PostMapping("/Org/listfiltr")
    public Org loadByName(@RequestBody String Name) {
        return orgService.loadByName(Name);
    }

}
