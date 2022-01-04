package pl.dotnet.dotnellobackend.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.util.List;

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
    private List<TaskTable> ownedTaskTables;

    @ManyToMany
    private List<TaskTable> memberedTaskTables;

    public void addOwnedTaskTable(TaskTable table) {
        ownedTaskTables.add(table);
    }

    public void removeOwnedTaskTable(TaskTable table) {
        ownedTaskTables.remove(table);
    }

    public void addMemberedTaskTable(TaskTable table) {
        memberedTaskTables.add(table);
    }

    public void removeMemberedTaskTable(TaskTable table) {
        memberedTaskTables.remove(table);
    }
}
