package todo;

import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration {
	
	@Autowired
    private Environment env;    
	
	@Override
    public String getDatabaseName(){
        return "todo";
    }

    @Bean
	@Override
	public MongoClient mongoClient() {
    	String dbUrl = "localhost";
    	
    	if (env.getProperty("MONGO_URL") != null) {
    		dbUrl = env.getProperty("MONGO_URL");
    	}
    	
    	System.out.println("============MONGO_URL========" + env.getProperty("MONGO_URL").toString());
    	System.out.println("============dbUrl========" + dbUrl);
		return new MongoClient(dbUrl);
	}
}