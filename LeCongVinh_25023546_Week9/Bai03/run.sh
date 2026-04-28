#!/bin/bash
echo "--- Đang chạy tự động hóa Local ---"
mvn clean package -f LeCongVinh_25023546_Week9/Bai03/pom.xml
if [ $? -eq 0 ]; then
    echo "BUILD SUCCESS! Bạn có thể lấy file jar trong thư mục target."
else
    echo "BUILD FAILED! Kiểm tra lại code đi Vinh ơi."
fi
