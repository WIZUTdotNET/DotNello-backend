package pl.dotnet.dotnellobackend.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @NotEmpty
    private String userName;
    @Email
    private String email;
    @NotEmpty
    private String password;

    @OneToMany
    private List<UserTable> tables;

    public void addTable(UserTable table) {
        tables.add(table);
    }

    public void removeTable(TaskTable table) {
        tables.remove(table);
    }
}
