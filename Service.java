@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        return userRepository.save(user);
    }

    public Optional<User> authenticate(String username, String password) {
        // Add password hashing and comparison logic here
        return userRepository.findByUsername(username);
    }
}
@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> searchBooks(String title, String author) {
        return bookRepository.findByTitleContainingOrAuthorContaining(title, author);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }
}
@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getReviewsForBook(Book book) {
        return reviewRepository.findByBook(book);
    }

    public Review addReview(Review review) {
        return reviewRepository.save(review);
    }
}

