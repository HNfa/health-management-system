package com.tftte.service;

import com.tftte.pojo.Member;

import java.util.List;

/**
 * @Author: tftte
 * @Date: 2020/3/27 13:57
 * @Description:
 */
public interface MemberService {

    Member findByTelephone(String telephone);

    void addMember(Member member);

    List<Integer> findMemberCountByMonths(List<String> months);
}
