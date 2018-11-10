package todo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration {
    @Override
    public String getDatabaseName(){
        return "todo";
    }

    @Bean
	@Override
	public MongoClient mongoClient() {
		return new MongoClient("localhost");
	}
}