package com.udemy.demospringbatchv5.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoSpringBatchConfig {
	private final JobRepository jobRepository;

	public DemoSpringBatchConfig(JobRepository jobRepository) {
		this.jobRepository = jobRepository;
	}

	@Bean
	Job imprimeOlaJob(Step imprimeOlaStep) {
		return new JobBuilder("imprimeOlaJob", jobRepository)
				.start(imprimeOlaStep)
				.incrementer(new RunIdIncrementer())
				.build();
	}
}
