package com.aleadin.train.startup;

import java.io.IOException;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.BeansException;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EnableConfigurationProperties({ com.aleadin.train.startup.DBConfig.DBConf.class })
public class DBConfig  implements ApplicationContextAware{

	private Log log = LogFactory.getLog(DBConfig.class);
	private ApplicationContext ctx;

	@Bean(name = "sdkserver_datasource")
	@Primary
	DataSource sdkserver_datasource(DBConf dbConf) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:oracle:thin:@" + dbConf.getIp() + ":" + dbConf.getPort() + ":" + dbConf.getSid();
		dataSource.setUrl(url);
		dataSource.setUsername(dbConf.getUser());
		dataSource.setPassword(dbConf.getPassword());
		dataSource.setMinIdle(dbConf.getMinIdle());
		dataSource.setMinIdle(dbConf.getMaxIdle());
		dataSource.setMaxActive(dbConf.getMaxActive());
		log.info("sdkserver center database url is " + url + ", user is  " + dbConf.getUser());
		return dataSource;
	}

	@Bean(name = "sdkserver_sqlsession")
	@DependsOn("sdkserver_datasource")
	SqlSessionFactoryBean sqlSessionFactory() throws IOException {
		SqlSessionFactoryBean sqlSession = new SqlSessionFactoryBean();
		sqlSession.setDataSource(ctx.getBean("sdkserver_datasource", DataSource.class));
		sqlSession.setTypeAliasesPackage("com.seasun.powerking.sdkportal.dao.vo");
		sqlSession.setConfigLocation(new ClassPathResource("com/seasun/powerking/sdkportal/dao/mapper/mybatis_config.xml"));
		Resource[] resources = new PathMatchingResourcePatternResolver()
				.getResources("classpath:com/seasun/powerking/sdkportal/dao/mapper/*mapper.xml");
		sqlSession.setMapperLocations(resources);
		return sqlSession;
	}

	@Bean(name = "sdkserver_transactionmanager")
	@DependsOn("sdkserver_datasource")
	PlatformTransactionManager sdkserver_transactionManager() {
		return new DataSourceTransactionManager(ctx.getBean("sdkserver_datasource", DataSource.class));
	}

	@Bean(name = "sdkserver_mapper")
	MapperScannerConfigurer mapperScannerConfigure() {
		MapperScannerConfigurer scanner = new MapperScannerConfigurer();
		scanner.setBasePackage("com.seasun.powerking.sdkportal.dao.service");
		scanner.setSqlSessionFactoryBeanName("sdkserver_sqlsession");
		return scanner;
	}
	
	@Bean(name = "sdkserver_jdbc")
	@DependsOn("sdkserver_datasource")
	public JdbcTemplate sdkserver_jdbcTemplate(DataSource sdkserver_datasource) {
		return new JdbcTemplate(sdkserver_datasource);
	}

	@ConfigurationProperties(prefix = "db")
	public static class DBConf {
		private String driverClassName;
		private String url;
		private String ip;
		private int port;
		private String user;
		private String password;
		private String sid;
		private int minIdle;
		private int maxIdle;
		private int maxActive;

		public String getSid() {
			return sid;
		}

		public void setSid(String sid) {
			this.sid = sid;
		}

		public String getIp() {
			return ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		public String getUser() {
			return user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getMaxIdle() {
			return maxIdle;
		}

		public void setMaxIdle(int maxIdle) {
			this.maxIdle = maxIdle;
		}

		public int getMaxActive() {
			return maxActive;
		}

		public void setMaxActive(int maxActive) {
			this.maxActive = maxActive;
		}

		public int getMinIdle() {
			return minIdle;
		}

		public void setMinIdle(int minIdle) {
			this.minIdle = minIdle;
		}

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ctx = applicationContext;
	}    

	@Bean(name = "sdkserver_transactionmanager")
	@DependsOn("sdkserver_datasource")
	PlatformTransactionManager analytics_transactionManager() {
		return new DataSourceTransactionManager(ctx.getBean("sdkserver_datasource", DataSource.class));
	}
}
