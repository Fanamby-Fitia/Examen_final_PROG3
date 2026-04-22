package org.td2.prog_3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.td2.prog_3.Model.Member;
import org.td2.prog_3.Services.MemberServices;

@RestController
public class MemberController {

    private MemberServices service;

    public MemberController(MemberServices service) {
        this.service = service;
    }

    @PostMapping("/members")
    public Member admitMember(@RequestBody Member member) {
        return service.addMember(member);
    }
}