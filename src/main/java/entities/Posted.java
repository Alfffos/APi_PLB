package entities;
import jakarta.persistence.*;

public class Posted {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private Integer postedId;
    @OneToOne
    @JoinColumn
    private User user;
    @Column
    private String pictured;
    @Column
    private  String name_posted;
    @Column
    private String description;
    @Column
    private Integer locationX;
    @Column Integer locationY;

}