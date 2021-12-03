package snippet;

public class Snippet {
	public static void main(String[] args) {
		<plugin>
		    <groupId>org.apache.maven.plugins</groupId>
		    <artifactId>maven-surefire-plugin</artifactId>
		    <version>2.19.1</version>
		    <dependencies>
		        <dependency>
		            <groupId>org.junit.platform</groupId>
		            <artifactId>junit-platform-surefire-provider</artifactId>
		            <version>1.1.0</version>
		        </dependency>
		        <dependency>
		            <groupId>org.junit.jupiter</groupId>
		            <artifactId>junit-jupiter-engine</artifactId>
		            <version>5.1.0</version>
		        </dependency>
		    </dependencies>
		</plugin>
	}
}

