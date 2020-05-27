package com.zhang.eblog.service.impl;

import com.zhang.eblog.entity.UserMessage;
import com.zhang.eblog.mapper.UserMessageMapper;
import com.zhang.eblog.service.UserMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 张
 * @since 2020-05-27
 */
@Service
public class UserMessageServiceImpl extends ServiceImpl<UserMessageMapper, UserMessage> implements UserMessageService {

}
