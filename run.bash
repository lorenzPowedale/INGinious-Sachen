#!/bin/bash

getinput thecode > student/student_code.py
output=$(python3 student/student_code.py)

if [ "$output" = "Hello World!" ]; then
    feedback-result success
else
    feedback-result failed
    feedback-msg -em "Your program displayed : $output"
fi