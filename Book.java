@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    private String author;
    private String genre;
    private String description;
    private Date publishedDate;

    // getters and setters
}
