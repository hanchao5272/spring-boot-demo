package pers.hanchao.springbootdemo.hello;

import org.hamcrest.Matchers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URL;

import static org.junit.Assert.assertThat;


/**
 * HelloController Tester.
 *
 * @author hanchao
 * @version 1.0
 * @since <pre>06/10/2018</pre>
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTest {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;


    @Before
    public void before() throws Exception {
        this.base = new URL("http://localhost:" + port + "/hello/david/");
    }

    @After
    public void after() throws Exception {

    }

    /**
     * Method: hello(@PathVariable("name") String name)
     */
    @Test
    public void testHello() throws Exception {
        //通过TestRestTemplate获取响应实体
        ResponseEntity<String> response = template.getForEntity(base.toString(), String.class);

        //进行响应结果判断
        assertThat(response.getBody(), Matchers.equalTo("Hello World, david"));
    }
}
