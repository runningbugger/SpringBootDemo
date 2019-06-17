package io.runningbug;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.runningbug.dao")
public class RunningBugApplication {

	public static void main(String[] args) {
		SpringApplication.run(RunningBugApplication.class, args);
	}

}
