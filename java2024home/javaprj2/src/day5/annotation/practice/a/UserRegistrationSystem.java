package day5.annotation.practice.a;

public class UserRegistrationSystem {
    public static void main(String[] args) {
        User user = new User(20, "John Doe", "john@example.com");
        try {
            validateUser(user);
            System.out.println("유저 등록이 완료되었습니다.");
        } catch (ValidationException e) {
            System.out.println("유저 등록 실패: " + e.getMessage());
        }
    }

    public static void validateUser(User user) throws ValidationException {
        if (user.getAge() < 18) {
            throw new ValidationException("나이가 18세 미만입니다.");
        }
        if (user.getName().isEmpty()) {
            throw new ValidationException("이름이 비어 있습니다.");
        }
        if (!isValidEmail(user.getEmail())) {
            throw new ValidationException("유효하지 않은 이메일 형식입니다.");
        }
    }

    public static boolean isValidEmail(String email) {
        // 이메일 유효성 검사는 간단한 형식으로 하겠습니다.
        // @가 포함되어 있으면 유효한 이메일로 판단합니다.
        return email.contains("@");
    }
}

class User {
    private int age;
    private String name;
    private String email;

    public User(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}
