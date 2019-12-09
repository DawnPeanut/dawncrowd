package com.dawn.crowd.server.impl;

import com.dawn.crowd.mapper.MemberPOMapper;
import com.dawn.crowd.server.api.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberPOMapper memberPOMapper;

}
