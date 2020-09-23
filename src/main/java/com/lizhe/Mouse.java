package com.lizhe;

/**
 * @Auther: lizhe
 * @Date: 2020/9/6 - 09 - 06 - 16:49
 * @Description:com.lizhe
 * @version: 1.0
 */
@FunctionalInterface
public interface Mouse<E,T,V> {
    void steal(E rice,T m,V n);
}
