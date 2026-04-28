public class App {
//
    public String sayHello() {
        return "Hello CI/CD";
    }
}
//Lần 1:
//Maven sẽ tải dependency từ đầu
//→ chạy chậm hơn
//→ log sẽ có download từ Maven Central

// lần 2
//Maven dùng cache
//→ chạy nhanh hơn
//→ log sẽ hiện restored cache
//→ không tải lại dependency

//First workflow run:
//Duration: 2 min 10 sec
//
//Second workflow run:
//Duration: 45 sec

//Sau khi cấu hình cache: maven trong setup-java,
//thời gian thực thi workflow giảm đáng kể.
//
//Lần chạy đầu Maven phải tải toàn bộ dependency
//từ Maven Central nên mất nhiều thời gian hơn.
//
//Từ lần chạy sau, GitHub Actions sử dụng cache
//để khôi phục dependency đã tải trước đó,
//giúp build nhanh hơn và tối ưu pipeline CI/CD.