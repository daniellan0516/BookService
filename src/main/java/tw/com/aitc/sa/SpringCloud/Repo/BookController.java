package tw.com.aitc.sa.SpringCloud.Repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

import javax.websocket.server.PathParam;

@RestController
@Tag(name = "書介面", description = "書相關CRUD介面")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/api/v1/book",  produces = "application/json;charset=UTF-8")
    @Operation(summary = "取得所有書籍的清單")
    public List<Book> getAll() {
        List<Book> result = bookRepository.findAll();
        System.out.println(result);
        return result;
    }

    @GetMapping("/hi/{name}")
    public String hi(@PathVariable("name") String name) {
        return "HI，" + name + "你好";
    }
}
