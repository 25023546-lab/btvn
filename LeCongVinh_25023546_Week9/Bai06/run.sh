#!/bin/bash

echo "=============================="
echo " CI/CD Caching Demo "
echo "=============================="

echo ""
echo "Running Maven build..."

mvn clean test

if [ $? -ne 0 ]; then
    echo ""
    echo "Build FAILED!"
    exit 1
fi

echo ""
echo "Build SUCCESS!"