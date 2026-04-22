package org.td2.prog_3.Services;

import org.springframework.stereotype.Service;
import org.td2.prog_3.Exception.BadRequestException;
import org.td2.prog_3.Exception.NotFoundException;
import org.td2.prog_3.Model.Member;
import org.td2.prog_3.Repository.CollectivityRepository;
import org.td2.prog_3.Repository.MemberRepository;


@Service
public class MemberServices {

    private MemberRepository memberRepository;
    private CollectivityRepository collectivityRepository;

    public MemberServices(MemberRepository memberRepository, CollectivityRepository collectivityRepository) {
        this.memberRepository = memberRepository;
        this.collectivityRepository = collectivityRepository;
    }

    public Member addMember(Member member) {

        if (collectivityRepository.findById(member.getCollectivityId()).isEmpty()) {
            throw new NotFoundException("Collectivity does not exist");
        }

        if (member.getGender() == null || member.getGender().isEmpty()) {
            throw new BadRequestException("Gender is required");
        }

        memberRepository.save(member);
        return member;
    }
}