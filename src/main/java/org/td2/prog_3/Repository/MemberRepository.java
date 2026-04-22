package org.td2.prog_3.Repository;

import org.springframework.stereotype.Repository;
import org.td2.prog_3.Model.Member;

import java.util.ArrayList;
import java.util.List;


@Repository
public class MemberRepository {

    private List<Member> data = new ArrayList<>();

    public void save(Member member) {
        data.add(member);
    }

    public List<Member> findAll() {
        return data;
    }
}