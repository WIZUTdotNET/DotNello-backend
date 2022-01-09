package pl.dotnet.dotnellobackend.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TaskTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private List<UserTable> users;

    public void addTable(UserTable user) {
        users.add(user);
    }

    public void removeTable(UserTable user) {
        users.remove(user);
    }
}
