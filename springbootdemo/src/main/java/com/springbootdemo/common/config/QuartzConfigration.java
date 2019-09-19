package com.springbootdemo.common.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfigration {

	/*@Autowired
	JobFactory jobFactory;


	@Bean
	public SchedulerFactoryBean schedulerFactoryBean() {
		SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
		try {
			schedulerFactoryBean.setOverwriteExistingJobs(true);
			schedulerFactoryBean.setQuartzProperties(quartzProperties());
			schedulerFactoryBean.setJobFactory(jobFactory);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return schedulerFactoryBean;
	}

	// 指定quartz.properties
	@Bean
	public Properties quartzProperties() throws IOException {
		PropertiesFactoryBean propertiesFactoryBean = new PropertiesFactoryBean();
		propertiesFactoryBean.setLocation(new ClassPathResource("/config/quartz.properties"));
		propertiesFactoryBean.afterPropertiesSet();
		return propertiesFactoryBean.getObject();
	}

	// 创建schedule
	@Bean(name = "scheduler")
	public Scheduler scheduler() {
		return schedulerFactoryBean().getScheduler();
	}*/
}
