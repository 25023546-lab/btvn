import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PathHandlerTest {
    @Test
    public void testCrossPlatformPath() {
        PathHandler handler = new PathHandler();
        // Dùng File.separator để lấy dấu chuẩn của HĐH đang chạy test
        String expectedPath = "reports" + File.separator + "report.txt";

        // So sánh: Nếu chạy trên Linux, expected là "reports/report.txt"
        // Nhưng hàm getReportPath luôn trả về "reports\report.txt" => Sẽ báo lỗi!
        assertEquals(expectedPath, handler.getReportPath());
    }
}
