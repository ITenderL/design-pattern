    package com.itender.design.strategy;


    import lombok.extern.slf4j.Slf4j;

    /**
     * @Author: ITender
     * @CreateTime: 2022-02-19 21:33
     * @Description: 淘汰最后
     */
    public class LastEvictionStrategy implements EvictionStrategy {

        @Override
        public void evictionCache() {
            System.out.println("淘汰最后一名！");
        }
    }
