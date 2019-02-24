package com.bjb.entitlement.entitlementgenerator2.Batch;

import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.batch.item.database.JpaPagingItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bjb.entitlement.entitlementgenerator2.DAOService.EntitlementDAO;
import com.bjb.entitlement.entitlementgenerator2.Entity.DiaryEntity;
import com.bjb.entitlement.entitlementgenerator2.Entity.EntitlementEntity;


@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
 
 @Autowired
 public JobBuilderFactory jobBuilderFactory;
 
 @Autowired
 public StepBuilderFactory stepBuilderFactory;
 
 @Autowired
 public DataSource dataSource;
 
 @Autowired
 EntityManagerFactory emf;
 
 @Autowired
 EntitlementDAO entitlementDAO;
 
 @Autowired
 DiaryEntity diaryDAO;
 
 @Autowired
 DiaryEntity diaryEntity;
 
 /*@Autowired
 EntitlementEntity entitlementEntity;*/
 
 
 /*************************************************************************/
 // 				READER	
 /*************************************************************************/
 @Bean
 public JpaPagingItemReader<DiaryEntity> demoJobReader()  {
     String jpqlQuery = "select d from DiaryEntity d where status ='NSNG'";
     JpaPagingItemReader<DiaryEntity> reader = new JpaPagingItemReader<>();
     reader.setQueryString(jpqlQuery);
     reader.setEntityManagerFactory(emf);
     reader.setPageSize(1000);
	 try {
		reader.afterPropertiesSet();
	} catch (Exception e) {
		e.printStackTrace();
	}    
     reader.setSaveState(true);

     return reader;
 }
 
 /*************************************************************************/
 // 				PROCESSOR	
 /*************************************************************************/
 @Bean
 public ItemProcessor<DiaryEntity, List<EntitlementEntity>> customprocessor() {
     return new entGenProcessor();
 }
 
 /*************************************************************************/
 // 				WRITER	
 /*************************************************************************/
 
 @Bean
 public ItemWriter<List<EntitlementEntity>> writer() {
     return new EntGenWriter();
 }
 
 /*************************************************************************/
 // 				BATCH JOB RUN	
 /*************************************************************************/
 @Bean
 public Step step1() {
  return stepBuilderFactory.get("step1")
    .<DiaryEntity, List<EntitlementEntity>> chunk(10)
    .reader(demoJobReader())
    .processor(customprocessor())
    .writer(writer())
    .build();
 }
 
 @Bean
 public Job importEntitlementJob() {   
  return jobBuilderFactory.get("importEntitlementJob")
    .incrementer(new RunIdIncrementer())
    .flow(step1())
    .end()
    .build();
    
 }
}
