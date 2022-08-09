package tw.com.aitc.sa.SpringCloud.Repo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.swagger.v3.oas.annotations.media.Schema;


@Data
@Entity
@Schema(name = "書", description = "書的實體定義")
public class Book {
    @Id
    @GeneratedValue
    private Integer bookid;
    private String name;
    private String author;
}
