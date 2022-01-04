package pl.dotnet.dotnellobackend.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @ManyToOne
    @NotNull
    private User taskTableOwner;

    @ManyToMany
    private List<User> taskTableMembers;

    void addTaskTableMember(User user){
        taskTableMembers.add(user);
    }

    void removeTaskTableMember(User user) {
        taskTableMembers.remove(user);
    }
}
