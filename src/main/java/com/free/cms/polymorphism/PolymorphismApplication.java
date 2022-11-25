package com.free.cms.polymorphism;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.free.cms.polymorphism.domain.*;
import com.free.cms.polymorphism.repository.BackMarginConfigurationRepository;
import com.free.cms.polymorphism.repository.BtobConfigurationRepository;
import com.free.cms.polymorphism.repository.ConfigurationRepository;
import com.free.cms.polymorphism.repository.UmeConfigurationRepository;

@SpringBootApplication
public class PolymorphismApplication implements CommandLineRunner {

	private final ConfigurationRepository configurationRepository;
	private final BtobConfigurationRepository btobConfigRepository;
	private final UmeConfigurationRepository umeConfigurationRepository;

	private final Logger log = LoggerFactory.getLogger(PolymorphismApplication.class);
	
	public PolymorphismApplication(ConfigurationRepository configurationRepository,
			BtobConfigurationRepository btobConfigRepository,
			UmeConfigurationRepository umeConfigurationRepository) {
		this.configurationRepository = configurationRepository;
		this.btobConfigRepository = btobConfigRepository;
		this.umeConfigurationRepository = umeConfigurationRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(PolymorphismApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// BtobConfiguration btobConfig = new BtobConfiguration();
		// btobConfigRepository.save(btobConfig);
		// Configuration conf = new Configuration();
		// conf.setConfigurable(btobConfig);
		// configurationRepository.save(conf);
		Configuration config = configurationRepository.findById(10L).get();

		Configurable cfAble = config.getConfigurable();
		System.out.println("****************************************************************");
		log.info("MX {}", cfAble instanceof BtobConfiguration);
		
	}

}
