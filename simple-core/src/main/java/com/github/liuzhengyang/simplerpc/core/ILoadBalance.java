package com.github.liuzhengyang.simplerpc.core;

/**
 * Description:
 *
 * @author liuzhengyang
 * @version 1.0
 * @since 2016-12-16
 */
public interface ILoadBalance {
	RpcClient select();
}
