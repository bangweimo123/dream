package com.dream.netty.common.coder;

import com.dream.netty.common.domain.INettyRequest;
import com.dream.netty.common.domain.INettyResponse;

/**
 * 将获取的消息转化成我们需要的nettyRequest
 * 
 * @author mobangwei
 *
 */
public interface INettyMessageHandler {

	INettyRequest handlerForMsg(Object msg);

	Object handlerToMsg(INettyResponse response);
}
