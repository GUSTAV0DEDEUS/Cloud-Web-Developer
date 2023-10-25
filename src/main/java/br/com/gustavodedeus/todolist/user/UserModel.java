package br.com.gustavodedeus.todolist.user;
import io.swagger.annotations.ApiModelProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "tb_users")
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID")
    @ApiModelProperty(hidden = true)
    private UUID id;

    private String name;
    private String userAge;
    private double firstNote;

    private double secondNote;
    private String nameTeacher;
    private String numberClass;

}
