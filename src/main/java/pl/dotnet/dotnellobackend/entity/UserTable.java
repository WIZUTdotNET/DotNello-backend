package pl.dotnet.dotnellobackend.entity;


import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
@Builder
public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private TaskTable table;
    @ManyToOne
    private User user;
    private UserRole role;
}
