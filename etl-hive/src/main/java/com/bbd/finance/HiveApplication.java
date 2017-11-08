/**
 * BBD Service Inc
 * All Rrights Reserved@2017
 */
package com.bbd.finance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import static java.util.stream.Collectors.*;

/**
 *
 * @author moumao
 * @version $Id: HiveApplication.java, v 0.1 2017/11/3 10:50 moumao Exp $$
 */
@SpringBootApplication
@EnableScheduling
public class HiveApplication {
    public static void main(String[] args){
        SpringApplication.run(HiveApplication.class,args);
    }
}
