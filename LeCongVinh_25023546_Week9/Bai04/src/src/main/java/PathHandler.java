

import java.nio.file.Paths;

public class PathHandler {
    public String getReportPath() {
        // REFACTOR: Sử dụng Paths.get() để tự động dùng đúng dấu gạch chéo / hoặc \
        return Paths.get("reports", "report.txt").toString();
    }
}